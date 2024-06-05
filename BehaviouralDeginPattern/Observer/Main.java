package Educational_Initiatives.DesignPatterns.BehaviouralDeginPattern.Observer;

public class Main {
    public static void main(String[] args) {
        Channel CodeJOD = new Channel();

        Subscriber s1=new Subscriber("Vivek");
        Subscriber s2=new Subscriber("Utsav");
        Subscriber s3=new Subscriber("Kevin");
        Subscriber s4=new Subscriber("Monarch");
        Subscriber s5=new Subscriber("Hardeep");

        CodeJOD.subscribe(s1);
        CodeJOD.subscribe(s2);
        CodeJOD.subscribe(s3);
        CodeJOD.subscribe(s4);
        CodeJOD.subscribe(s5);

        CodeJOD.unsubscribe(s4);
        CodeJOD.unsubscribe(s5);

        s1.subscribeChannel(CodeJOD);
        s2.subscribeChannel(CodeJOD);
        s3.subscribeChannel(CodeJOD);
        s4.subscribeChannel(CodeJOD);
        s5.subscribeChannel(CodeJOD);

        CodeJOD.upload("Observer Design Pattern");
    }
}
