public  class BasePrice implements Price {
    private final double value;
    public BasePrice(double value) { this.value = value; }
    public double getTotal() { return value; }
}
