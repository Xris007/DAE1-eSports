package pe.isil;

import pe.isil.model.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    private static EntityManager entityManager;
    private static EntityManagerFactory builder;

    public static void main(String[] args) {
        builder = Persistence.createEntityManagerFactory("isilPU");
        entityManager = builder.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().commit();

        Usuario usuario = new Usuario();
        usuario.setUserid(1000);
        usuario.setUsername("DoctorSasquatch");
        usuario.setPassword("1234");

        entityManager.persist(usuario);
        Usuario usuario1 = entityManager.find(Usuario.class, 1000);
        System.out.println("User = " + usuario1);

        entityManager.getTransaction().commit();
    }
}
