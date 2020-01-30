package local.example.basicresteureka;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicRestEureka {

	@RequestMapping(path = "/example/orchestrator/index", method = RequestMethod.GET)
	public String getAuthor() {
		return "This is from a basic load balanced API endpint with eureka.";
	}

}
