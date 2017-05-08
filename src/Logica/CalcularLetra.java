package Logica;

/*
 * By Paco Gomez
 * Esta clase realiza el calculo
 * 
 * */
public class CalcularLetra {
	
	private String dni="";
	private int dni_numero=0;
	private char letra=' ';
	
	//El constructor recibe el DNI en formato String
	public CalcularLetra(String dni) {
		this.dni=dni;
		char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		int dniEntero = Integer.parseInt(dni);
		int resto=dniEntero%23;
		this.letra=letras[resto];
	}
	
	//REaliza el calculo
	public char devolverLetra(){
		return this.letra;
	}
	
}
