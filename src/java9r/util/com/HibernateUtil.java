package java9r.util.com;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
 
@SuppressWarnings("deprecation")
public class HibernateUtil {
    private static SessionFactory sessionFactory;
     
    static{
    	try{
    		sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
    	}catch (Throwable ex) {
    		System.err.println("Initial sessionFactory creation failed."+ex);
    		throw new ExceptionInInitializerError(ex);
			// TODO: handle exception
		}
    }
    
    
    
    
    public static SessionFactory getSessionFactory() {
    /*    if (sessionFactory == null) {
            // loads configuration and mappings
            Configuration configuration = new Configuration().configure();
            ServiceRegistry serviceRegistry
                = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
             
            // builds a session factory from the service registry
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);           
        }
         */
        return sessionFactory;
    }
}