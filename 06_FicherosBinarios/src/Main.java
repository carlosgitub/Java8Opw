import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileOutputStream ficheroSalida = null;
		DataOutputStream salida = null;
		
		try {
			ficheroSalida = new FileOutputStream("/Users/miguelcampos/nuevoFichero.dat");
			salida = new DataOutputStream(ficheroSalida);
			
			System.out.print("Introduce un número entero (-1 para finalizar):");
			int n = sc.nextInt();
			
			while(n!=-1) {
				salida.writeInt(n);
				System.out.print("Introduce un número entero (-1 para finalizar):");
				n = sc.nextInt();
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
				try {
					if(ficheroSalida!=null) {
						ficheroSalida.close();
					}
					
					if(salida!=null) {
						salida.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		}
		
		
		// LECTURA DE FICHERO BINARIO
		FileInputStream fis = null;
		DataInputStream entrada = null;
		int numeroEntrada;
		
		try {
			fis = new FileInputStream("/Users/miguelcampos/nuevoFichero.dat");
			entrada = new DataInputStream(fis);
			
			while(true) {
				numeroEntrada = entrada.readInt();
				System.out.println(numeroEntrada);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("Fin del fichero");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				if(fis!=null) {
					fis.close();
				}
				
				if(entrada!=null) {
					entrada.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
		
		
    }



}
