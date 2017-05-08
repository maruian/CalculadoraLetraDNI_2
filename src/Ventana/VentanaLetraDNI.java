package Ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Logica.CalcularLetra;


/*
 * By Paco Gomez
 * Esta ventana tendr� dos JTextFields
 * El primero recojer� el DNI
 * El segundo calcular� la letra al apretar el bot�n
 * 
 * */
public class VentanaLetraDNI extends JFrame implements ActionListener{

	private JPanel contentPane;
	JTextField txtLetra;
	JButton btnCalcular;
	JTextField txtDNI;
	/**
	 * Create the frame.
	 */
	public VentanaLetraDNI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		JLabel lblPideDNI = new JLabel("Introduce DNI:");
		txtDNI = new JTextField();
		JLabel lblResult = new JLabel("Letra DNI calculada:");
		txtLetra = new JTextField();
		txtLetra.setEditable(false);
		btnCalcular = new JButton("Calcular");
		contentPane.add(lblPideDNI);
		contentPane.add(txtDNI);
		contentPane.add(lblResult);
		contentPane.add(txtLetra);
		contentPane.add(btnCalcular);
		btnCalcular.addActionListener(this);
		btnCalcular.setActionCommand("Calcular");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand()=="Calcular"){
			CalcularLetra cl = new CalcularLetra(txtDNI.getText());
			txtLetra.setText(cl.devolverLetra()+"");
		}
		
	}

}
