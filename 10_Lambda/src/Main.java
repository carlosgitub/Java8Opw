import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		InterfaceNumero iNumero = (x) -> x+2;
		System.out.println(iNumero.devolverNumero(5));
		
		InterfacePredicado iPredicado = (x) -> {
			if(x%2==0) return true;
			else return false;
		};
		
		System.out.print("Es par el nº 3? "+iPredicado.esPar(3));
		
		
		ArrayList<String> animales = new ArrayList();
		animales.add("elefante");
		animales.add("mono");
		animales.add("perro");
		animales.add("gato");
		animales.add("caballo");
		animales.add("chimpancé");
		
		animales.removeIf(elemento -> elemento.startsWith("c"));
		System.out.println(animales.toString());
	}
		
}
