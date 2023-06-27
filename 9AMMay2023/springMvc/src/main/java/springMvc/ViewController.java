package springMvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ViewController {
	@GetMapping("/products")
	public String products() {
		return "products.jsp";
	}
}
