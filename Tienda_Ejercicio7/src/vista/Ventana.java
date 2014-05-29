package vista;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Ventana extends JFrame {
	/**
	 *
	 */
	private static final long serialVersionUID = -4833339695289396428L;
	//Atributos
	private JPanel contentPane;
	private JMenu menu;
	private JMenuBar barraMenu;
	private JMenuItem itemMenuUno, itemMenuDos;
	private JPanel panelBaseUnidades, panelTeclado;
	private JButton botonCero, botonUno, botonDos, botonTres, botonCuatro, botonCinco, botonSeis, botonSiete, botonOcho, botonNueve, botonPunto;
	private JLabel lblTrabajoRealizadoPor;
	private JMenuItem mntmCreartienda;
	private JButton btnIntro;
	private JButton boton100;
	private JButton boton50;
	private JButton boton10;
	private JButton boton2b;
	private JButton boton20;
	private JButton boton5b;
	private JButton boton1;
	private JButton boton050;
	private JButton boton020;
	private JButton btnLacteos;
	private JButton btnFrutas;
	private JButton btnPostres;
	private JPanel panelLacteos;
	private JButton btnLacteos_1;
	private JButton btnVentas;
	private JButton btnCobrar;

	/**
	 * Create the frame.
	 */
	public Ventana() {

		ponerVentana();

		ponerBarraMenu();

		ponerElementosVentana();

		ponerPanelBaseUnidades();

		ponerPanelTeclado();

	}

	private void ponerElementosVentana() {
		contentPane.setLayout(null);

		lblTrabajoRealizadoPor = new JLabel("Autor: Jes\u00FAs Aus\u00EDn Rodr\u00EDguez");
		lblTrabajoRealizadoPor.setBounds(348, 415, 176, 15);
		lblTrabajoRealizadoPor.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		contentPane.add(lblTrabajoRealizadoPor);
	}

	private void ponerBarraMenu() {
		barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);

		menu = new JMenu("Archivo");
		barraMenu.add(menu);

		JMenuItem mntmLogin = new JMenuItem("Login");
		mntmLogin.setIcon(new ImageIcon(Ventana.class.getResource("/imagenes/abrir.jpg")));
		menu.add(mntmLogin);

		mntmCreartienda = new JMenuItem("CrearTienda");
		mntmCreartienda.setIcon(new ImageIcon(Ventana.class.getResource("/imagenes/nuevo.jpg")));
		menu.add(mntmCreartienda);

		itemMenuUno = new JMenuItem("Acerca de");
		itemMenuUno.setIcon(new ImageIcon(Ventana.class.getResource("/imagenes/acercade.jpg")));
		menu.add(itemMenuUno);

		itemMenuDos = new JMenuItem("Salir");
		itemMenuDos.setIcon(new ImageIcon(Ventana.class.getResource("/imagenes/cerrar.jpg")));
		menu.add(itemMenuDos);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	}

	private void ponerPanelBaseUnidades() {
		panelBaseUnidades = new JPanel();
		panelBaseUnidades.setBounds(10, 60, 290, 159);
		panelBaseUnidades.setBackground(new Color(255, 255, 255));
		panelBaseUnidades.setFont(new Font("Arial", Font.BOLD, 12));
		panelBaseUnidades.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cat\u00E1logo de productos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panelBaseUnidades);
		panelBaseUnidades.setLayout(new CardLayout(0, 0));

		JPanel panelFrutas = new JPanel();
		panelBaseUnidades.add(panelFrutas, "name_9509879877275");

		panelLacteos = new JPanel();
		panelBaseUnidades.add(panelLacteos, "name_9479197313459");

		JPanel panelPostres = new JPanel();
		panelBaseUnidades.add(panelPostres, "name_9525916578900");
	}

	private void ponerPanelTeclado() {

		panelTeclado = new JPanel();
		panelTeclado.setBounds(310, 11, 214, 410);
		panelTeclado.setBackground(new Color(255, 255, 255));
		panelTeclado.setBorder(new TitledBorder(null, "Teclado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panelTeclado);
		panelTeclado.setLayout(null);

		botonSiete = new JButton("7");
		botonSiete.setFont(new Font("Arial", Font.PLAIN, 9));
		botonSiete.setBackground(new Color(255, 255, 255));
		botonSiete.setBounds(10, 260, 42, 31);
		panelTeclado.add(botonSiete);

		botonOcho = new JButton("8");
		botonOcho.setFont(new Font("Arial", Font.PLAIN, 9));
		botonOcho.setBounds(57, 260, 42, 31);
		panelTeclado.add(botonOcho);

		botonNueve = new JButton("9");
		botonNueve.setFont(new Font("Arial", Font.PLAIN, 9));
		botonNueve.setBounds(104, 260, 42, 31);
		panelTeclado.add(botonNueve);

		botonCuatro = new JButton("4");
		botonCuatro.setFont(new Font("Arial", Font.PLAIN, 9));
		botonCuatro.setBounds(10, 296, 42, 31);
		panelTeclado.add(botonCuatro);

		botonCinco = new JButton("5");
		botonCinco.setFont(new Font("Arial", Font.PLAIN, 9));
		botonCinco.setBounds(57, 296, 42, 31);
		panelTeclado.add(botonCinco);

		botonSeis = new JButton("6");
		botonSeis.setFont(new Font("Arial", Font.PLAIN, 9));
		botonSeis.setBounds(104, 296, 42, 31);
		panelTeclado.add(botonSeis);

		botonUno = new JButton("1");
		botonUno.setFont(new Font("Arial", Font.PLAIN, 9));
		botonUno.setBounds(10, 332, 42, 31);
		panelTeclado.add(botonUno);

		botonDos = new JButton("2");
		botonDos.setFont(new Font("Arial", Font.PLAIN, 9));
		botonDos.setBounds(57, 332, 42, 31);
		panelTeclado.add(botonDos);

		botonTres = new JButton("3");
		botonTres.setFont(new Font("Arial", Font.PLAIN, 9));
		botonTres.setBounds(104, 332, 42, 31);
		panelTeclado.add(botonTres);

		botonCero = new JButton("0");
		botonCero.setFont(new Font("Arial", Font.PLAIN, 9));
		botonCero.setBounds(10, 368, 42, 31);
		panelTeclado.add(botonCero);

		botonPunto = new JButton(".");
		botonPunto.setFont(new Font("Arial", Font.PLAIN, 9));
		botonPunto.setBounds(104, 368, 42, 31);
		panelTeclado.add(botonPunto);

		JButton button = new JButton("00");
		button.setFont(new Font("Arial", Font.PLAIN, 9));
		button.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(57, 368, 42, 31);
		panelTeclado.add(button);

		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Arial", Font.PLAIN, 9));
		btnC.setBounds(149, 260, 55, 31);
		panelTeclado.add(btnC);

		JButton button_1 = new JButton("+/-");
		button_1.setFont(new Font("Arial", Font.PLAIN, 9));
		button_1.setBounds(149, 296, 55, 31);
		panelTeclado.add(button_1);

		btnIntro = new JButton("Intro");
		btnIntro.setFont(new Font("Arial", Font.PLAIN, 9));
		btnIntro.setBounds(149, 332, 55, 67);
		panelTeclado.add(btnIntro);

		JButton boton200 = new JButton("200");
		boton200.setIcon(new ImageIcon(Ventana.class.getResource("/imagenes/200.jpg")));
		boton200.setBounds(10, 21, 89, 38);
		panelTeclado.add(boton200);

		boton100 = new JButton("");
		boton100.setIcon(new ImageIcon(Ventana.class.getResource("/imagenes/100.jpg")));
		boton100.setBounds(115, 21, 89, 38);
		panelTeclado.add(boton100);

		boton50 = new JButton("");
		boton50.setIcon(new ImageIcon(Ventana.class.getResource("/imagenes/50.jpg")));
		boton50.setBounds(10, 70, 89, 38);
		panelTeclado.add(boton50);

		boton10 = new JButton("");
		boton10.setIcon(new ImageIcon(Ventana.class.getResource("/imagenes/10.jpg")));
		boton10.setBounds(10, 119, 89, 38);
		panelTeclado.add(boton10);

		boton2b = new JButton("");
		boton2b.setIcon(new ImageIcon(Ventana.class.getResource("/imagenes/2.jpg")));
		boton2b.setBounds(10, 168, 89, 38);
		panelTeclado.add(boton2b);

		boton20 = new JButton("");
		boton20.setIcon(new ImageIcon(Ventana.class.getResource("/imagenes/20.jpg")));
		boton20.setBounds(115, 70, 89, 38);
		panelTeclado.add(boton20);

		boton5b = new JButton("");
		boton5b.setIcon(new ImageIcon(Ventana.class.getResource("/imagenes/5.jpg")));
		boton5b.setBounds(115, 119, 89, 38);
		panelTeclado.add(boton5b);

		boton1 = new JButton("");
		boton1.setIcon(new ImageIcon(Ventana.class.getResource("/imagenes/1.jpg")));
		boton1.setBounds(115, 168, 89, 38);
		panelTeclado.add(boton1);

		boton050 = new JButton("");
		boton050.setIcon(new ImageIcon(Ventana.class.getResource("/imagenes/050.jpg")));
		boton050.setBounds(10, 217, 89, 38);
		panelTeclado.add(boton050);

		boton020 = new JButton("");
		boton020.setIcon(new ImageIcon(Ventana.class.getResource("/imagenes/020.jpg")));
		boton020.setBounds(115, 217, 89, 38);
		panelTeclado.add(boton020);

		JPanel panelDatos = new JPanel();
		panelDatos.setFont(new Font("Arial", Font.BOLD, 12));
		panelDatos.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelDatos.setBackground(Color.WHITE);
		panelDatos.setBounds(10, 222, 290, 159);
		contentPane.add(panelDatos);
		panelDatos.setLayout(new CardLayout(0, 0));

		JPanel panelClientes = new JPanel();
		panelDatos.add(panelClientes, "name_10143230084344");

		JPanel panelVentas = new JPanel();
		panelDatos.add(panelVentas, "name_10169941073277");

		JPanel panelCobrar = new JPanel();
		panelDatos.add(panelCobrar, "name_10202221639593");

		btnLacteos = new JButton("Lacteos");
		btnLacteos.setBounds(10, 11, 89, 38);
		contentPane.add(btnLacteos);

		btnFrutas = new JButton("Frutas");
		btnFrutas.setBounds(109, 11, 89, 38);
		contentPane.add(btnFrutas);

		btnPostres = new JButton("Postres");
		btnPostres.setBounds(208, 11, 89, 38);
		contentPane.add(btnPostres);

		btnLacteos_1 = new JButton("Clientes");
		btnLacteos_1.setBounds(10, 392, 89, 38);
		contentPane.add(btnLacteos_1);

		btnVentas = new JButton("Ventas");
		btnVentas.setBounds(109, 392, 89, 38);
		contentPane.add(btnVentas);

		btnCobrar = new JButton("Cobrar");
		btnCobrar.setBounds(211, 392, 89, 38);
		contentPane.add(btnCobrar);
	}

	private void ponerVentana() {
		setBackground(new Color(128, 0, 128));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ventana.class.getResource("/imagenes/icono.jpg")));
		setTitle("TPV Tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 496);
	}
}
