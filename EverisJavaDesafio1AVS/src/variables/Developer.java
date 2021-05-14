package variables;

/**
 * 
 * @author Alexei Viadero
 *
 */

public class Developer {
	public String nombre;
	public int diasVacaciones;
	public int idEmpleado;
	public int contadorEmpleados;
	public static String empresa = "EVERIS";

	/**
	 * @param nombre
	 * @param diasVacaciones
	 * @param idEmpleado
	 */
	public Developer(String nombre) {
		this.nombre = nombre;
		this.diasVacaciones = 21;
		this.idEmpleado = contadorEmpleados + 1;
		contadorEmpleados++;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the idEmpleado
	 */
	public int getIdEmpleado() {
		return idEmpleado;
	}

	/**
	 * @param idEmpleado
	 *            the idEmpleado to set
	 */
	public void setIdEmpleado(int idEmpleado) {
		if (contadorEmpleados >= 127) {
			System.out.println("Alcanzado el numero maximo de empleados");
		}
		this.idEmpleado = contadorEmpleados;
	}

	/**
	 * @return the contadorEmpleados
	 */
	public int getContadorEmpleados() {
		return contadorEmpleados;
	}

	/**
	 * @param contadorEmpleados
	 *            the contadorEmpleados to set
	 */
	public void setContadorEmpleados(int contadorEmpleados) {
		this.contadorEmpleados = contadorEmpleados;
	}

	/**
	 * @return the empresa
	 */
	public static String getEmpresa() {
		return empresa;
	}

	/**
	 * @param empresa
	 *            the empresa to set
	 */
	public static void setEmpresa(String empresa) {
		Developer.empresa = empresa;
	}

	/**
	 * @param diasVacaciones
	 *            the diasVacaciones to set
	 */
	public void setDiasVacaciones(int diasVacaciones) {
		this.diasVacaciones = diasVacaciones;
	}


	public int getDiasVacaciones() {
		return diasVacaciones;
	}

	public void restarDiasVacaciones(int dias) {
		if (dias < 1)
			System.out.println("Numero no valido");
		else {
			diasVacaciones = diasVacaciones - dias;
			if (diasVacaciones < 0)
				diasVacaciones = 0;
		}
	}

}
