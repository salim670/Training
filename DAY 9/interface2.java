interface payment{
    void MakePayment();
}
class phonepay implements payment{
    public void MakePayment(){
        System.out.println("Payment made using PhonePay");
    }
}
class googlepay implements payment{
    public void MakePayment(){
        System.out.println("Payment made using GooglePay");
    }
}
class paytm implements payment{
    public void MakePayment(){
        System.out.println("Payment made using Paytm");
    }
}


public class interface2 {
    public static void main(String[] args) {
        payment p1 = new phonepay();
        payment p2 = new googlepay();
        payment p3 = new paytm();
        
        p1.MakePayment();
        p2.MakePayment();
        p3.MakePayment();
    
    }
    
}
