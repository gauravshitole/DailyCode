package factory;

public class FactoryCar {
    public Car getCar(String carName){
        if("Fortuner".equalsIgnoreCase(carName)){
            return new FourtunerCar();
        }
        else if("Swift".equalsIgnoreCase(carName)){
            return new SwiftCar();
        } else if ("Thar".equalsIgnoreCase(carName))
            {
              return new  TharCar();
            }else{
                throw  new IllegalArgumentException("Invalid Input");
            }

        }
    }

