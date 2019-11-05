package pe.isil;

import pe.isil.model.Usuario;
import pe.isil.service.UsuarioService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {

    private static EntityManager entityManager;
    private static EntityManagerFactory builder;

    public static void main(String[] args) {
        builder = Persistence.createEntityManagerFactory("eSportsPU");
        entityManager = builder.createEntityManager();

        entityManager.getTransaction().begin();
        //entityManager.getTransaction().rollback();
        //entityManager.getTransaction().commit();

        Usuario usuario = new Usuario();
        usuario.setUserid(2000);
        usuario.setUsername("DoctorSasquatch");
        usuario.setPassword("1234");

        UsuarioService usuarioService = new UsuarioService();

        usuarioService.create(usuario);
        List<Usuario> usuarios = usuarioService.findAll();
        System.out.println("Lista de Usuarios: " + usuarios);


//        usuarioService.delete(2000);

    }
}
