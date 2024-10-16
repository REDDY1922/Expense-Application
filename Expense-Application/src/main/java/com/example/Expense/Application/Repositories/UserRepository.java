package com.example.Expense.Application.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Expense.Application.Models.User;
/**
 * Repository interface for the User entity.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
