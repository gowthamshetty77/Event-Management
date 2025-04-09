package in.gowtham.serviceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.gowtham.entity.TaskEntity;
import in.gowtham.repository.TaskRepo;
import in.gowtham.serviceInterface.TaskService;
@Service
public class TaskServiceImpl implements TaskService{
@Autowired
	private TaskRepo repo;
	@Override
	public List<TaskEntity> getAllTask() {
		// TODO Auto-generated method stub
		return repo.findAll() ;
	}
	@Override
	public List<TaskEntity> findTasksByCategory(String category) {
		// TODO Auto-generated method stub
		return (List<TaskEntity>) repo.findTasksByCategory(category);
	}
	@Override
	public Integer updateStatus(String taskId, Integer attendieId, String status) {
		// TODO Auto-generated method stub
		//return repo.updateTaskStatus(taskId, attendieId, status);
		return null;
	}
	@Override
	public Integer updateStatus(String taskId, String attendieId, String status) {
		// TODO Auto-generated method stub
		return repo.updateTaskStatus(taskId, attendieId, status);
	}
	@Override
	public Integer updateStatus(Integer taskId, Integer attendieId1, String status) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
