package modelo.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenciaPU {

    private static EntityManagerFactory emf = 
            Persistence.createEntityManagerFactory("AcademiaPU");

    public static EntityManager createEntityManager() {
        return emf.createEntityManager();
    }

}
