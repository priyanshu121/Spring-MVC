package springmvc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
import springmvc.model.User;

@Repository // This registers the class as a Spring Bean
public class userDao {

    @Autowired // Autowire the SessionFactory
    private SessionFactory sessionFactory;

    @Transactional
    public int saveUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        Integer id = (Integer) session.save(user);
        return id;
    }
}
