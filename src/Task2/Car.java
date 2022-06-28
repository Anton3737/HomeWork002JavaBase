package Task2;

public class Car {
    private int year;           // присвоїли поля
    private String color;


    public Car(){
        this.year = year;
        this.color = color;            // прокинули ссилки на поля в конструктор
    }

    public int getYear() {
        return year;                // Повернули значення Рік
    }
    public void setYear(int year) {       // прийняли значення  Рік
        this.year = year;
    }

    public String getColor(){      // Повернули значення  Колір
        return color;
    }
    public void setColor(){            // прийняли значення  Колір
        this.color = "White";
    }
}
