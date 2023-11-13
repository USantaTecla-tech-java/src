package es.usantatecla.a0_itinerario.a6_packages.a1_regExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class App {

  public static void main(String[] args) {
    Pattern words = Pattern.compile("\\w+");
    final String TEXT = "Uno, dos, tres y cuatro.";
    Matcher matcher = words.matcher(TEXT);
    while (matcher.find()) {
      Console.instance().writeln(
        "\"" + matcher.group() + "\""
        + "(" + matcher.start() + 
        "-" + matcher.end() + ")");
    }
    Pattern separators = 
      Pattern.compile(
        "[\\s,.]+", Pattern.CASE_INSENSITIVE);
    Console.instance().writeln(
      separators.matcher(TEXT).replaceAll("\n"));
  }
}
