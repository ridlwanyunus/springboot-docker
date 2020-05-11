package com.example.demo.openshift.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.openshift.model.User;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Integer>{

	<Optional> User findByUsername(String username);
}
