package com.example.testspringboot.Entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPatient;

    private TypePieceIdentite typePieceIdentite;
    private String identifiantPieceIdentite;
    private Date dateEmission;
    private String nomP;
    private String prenomP;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Pathologie> pathologies;

    public Long getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(Long idPatient) {
        this.idPatient = idPatient;
    }

    public TypePieceIdentite getTypePieceIdentite() {
        return typePieceIdentite;
    }

    public void setTypePieceIdentite(TypePieceIdentite typePieceIdentite) {
        this.typePieceIdentite = typePieceIdentite;
    }

    public String getIdentifiantPieceIdentite() {
        return identifiantPieceIdentite;
    }

    public void setIdentifiantPieceIdentite(String identifiantPieceIdentite) {
        this.identifiantPieceIdentite = identifiantPieceIdentite;
    }

    public Date getDateEmission() {
        return dateEmission;
    }

    public void setDateEmission(Date dateEmission) {
        this.dateEmission = dateEmission;
    }

    public String getNomP() {
        return nomP;
    }

    public void setNomP(String nomP) {
        this.nomP = nomP;
    }

    public String getPrenomP() {
        return prenomP;
    }

    public void setPrenomP(String prenomP) {
        this.prenomP = prenomP;
    }

    public List<Pathologie> getPathologies() {
        return pathologies;
    }

    public void setPathologies(List<Pathologie> pathologies) {
        this.pathologies = pathologies;
    }
}
