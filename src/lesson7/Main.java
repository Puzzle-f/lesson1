
package lesson7;
import java.util.Arrays;

public class Main {

        public static void main(String[] args) {


            Plate plate = new Plate(100);
            Cat[] cat = new Cat[5];
            cat[0] = new Cat("Barsik", 30);
            cat[1] = new Cat ("Murzik", 20);
            cat[2] = new Cat ("Zina", 40);
            cat[3] = new Cat ("Faina", 25);
            cat[4] = new Cat("Ton", 15);


            for (int i = 0; i < cat.length; i++) {
                cat[i].eat(plate);
                System.out.println(plate);
            }
        }
    }

