package com.example.exam.service;

import com.example.exam.model.Doctor;
import com.example.exam.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor get(Integer id) {
        return null;
    }

    public Doctor create(Doctor dto) {
        return null;
    }


    public boolean update(Integer id, Doctor doctor) {
        return false;
    }

    public boolean delete(Integer id) {
        return false;
    }

    public Doctor getEntity(Integer id) {
        return null;
    }
}
