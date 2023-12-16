package com.smc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.smc.DAO.Student_DAO;
import com.smc.DTO.Students;
import com.smc.helper.ResponseStructure;

@Service
public class Student_Service {

	@Autowired
	private Student_DAO student_dao;

	public ResponseStructure saveStudent(Students student) {

		double percentage = (student.getHindi_marks() + student.getEnglish_marks() + student.getMath_marks() + student.getScience_marks() + student.getSst_marks()) / 5;

		student.setPercentage(percentage);

		if (percentage >= 75) {
			student.setResult("Distinct");

		} else if (percentage >= 60 && percentage < 75) {
			student.setResult("First Class");

		} else if (percentage >= 45 && percentage < 60) {
			student.setResult("Second Class");

		} else if (percentage >= 33 && percentage < 45) {
			student.setResult("Third Class");

		} else if (percentage < 33) {
			student.setResult("Fail");

		}

		ResponseStructure<Students> responseStructure = new ResponseStructure<Students>();

		responseStructure.setMsg("Data saved Successfully");

		responseStructure.setStatusCode(HttpStatus.CREATED.value());

		responseStructure.setData(student_dao.saveStudent(student));

		return responseStructure;

	}

	public ResponseStructure<List<Students>> saveMultipleStudent(List<Students> students) {

		for (Students student : students) {
			double percentage = (student.getHindi_marks() + student.getEnglish_marks() + student.getMath_marks() + student.getScience_marks() + student.getSst_marks()) / 5;

			student.setPercentage(percentage);

			if (percentage >= 75) {
				student.setResult("Distinct");

			} else if (percentage >= 60 && percentage < 75) {
				student.setResult("First Class");

			} else if (percentage >= 45 && percentage < 60) {
				student.setResult("Second Class");

			} else if (percentage >= 33 && percentage < 45) {
				student.setResult("Third Class");

			} else if (percentage < 33) {
				student.setResult("Fail");

			}

		}
		student_dao.saveStudent(students);

		ResponseStructure<List<Students>> responseStructure = new ResponseStructure<List<Students>>();

		responseStructure.setMsg("Data saved Successfully");

		responseStructure.setStatusCode(HttpStatus.CREATED.value());

		responseStructure.setData(student_dao.saveStudent(students));

		return responseStructure;

	}

	public ResponseStructure<Students> fetchById(int id) {

		Students student = student_dao.fetchById(id);

		ResponseStructure<Students> responseStructure = new ResponseStructure<Students>();

		if (student == null) {
			responseStructure.setMsg("Data Not Found");
			responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
			responseStructure.setData(null);
			return responseStructure;

		} else {

			responseStructure.setMsg("Data Found");

			responseStructure.setStatusCode(HttpStatus.FOUND.value());

			responseStructure.setData(student);

			return responseStructure;
		}

	}

}
