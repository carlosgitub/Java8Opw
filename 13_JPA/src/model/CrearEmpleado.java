package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CrearEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("EclipseLink_JPA");
		EntityManager entityManager = emFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		// INSERCION
		/*Empleado empleadoNuevo = new Empleado();
		empleadoNuevo.setNombreApellidos("Manolito Pérez");
		empleadoNuevo.setNif("44556677U");
		empleadoNuevo.setCargo("Analista de Programación");
		
		entityManager.persist(empleadoNuevo);*/
		
		Empleado buscarEmpleado = entityManager.find(Empleado.class, 2);
		System.out.println("Empleado encontrado: "+buscarEmpleado.getNombreApellidos());
		
		entityManager.remove(buscarEmpleado);
				
		entityManager.getTransaction().commit();
	
		entityManager.close();
		
	}

}
