package es.usantatecla.u7parametrizacion.colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Juan Alberto
 */
public class Colecciones {

    public static void visualizar(String titulo, List<?> lista) {
	Iterator<?> it = lista.iterator();
	System.out.println(titulo);
	while (it.hasNext()) {
	    System.out.println(it.next());
	}
    }

    
    
    public static void main(String[] args) {
	ArrayList<Number> lista = new ArrayList<Number>();
	lista.add(new Integer(27));
	lista.add(new Integer(2));
	lista.add(new Integer(1890));
	lista.add(new Double(54.43));
	if (!lista.remove(new Integer(2))){
	    System.out.println ("Imposible borrar objeto");
	}
	Number numero = lista.remove(1);
	System.out.println ("Borrado el elemento " + numero);

	Iterator<Number> it = lista.iterator();
	System.out.println("CONTENIDO DEL ARRAYLIST:");
	while (it.hasNext()) {
	    System.out.println(it.next());
	}
	
	System.out.println("CONTENIDO DEL ARRAYLIST CON FOR PARA COLECCIONES:");
	for (Number num: lista){
	    System.out.println(num);
	}

	
	List<Integer> lista2 = new LinkedList<Integer>();
	lista2.add(new Integer(33));
	lista2.add(new Integer(44));

	System.out.println("\nCONTENIDO DEL LINKEDLIST:");
	Iterator<Integer> it2 = lista2.iterator();
	while (it2.hasNext()) {
	    System.out.println(it2.next());
	}
	
	System.out.println("CONTENIDO DEL LINKEDLIST CON FOR PARA COLECCIONES:");
	for (Integer num: lista2){
	    System.out.println(num);
	}

	lista.addAll(lista2);
//	lista.addAll (new ArrayList<String>());
	System.out.println("\nCONTENIDO AL JUNTARLAS:");
	Iterator<Number> it3 = lista.iterator();
	while (it3.hasNext()) {
	    System.out.println(it3.next());
	}
	
	System.out.println("CONTENIDO AL JUNTARLAS CON FOR PARA COLECCIONES:");
	for (Number num: lista){
	    System.out.println(num);
	}

	
	
//
//			Colecciones.visualizar ("VISALIZAR EN EL LINKEDLIST:", lista2);
//			Colecciones.visualizar ("VISUALIZAR AL JUNTARLAS", lista);

	
//	int tamano = lista2.size();
//	Number[] numeros = new Number[lista2.size()];
//	numeros = lista2.toArray(numeros);
//	System.out.println("EL LINKEDLIST EN EL ARRAY:");
//	for (int i = 0; i < tamano; i++) {
//	    System.out.println(numeros[i]);
//	}
    }

}
