package com.example.Expense.Application.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Expense.Application.Repositories.ExpenseRepository;
import com.example.Expense.Application.Repositories.UserRepository;
/**
 * Service class to handle logic related to expenses.
 */
@Service
public class ExpenseService {
	@Autowired
    private ExpenseRepository expenseRepository;

    @Autowired
    private UserRepository userRepository;
}
