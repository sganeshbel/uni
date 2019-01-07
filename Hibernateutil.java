package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernateutil {
private static SessionFactory factory;
public static SessionFactory getfactory() {
	System.out.println("factory is created");
	return factory;
}
static {
	Configuration config = new Configuration();
	config.configure();
	factory = config.buildSessionFactory();
}
}