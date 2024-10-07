package tn.iit.controller;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")

public class HelloController {
	@GetMapping("/home")
	public String goToHello(Model model) { //initialiser automatiquement par spring
		model.addAttribute("date",LocalTime.now()) ;
		return "hello"; //le nom du fichier html , dans le repertoire templates
	}
	@GetMapping("/home2")
	public ModelAndView goToHello2() {
		ModelAndView modelAndView = new ModelAndView() ;
		modelAndView.addObject("date", LocalDate.now()); //envoi de données à la vue
		modelAndView.setViewName("hello") ;
		return  modelAndView ; //le nom du fichier html (view), dans le repertoire templates
	}


}
