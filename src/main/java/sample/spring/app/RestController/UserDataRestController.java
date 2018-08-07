package sample.spring.app.RestController;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sample.spring.app.UserData.UserData;
import sample.spring.app.UserData.UserDataService;

@RestController
@RequestMapping("/rest/userData")
public class UserDataRestController {
	
	@Autowired
	UserDataService userDataService;
	
	@RequestMapping("/save")
	public UserData saveUserData() {
		UserData userdata = new UserData();
		Random random = new Random();
		int test = random.nextInt();
		String fname = String.valueOf(test)+" fname";
		String lname = String.valueOf(test)+" lname";
		userdata.setFname(fname);
		userdata.setLname(lname);
		userdata.setAge(random.nextInt());
		userdata.setEmailid(fname+"@something.com");
		userdata = userDataService.save(userdata);
		return userdata;
	}
}
