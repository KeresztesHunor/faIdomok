package faidom;

public class Hasab extends FaIdom
{
    private final double alapTerulet;
    private final double magassag;
    
    public Hasab(double alapTerulet, double magassag)
    {
        this(alapTerulet, magassag, 1);
    }
    
    public Hasab(double alapTerulet, double magassag, double fajSuly)
    {
        super(fajSuly);
        this.alapTerulet = alapTerulet;
        this.magassag = magassag;
    }
    
    public double getAlapTerulet()
    {
        return alapTerulet;
    }
    
    @Override public double terfogat()
    {
        return alapTerulet * magassag;
    }

    @Override public boolean equals(Object obj)
    {
        return obj instanceof Hasab h ? super.equals(h) && alapTerulet == h.alapTerulet && magassag == h.magassag : false;
    }

    @Override public String toString()
    {
        return super.toString() + "\n\tHasab{" + "alapTerulet=" + alapTerulet + ", magassag=" + magassag + '}';
    }
}
