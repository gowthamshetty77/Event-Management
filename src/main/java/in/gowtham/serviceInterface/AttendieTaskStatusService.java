package in.gowtham.serviceInterface;

import java.util.List;

import in.gowtham.entity.AttendieTaskStatus;
import in.gowtham.entity.AttendiesEntity;
import in.gowtham.entity.TaskEntity;

public interface AttendieTaskStatusService {

	
	// to get the tasks with the status of an attendie
	List<AttendieTaskStatus> getTasksByAttendie(AttendiesEntity attendie);
	
	
	  // Mark a task as completed for an attendee
    void markTaskAsCompleted(AttendiesEntity attendie, TaskEntity task, boolean status);
}
