package in.gowtham.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.gowtham.entity.AttendiesEntity;
import in.gowtham.entity.RegisterEntity;
import jakarta.transaction.Transactional;

@Transactional
public interface AttendiesRepo extends JpaRepository<AttendiesEntity, Integer>{
@Query("select a from AttendiesEntity a where aEmail=:email")
	AttendiesEntity  findByaEmail(String email);
@Query("select a from AttendiesEntity a where aEmail=:email and aPassword=:password")

AttendiesEntity findByEmailAndPassword(String email,String password);
@Query("select a.aEmail from AttendiesEntity a where aEmail=:email")

boolean existsByAEmail(String email);

}
