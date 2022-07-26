public class Ejercicio2 {

	public static void main(String[] args) {
		
		clasificacionPersonas();

	}
	
	static void clasificacionPersonas () {
		
		Persona Personas [] = leerPersonas(); 
		
		
		int totalMayoresEdad = 0;
		int totalMenoresEdad = 0;
		int hombresMayoresEdad = 0;
		int mujeresMenoresEdad = 0;
		
		
		for (Persona p:Personas) {
			if (p.getEdad()>=18) {
				totalMayoresEdad ++;
				if (p.getSexo()==Sexo.MASCULINO) {
					hombresMayoresEdad ++;
				}
			}else {
				totalMenoresEdad ++;
				if (p.getSexo() == Sexo.FEMENINO) {
					mujeresMenoresEdad ++;
				}
			}
			
		}
		
		double porcentajeMayoresEdad = ((double)totalMayoresEdad /(double)Personas.length)*100;
		double porcentajeMujeres =((double)(totalMayoresEdad - hombresMayoresEdad + mujeresMenoresEdad)/(double)Personas.length)*100;
		
		
		
		System.out.println("Hay "+totalMayoresEdad+" personas mayores de edad");
		System.out.println("Hay "+totalMenoresEdad+" personas menores de edad");
		System.out.println("Hay "+hombresMayoresEdad+" hombres mayores de edad");
		System.out.println("Hay "+mujeresMenoresEdad+" mujeres menores de edad");
		System.out.println("Hay "+porcentajeMayoresEdad+"% de personas mayores de edad");
		System.out.println("Hay "+porcentajeMujeres+"% mujeres ");
		
	}
	
	
	
	static Persona [] leerPersonas() {
		Persona Personas [] = new Persona[50];
		
		Personas[0] = new Persona(Sexo.MASCULINO,12);
		Personas[1] = new Persona(Sexo.FEMENINO,7);
		Personas[2] = new Persona(Sexo.MASCULINO,28);
		Personas[3] = new Persona(Sexo.FEMENINO,45);
		Personas[4] = new Persona(Sexo.MASCULINO,30);
		Personas[5] = new Persona(Sexo.MASCULINO,19);
		Personas[6] = new Persona(Sexo.FEMENINO,71);
		Personas[7] = new Persona(Sexo.MASCULINO,2);
		Personas[8] = new Persona(Sexo.FEMENINO,48);
		Personas[9] = new Persona(Sexo.MASCULINO,3);
		Personas[10] = new Persona(Sexo.MASCULINO,17);
		Personas[11] = new Persona(Sexo.FEMENINO,37);
		Personas[12] = new Persona(Sexo.MASCULINO,20);
		Personas[13] = new Persona(Sexo.FEMENINO,49);
		Personas[14] = new Persona(Sexo.MASCULINO,3);
		Personas[15] = new Persona(Sexo.MASCULINO,15);
		Personas[16] = new Persona(Sexo.FEMENINO,71);
		Personas[17] = new Persona(Sexo.MASCULINO,90);
		Personas[18] = new Persona(Sexo.FEMENINO,34);
		Personas[19] = new Persona(Sexo.MASCULINO,37);
		Personas[20] = new Persona(Sexo.MASCULINO,1);
		Personas[21] = new Persona(Sexo.FEMENINO,73);
		Personas[22] = new Persona(Sexo.MASCULINO,28);
		Personas[23] = new Persona(Sexo.FEMENINO,67);
		Personas[24] = new Persona(Sexo.MASCULINO,56);
		Personas[25] = new Persona(Sexo.MASCULINO,64);
		Personas[26] = new Persona(Sexo.FEMENINO,9);
		Personas[27] = new Persona(Sexo.MASCULINO,60);
		Personas[28] = new Persona(Sexo.FEMENINO,40);
		Personas[29] = new Persona(Sexo.MASCULINO,30);
		Personas[30] = new Persona(Sexo.MASCULINO,18);
		Personas[31] = new Persona(Sexo.FEMENINO,7);
		Personas[32] = new Persona(Sexo.MASCULINO,28);
		Personas[33] = new Persona(Sexo.FEMENINO,45);
		Personas[34] = new Persona(Sexo.MASCULINO,30);
		Personas[35] = new Persona(Sexo.MASCULINO,12);
		Personas[36] = new Persona(Sexo.FEMENINO,7);
		Personas[37] = new Persona(Sexo.MASCULINO,28);
		Personas[38] = new Persona(Sexo.FEMENINO,45);
		Personas[39] = new Persona(Sexo.MASCULINO,30);
		Personas[40] = new Persona(Sexo.MASCULINO,12);
		Personas[41] = new Persona(Sexo.FEMENINO,7);
		Personas[42] = new Persona(Sexo.MASCULINO,28);
		Personas[43] = new Persona(Sexo.FEMENINO,45);
		Personas[44] = new Persona(Sexo.MASCULINO,30);
		Personas[45] = new Persona(Sexo.MASCULINO,12);
		Personas[46] = new Persona(Sexo.FEMENINO,7);
		Personas[47] = new Persona(Sexo.MASCULINO,28);
		Personas[48] = new Persona(Sexo.FEMENINO,45);
		Personas[49] = new Persona(Sexo.MASCULINO,30);
		
		return Personas;
		
		
	}
	
		

}
