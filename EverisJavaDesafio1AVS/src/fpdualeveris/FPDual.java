package fpdualeveris;

import variables.Developer;

/**
 * 
 * @author Alexei Viadero
 *
 */

public class FPDual {

	/**
	 * Metodo principal
	 * 
	 * @param args
	 * @return
	 */

	void variablesChallenge() {
	}

	public static void main(String[] args) {

		/** Crear los desarrolladores */
		Developer desarrollador1 = new Developer("Fatima");
		Developer desarrollador2 = new Developer("Daniel");
		Developer desarrollador3 = new Developer("Diego");
		Developer desarrollador4 = new Developer("Juan Manuel");

		/** Nombre empresa */
		System.out.println("Nombre de empresa: " + Developer.empresa);

		/** Numero total de empleados desde los desarrolladores 1 y 4 */
		System.out.println("Número total de empleados (desde d1): " + desarrollador1.getContadorEmpleados());
		System.out.println("Número total de empleados (desde d4): " + desarrollador4.getContadorEmpleados());

		/** Número de cada desarrollador */
		System.out.println("Número de empleado de desarrollador 1: " + desarrollador1.idEmpleado);
		System.out.println("Número de empleado de desarrollador 2: " + desarrollador2.idEmpleado);
		System.out.println("Número de empleado de desarrollador 3: " + desarrollador3.idEmpleado);
		System.out.println("Número de empleado de desarrollador 4: " + desarrollador4.idEmpleado);

		/** Descontar dias de vacaciones al desarrollador */
		desarrollador2.restarDiasVacaciones(4);

		/** Dias restantes de vacaciones */
		System.out.println("Días de vacaciones de desarrollador 1: " + desarrollador1.getDiasVacaciones());
		System.out.println("Días de vacaciones de desarrollador 2: " + desarrollador2.getDiasVacaciones());
		System.out.println("Días de vacaciones de desarrollador 3: " + desarrollador3.getDiasVacaciones());
		System.out.println("Días de vacaciones de desarrollador 4: " + desarrollador4.getDiasVacaciones());
	}

}
