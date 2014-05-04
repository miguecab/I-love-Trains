import javax.swing.SwingUtilities;

import vista.Principal;
import modelo.Mundo;
import controlador.Controlador;


public class Main {

	public static void main(String[] args) {/*
		// TODO Auto-generated method stub
		Mundo modelo = new Mundo();
		Principal vista= new Principal();
		Controlador control= new Controlador(modelo, vista);
		do{
			// Ejecucion del programa; Vista en ejecucion			
		}while(!modelo.isQuit()); //mientras no termine la ejecucion*/
		//Principal ventanaPrincipal = new Principal();
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run() {
				Principal.crearYMostrarGUI();
				
			}
		});

	}

}
