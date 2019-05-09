package com.co.subastame.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.co.subastame.model.TbAucUser;
import com.co.subastame.repository.LoginRepository;
import com.co.subastame.services.LoginServices;

@Component
public class LoginController {

	@Autowired
	LoginRepository loginRespository;
	private static final Logger logger = LogManager.getLogger(LoginServices.class);

	public Boolean validateLogin(String email, String pass) {
		try {
			List<TbAucUser> listUser = loginRespository.findByUserMailAndUserPassword(email, pass);
			if (listUser.size() > 0) {
				return true;
			}

		} catch (Exception e) {
			logger.error("Error Validate Password");

		}
		return false;

	}

}
