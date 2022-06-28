package Task5;

public class MyArea {

    static final double PI = 3.14;
    static double R;

    public static void areaOfCircle(){
        R = 6;
        double S = (PI * R)*2;
        System.out.println("Площа круга з радіусом R " + R + "  становить: " + S);
    }
}

