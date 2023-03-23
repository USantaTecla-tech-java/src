package es.usantatecla.aX_dispensers.a8_parametrized.a4_map.a1_arrays;

public class App {

  public static void main(String[] args) {
    Map<String, Integer> map = new Map<String, Integer>();
    map.put("Enero", Integer.valueOf(31));
    map.put("Febrero", Integer.valueOf(28));
    map.put("Marzo", Integer.valueOf(31));
    map.put("Abril", Integer.valueOf(30));
    map.put("Mayo", Integer.valueOf(31));
 
    Console.getInstance().writeln("Enero = " + map.get("Enero"));
    Console.getInstance().writeln("Febrero = " + map.get("Febrero"));
    Console.getInstance().writeln("Marzo = " + map.get("Marzo"));
    Console.getInstance().writeln("Abril = " + map.get("Abril"));
    Console.getInstance().writeln("Mayo = " + map.get("Mayo"));

    map.put("Febrero", Integer.valueOf(29));
    Console.getInstance().writeln("Enero = " + map.get("Enero"));
    Console.getInstance().writeln("Febrero = " + map.get("Febrero"));
    Console.getInstance().writeln("Marzo = " + map.get("Marzo"));
    Console.getInstance().writeln("Abril = " + map.get("Abril"));
    Console.getInstance().writeln("Mayo = " + map.get("Mayo"));
  }

}
