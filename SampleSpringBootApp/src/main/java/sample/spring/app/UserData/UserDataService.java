package sample.spring.app.UserData;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDataService {

	@Autowired
	UserDataRepository userDataRepository;
	
	public UserData findById(String id) {
		Optional<UserData> userData = userDataRepository.findById(id);
		if(userData.isPresent()) {
			return userData.get();
		} 
		return null;
	}
	
	public List<UserData> findByFname(String fname){
		return userDataRepository.findByFname(fname);
	}
	
	public List<UserData> findByLname(String lname){
		return userDataRepository.findByLname(lname);
	}
	
	public List<UserData> findAll(){
		return userDataRepository.findAll();
	}
	
	public UserData save(UserData userdata) {
		return userDataRepository.save(userdata);
	}
}
