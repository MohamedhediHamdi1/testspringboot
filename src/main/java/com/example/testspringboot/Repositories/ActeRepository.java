package com.example.testspringboot.Repositories;

import com.example.testspringboot.Entities.Acte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActeRepository extends JpaRepository<Acte,Long> {
    Acte findByCodeActe(String id);
}
