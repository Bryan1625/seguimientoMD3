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

public class Interfaz_IdentificarFunciones extends JFrame {

	private JPanel contentPane;
	private JTextField txtSeguimientoUnidad;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_IdentificarFunciones frame = new Interfaz_IdentificarFunciones();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Interfaz_IdentificarFunciones() {
		setBounds(100, 100, 420, 265);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtSeguimientoUnidad = new JTextField("Identificador de Funciones");
		txtSeguimientoUnidad.setBounds(10, 10, 385, 92);
		txtSeguimientoUnidad.setEditable(false);
		txtSeguimientoUnidad.setBackground(Color.WHITE);
		txtSeguimientoUnidad.setFont(new Font("Arial", Font.PLAIN, 31));
		contentPane.add(txtSeguimientoUnidad);
		txtSeguimientoUnidad.setColumns(10);

		JButton btnInterseccion = new JButton("Identificar Funcion");
		btnInterseccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Utils.main(null);
			}
		});
		btnInterseccion.setFont(new Font("Arial", Font.PLAIN, 20));
		btnInterseccion.setBounds(69, 112, 260, 92);
		contentPane.add(btnInterseccion);

	}
}