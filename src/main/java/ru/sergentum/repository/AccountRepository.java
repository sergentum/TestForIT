package ru.sergentum.repository;

import org.springframework.data.repository.CrudRepository;
import ru.sergentum.domain.Transaction;

public interface AccountRepository extends CrudRepository<Transaction, Integer> {
}
