package Ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


/*
 * By Paco Gomez
 * Esta ventana tendr� dos JTextFields
 * El primero recojer� el DNI
 * El segundo calcular� la letra al apretar el bot�n
 * 
 * */
public class VentanaLetraDNI extends JFrame {

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public VentanaLetraDNI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		JLabel lblPideDNI = new JLabel("Introduce DNI:");
		JTextField txtDNI = new JTextField();
		JLabel lblResult = new JLabel("Letra DNI calculada:");
		JTextField txtLetra = new JTextField();
		txtLetra.setEditable(false);
		JButton btnCalcular = new JButton("Calcular");
		contentPane.add(lblPideDNI);
		contentPane.add(txtDNI);
		contentPane.add(lblResult);
		contentPane.add(txtLetra);
		contentPane.add(btnCalcular);
	}

}
