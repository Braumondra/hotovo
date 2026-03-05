public class HasDigitPolicy implements PasswordPolicy {
    @Override
    public boolean okay(String password) {
        return password.matches(".*\\d*.");
    }
}
