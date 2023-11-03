package com.workforces.Service;

import com.workforces.Repository.EmployeRepository;
import com.workforces.model.Employe;

import java.util.List;

public class EmployeService implements EmployeServiceInterface {
    private final EmployeRepository employeRepository;
    public EmployeService(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    @Override
    public List<Employe> findAll(){
        return employeRepository.findAll();
    }

    @Override
    public Employe findById(Long id){
        return employeRepository.findById(id).orElse(null);
    }
    @Override
    public Employe save(Employe employe){
        return employeRepository.save(employe);
    }
}
