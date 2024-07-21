package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nt.entity.Doctor;

@Repository
public interface IDoctorRepo extends JpaRepository<Doctor, Integer> {
	@Query("SELECT count(distinct docName) from Doctor")
	public int fetchDoctorNameCount();
	
	@Query("Select Max(income),count(*),min(income),avg(income),sum(income) from Doctor")
	public Object fetchAggregateData();
}
