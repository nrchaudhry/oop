package pk.edu.uog.student.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
@RequestMapping("/student")
public class studentController {

	@RequestMapping(method = RequestMethod.GET)
	public String get() {
		return "Welcome to Student API!";
	}

	@RequestMapping(value="/all", method = RequestMethod.GET)
	public String getAll() {
		return "Welcome to All Student API!";
	}

	@RequestMapping(value="/one", method = RequestMethod.GET)
	public String getOne() {
		return "Welcome to One Student API!";
	}
}
