package proyectoPersona;

public class PersonaServicios {
	public Persona crear() {
		Persona persona = new Persona();
		return persona;
	}

	public Persona crear(String nombre, Integer edad, Character sexo) {
		Persona persona = new Persona();
		persona.setNombre(nombre);
		persona.setEdad(edad);
		persona.setSexo(comprobarSexo(sexo));

		return persona;
	}

	public Persona crear(String nombre, Integer edad, String dni, Character sexo, Float peso, Float altura) {
		Persona persona = new Persona();
		persona.setNombre(nombre);
		persona.setEdad(edad);
		persona.setDni(dni);
		persona.setSexo(comprobarSexo(sexo));
		persona.setPeso(peso);
		persona.setAltura(altura);

		return persona;
	}

	public String generarDni() {
		Integer numero = (int) (40000000 + Math.random() * 400000000);
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		Character letra = letras.charAt(numero % 23);
		String dni = numero.toString() + letra.toString();

		return dni;
	}

	public String calcularIMC(Persona persona) {
		Float imc;
		imc = (float) (persona.getPeso() / (Math.pow(persona.getAltura(), 2)));
		return String.format("%s, tu IMC es: %s%n", persona.getNombre(), imc);
	}

	public Boolean esMayorDeEdad(Persona persona) {
		Boolean mayorDeEdad = false;
		if (persona.getEdad() >= 18) {
			mayorDeEdad = true;
		}
		return mayorDeEdad;
	}

	private Character comprobarSexo(Character sexo) {
		if (sexo != 'H' && sexo != 'M') {
			sexo = 'H';
		}
		return sexo;
	}

	public String info(Persona persona) {
		return String.format("Nombre: %s%n" + "Edad: %s%n" + "DNI: %s%n" + "Sexo: %s%n" + "Peso: %s%n" + "Altura: %s%n",
				persona.getNombre(), persona.getEdad(), persona.getDni(), persona.getSexo(), persona.getPeso(),
				persona.getAltura());
	}
}
