package Educational_Initiatives.DesignPatterns.CreationalDesignPattern.Factory;

public abstract class Car {
     private CarType model = null;
     protected abstract void construct();
     public Car(CarType model) {
       this.model = model;
       arrangeParts();
     }
     private void arrangeParts() {
         System.out.println("Car parts are arranging for "+ getModel() + " model.");
     }
     public CarType getModel() {
       return model;
     }
}