package in.gowtham.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.gowtham.entity.Form;
import in.gowtham.repository.FormRepo;
import in.gowtham.serviceInterface.FormService;

@Service
public class FormImplementation implements FormService {
	@Autowired
	FormRepo repo;

	@Override
	public int save(Form form) {
		return repo.save(form).getId();
	}

}
