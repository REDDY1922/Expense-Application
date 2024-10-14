package com.example.Expense.Application.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * Service to load user-specific data during authentication.
 */

import com.example.Expense.Application.Repositories.UserRepository;
@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
}
