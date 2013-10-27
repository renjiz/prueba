package co.pruebaBeans;

public class Estudiante {

	private String name;
	private Integer edad;
	private String mensaje;

	public Estudiante() {

	}

	public Estudiante(String name) {
		this.name = name;

	}

	public void constructor1() {
		System.out.println(name);
	}

	public void tonteria(String name, Integer edad) {
		this.name = name;
		this.edad = edad;

		mensaje = "Estudiante se llama " + name + " y su edad es de " + edad
				+ ".";
		mensaje = mensaje + " Las cosas de la vida!";
		System.out.println(mensaje);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
