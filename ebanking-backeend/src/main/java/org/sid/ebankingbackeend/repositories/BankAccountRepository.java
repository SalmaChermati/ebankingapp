package org.sid.ebankingbackeend.repositories;

import org.sid.ebankingbackeend.entities.BankAccount;
import org.sid.ebankingbackeend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String > {

}
