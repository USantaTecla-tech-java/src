package es.usantatecla.a0_itinerario.a5_excepciones.a2_readText;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class App {

  public static void main(String[] args) {
    BufferedReader in = null;
    try {
      in = new BufferedReader(new FileReader("./src/main/resources/fichero.txt"));
      String linea;
      while ((linea = in.readLine()) != null) {
        System.out.println(linea);
      }
    } catch (IOException ex) {
      System.out.println("IOException al leer: " + ex.getMessage());
    } finally {
      if (in != null) {
        try {
          in.close();
        } catch (IOException ex) {
          System.out.println("IOException al cerrar: " + ex.getMessage());
        }
      }
    }
  }
}
