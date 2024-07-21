package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nt.entity.Doctor;

@Repository
public interface IDoctorRepo extends JpaRepository<Doctor, Integer> {
//	@Query("from Doctor where income>=?1 AND income<=?2")
//	@Query("from com.nt.entity.Doctor where income>=?1 And income<=?2")
//	@Query("from com.nt.entity.Doctor where income>=?1 And income<=?")  ---> throw new illegalArgument Exception
	//@Query("FROM Doctor doc where doc.income>=?1 AND doc.income<=?2")
/*	public List<Doctor> searchDoctorByIncomeRange(Double start,Double end);
  
	@Query("FROM Doctor where income>=:start AND income<=:end")
	public List<Doctor> searchDoctorByIncomeRange(@Param("start")Double startRange,@Param("end") Double endRange);
*/
	@Query("FROM Doctor where income>=:startRange AND income<=:endRange")
	public List<Doctor> searchDoctorByIncomeRange(Double startRange,Double endRange);
}
