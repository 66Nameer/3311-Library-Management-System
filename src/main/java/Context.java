package src.main.java;

public class Context {
    private PenaltyCalculationStrategy penaltyStrat;


    public void setPenaltyStrat(PenaltyCalculationStrategy strategy){
        this.penaltyStrat=strategy;
    }


    public double calculatePenalty(int daysOverdue){
        return penaltyStrat.calculatePenalty(daysOverdue);
    }


}
