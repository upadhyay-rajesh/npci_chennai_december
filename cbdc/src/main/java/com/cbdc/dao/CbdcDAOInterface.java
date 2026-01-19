package com.cbdc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cbdc.entity.Token;

@Repository
public interface CbdcDAOInterface extends JpaRepository<Token, Long>{

}
