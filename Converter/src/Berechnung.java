
public class Berechnung
{
    private double zahl;
    private double basis;
    private double mod;

    public Berechnung(double zahl, double basis, double mod)
    {
        this.zahl = zahl;
        this.basis = basis;
        this.mod = mod;
    }

    public void Dezimal(double zahl,double mod)
    {
        double div;
        double n = zahl;
        double moduloergebniss;

        for (n = zahl; n > 0; n = div)
        {
            moduloergebniss = n % mod;
            div = Math.floor(n/ mod);
            System.out.println(n + " mod " + mod + " = " + moduloergebniss + " | n = " + div);
        }        
    }

    public void Other(double zahl, double basis)
    {
        double n = zahl;
        double nextNumber;
        int counter = -1;
        double modulus;
    
        for (n = zahl ; n >= 1 ; n = nextNumber)
        {
            counter++;

            if (counter == 0)
            {
                System.out.println(n % 10);
                nextNumber = n / 10;
            }           
            else
            {
                modulus = Math.pow(basis, counter);
                
                System.out.println((Math.floor(n % 10)* modulus  ));
                nextNumber = n /10;
            }           
        }
    }

    public void check()
    {
        if(basis == 10)
        {
            Dezimal(this.zahl,this.mod);
        }
        else  
        {
            Other(this.zahl, this.basis);
        }
    }   
}