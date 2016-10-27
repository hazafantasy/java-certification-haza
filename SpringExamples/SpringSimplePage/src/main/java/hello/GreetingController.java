package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {


/*
	The @RequestMapping annotaion ensures that HTTP requests
	to /greeting are mapped to greeting() method.
	For this example we are not specifying GET, PUT or POST.
	So this controller will map everything by default.
	To narrow this mapping you need to use
	@RequestMapping(method=GET)
*/

	@RequestMapping("/greeting")
	public String greeting(
		@RequestParam(value="name", required = false,
		defaultValue="World") String name,
		Model model) {
		
		model.addAttribute("name", name);
		return "greeting";
	}

}
