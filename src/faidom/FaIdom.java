package faidom;

public abstract class FaIdom
{
    private final double fajSuly;
    
    public FaIdom(double fajSuly)
    {
        this.fajSuly = fajSuly;
    }
    
    public double getFajSuly()
    {
        return fajSuly;
    }
    
    public abstract double terfogat();
    
    public double suly()
    {
        return terfogat() * fajSuly;
    }

    @Override public boolean equals(Object obj)
    {
        return obj instanceof FaIdom fi ? fajSuly == fi.fajSuly : false;
    }

    @Override public String toString()
    {
        return "FaIdom{" + "fajSuly=" + fajSuly + '}';
    }
}
