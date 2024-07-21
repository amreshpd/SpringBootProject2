package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nt.entity.Doctor;

import jakarta.transaction.Transactional;

@Repository
public interface IDoctorRepo extends JpaRepository<Doctor, Integer> {
	@Query(value = "INSERT into JPA_DOCTOR1 values(:id,:name,:income,:percantage,:mobile,:special,)",nativeQuery = true)
	@Modifying
	@Transactional
	public int registerDoctor(int id,String name,String special,double income,long mobile,double percantage);	
	
}
