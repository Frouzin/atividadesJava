package AtividadeSemPOO;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Application {

        public static void main (String[] args){
            Locale.setDefault(Locale.US);
            Scanner scan = new Scanner(System.in);

            Triangle x,y;
            x = new Triangle();
            y = new Triangle();

            System.out.println("Enter the measures of triangle X: ");
            x.a = scan.nextDouble();
            x.b = scan.nextDouble();
            x.c = scan.nextDouble();

            System.out.println("Enter the measures of triangle Y: ");
            y.a = scan.nextDouble();
            y.b = scan.nextDouble();
            y.c = scan.nextDouble();


            double areax = x.area();

            double areay = y.area();

            System.out.printf("Triangle X area: %.4f%n", areax);
            System.out.printf("Triangle Y area: %.4f%n", areay);

            if (areax > areay){
                System.out.println("Larger area: X");
            }
            else{
                System.out.println("Larger area: Y");
            }

            scan.close();
        }
    }
