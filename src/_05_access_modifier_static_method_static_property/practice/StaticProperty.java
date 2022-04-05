package _05_access_modifier_static_method_static_property.practice;

public class StaticProperty {
    public static class Car {

        private String name;

        private String engine;



        public static int numberOfCars;



        public Car(String name, String engine) {

            this.name = name;

            this.engine = engine;

            numberOfCars++;

        }
        public void showCar(){
            System.out.println(this.name+" "+this.engine+" "+numberOfCars);
        }



        // getters and setters

    }

    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyactiv 3");

        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mazda 6","Skyactiv 6");

        System.out.println(Car.numberOfCars);
        car1.showCar();
        car2.showCar();
    }
}
