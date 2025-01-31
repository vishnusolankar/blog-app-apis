package com.BikkadIT.blog.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class UserDto {

	//class
	private int id;
	@NotEmpty
	@Size(min = 4, message = "username must be min of 4 characters !!")
	private String name;

	@Email(message = "Email address is not valid !!")
	private String email;

	@NotEmpty
	@Size(min = 3, max = 10, message = "password must be min of 3 chars and max of 10 chars !!")

	private String password;

	@NotEmpty
	private String about;

}
