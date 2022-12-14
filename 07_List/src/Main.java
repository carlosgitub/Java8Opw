import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		
		listaClientes.add(new Cliente("Ana","88776655E","955442299"));
		listaClientes.add(new Cliente("María","45776655E","955442266"));
		listaClientes.add(new Cliente("Manuel","78776655E","955442254"));
			

		 // Usamos como delimitador el dos puntos, o bien cualquier
		 // espacio/fin de línea (el \\s)
		 sc.useDelimiter("[:\\s]");


		 // Obtenemos el nombre
		 System.out.println("Bienvenido al gestor de Clientes \n");
		 
		 // Mostramos al usuario las opciones del menú
		 System.out.println("***** MENÚ ****\n"
		 		+ "* 1. Añadir nuevo cliente \n"
				+ "* 2. Eliminar cliente \n"
				+ "* 3. Buscar cliente \n"
				+ "* 4. Limpiar lista clientes \n"
				+"**********************\n");
		 
		 System.out.println("Indique una opción de Menú \n");

		 int opcionMenu = sc.nextInt();

		 if(opcionMenu==1) {
			 
			 System.out.print("Indique el NIF del cliente: ");
			 String nombre = sc.nextLine();
			 String nif = sc.nextLine();
			 
			 Cliente nuevoCliente = new Cliente("Nombre ejemplo", nif, "123456");
			 if(listaClientes.contains(nuevoCliente)) {
				 System.out.println("El cliente con nif"+nif+" ya existe");
			 } else {
				 listaClientes.add(nuevoCliente);
				 System.out.println("El cliente con nif"+nif+" ha sido añadido");
			 }
			 
			 Iterator<Cliente> it = listaClientes.iterator();
			 
			 int posicion = 0;
			 while(it.hasNext()) {
				 Cliente c = it.next();
				 System.out.println(posicion + ">> "+c.getNif());
				 posicion++;
			 }
			 
			 System.out.println(">>> Lista tamaño = "+listaClientes.size());
		 } else if(opcionMenu==2) {
			 Iterator<Cliente> it = listaClientes.iterator();
			 
			 int posicion = 0;
			 while(it.hasNext()) {
				 Cliente c = it.next();
				 System.out.println(posicion + ">> "+c.getNombre());
				 posicion++;
			 }
			 
			 System.out.println("Indique el nº de cliente que desea eliminar ");
			 int indiceEliminar = sc.nextInt();
			 listaClientes.remove(indiceEliminar);
			 
			 it = listaClientes.iterator();
			 
			 posicion = 0;
			 while(it.hasNext()) {
				 Cliente c = it.next();
				 System.out.println(posicion + ">> "+c.getNombre());
				 posicion++;
			 }
		 } else if(opcionMenu == 4) {
			 listaClientes.clear();
			 System.out.println("Lista vacía");
		 } else if(opcionMenu == 3) {
			 
		 }

		 
		 
		
	}

}
