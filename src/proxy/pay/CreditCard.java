package proxy.pay;

public class CreditCard implements Payment{

    Payment cash = new Cash();

    //프록시 역할
    @Override
    public void pay(int amount) {
        if(amount > 100){
            System.out.println(amount + "신용 카드");
        } else{
            cash.pay(amount);
        }
    }
}
