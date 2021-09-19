package com.prajapati.hetaram.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "firstName", "lastName", "email", "password", "confirmPassword", "gender", "status", "avatar"}) 
public class SaveUserRequest {
	
	@NotBlank(message = "Frist Name should not be empty")
	@JsonProperty("firstName")
	private String firstName;
	
	@NotBlank(message = "Last Name should not be empty")
	@JsonProperty("lastName")
	private String lastName;
	
	@NotBlank(message = "Email should not be empty")
	@Email(message = "Please provide valid email")
	@JsonProperty("email")
	private String email;
	
	@NotBlank(message = "Password can not be empty")
	@JsonProperty("password")
	private String password;

}
