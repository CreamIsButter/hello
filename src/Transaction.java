// Brody Vandiver
// 12/5/2022
// Prog213v

public class Transaction {
    private String myType;
    private double myAmount;

    public Transaction(String type, double amount) {
        myType = type;
        myAmount = amount;
    }

    public String getCode() { return myType; }
    public double getAmount() { return myAmount; }
}
