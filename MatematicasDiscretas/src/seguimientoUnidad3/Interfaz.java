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

public class Interfaz extends JFrame {

	private JPanel contentPane;
	private JTextField txtSeguimientoUnidad;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Interfaz() {
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtSeguimientoUnidad = new JTextField("Seguimiento Unidad 3");
		txtSeguimientoUnidad.setBounds(89, 33, 406, 92);
		txtSeguimientoUnidad.setEditable(false);
		txtSeguimientoUnidad.setBackground(Color.WHITE);
		txtSeguimientoUnidad.setFont(new Font("Arial", Font.PLAIN, 40));
		contentPane.add(txtSeguimientoUnidad);
		txtSeguimientoUnidad.setColumns(10);

		JButton btnInterseccion = new JButton("Hallar Funciones");
		btnInterseccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interfaz_HallarFunciones.main(null);
			}
		});
		btnInterseccion.setFont(new Font("Arial", Font.PLAIN, 20));
		btnInterseccion.setBounds(10, 170, 260, 92);
		contentPane.add(btnInterseccion);

		JButton btnComplemento = new JButton("Identificar Funciones");
		btnComplemento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interfaz_IdentificarFunciones.main(null);
			}
		});
		btnComplemento.setFont(new Font("Arial", Font.PLAIN, 20));
		btnComplemento.setBounds(10, 335, 260, 106);
		contentPane.add(btnComplemento);

		JButton btnUnion = new JButton("Induccion Matematica");
		btnUnion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interfaz_InduccionMatematica.main(null);
			}
		});
		btnUnion.setFont(new Font("Arial", Font.PLAIN, 20));
		btnUnion.setBounds(316, 170, 260, 92);
		contentPane.add(btnUnion);

		JButton btnComplementoRelativo = new JButton("Algoritmo de Euclides");
		btnComplementoRelativo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlgoritmoEuclides.main(null);
			}
		});
		btnComplementoRelativo.setFont(new Font("Arial", Font.PLAIN, 20));
		btnComplementoRelativo.setBounds(316, 335, 260, 106);
		contentPane.add(btnComplementoRelativo);

	}
}