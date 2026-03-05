class WebClient implements NewsObserver {
    @Override
    public void onNews(String h){
        System.out.println("WEB: " + h);
    }
}