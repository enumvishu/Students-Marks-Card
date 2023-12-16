package com.smc.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smc.DTO.Students;
import com.smc.repository.Student_Repository;

@Service
public class Student_DAO {

	@Autowired
	private Student_Repository studentRepo;

	public Students saveStudent(Students student) {

		return studentRepo.save(student);

	}

	public List<Students> saveStudent(List<Students> student) {

		return studentRepo.saveAll(student);

	}

	public Students fetchById(int id) {

		Optional<Students> optional = studentRepo.findById(id);

		if (optional.isEmpty()) {

			return null;

		} else {

			Students std = optional.get();

			return std;

		}

	}

}
