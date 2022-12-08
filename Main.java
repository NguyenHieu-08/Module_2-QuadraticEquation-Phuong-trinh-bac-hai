import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap c: ");
        double c = sc.nextDouble();
        
        QuadraticEquation qe = new QuadraticEquation(a,b,c);

        if(qe.getDiscriminant() > 0) {
            System.out.println("x1: " +qe.getRoot1()+ " , x2: "+qe.getRoot2());
        } else if(qe.getDiscriminant() == 0) {
            System.out.println("x: " +qe.getRoot1());
        } else {
            System.out.print("The equation has no roots");
        }
    }
}