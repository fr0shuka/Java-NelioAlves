package src.Entities;

public class ConvertCalc {

    public final double IOF = 0.06;

    public double convert (double dollar, double quantity){
        double conversionAmount = quantity * dollar * (1 + IOF);
        return conversionAmount;
    }
}
