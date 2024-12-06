package com.example.testspringboot.Repositories;

import com.example.testspringboot.Entities.FamileActe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilleActeRepository extends JpaRepository<FamileActe,Long> {
}
