package sk.com.ymca.javastart.lecture1.classwork.ex3;

public class Counts {
    public static void main(String[] args) {
        double quantity = 10 ;
        double price = 34.5;
        double discount = 0.75;
        double total;
        total = (quantity >= 10) ? (quantity * price * discount) : (quantity * price);
        System.out.println(total);
    }
}
