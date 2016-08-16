package body.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainCtrl {

	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	public String homeRequest(Model model) {
		return "index";
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String testRequest() {

		return "test";
	}

}
