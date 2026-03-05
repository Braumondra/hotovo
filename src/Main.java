//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PaymentAdapter paymentAdapter = new PaymentAdapter();
        paymentAdapter.pay(10);

        Price p = new DiscountDecorator(new VatDecorator(new BasePrice(100)));
        System.out.println(p.getTotal());


        PasswordStrategy checker = new PasswordStrategy(new LenPolicy(6));


        checker.setPasswordPolicy(new HasDigitPolicy());
        if (checker.check("Kardsaadsel64")){
            System.out.println(6546);
        }

        NewsAgency agency = new NewsAgency();
        agency.add(new WebClient());
        agency.add(new MobileClient());
        agency.publish("New Java version released!");


    }
}