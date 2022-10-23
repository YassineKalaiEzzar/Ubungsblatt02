
//Aufgabe 3: Wurfelsimulator 

public class Ubung3 {
	public static void main(String[] args) {
	   System.out.println("Java Random:");
	   int Nbr1=Integer.parseInt(args[0]),Nbr2=Integer.parseInt(args[1]);
	   for (int i=0;i<8;i++){
    	   double Reslt=Math.random()*(Nbr2-Nbr1)+Nbr1;
    	   System.out.println((int)Reslt);
	}}

}