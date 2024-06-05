package Educational_Initiatives.DesignPatterns.CreationalDesignPattern.Factory;

public class SedanCar extends Car {
    SedanCar(){
        super(CarType.SEDAN);
        construct();
    }
    @Override
    protected void construct() {
        System.out.println("Building sedan car");
    }
}