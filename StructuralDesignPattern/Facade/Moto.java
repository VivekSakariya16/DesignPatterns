package Educational_Initiatives.DesignPatterns.StructuralDesignPattern.Facade;

public class Moto implements MobileShop{
    @Override
    public void mobileName() {
        System.out.println("Moto G16");
    }

    @Override
    public void price() {
        System.out.println("RS. 45000");
    }
}
