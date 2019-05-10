import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controlador implements ActionListener{
	
	Menu menu;
	Modelo modelo;
	
	public Controlador(Menu menu, Modelo modelo){
		this.menu = menu;
		this.modelo = modelo;
		
		menu.btnContinue.addActionListener(this);
	}
	
	public void iniciarVista() {
		menu.setVisible(true);
		menu.setTitle("Pizzeria!");
		menu.setBounds(100, 100, 791, 526);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		modelo.iniciarModelo(menu);
	}

}
