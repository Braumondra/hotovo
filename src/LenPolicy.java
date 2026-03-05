public class LenPolicy implements PasswordPolicy{
    private int  delka;
    public LenPolicy(int password){
        this.delka = password;
    }
    public LenPolicy() {
    }

    @Override
    public boolean okay(String password) {
        return password.length() >= delka;
    }
}
