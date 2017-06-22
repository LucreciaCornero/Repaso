package vista;

import javax.swing.*;

public class Pantallas {
	
	public String IngresarValor(String titulo){
		
		JFrame frame=new JFrame();
		String ValorIngresado=JOptionPane.showInputDialog(frame, titulo, "");
		
		return ValorIngresado;
	}
	
	public void MostrarMensaje(String mensaje){
		JFrame frame=new JFrame();
		JOptionPane.showMessageDialog(frame, mensaje);
		
	}

}




