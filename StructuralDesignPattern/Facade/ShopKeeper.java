package Educational_Initiatives.DesignPatterns.StructuralDesignPattern.Facade;

public class ShopKeeper {
    private MobileShop samsung;
    private MobileShop apple;
    private MobileShop moto;

    public ShopKeeper(){
        samsung = new Samsung();
        apple = new Apple();
        moto = new Moto();
    }

    public void buySamsung(){
        samsung.mobileName();
        samsung.price();
    }

    public void buyApple(){
        apple.mobileName();
        apple.price();
    }

    public void buyMoto(){
        moto.mobileName();
        moto.price();
    }
}
