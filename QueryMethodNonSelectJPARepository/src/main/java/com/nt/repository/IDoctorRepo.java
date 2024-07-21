package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nt.entity.Doctor;

import jakarta.transaction.Transactional;

@Repository
public interface IDoctorRepo extends JpaRepository<Doctor, Integer> {
	@Query("UPDATE Doctor set income=income+(income*:percantage/100.0) where specialization=:sp")
	@Modifying
	@Transactional
	public int hikeDoctorsIncomeBySpecialization(String sp,double percantage);
	
	@Query("DELETE from Doctor where income>=:start AND income<=:end")
	@Modifying
	@Transactional
	public int removeDoctorByIncomeRange(double start,double end);
	
}
