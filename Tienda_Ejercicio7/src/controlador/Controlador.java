package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Ventana;

public class Controlador implements ActionListener {
	//Atributos
	private Ventana ventana;

	//M�todo para crear objetos Controlador
	public Controlador() {

	}

	/*
	 * M�todo para devolver la ventana
	 */

	public Ventana getVentana() {
		return ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Ap�ndice de m�todo generado autom�ticamente

	}

}
