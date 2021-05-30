package figuras;

/**
 * Esta clase deonominada Circunferencia, define una Circunferencia, dispone de los atributos radio (double)
 * y color (String)
 * 
 * @author Oscar Domínguez, <a href=
 *         "mailto:oscarluisdominguezrivero@alumno.ieselrincon.es">enviar correo
 *         electrónico</a>
 */
public class Circunferencia {
	private double radio;
	private String color;

	/**
	 * Métododo de tipo set
	 * 
	 * @param radio establece el radio de la circunferencia
	 */
	public Circunferencia(double radio) {
		this.radio = radio;
	}
	
	/**
	 * Método que imprime por pantalla el diámetro, el color y el área de la circunferencia
	 */
	public void imprimir() {
		color = "rojo";
		System.out.println("Diámetro: " + (2 * radio));
		System.out.println("Color: " + color);
		double area1 = 2 * 3.1416 * radio * radio;
		double area = area1;
		System.out.println(area);
	}
	
	/**
	 * Métdodo que devuelve un booleano cuando los radios de 2 circunferencias son iguales o 
	 * la diferencia absoluta es menor a 1, dependiendo de la variable considerarDecimales 
	 * @param considerarDecimales es una varaible booleana que nos indica si consideramos decimales o no
	 * @param otro corresponde a un objeto circunferencia con el que vamos a comparar el radio del objeto actual
	 * @return devuelve verdadero si son iguales o tienen una diferencia menor a 1, según el caso, y falso en otro caso
	 */
	public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
		double radio1 = this.radio;
		double radio2 = otro.getRadio();
		if (considerarDecimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}

	/**
	 * Método de tipo get que nos devuelve el radio de la circunferencia
	 * @return radio, el radio de la circunferencia
	 */
	public double getRadio() {
		return radio;
	}

	/**
	 * Método de tipo set que establece el radio de la circunferencia
	 * @param rad establece en el objeto circunferencia correspondiente
	 */
	public void setRadio(double rad) {
		this.radio = rad;
	}

}
