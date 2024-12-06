package com.example.testspringboot.Controllers;

import com.example.testspringboot.Entities.Acte;
import com.example.testspringboot.Entities.FamileActe;
import com.example.testspringboot.Repositories.ActeRepository;
import com.example.testspringboot.Repositories.FamilleActeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/familleacte")
@AllArgsConstructor
public class FamilleActeController {

    ActeRepository acteRepository;
    FamilleActeRepository familleActeRepository;

    @PostMapping()
    public FamileActe ajouterFamilleActeEtActeAssocie(@RequestBody FamileActe famileActe){
         List<Acte> actes=famileActe.getActes();
         acteRepository.saveAll(actes);
         return familleActeRepository.save(famileActe);
    }

}
