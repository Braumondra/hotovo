public class DiscountDecorator extends PriceDecorater {
    public DiscountDecorator(Price inner) { super(inner); }
    public double getTotal() { return inner.getTotal() * 0.90; }
}
