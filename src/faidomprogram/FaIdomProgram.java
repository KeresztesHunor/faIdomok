package faidomprogram;

import faidom.FaIdom;
import faidom.Gomb;
import faidom.Hasab;

public class FaIdomProgram
{
    private final FaIdom[] faIdomok;
    
    public static void main(String[] args)
    {
        new FaIdomProgram(5).run();
    }
    
    private FaIdomProgram(int db)
    {
        faIdomok = new FaIdom[db > 0 ? db : 1];
    }
    
    private void run()
    {
        faIdomok[0] = new Gomb(2.5);
        faIdomok[1] = new Gomb(4);
        faIdomok[2] = new Hasab(3, 2.5);
        faIdomok[3] = new Hasab(1, 1.5);
        faIdomok[4] = new Hasab(2.5, 4);
        System.out.println("A fa idomok össz súlya: " + osszSuly());
        System.out.println("A gömbök össz súlya: " + gombokOsszSuly());
        System.out.println("A legkisebb térfogatú fa idom adatai: " + legkisebbTerfogatu());
        System.out.println("A legnagyobb térfogatú fa idom adatai: " + legnagyobbTerfogatu());
    }
    
    private double osszSuly()
    {
        double osszSuly = 0;
        for (FaIdom faIdom : faIdomok)
        {
            osszSuly += faIdom.suly();
        }
        return osszSuly;
    }
    
    private double gombokOsszSuly()
    {
        double gombokOsszSuly = 0;
        for (FaIdom faIdom : faIdomok)
        {
            if (faIdom instanceof Gomb g)
            {
                gombokOsszSuly += g.suly();
            }
        }
        return gombokOsszSuly;
    }
    
    private FaIdom legkisebbTerfogatu()
    {
        int legkisebbTerfogatuIndex = 0;
        for (int i = 1; i < faIdomok.length; i++)
        {
            if (faIdomok[i].terfogat() < faIdomok[legkisebbTerfogatuIndex].terfogat())
            {
                legkisebbTerfogatuIndex = i;
            }
        }
        return faIdomok[legkisebbTerfogatuIndex];
    }
    
    private FaIdom legnagyobbTerfogatu()
    {
        int legnagyobbTerfogatuIndex = 0;
        for (int i = 1; i > faIdomok.length; i++)
        {
            if (faIdomok[i].terfogat() < faIdomok[legnagyobbTerfogatuIndex].terfogat())
            {
                legnagyobbTerfogatuIndex = i;
            }
        }
        return faIdomok[legnagyobbTerfogatuIndex];
    }
}
