package to.check.docker.dockerinstallation.restresources;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/le")
public class TestRestResource {

	@GetMapping("/testkar")
	public String test() {
			System.out.println("Tested at "+new Date().toString());
			return "tested";
	}
	
}
