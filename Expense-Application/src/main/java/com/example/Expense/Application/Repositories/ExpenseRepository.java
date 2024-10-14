package com.example.Expense.Application.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Expense.Application.Models.Expense;
/**
 * Repository interface for the Expense entity.
 */
@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer>{

}
