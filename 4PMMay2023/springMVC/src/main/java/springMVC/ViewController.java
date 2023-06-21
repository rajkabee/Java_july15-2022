package springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
	@RequestMapping("/products")
	public String products(Model model) {
		model.addAttribute("msg", "Hello from Spring web MVC!");
		return "products.jsp";
	}
	
	
}
