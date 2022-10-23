
//Aufgabe 2: Ballistische Kurve

public class Ubung2 {
	public static void main(String[] args) {
	    System.out.println("java Ballistic:");
        double x0=Double.parseDouble(args[0]),v0=Double.parseDouble(args[1]) ,t=Double.parseDouble(args[2]);
	    double g= 9.81;
        double Ergebnis=x0+v0*t-(g*t*t)/2;
	    System.out.println("The Result:"+Ergebnis);
	}

}