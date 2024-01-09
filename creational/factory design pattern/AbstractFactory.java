public class AbstractFactory{

}
interface WheelFittingExpert {

    String getDescription();
}
interface Wheel {
    String getDescription();
}
abstract class WheelFactory {

    abstract Wheel makeWheel();
    abstract WheelFittingExpert makeFittingExpert();
}


// Car Wheel factory to return car wheel and car expert
class CarWheelFactory extends WheelFactory {

    @Override
    Wheel makeWheel() {
        return new CarWheel();
    }

    @Override
    WheelFittingExpert makeFittingExpert() {
        return new CarExpert();
    }
}

// Bike Wheel factory to return bike wheel and bike expert
class BikeWheelFactory extends WheelFactory {

    @Override
    Wheel makeWheel() {
        return new BikeWheel();
    }

    @Override
    WheelFittingExpert makeFittingExpert() {
        return new BikeExpert();
    }
}