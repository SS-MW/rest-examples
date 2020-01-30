package local.example.basicrest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

	@RequestMapping(path = "/example/basic", method = RequestMethod.GET)
	public String getAuthor() {
		return "Basic REST Controller Example";
	}

}
