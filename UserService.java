package com.demo.healthcareportal.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.demo.healthcareportal.model.User;
import com.demo.healthcareportal.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
	
	User save(UserRegistrationDto registrationDto);

}
