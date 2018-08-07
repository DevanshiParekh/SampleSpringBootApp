package sample.spring.app.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class InitialRestcontroller {

	@RequestMapping("/displayHello")
	public String displayHello() {
		return "Heya! This RestController Works fine :) :)";
	}
}
