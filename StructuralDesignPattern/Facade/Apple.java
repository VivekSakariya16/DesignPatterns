package Educational_Initiatives.DesignPatterns.StructuralDesignPattern.Facade;

public class Apple implements MobileShop{
    @Override
    public void mobileName() {
        System.out.println("IPHONE 15");
    }

    @Override
    public void price() {
        System.out.println("RS. 65000");
    }
}
