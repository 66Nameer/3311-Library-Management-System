package api;

public class PenaltyCalculation extends PenaltyCalculationStrategy{
    @Override
    public double calculatePenalty(int daysOverdue) {
        return daysOverdue*0.5;
    }
}
