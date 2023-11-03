package com.workforces.Service;

import com.workforces.model.Employe;

import java.util.List;

public interface EmployeServiceInterface {
    List<Employe> findAll();

    Employe findById(Long id);

    Employe save(Employe employe);
}
