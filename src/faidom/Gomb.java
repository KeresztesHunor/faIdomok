package faidom;

public class Gomb extends FaIdom
{
    private final double sugar;
    
    public Gomb(double sugar)
    {
        this(sugar, 1);
    }
    
    public Gomb(double sugar, double fajSuly)
    {
        super(fajSuly);
        this.sugar = sugar;
    }
    
    public double getSugar()
    {
        return sugar;
    }
    
    @Override public double terfogat()
    {
        return 4 * Math.PI * Math.pow(sugar, 3) / 3;
    }

    @Override public boolean equals(Object obj)
    {
        return obj instanceof Gomb g ? super.equals(g) && sugar == g.sugar : false;
    }

    @Override public String toString()
    {
        return super.toString() + "\n\tGomb{" + "sugar=" + sugar + '}';
    }
}
