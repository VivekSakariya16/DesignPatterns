package Educational_Initiatives.DesignPatterns.BehaviouralDeginPattern.Observer;

public class Subscriber implements Observer{

    private String name;
    private Channel channel=new Channel();

    public Subscriber(String name) {
        this.name = name;
    }
    @Override
    public void update() {
        System.out.println("Hello, "+name+" your video was uploaded on-> "+channel.title);
    }

    @Override
    public void subscribeChannel(Channel channel) {
        this.channel=channel;
    }
}
