package proyectoPersona;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		String nombre;
		Integer edad;
		Character sexo;
		Float peso, altura;
		Persona p1, p2, p3;
		PersonaServicios personaServicios = new PersonaServicios();

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Introduce tu nombre:");
		nombre = reader.readLine();
		System.out.println("Introduce tu edad:");
		edad = Integer.parseInt(reader.readLine());
		System.out.println("Introduce tu sexo:");
		sexo = reader.readLine().charAt(0);
		System.out.println("Introduce tu peso:");
		peso = Float.parseFloat(reader.readLine());
		System.out.println("Introduce tu altura:");
		altura = Float.parseFloat(reader.readLine());

		p1 = personaServicios.crear(nombre, edad, personaServicios.generarDni(), sexo, peso, altura);

		p2 = personaServicios.crear();
		p2.setAltura(1.65f);
		p2.setPeso(78.2f);
		p2.setEdad(14);

		p3 = new Persona();
		p3.setNombre("Samuel Díaz");
		p3.setEdad(31);
		p3.setDni(personaServicios.generarDni());
		p3.setSexo('V');
		p3.setPeso(72.4f);
		p3.setAltura(1.86f);

		if (personaServicios.esMayorDeEdad(p1) == true) {
			System.out.println(p1.getNombre() + " es mayor de edad");
		} else {
			System.out.println(p1.getNombre() + " NO es mayor de edad");
		}
		if (personaServicios.esMayorDeEdad(p2) == true) {
			System.out.println(p2.getNombre() + " es mayor de edad");
		} else {
			System.out.println(p2.getNombre() + " NO es mayor de edad");
		}
		if (personaServicios.esMayorDeEdad(p3) == true) {
			System.out.println(p3.getNombre() + " es mayor de edad");
		} else {
			System.out.println(p3.getNombre() + " NO es mayor de edad");
		}

		System.out.println(personaServicios.calcularIMC(p1));
		System.out.println(personaServicios.calcularIMC(p2));
		System.out.println(personaServicios.calcularIMC(p3));

	}
}
