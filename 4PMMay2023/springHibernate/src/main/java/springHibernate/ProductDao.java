package springHibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductDao {
	@Autowired
	HibernateTemplate template;
	
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	public void save(Product p) {
		template.save(p);
	}
	public void update(Product p) {
		template.update(p);
	}
	public void delete(Product p) {
		template.delete(p);
	}
	
}
