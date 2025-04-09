package in.gowtham.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.gowtham.entity.AttendieTaskStatus;
import in.gowtham.entity.AttendiesEntity;
import in.gowtham.entity.TaskEntity;
import in.gowtham.repository.AttendieTaskStatusRepository;
import in.gowtham.serviceInterface.AttendieTaskStatusService;
@Service
public class AttendieTaskStatusServiceImpl implements AttendieTaskStatusService{

	@Autowired
	private AttendieTaskStatusRepository repo;
	@Override
	public List<AttendieTaskStatus> getTasksByAttendie(AttendiesEntity attendie) {
		// TODO Auto-generated method stub
		return repo.findByAttendie(attendie);
	}

	@Override
	public void markTaskAsCompleted(AttendiesEntity attendie, TaskEntity task, boolean status) {
		// TODO Auto-generated method stub
        AttendieTaskStatus taskStatus = repo.findByAttendieAndTask(attendie, task);

        
        if(taskStatus!=null)
        {
        	//taskStatus = new AttendieTaskStatus();
        //	taskStatus.setAttendie(attendie);
        	//taskStatus.setTask(task);
        
        taskStatus.setStatus(status);
        repo.save(taskStatus);
        }
	}

}
