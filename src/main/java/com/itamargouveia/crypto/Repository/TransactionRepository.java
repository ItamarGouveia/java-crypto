package com.itamargouveia.crypto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itamargouveia.crypto.Entity.TransactionEntity;

public interface TransactionRepository  extends JpaRepository<TransactionEntity, Long>{
    
}
