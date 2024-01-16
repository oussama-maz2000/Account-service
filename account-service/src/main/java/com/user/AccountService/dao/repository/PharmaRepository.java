package com.user.AccountService.dao.repository;

import com.user.AccountService.dao.entity.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PharmaRepository extends JpaRepository<Pharmacy,Long> {
}
