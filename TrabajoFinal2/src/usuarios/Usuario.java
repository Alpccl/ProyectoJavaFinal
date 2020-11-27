package usuarios;

public class Usuario {
	
	protected String nombre;/*minimo 10 a 50 caracteres*/
	protected String fechaNacimiento;/*obligatorio y String = dd/mm/aaaa*/
	protected String run;/*menor a 99.999.999*/
	
	public Usuario(String nombre, String fechaNacimiento, String run) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}

	
	public Usuario() {
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getRun() {
		return run;
	}

	public void setRun(String run) {
		this.run = run;
	}


	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaNacimiento=" + 
				fechaNacimiento + ", run=" + run + "]";
	}
	
	//metodo
	
public void analizarUsuario() {
	
	/*method asociado a clase padre que retorna datos de nombre y run
	 * 
	 */
		
		System.out.println("el Usuario " + nombre+ "run: " + run);
	}
	
public void datosUsuario() {
	nombre ="";
	if (nombre.length()>= 10 && nombre.length()<=50) {
		System.out.println("Datos ingresados con exito");
	}else {
		System.out.println("datos invalidos, reintente nuevamnete");
	}
	fechaNacimiento="";//cambiar formato a FECHA VER METHOD
	if (nombre.length()>= 10 && nombre.length()<=50) {
		System.out.println("Datos ingresados con exito");
	}else {
		System.out.println("datos invalidos, reintente nuevamnete");
	}
	run ="";
	if (run.length()<=99999999) {
		System.out.println("Datos ingresados con exito");
	}else {
		System.out.println("datos invalidos, reintente nuevamnete");
	}
}
	
}
