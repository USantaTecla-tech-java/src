package es.usantatecla.a0_itinerario.a5_excepciones.a4_readBinary;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class App {

  public static void main(String[] args) {
    DataInputStream in = null;
    try {
      in = new DataInputStream(new FileInputStream("./src/main/resources/fichero.dat"));
      System.out.println(in.readInt() + String.valueOf(in.readChar()) +
          in.readUTF() + in.readDouble());
      System.out.println(in.readInt() + String.valueOf(in.readChar()) +
          in.readUTF() + in.readDouble());
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
