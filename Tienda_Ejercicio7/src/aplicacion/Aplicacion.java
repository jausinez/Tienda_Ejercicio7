package aplicacion;

import graficos.PosicionVentana;

import javax.swing.JFrame;

import vista.Ventana;
import controlador.Controlador;

/* Esta clase contiene el m�todo main para ejecutar la aplicaci�n, comienza
 * creando un objeto de tipo Aplicacion con dos atributos la ventana y el
 * controlador.
 * Para centrar la ventana se utiliza un m�todo centrar() de la clase
 * presengrafica.Ventanas que forma parte de la librer�a presentaciongrafica.
 */

public class Aplicacion {
	//Atributos
	private final Controlador controlador;
	private final Ventana ventana;

	/* Constructor */
	public Aplicacion() {
		controlador = new Controlador();
		ventana = controlador.getVentana();
		iniciar();
	}

	public void iniciar() {
		ventana.setSize(1000, 1000);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		PosicionVentana.centrarVentana(ventana);
	}

	/* M�todo para ejecutar la aplicaci�n. */

	public static void main(String[] args) {
		new Aplicacion();
	}
}// Fin de la clase Aplicacion
