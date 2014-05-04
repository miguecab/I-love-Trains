package controlador;

import java.util.ArrayList;

import modelo.*;

public class sujetoMundo 
{
	// Atributos
    Tren misTrenes[];
    Senal misSenales[];
/*
Revisado por Christian �?lvarez
-Se han colocado las llaves, renombrar correctamente los atributos.
*/

//    observadores misObservadores[];
    ArrayList<Observador> misObservadores;
    // SOLO DEL MUNDO

    // Métodos
    void anadir(Observer miObservador){// Añadir un observador a cierto sujeto
    	misObservadores.add(miObservador);
    }
    void quitar(Observer miObservador){ // Obvio, joder
    	misObservadores.remove(miObservador);
    }
    void notificar(){ // Recibir un update
    	// Supongo que notificar a los observadores
    	for (Observador o : misObservadores) o.notificar();
    }
    void actualizar(){ // Actualizar la información de un sujeto (método de un observador)
	for (Observador o : misObservadores) o.actualizar();
    }
    void getEstado(){ // Toma un estado de una entidad
    	// ¿qué entidad?
    }
    void setEstado(){ // Modifica el estado de una entidad
    	// ¿qué entidad?
    }
}
