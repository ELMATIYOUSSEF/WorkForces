package com.workforces.Service;

import com.workforces.Repository.DepartementRepository;
import com.workforces.model.Departement;
import com.workforces.model.Employe;

public class DepartementService implements DepartementServiceInterface {
    private final DepartementRepository departementRepository;

    public DepartementService(DepartementRepository departementRepository) {
        this.departementRepository = departementRepository;
    }

    @Override
    public Departement findById(Long id){
        return departementRepository.findById(id).orElse(null);

    }
    public Departement save(Departement departement){
        return departementRepository.save(departement);
    }

    public static void main(String[] args) {

    }
}
