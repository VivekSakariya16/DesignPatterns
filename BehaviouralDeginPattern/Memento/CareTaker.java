package Educational_Initiatives.DesignPatterns.BehaviouralDeginPattern.Memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    List<Memento> mementoList = new ArrayList<>();
    public void addMemento(Memento m){
        mementoList.add(m);
    }

    public Memento getMemento(int i){
        return mementoList.get(i);
    }
}
