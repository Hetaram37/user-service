package com.prajapati.hetaram.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Document(collection = "users")
public class User {

	@Id
	private String id;

	@Field(name = "fn")
	private String firstName;

	@Field(name = "ln")
	private String lastName;

	@Field(name = "e")
	private String email;

}
