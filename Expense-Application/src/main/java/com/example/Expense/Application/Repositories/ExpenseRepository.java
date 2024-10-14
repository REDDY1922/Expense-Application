package com.example.Expense.Application.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Expense.Application.Models.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Integer>{

}
