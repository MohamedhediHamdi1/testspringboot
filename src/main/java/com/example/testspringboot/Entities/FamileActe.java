package com.example.testspringboot.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "famileact")
public class FamileActe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFA;

    private String codeFA;
    private String libelle;
    private String description;

    @OneToMany(mappedBy = "famileacte",cascade = CascadeType.ALL)
    List<Acte> actes;


    public Long getIdFA() {
        return idFA;
    }

    public void setIdFA(Long idFA) {
        this.idFA = idFA;
    }

    public String getCodeFA() {
        return codeFA;
    }

    public void setCodeFA(String codeFA) {
        this.codeFA = codeFA;
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

    public List<Acte> getActes() {
        return actes;
    }

    public void setActes(List<Acte> actes) {
        this.actes = actes;
    }
}
