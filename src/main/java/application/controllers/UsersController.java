package application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsersController {
	
//	@Autowired private UserService userService;
	
	@RequestMapping("/users")
	public String index(Model model){

		return "users/index";
	}
	

}
