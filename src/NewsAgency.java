class NewsAgency {
    private final java.util.List<NewsObserver> obs = new java.util.ArrayList<>();
    public void add(NewsObserver o){
        obs.add(o);
    }
    public void remove(NewsObserver o){
        obs.remove(o);
    }
    public void publish(String headline){
        for (NewsObserver o : obs)
            o.onNews(headline);
    }
}