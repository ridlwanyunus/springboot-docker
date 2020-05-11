package com.example.demo.openshift;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.demo.openshift.model.User;
import com.example.demo.openshift.repository.UserRepository;

@SpringBootApplication
public class OpenshiftApplication implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(OpenshiftApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User checkUser = userRepository.findByUsername("user");
		
		if(checkUser == null) {
			User user = new User();
			user.setUsername("user");
			user.setPassword(passwordEncoder.encode("user"));
			user.setRole("guest");
			userRepository.save(user);
		}
	}

}
