package proyectoPersona;

public class Persona {
	private char hombre = 'H';

	private String nombre = null;
	private Integer edad = null;
	private String dni = null;
	private Character sexo = hombre;
	private Float peso = null;
	private Float altura = null;

	public char getHombre() {
		return hombre;
	}

	public void setHombre(char hombre) {
		this.hombre = hombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
}
