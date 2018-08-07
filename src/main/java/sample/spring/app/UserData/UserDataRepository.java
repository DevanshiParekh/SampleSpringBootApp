package sample.spring.app.UserData;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDataRepository extends MongoRepository<UserData, String>{

	List<UserData> findByFname(String fname);

	List<UserData> findByLname(String lname);
	
	List<UserData> findByEmailid(String emailid);
	
	List<UserData> findByAge(int age);
}
