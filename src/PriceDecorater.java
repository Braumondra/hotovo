public abstract class PriceDecorater implements Price {
    protected final Price inner;

    protected PriceDecorater(Price inner) {
        this.inner = inner;
    }
}
