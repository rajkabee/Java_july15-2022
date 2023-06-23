package com.rajkabee.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rajkabee.api.entities.Account;
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
