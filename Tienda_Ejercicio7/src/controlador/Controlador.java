package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Ventana;

public class Controlador implements ActionListener {
	//Atributos
	private Ventana ventana;

	//Método para crear objetos Controlador
	public Controlador() {

	}

	/*
	 * Método para devolver la ventana
	 */

	public Ventana getVentana() {
		return ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Apéndice de método generado automáticamente

	}

}
