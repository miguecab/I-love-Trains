package modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.swing.JTextArea;

import controlador.CargarMundo;

/**
	Corrección por Ignacio Rocillo
	
*/

public class Mundo {
	private Tren[] trenes;
	private Senal[] senales;
	private char[][] estadoMundo;
	private static final  int DIM = 60;
	public Mundo()
	{
		try {
			String nombreArchivo = "mapa.txt";
			InputStream mapa = new FileInputStream(nombreArchivo);
			CargarMundo cargarMundo = new CargarMundo();
			estadoMundo = cargarMundo.cargarMapa(mapa);
		} catch (FileNotFoundException e) {
			System.err.println("No se ha encontrado el archivo");
		}
		/*while(true){
			recalcularEstadoTrenes();
		}*/
		
		
	}
	
	public void recalcularEstadoTrenes(){
		for(Tren e: trenes){
			 e.avanza(senales);
		}
	}
	
	//Cambio de void a JTextArea para la vista en "Mapa". Cambios indicados con un comentario "*"
	public JTextArea mostrarMapa()
	{
		/* * */JTextArea texto = new JTextArea();
		/* * */StringBuilder contenido = new StringBuilder();
		for(int i = 0; i < DIM; i++){
			for(int j = 0; j < DIM; j++){
				if(estadoMundo[j][i] == '*')//Columnas extrapoladas, se han corregido (antes era [i][j]
					//System.out.print(" ");
					/* * */contenido.append("S");	
				else 
					//System.out.print(estadoMundo[i][j]);
					/* * */contenido.append(estadoMundo[j][i]);				
			}
			//System.out.println("");
			/* * */contenido.append('\n');
		}
		/* * */texto.setText(contenido.toString());
		/* * */return texto;
	}
	
	public Senal[] getSenales() {
		return senales;
	}
	
	public void setSenal(Senal senal, int i) {
		senales[i] = senal;
	}
	
	public Tren[] getTrenes() {
		return trenes;
	}
	
	public void setTren(Tren _trenes, int i) {
		trenes[i] = _trenes;
	}
	
	public char[][] getEstadoMundo() {
		return estadoMundo;
	}
	
	public void setEstadoMundo(char[][] _estadoMundo) {
		estadoMundo = _estadoMundo;
	}
	
}
