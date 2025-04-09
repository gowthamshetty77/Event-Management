package in.gowtham.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import in.gowtham.entity.RegisterEntity;
import jakarta.transaction.Transactional;

@Transactional
public interface RegisterRepo extends JpaRepository<RegisterEntity, Integer> {

	RegisterEntity findByUserEmail(String userEmail);

	boolean existsByUserEmail(String userEmail);
	boolean existsByUserPassword(String password);

	@Modifying
	@Query("UPDATE RegisterEntity SET userPassword = :password WHERE userEmail = :mail")
	int updateUserPassword(String mail, String password);

}