package Task3;

public class Main {
        public static void main(String[] args) {
                Car car = new Car( 12, 200, "Wsdfs");

                car.setYear();
                int year = car.getYear();
                System.out.println(year + " model years");

                car.setSpeed();
                double speed = car.getSpeed();
                System.out.println(speed + " km/h");

                car.setColor();
                String color = car.getColor();
                System.out.println(color + " color Auto");

                car.setWeight(1500);
                int weight = car.getWeight();
                System.out.println(weight + " kilogram");
        }

}
