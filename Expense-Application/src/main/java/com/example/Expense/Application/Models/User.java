package com.example.Expense.Application.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*Entity Representing user info*/
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user_details")
public class User{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(unique = true,nullable = false)
	private String username;
	@Column(nullable = false)
	private String password;
	@NotNull
	private String name;
	@NotNull
	private String email;
	@NotNull
	private String mobileNumber;
	
}
