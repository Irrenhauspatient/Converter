import java.util.Scanner;


public class Converter {
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Geben sie die Zahl ein, dann die Basis und anschließend die gewünschte Basis als Ergebnis");

        Scanner scanner = new Scanner(System.in);        
        Berechnung berechnung1 = new Berechnung(scanner.nextDouble() , scanner.nextDouble(), scanner.nextDouble());        
        scanner.close();
        System.out.println(" ");

        berechnung1.check();        
    }
}
