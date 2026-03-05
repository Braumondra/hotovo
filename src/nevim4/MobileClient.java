package nevim4;

class MobileClient implements NewsObserver {
    public void onNews(String h){
        System.out.println("MOBILE: " + h);
    }
}