package com.smc.DTO;

import org.springframework.stereotype.Service;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Service
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int sid;

	@Column(name = "Name")
	String sname;

	@Column(name = "Mobile")
	long mob;

	@Column(name = "Math")
	int math_marks;

	@Column(name = "Science")
	int science_marks;

	@Column(name = "Social_Science")
	int sst_marks;

	@Column(name = "Hindi")
	int hindi_marks;

	@Column(name = "English")
	int english_marks;

	double percentage;

	String result;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public long getMob() {
		return mob;
	}

	public void setMob(long mob) {
		this.mob = mob;
	}

	public int getMath_marks() {
		return math_marks;
	}

	public void setMath_marks(int math_marks) {
		this.math_marks = math_marks;
	}

	public int getScience_marks() {
		return science_marks;
	}

	public void setScience_marks(int science_marks) {
		this.science_marks = science_marks;
	}

	public int getSst_marks() {
		return sst_marks;
	}

	public void setSst_marks(int sst_marks) {
		this.sst_marks = sst_marks;
	}

	public int getHindi_marks() {
		return hindi_marks;
	}

	public void setHindi_marks(int hindi_marks) {
		this.hindi_marks = hindi_marks;
	}

	public int getEnglish_marks() {
		return english_marks;
	}

	public void setEnglish_marks(int english_marks) {
		this.english_marks = english_marks;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
