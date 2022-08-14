import jdk.jfr.internal.MetadataLoader;
import sun.jvm.hotspot.oops.Metadata;

import javax.management.StandardMBean;

public class Msin {
    public static void main(String[] args) {
StandardServiceRegistry registry = new StandardServiceRegistry().configure("hibernate.cfg.xml").bild();

Metadata metadata = MetadataSources(registry),getMeradataBilder().build();
SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

Session session = sessionFactory.openSessopn();
    }

    private static Metadata MetadataSources(StandardServiceRegistry registry) {
    }
}
