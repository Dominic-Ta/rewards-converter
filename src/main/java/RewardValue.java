public class RewardValue {
    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue*0.0035;
    }
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue/0.0035;
    }
    public int getCashValue(){
        return (int)this.cashValue;
    }
    public int getMilesValue(){
        return (int)this.milesValue;
    }
}
