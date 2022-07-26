import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		calculoSalario();

	}
	
	static void calculoSalario () {
		
		double horasTrabajadas =leerHorasTrabajadas();
		double tarifaDePago = leerTarifa();
		double sueldo;
		
		if (horasTrabajadas > 40) {
			sueldo = 40*tarifaDePago + (horasTrabajadas -40) * tarifaDePago*1.5;
		}
		else {
			sueldo = horasTrabajadas *tarifaDePago;
		}
		
		System.out.println("El trabajador cobrará " + sueldo +"€");
		
	}
	
	
	
	static double leerHorasTrabajadas(){
		
		Scanner in = new Scanner(System.in);
		double horasTrabajadas;
		
		System.out.print("Ingresa el valor de horas trabajadas: ");
        horasTrabajadas = in.nextDouble();
        
        return horasTrabajadas;
		
	}
	
	static double leerTarifa(){
		Scanner in = new Scanner(System.in);
		double tarifaDePago;
		
		 System.out.print("Ingresa el valor de tarifa de pago: ");
		 tarifaDePago = in.nextDouble();
	        
	        return tarifaDePago;
	}
	
	

}
