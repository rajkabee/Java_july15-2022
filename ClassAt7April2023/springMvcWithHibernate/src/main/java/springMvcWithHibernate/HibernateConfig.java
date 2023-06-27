package springMvcWithHibernate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScans(value = {@ComponentScan("springMvcWithHibernate")})
public class HibernateConfig {

  @Bean
  public LocalSessionFactoryBean getSessionFactory() {

    LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
    factoryBean.setPackagesToScan("com.howtodoinjava.demo.spring.model");
    factoryBean.setConfigLocation(context.getResource("classpath:hibernate.cfg.xml"));
    return factoryBean;
  }

  @Bean
  public HibernateTransactionManager getTransactionManager() {
  
    HibernateTransactionManager transactionManager = new HibernateTransactionManager();
    transactionManager.setSessionFactory(getSessionFactory().getObject());
    return transactionManager;
  }
}
