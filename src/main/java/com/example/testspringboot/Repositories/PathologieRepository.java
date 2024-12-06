package com.example.testspringboot.Repositories;

import com.example.testspringboot.Entities.Pathologie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PathologieRepository extends JpaRepository<Pathologie,Long> {
    Pathologie findByCodePath(String id);

}
