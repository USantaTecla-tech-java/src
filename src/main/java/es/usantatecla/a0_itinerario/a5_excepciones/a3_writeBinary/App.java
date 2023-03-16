package es.usantatecla.a0_itinerario.a5_excepciones.a3_writeBinary;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class App {

  public static void main(String[] args) {
    DataOutputStream out = null;
    try {
      out = new DataOutputStream(new FileOutputStream("./src/main/resources/fichero.dat"));
      out.writeInt(1);
      out.writeChar(':');
      out.writeUTF(" juan = ");
      out.writeDouble(5.5);
      Console.getInstance().writeln("Fichero generado");
    } catch (IOException ex) {
      System.out.println("IOException al escribir: " + ex.getMessage());
    } finally {
      if (out != null) {
        try {
          out.close();
        } catch (IOException ex) {
          System.out.println("IOException al cerrar: " + ex.getMessage());
        }
      }
    }
  }
}
