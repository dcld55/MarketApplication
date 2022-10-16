package com.assignment.MarketApplication.dao;

import com.assignment.MarketApplication.entity.TransactionHeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionHeaderRepository extends JpaRepository<TransactionHeader, Long> {

}
