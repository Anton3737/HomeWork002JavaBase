package Task2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.setYear(2020);
        int year = car.getYear();


        car.setColor();
        String color = car.getColor();

        System.out.println(year);
        System.out.println(color);
    }

}
