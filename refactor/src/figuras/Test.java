package figuras;

/**
 * Esta clase deonominada Test, es la clase principal del proyecto que básicamente compara el radio de 2 circunferencias
 * 
 * @author Oscar Domínguez, <a href="mailto:oscarluisdominguezrivero@alumno.ieselrincon.es">enviar correo electrónico</a>
 */
public class Test {
	
	/**
	 * Es el método principal, main, del proyecto, y en él se crean tres objetos Circunferencia, aunque sólo
	 * se compara la circunferencia 2 con la 3, mediante el método "esIgual" de la clase Circunferencia. 
	 * la circunferecia 1 no se usa en el resto del código, por lo que podría ser borrada.
	 * @param args
	 */
	public static void main(String[] args) {
		Circunferencia c1 = new Circunferencia(5.5);
		Circunferencia c2 = new Circunferencia(10.1);
		Circunferencia c3 = new Circunferencia(10.9);

		if (c2.esIgual(false, c3))
			System.out.println("c2 y c3: iguales sin considerar decimales");

		if (c2.esIgual(true, c3))
			System.out.println("c2 y c3: iguales considerando decimales");
	}

}
