package com.example.testspringboot.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "pathologie")
public class Pathologie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPath;

    private String codePath;
    private String libelle;
    private String description;
    private Boolean archive;

    @ManyToMany(mappedBy = "pathologies")
    private List<Patient> patients;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Acte> actes;


    public Long getIdPath() {
        return idPath;
    }

    public void setIdPath(Long idPath) {
        this.idPath = idPath;
    }

    public String getCodePath() {
        return codePath;
    }

    public void setCodePath(String codePath) {
        this.codePath = codePath;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Acte> getActes() {
        return actes;
    }

    public void setActes(List<Acte> actes) {
        this.actes = actes;
    }
}
