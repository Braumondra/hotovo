public class PaymentAdapter implements PaymentGateway {
    private OldPayment oldPayment=new OldPayment();
    @Override
    public void pay(double amountEur) {
        oldPayment.payCzk((int) Math.round(amountEur*25));
    }
}
