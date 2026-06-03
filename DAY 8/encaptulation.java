class bankaccount{
    private double balance;
    public void setBalance(int amount){
        balance += amount;
    }
    public double getBalance(){
        return balance;
    }

}

public class encaptulation {
    public static void main(String[] args) {
        bankaccount account = new bankaccount();
        account.setBalance(1000);
        System.out.println("Balance: " + account.getBalance());
    }
        
}
