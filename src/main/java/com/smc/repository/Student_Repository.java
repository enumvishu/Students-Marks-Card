package com.smc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smc.DTO.Students;

public interface Student_Repository extends JpaRepository<Students, Integer> {

}
