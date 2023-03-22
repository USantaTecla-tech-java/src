package es.usantatecla.u7parametrizacion.util3;

public class Fecha implements Comparable<Fecha> {

	private Integer dia;
	private Integer mes;
	private Integer año;

	public Fecha(Integer dia, Integer mes, Integer año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public boolean iguales(Fecha fecha) {
		return dia.equals(fecha.dia) &&
			   mes.equals(fecha.mes) &&
			   año.equals(fecha.año);
	}

	public boolean distintas(Fecha fecha) {
		return (!this.iguales(fecha));
	}

	public String toString() {
		return dia + "/" + mes + "/" + año;
	}

	public int compareTo(Fecha fecha) {
		if (año == fecha.año) {
			if (mes == fecha.mes) {
				return dia.compareTo(fecha.dia);
			} else {
				return mes.compareTo(fecha.mes);
			}
		} else {
			return año.compareTo(fecha.año);
		}
	}

	public static void main(String[] args) {
		Fecha fecha11 = new Fecha(
			Integer.valueOf(1), Integer.valueOf(1), new Integer(1982));
		Fecha fecha12 = new Fecha(
				new Integer(31), new Integer(12), new Integer(1982));
		Intervalo<Fecha> intervaloFechas1 = new Intervalo<Fecha>(
				fecha11, fecha12);

		Fecha fecha21 = new Fecha(
				new Integer(1), new Integer(4), new Integer(1982));
		Fecha fecha22 = new Fecha(
				new Integer(30), new Integer(4), new Integer(1982));
		Intervalo<Fecha> intervaloFechas2 = new Intervalo<Fecha>(
				fecha21, fecha22);

		System.out.println("El intervalo " + intervaloFechas1 +
				(intervaloFechas1.incluye(intervaloFechas2) ? " SI" : " NO") +
				" incluye al intervalo " + intervaloFechas2);
	}
}
