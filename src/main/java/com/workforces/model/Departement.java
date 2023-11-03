package com.workforces.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String Name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }

    @OneToMany(mappedBy = "departement")
    private List<Employe> employes;

    public Departement() {
    }

    public Departement(long id, String name, List<Employe> employes) {
        this.id = id;
        Name = name;
        this.employes = employes;
    }

}
