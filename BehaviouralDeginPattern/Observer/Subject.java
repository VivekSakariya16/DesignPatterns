package Educational_Initiatives.DesignPatterns.BehaviouralDeginPattern.Observer;


public interface Subject {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Observer subscriber);
    void notifySubscriber();
    void upload(String title);
}
