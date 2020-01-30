package local.example.orchestrator.orxcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrxController {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(path = "/example/orchestrator/index", method = RequestMethod.GET)
	public String getAuthor() {

		System.out.println("\n\n\n***********] ORCHESTRATOR REDIRECT EVENT [***********\n\n\n");
		ResponseEntity<String> response = restTemplate.getForEntity("http://basic-service/example/orchestrator/index", String.class);
		return response.getBody();
	}

}
