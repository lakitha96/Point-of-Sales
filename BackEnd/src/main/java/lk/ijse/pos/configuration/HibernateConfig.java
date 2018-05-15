package lk.ijse.pos.configuration;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;


@Configuration
@EnableTransactionManagement
public class HibernateConfig {

    @Autowired
    @Qualifier("dataSource")
    @Bean
    public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
        LocalSessionFactoryBean sfb = new LocalSessionFactoryBean();
        sfb.setDataSource(dataSource);
        sfb.setPackagesToScan(new String[] {"lk.ijse.pos.entity"});
        Properties props = new Properties();
        props.setProperty("dialect","org.hibernate.dialect.MySQL5Dialect");
        sfb.setHibernateProperties(props);
        return sfb;
    }


    @Autowired
    @Bean
    public HibernateTransactionManager transactionManager(SessionFactory sf){
        HibernateTransactionManager htm = new HibernateTransactionManager();
        htm.setSessionFactory(sf);
        return htm;
    }

}
