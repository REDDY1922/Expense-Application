package com.example.Expense.Application.Models;

import java.util.Map;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Entity Representing an Expense
 * The EXpense can be split equally,by exact amounts or by percentages among participants
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Expense {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotNull
	private String description;
	@NotNull
	private Double amount;
	// Split method: EQUAL, EXACT, or PERCENTAGE
	@NotNull
	private String splitMethod;
	// A map that holds user ID and the amount each user owes.
	@ElementCollection
	private Map<Long,Double> splitDetails;

}
