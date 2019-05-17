public class Patron {
	
	public static void main(String[] args) {
		Menu menu = new Menu(); //Vista
		Modelo modelo = new Modelo(menu); //Modelo
		Controlador con = new Controlador(menu,modelo);
		con.iniciarVista();
	}

}
