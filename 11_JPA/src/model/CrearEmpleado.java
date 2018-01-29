package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CrearEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "11_JPA" );
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );

	      Empleado employee = new Empleado( ); 
	      employee.setNombreApellidos("Juan");
	      employee.setCargo("Jefe de proyedcto");
	      employee.setNif("76264617K");
	      
	      entitymanager.persist (employee);
	      entitymanager.getTransaction( ).commit( );
	      
	      entitymanager.close( );
	      emfactory.close( );
	}

}
