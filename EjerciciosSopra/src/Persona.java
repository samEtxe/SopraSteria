
public class Persona {
		 
		private Sexo sexo;
		private int edad;
	 
		public Persona(Sexo sexo, int edad) {
			this.sexo = sexo;
			this.edad = edad;
		}
	 
		public Sexo getSexo() {
			return sexo;
		}
	 
	 
		public int getEdad() {
			return edad;
		}
	 
		@Override
		public String toString() {
			return "Persona [sexo=" + sexo + ", edad=" + edad +"]";
		}
	 
	}
