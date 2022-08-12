package com.auto.dealeraudit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auto.dealeraudit.entity.User;


@Repository 
public interface UserRepository extends JpaRepository<User, Integer> {
	
	public  User findByMailId(String mailId);

}
