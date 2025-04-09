package in.gowtham.serviceInterface;

import java.util.List;

import in.gowtham.entity.AttendiesEntity;
import in.gowtham.entity.RegisterEntity;


public interface AttendiesService {
	Integer saveAttendie(AttendiesEntity entity);
	//boolean existsbyemail(String email);
	AttendiesEntity findbyEmail(String email);
	AttendiesEntity findbyEmailAndPassword(String email,String password);
	boolean existsByAEmail(String email);
//	

}
