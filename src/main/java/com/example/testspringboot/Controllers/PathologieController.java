package com.example.testspringboot.Controllers;

import com.example.testspringboot.Entities.Acte;
import com.example.testspringboot.Entities.Pathologie;
import com.example.testspringboot.Repositories.ActeRepository;
import com.example.testspringboot.Repositories.PathologieRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pathologie")
@AllArgsConstructor
public class PathologieController {
    PathologieRepository pathologieRepository;
    ActeRepository acteRepository;

    @PostMapping()
    public Pathologie ajouterPathologie(@RequestBody Pathologie pathologie){
        return pathologieRepository.save(pathologie);
    }

    @GetMapping("/{codeActe}/{codePathologie}")
    public void affecterActeAPathologie(@PathVariable String codeActe,@PathVariable String codePathologie){
        Acte acte=acteRepository.findByCodeActe(codeActe);
        Pathologie pathologie=pathologieRepository.findByCodePath(codePathologie);
        if(!pathologie.getArchive()){
            List<Acte> actes=pathologie.getActes();
            actes.add(acte);
            pathologie.setActes(actes);
            pathologieRepository.save(pathologie);
        }
    }

    @GetMapping("/calculerF/{identifiant}")
    public float calculerFacture(@PathVariable String identifiant){
        Pathologie pathologie=pathologieRepository.findByCodePath(identifiant);
        if(pathologie.getArchive()){
            return 0;
        }else{
            float facture=0;
            for(Acte acte: pathologie.getActes()){
                facture+=acte.getCotationActe()*acte.getPricUnitaireActe();
            }
            return facture;
        }
    }

}
