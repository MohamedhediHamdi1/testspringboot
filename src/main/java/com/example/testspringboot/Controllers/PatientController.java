package com.example.testspringboot.Controllers;

import com.example.testspringboot.Entities.Pathologie;
import com.example.testspringboot.Entities.Patient;
import com.example.testspringboot.Repositories.PathologieRepository;
import com.example.testspringboot.Repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/patient")
@AllArgsConstructor
public class PatientController {

    PathologieRepository pathologieRepository;

    PatientRepository patientRepository;

    @PostMapping("/{codePath}")
    public Patient ajouterPatientEtAffecterAPathologie(@RequestBody Patient p,@PathVariable String codePath){
        Pathologie pathologie=pathologieRepository.findByCodePath(codePath);

        List<Patient> patients=pathologie.getPatients();
        patients.add(p);
        pathologie.setPatients(patients);
        pathologieRepository.save(pathologie);


        List<Pathologie> pathologies=new ArrayList<>();
        pathologies.add(pathologie);
        p.setPathologies(pathologies);
        patientRepository.save(p);

        return p;
    }

}
