package Educational_Initiatives.DesignPatterns.BehaviouralDeginPattern.Memento;

public class Originator {
    public String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println(state);
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento m){
        state = m.getState();
    }
}
