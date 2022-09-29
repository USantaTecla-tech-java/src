package es.usantatecla.a2_texts.a2_morseTranslator.v0_0;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        final char[] LETTERS = new char[] { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        final String[] MORSE = new String[] { "/ ", ".- ", "-... ", "-.-. ", "-.. ", ". ", "..-. ", "--. ", ".... ",
                ".. ", ".--- ", "-.- ", ".-.. ", "-- ", "-. ", "--- ", ".--. ", "--.- ", ".-. ", "... ", "- ", "..- ",
                "...- ", ".-- ", "-..- ", "-.-- ", "--.. " };
        final String sentence = console.readString("Dime algo: ");
        String message = "";
        for (int i = 0; i < sentence.length(); i++) {
            int character = sentence.charAt(i);
            if ('A' <= character && character <= 'Z') {
                character = sentence.charAt(i) - 'A';
            } else if (character < 'a' || 'z' < character) {
                character = ' ';
            }
            for (int j = 0; j < MORSE.length; j++) {
                if (character == LETTERS[j]) {
                    message += MORSE[j];
                }
            }
        }
        console.writeln("La frase " + sentence + "se traduce a " + message);
    }
}
