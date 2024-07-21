package com.nt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nt.entity.Doctor;

@Repository
public interface IDoctorRepo extends JpaRepository<Doctor, Integer> {
	//Entity Giving Single row value........
	@Query("From Doctor where docName=:name")
	public Optional<Doctor> showDoctorInfoByName(String name);
	// Scalar Query single object giving multiple column
	@Query("select docId,income,specialization from Doctor where docName=:name")
	public Object showDoctorDataByName(String name);
	// scalar Query having single column fetch single value
	@Query("SELECT specialization from Doctor where docName=:name")
	public String showSpecializationByName(String name);
	
	
}
