package Principal;

import java.util.Collection;
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {

    public static void main(String[] args) {
        
        ////////////////////////////////////////
        ////////////INSERT//////////////////////
        ////////////////////////////////////////
        
        try {
            
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ejp1_JPA_EggVideoPU");
            EntityManager em = emf.createEntityManager();
            
//            try {
//                
//                //Creo fabricantes
//                
//                Fabricante fabricante1 = new Fabricante();
//                fabricante1.setId(UUID.randomUUID().toString());
//                fabricante1.setCodigo_fabricante(1);
//                fabricante1.setNombre("popopop");
//                
//                em.getTransaction().begin();
//                em.persist(fabricante1);
//                em.getTransaction().commit();
//                
//                Fabricante fabricante2 = new Fabricante();
//                fabricante2.setId(UUID.randomUUID().toString());
//                fabricante2.setCodigo_fabricante(2);
//                fabricante2.setNombre("Prueba");
//                
//                em.getTransaction().begin();
//                em.persist(fabricante2);
//                em.getTransaction().commit();
//                
//                
//                //Creo un producto.
//                Producto producto = new Producto();
//                producto.setId(UUID.randomUUID().toString());
//                producto.setCodigo_producto(100);
//                producto.setNombre_producto("PC Portatil");
//                producto.setPrecio(100);
//                producto.setFabricante(fabricante1);
//             
//                em.getTransaction().begin();
//                em.persist(producto);
//                em.getTransaction().commit();
//                
//                
//            } catch (Exception e) {
//                System.out.println("Error en el sistema.");
//            }
           
        ////////////////////////////////////////
        ////////////CONSULTAS///////////////////
        ////////////////////////////////////////
            
        // Busco fabricante por criterio
        int codigo = 1;
        Fabricante fabricante1 = (Fabricante)em.createQuery("SELECT f"
                                                            + "  FROM Fabricante f" 
                                                            + " WHERE f.codigo = :codigo").
                                                            setParameter("codigo", 1).
                                                            getSingleResult();
//        
//        // Busco fabricante por Id.
        Fabricante fabricante2 = em.find(Fabricante.class, fabricante1.getId());
//        
//        
//        //Listo fabricante
        Collection<Fabricante> fabricantes = em.createQuery("SELECT f"
                                                            + " FROM Fabricante f").
                                                            getResultList();
//        
//        //Recorremos e imprimimos los "fabricantes".
            for (Fabricante f : fabricantes) {
                System.out.println(f.getCodigo());
                System.out.println(f.getNombre());
            }
            
        // Buscamos un "producto".
//        Producto producto = (Producto) em.createQuery("SELECT p"
//                                                    + "  FROM Producto p"
//                                                    + " WHERE p.Codigo_producto = :codigo").
//                                                    setParameter("codigo", 100).
//                                                    getSingleResult();
//        // Imprimo el "producto".
//            System.out.println(producto.getCodigo_producto());
//            System.out.println(producto.getNombre_producto());
//            System.out.println(producto.getPrecio());
//            System.out.println(producto.getFabricante().getNombre());
        
        ////////////////////////////////////////
        ////////////MODIFICAR///////////////////
        ////////////////////////////////////////
            
//            try {
//                
//                //Busco fabricante por criterio
//                int codigo = 1;
//                Fabricante fabricante = (Fabricante) em.createQuery("SELECT f"
//                                                                    + "  FROM Fabricante f"
//                                                                    + " WHERE f.codigo_fabricante = codigo"). 
//                                                                    setParameter("f.codigo_fabricante", codigo).
//                                                                    getSingleResult();
//                
//                
//                // Modifico el nombre.
//                fabricante.setNombre("Lenovo");
//                
//                em.getTransaction().begin();
//                em.merge(fabricante);
//                em.getTransaction().commit();
//                
//                
//            } catch (Exception e) {
//            }
        

        ////////////////////////////////////////
        ////////////ELIMINAR////////////////////
        ////////////////////////////////////////
        
//            try {
//                
//                //Busco el producto
//                Producto producto = (Producto) em.createQuery("SELECT p"
//                                                            + "  FROM Producto p"
//                                                            + " WHERE p.Codigo_producto = :codigo").
//                                                            setParameter("codigo", 100).
//                                                            getSingleResult();
//                
//                em.getTransaction().begin();
//                em.remove(producto);
//                em.getTransaction().commit();
//                
//                
//            } catch (Exception e) {
//                System.out.println("Error del sistema.");
//            }
//        
//        
        } catch (Exception e) {
        }
    }       
}