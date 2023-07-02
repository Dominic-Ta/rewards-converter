public class RewardValue {
    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public double miles_to_cash(){
        return (int)this.milesValue / 0.0035;
    }
    public int getCashValue(){
        return (int)this.cashValue;
    }
    public int getMilesValue(){
        this.milesValue = this.cashValue * 0.0035;
        return (int)this.milesValue;
    }
}
