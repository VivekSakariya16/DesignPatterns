package Educational_Initiatives.DesignPatterns.StructuralDesignPattern.Facade;

public class Samsung implements MobileShop{
    @Override
    public void mobileName() {
        System.out.println("Samsung S24");
    }

    @Override
    public void price() {
        System.out.println("Rs. 85000");
    }
}
