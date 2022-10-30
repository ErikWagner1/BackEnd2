package com.portfolio.ErikWagner.repository;

import com.portfolio.ErikWagner.model.Acerca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcercaRepository extends JpaRepository <Acerca, Long> {
    
}
