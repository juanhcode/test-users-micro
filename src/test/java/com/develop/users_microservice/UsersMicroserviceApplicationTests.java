package com.develop.users_microservice;

import com.develop.users_microservice.domain.model.Role;
import com.develop.users_microservice.domain.model.User;
import com.develop.users_microservice.infrastructure.repository.UserRepositoryImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = UsersMicroserviceApplication.class)
class UsersMicroserviceApplicationTests {
	@Autowired
	private UserRepositoryImpl userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void deleteUser() {
	}

}
