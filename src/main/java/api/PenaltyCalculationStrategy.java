package api;

public abstract class PenaltyCalculationStrategy {
    public abstract double calculatePenalty(int daysOverdue);
}
