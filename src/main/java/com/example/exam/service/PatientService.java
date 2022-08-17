package com.example.exam.service;

import com.example.exam.model.Patient;
import com.example.exam.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;


    public Patient get(Integer id) {
        return null;
    }

    public Patient create(Patient patientDto) {
        return null;
    }

    public boolean update(Integer id, Patient patientDto) {
        return false;
    }

    public boolean delete(Integer id){
        return false;
    }

    public Patient getEntity(Integer id){
        return null;
    }

}
