package com.co.subastame.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.co.subastame.model.TbAucUser;



@Repository
public interface LoginRepository extends CrudRepository<TbAucUser, Long>{	
	List<TbAucUser> findByUserMailAndUserPassword(String user, String pass);

}
