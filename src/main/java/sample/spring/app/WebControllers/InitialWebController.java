package sample.spring.app.WebControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InitialWebController {
	
	@RequestMapping("/")
	public String Initialise() {
		return "index";
	}
}
