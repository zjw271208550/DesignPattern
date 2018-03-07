package SimpleFactoryPattern;

public class Client {
    public static void main(String[] args){
        AbstractProduct_Vehicle car = Factory.createVehicle(Product_Car.class);
        car.load();

        AbstractProduct_Vehicle truck = Factory.createVehicle(Product_Truck.class);
        truck.load();
    }
}
