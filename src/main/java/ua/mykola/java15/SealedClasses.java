package ua.mykola.java15;

public class SealedClasses {
    public static void main(String[] args) {

    }
}

sealed class Vehicle permits Car, Bike, Truck  {}


non-sealed class Car extends Vehicle {}
final class Bike extends Vehicle {}
non-sealed class Truck extends Vehicle {}

//Для примера
//Может наследовать non-sealed
class SportCar extends Car{}
//не может наследовать файнал класс
//class Home extends Bike{}


//Интерфейсы
sealed interface Phone permits Iphone, Samsung {}

non-sealed interface Iphone extends Phone {}
sealed interface Samsung extends Phone permits GoldSamsung {}

non-sealed interface GoldSamsung extends Samsung {}
