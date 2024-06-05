package Educational_Initiatives.DesignPatterns.BehaviouralDeginPattern.Memento;

public class Main {
    public static void main(String[] args) {
        Originator or = new Originator();
        CareTaker ct = new CareTaker();

        or.setState("First State");
        System.out.println();

        or.setState("Second State");
        ct.addMemento(or.saveStateToMemento());
        System.out.println("Saved");
        System.out.println();

        or.setState("Third State");
        ct.addMemento(or.saveStateToMemento());
        System.out.println("Saved");
        System.out.println();

        or.setState("Forth State");
        System.out.println();

        or.getStateFromMemento(ct.getMemento(0));
        System.out.println("1st saved state is: "+or.getState());
        System.out.println();

        or.getStateFromMemento(ct.getMemento(1));
        System.out.println("2nd saved state is: "+or.getState());
        System.out.println();

        ct.addMemento(or.saveStateToMemento());
        System.out.println("Saved");
        System.out.println("3rd saved state is: "+or.getState());
        System.out.println();

        System.out.println("Last two output is same.\n" +
                "Because the last value of state is the same as the state of the second memento, \n" +
                "it is the same as the second preserved state.");
    }
}
