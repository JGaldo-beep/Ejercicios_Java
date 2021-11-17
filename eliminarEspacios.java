import java.util.Scanner;

public class EliminarCadenaDeTexto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String cadena;
		//int i;
		
		System.out.println("Eliminacion de espacios de una cadena de texto");
		System.out.print("Ingrese una cadena de texto: ");
		cadena = input.nextLine();
		
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) != ' ') {
				for (int j = i; j < cadena.length(); j++, i++) {
					System.out.print(cadena.charAt(j));
					if (cadena.charAt(j) == ' ') {
						//System.out.print(" ");
						break;
					}
				}
			}
		}
		
		/*for (int j = i; j < cadena.length(); j++) {
			System.out.println(cadena.charAt(j));
			if (cadena.charAt(i) == ' ') {
				System.out.println(" ");
				break;
			}
		}*/
		
		//cadenaSinEspacios = cadena.trim();		
		//System.out.println(cadenaSinEspacios);
		
		/*for (int i = 0; i < cadena.length(); i++) {
			             	
			if (cadena.charAt(i) != ' ') {
				for (int j = i; j < cadena.length()-i; j++) {
					System.out.println(cadena.charAt(j) + " ");
					if (cadena.charAt(j) == ' ') {
						System.out.println(' ');
						break;
					}
				}
			}
			
			if (cadena.charAt(i) == ' ') {
				continue;
			}
			System.out.print(cadena.charAt(i) + " ");
		}*/
	}

}
