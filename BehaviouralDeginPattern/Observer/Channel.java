package Educational_Initiatives.DesignPatterns.BehaviouralDeginPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{
    private List<Subscriber> subscriberList = new ArrayList<>();
    public String title;


    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(Observer subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscriber() {
        for(Observer sub : subscriberList){
            sub.update();
        }
    }

    @Override
    public void upload(String title) {
        this.title=title;
        notifySubscriber();
    }
}
