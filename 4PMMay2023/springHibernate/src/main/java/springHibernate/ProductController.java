package springHibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	ProductDao pDao;
	
	@GetMapping("/addProduct")
	public String addProduct() {
		pDao.save(new Product(0, "trouser", "levis",123123.2312f));
		return "product added to the database!";
	}
	
}


