import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {		

		calculoParImpar();
	}
	
	
	static void calculoParImpar () {
		int numero = leerNumero ();
		
		if (numero%2 ==0) {
			System.out.println(numero + " es un número PAR.");
			System.out.print("Números en orden descendente: " );
			do {
				System.out.print( numero + " ");
				numero = numero -2;
			}
			while (numero >=0);
		}
		
		if (numero%2 !=0) {
			System.out.println( numero + " es un número IMPAR.");
			System.out.print("Números en orden descendente: " );
			do {
				System.out.print(numero + " ");
				numero = numero -2;
			}
			while (numero >=0);
		}
	}
	
	static int leerNumero () {
		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número entero: ");
		numero =teclado.nextInt();
		
		return numero;
		
	}
}
