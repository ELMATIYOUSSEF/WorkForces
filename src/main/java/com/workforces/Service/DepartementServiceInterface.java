package com.workforces.Service;

import com.workforces.model.Departement;

public interface DepartementServiceInterface {
    Departement findById(Long id);
    Departement save(Departement departement);
}
