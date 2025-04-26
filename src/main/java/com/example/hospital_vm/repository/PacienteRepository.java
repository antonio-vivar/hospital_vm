package com.example.hospital_vm.repository;

import com.example.hospital_vm.repository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.param;

public interface PacienteRepository extends JpaRepository<Paciente,Integer>{

}
