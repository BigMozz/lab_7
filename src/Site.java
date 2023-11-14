public class Site
{
    public static double TAX_RATE;
    protected double units;
    protected double rate;

    public Site(double units, double rate)
    {
        this.units = units;
        this.rate = rate;
    }

    public double getBillableAmount()
    {
        return getBaseAmount() + getTaxAmount();
    }

    public double getBaseAmount()
    {
        return units * rate;
    }

    public double getTaxAmount()
    {
        return getBaseAmount() * TAX_RATE;
    }
}
