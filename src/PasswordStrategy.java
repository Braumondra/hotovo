public class PasswordStrategy  {

    private PasswordPolicy passwordPolicy;
    public PasswordStrategy(PasswordPolicy passwordPolicy) {
        this.passwordPolicy = passwordPolicy;
    }

    public void setPasswordPolicy(PasswordPolicy passwordPolicy) {
        this.passwordPolicy = passwordPolicy;
    }

    public boolean check(String pi){
        return passwordPolicy.okay(pi);
    }
}
