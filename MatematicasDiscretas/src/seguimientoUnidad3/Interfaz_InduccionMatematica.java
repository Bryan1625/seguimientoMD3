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

public class Interfaz_InduccionMatematica extends JFrame {

	private JPanel contentPane;
	private JTextField txtInduccionMatematica;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_InduccionMatematica frame = new Interfaz_InduccionMatematica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Interfaz_InduccionMatematica() {
		setBounds(100, 100, 465, 469);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtInduccionMatematica = new JTextField("Induccion Matematica");
		txtInduccionMatematica.setBounds(76, 10, 316, 92);
		txtInduccionMatematica.setEditable(false);
		txtInduccionMatematica.setBackground(Color.WHITE);
		txtInduccionMatematica.setFont(new Font("Arial", Font.PLAIN, 30));
		contentPane.add(txtInduccionMatematica);
		txtInduccionMatematica.setColumns(10);

		JButton btnInterseccion = new JButton("Suma N Primeros Numeros Enteros Positivos");
		btnInterseccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SumaNEnterosPos.main(null);
			}
		});
		btnInterseccion.setFont(new Font("Arial", Font.PLAIN, 17));
		btnInterseccion.setBounds(42, 112, 399, 92);
		contentPane.add(btnInterseccion);

		JButton btnComplemento = new JButton("Suma N Primeros Enteros al Cuadrado");
		btnComplemento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SumaNCuadrados.main(null);
			}
		});
		btnComplemento.setFont(new Font("Arial", Font.PLAIN, 20));
		btnComplemento.setBounds(42, 214, 399, 106);
		contentPane.add(btnComplemento);

		JButton btnUnion = new JButton("Suma N Primeros Numeros Impares");
		btnUnion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SumaNImpares.main(null);
			}
		});
		btnUnion.setFont(new Font("Arial", Font.PLAIN, 20));
		btnUnion.setBounds(42, 330, 399, 92);
		contentPane.add(btnUnion);

	}
}
