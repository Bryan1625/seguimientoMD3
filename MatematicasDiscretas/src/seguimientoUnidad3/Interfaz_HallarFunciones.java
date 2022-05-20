package seguimientoUnidad3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Interfaz_HallarFunciones extends JFrame {

	private JPanel contentPane;
	private JTextField txtHallarFunciones;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_HallarFunciones frame = new Interfaz_HallarFunciones();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Interfaz_HallarFunciones() {
		setBounds(100, 100, 389, 487);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtHallarFunciones = new JTextField("Hallar Funciones");
		txtHallarFunciones.setBounds(57, 10, 250, 92);
		txtHallarFunciones.setEditable(false);
		txtHallarFunciones.setBackground(Color.WHITE);
		txtHallarFunciones.setFont(new Font("Arial", Font.PLAIN, 30));
		contentPane.add(txtHallarFunciones);
		txtHallarFunciones.setColumns(10);

		JButton btnInterseccion = new JButton("Funcion Techo");
		btnInterseccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num = Utilidades.leerDouble("Ingrese el numero que desea evaluar: ");
				int funcionTecho = FuncionesSueloTechoFrac.funcionTecho(num);
				Utilidades.imprimir("La funcion techo del numero ingresado es: " + funcionTecho);
			}
		});
		btnInterseccion.setFont(new Font("Arial", Font.PLAIN, 20));
		btnInterseccion.setBounds(47, 112, 260, 92);
		contentPane.add(btnInterseccion);

		JButton btnComplemento = new JButton("Funcion Fraccionaria");
		btnComplemento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num = Utilidades.leerDouble("Ingrese el numero que desea evaluar: ");
				double funcionFrac = FuncionesSueloTechoFrac.funcionFrac(num);
				Utilidades.imprimir("La funcion fraccionaria del numero ingresado es: " + funcionFrac);
			}
		});
		btnComplemento.setFont(new Font("Arial", Font.PLAIN, 20));
		btnComplemento.setBounds(47, 316, 260, 106);
		contentPane.add(btnComplemento);

		JButton btnUnion = new JButton("Funcion Suelo");
		btnUnion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num = Utilidades.leerDouble("Ingrese el numero que desea evaluar: ");
				int funcionSuelo = FuncionesSueloTechoFrac.funcionSuelo(num);
				Utilidades.imprimir("La funcion suelo del numero ingresado es: " + funcionSuelo);
			}
		});
		btnUnion.setFont(new Font("Arial", Font.PLAIN, 20));
		btnUnion.setBounds(47, 214, 260, 92);
		contentPane.add(btnUnion);

	}
}