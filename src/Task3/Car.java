package Task3;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;


    // перегрузили конструкор Car 4 рази

    public Car(int year){    // конструктор з 1м параметром
        this.year = year;
    }
    public Car(int year, double speed){   // конструктор з 2ма параметрами
        this.year = year;
        this.speed = speed;
    }
    public Car(int year, double speed, String color){    // конструктор з 3ма параметрами
        this.year = year;
        this.speed = speed;
        this.color = color;
    }
    public Car(){               // конструктор з 4ма параметрами
        this.year = year;
        this.speed = speed;
        this.color = color;
        this.weight = weight;
    }

    // Гетери
    public int getYear() {
        return year;
    }
    public double getSpeed() {
        return speed;
    }
    public String getColor() {
        return color;
    }
    public int getWeight() {
        return weight;
    }

    // Сеттери
    public void setYear() {
        this.year = year;
    }
    public void setSpeed() {
        this.speed = speed;
    }
    public void setColor() {
        this.color = "Red";
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
