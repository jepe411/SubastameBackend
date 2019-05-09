package com.co.subastame.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.co.subastame.controller.LoginController;
import com.co.subastame.model.TbAucUser;

@RestController
public class LoginServices {

	@Autowired
	LoginController loginController;
	private static final Logger logger = LogManager.getLogger(LoginServices.class);

	@GetMapping("/validateUser/{user}/{pass}")
	public ResponseEntity<?> validateLogin(@PathVariable String user, @PathVariable String pass) {
		logger.info("Validate User Method");
		if(loginController.validateLogin(user, pass)) {
			return new ResponseEntity<TbAucUser>(HttpStatus.OK);
		}else {
			return new ResponseEntity<TbAucUser>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/validateUser/{useremail}")
	public ResponseEntity<TbAucUser> findUser(@PathVariable String useremail) {
		if (useremail != null) {
			return new ResponseEntity<TbAucUser>(HttpStatus.OK);
		} else {
			return new ResponseEntity<TbAucUser>(HttpStatus.NOT_FOUND);
		}
	}
}
