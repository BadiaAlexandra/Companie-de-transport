package ro.digitalnation.proiect;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controller {

	@GetMapping("/api/test")
	public String getString(){
	return "BUNA";
}
}
