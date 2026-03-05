public class VatDecorator extends PriceDecorater{
    public VatDecorator(Price inner) { super(inner); }
    public double getTotal() { return inner.getTotal() * 1.21; }
}
