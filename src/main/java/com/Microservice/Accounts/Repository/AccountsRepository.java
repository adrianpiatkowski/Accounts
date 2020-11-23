package com.Microservice.Accounts.Repository;

import com.Microservice.Accounts.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountsRepository extends JpaRepository<Account, Long> {
    List<Account> findAllByCustomerId(Long customerId);
}