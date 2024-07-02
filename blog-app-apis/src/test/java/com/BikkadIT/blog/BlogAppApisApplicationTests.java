package com.BikkadIT.blog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.BikkadIT.blog.repositories.UserRepo;

@SpringBootTest // Annotation to indicate that this is a Spring Boot test class
class BlogAppApisApplicationTests {

	@Autowired // Autowires the UserRepo bean for dependency injection
	private UserRepo userRepo;

	@Test // A simple test method to check if the context loads successfully
	void contextLoads() {
		// This test will pass if the application context loads without any issues
	}

	@Test // A test method to check the class name and package name of the UserRepo bean
	public void repoTest() {
		// Get the class name of the UserRepo bean
		String className = this.userRepo.getClass().getName();
		// Get the package name of the UserRepo bean
		String packName = this.userRepo.getClass().getPackageName();
		// Print the class name to the console
		System.out.println(className);
		// Print the package name to the console
		System.out.println(packName);
	}
}
