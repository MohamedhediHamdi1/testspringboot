package com.example.testspringboot.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "acte")
public class Acte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idActe;

    private String codeActe;
    private int cotationActe;
    private float pricUnitaireActe;
    private String designationActe;

    @ManyToMany(mappedBy = "actes")
    List<Pathologie> pathologies;

    @ManyToOne(cascade = CascadeType.ALL)
    private FamileActe famileacte;


    public Long getIdActe() {
        return idActe;
    }

    public void setIdActe(Long idActe) {
        this.idActe = idActe;
    }

    public String getCodeActe() {
        return codeActe;
    }

    public void setCodeActe(String codeActe) {
        this.codeActe = codeActe;
    }

    public int getCotationActe() {
        return cotationActe;
    }

    public void setCotationActe(int cotationActe) {
        this.cotationActe = cotationActe;
    }

    public float getPricUnitaireActe() {
        return pricUnitaireActe;
    }

    public void setPricUnitaireActe(float pricUnitaireActe) {
        this.pricUnitaireActe = pricUnitaireActe;
    }

    public String getDesignationActe() {
        return designationActe;
    }

    public void setDesignationActe(String designationActe) {
        this.designationActe = designationActe;
    }

    public FamileActe getFamileacte() {
        return famileacte;
    }

    public void setFamileacte(FamileActe famileacte) {
        this.famileacte = famileacte;
    }

    public List<Pathologie> getPathologies() {
        return pathologies;
    }

    public void setPathologies(List<Pathologie> pathologies) {
        this.pathologies = pathologies;
    }
}
