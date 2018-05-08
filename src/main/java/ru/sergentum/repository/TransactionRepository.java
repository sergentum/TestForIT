package ru.sergentum.repository;

import org.springframework.data.repository.CrudRepository;
import ru.sergentum.domain.Transaction;

public interface TransactionRepository extends CrudRepository<Transaction, Integer> {
}

