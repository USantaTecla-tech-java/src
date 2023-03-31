package es.usantatecla.a0_itinerario.a7_parametrized.a1_multimap;

public class App {
  public static void main(String[] args) {

		MultiMap<String, Integer> multimap = new MultiMap<String, Integer>();
		multimap.add("Enero", Integer.valueOf(1));
		multimap.add("Enero", Integer.valueOf(2));
		multimap.add("Enero", Integer.valueOf(1));
		multimap.add("Febrero", Integer.valueOf(1));
		multimap.add("Febrero", Integer.valueOf(1));
		multimap.add("Marzo", Integer.valueOf(1));
		multimap.add("Marzo", Integer.valueOf(3));
		multimap.add("Marzo", Integer.valueOf(2));

		System.out.println("Enero = " + multimap.get("Enero"));
		System.out.println("Febrero = " + multimap.get("Febrero"));
		System.out.println("Marzo = " + multimap.get("Marzo"));
		System.out.println("Abril = " + multimap.get("Abril"));

		MultiMap<Fraction, String> multimap2 = new MultiMap<Fraction, String>();
		multimap2.add(new Fraction(1,2), "a medias");
		multimap2.add(new Fraction(1,2), "fifty-fifty");
		multimap2.add(new Fraction(1,2), "a medias");
		multimap2.add(new Fraction(1,10), "décimo");

		System.out.println(new Fraction(1,2) + "= " + multimap2.get(new Fraction(1,2)));
		System.out.println(new Fraction(1,3) + "= " + multimap2.get(new Fraction(1,3)));
		System.out.println(new Fraction(1,10) + "= " + multimap2.get(new Fraction(1,10)));
	}

}
