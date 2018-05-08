package ru.sergentum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sergentum.domain.Account;


public interface AccountRepository extends JpaRepository<Account, Integer> {
}
