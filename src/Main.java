package develhope.src;

public class Main {
    public static void main(String[] args) {
        Auto car1= new Auto ("V2", "Ferrari","AB123CD", 700);

        System.out.println(car1);
        System.out.println("The model is " + car1.getModel());

        car1.setModel("V10");
        System.out.println (car1);
        System.out.println ("The model is " + car1.getModel());
    }
}
