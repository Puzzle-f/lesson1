
package lesson7;
import java.util.Arrays;

public class Main {


        public static void main(String[] args) {
//        Box box1 = new Box("RED", 5);
//        Box box2 = new Box("red", 5);
//
//        if (box1.equals(box2)) {
//            System.out.println("equals");
//        } else {
//            System.out.println("no equals");
//        }
//
//        System.out.println(box1.hashCode());
//        System.out.println(box2.hashCode());

//
//        String s = "java";

//        s = s + "1";
//        System.out.println(s);
//
//        for (int i = 0; i < 1000000; i++) {
//            s += "1";
//        }

//        String s1 = "java";
//        String s2 = new String("java");
//        System.out.println(s.equals(s2));

//        Integer x = 128;
//        Integer y = 128;
//        System.out.println(x.equals(y));
//
//        x = x + 1;
//
//        for (int i = 0; i < 1000000; i++) {
//            System.out.println(i);
//        }


//        StringBuilder sb = new StringBuilder("java");
////        for (int i = 0; i < 1000000; i++) {
////            sb.append("1");
////        }
//        sb.append(" abcd");
//        System.out.println(sb);
//        sb.setLength(sb.length()-3);
//        System.out.println(sb);
//        sb.insert(2,123);
//        System.out.println(sb);
//        sb.replace(3,5, " core ");
//        System.out.println(sb);

//        String s1 = "java,core,home";
//        String[] arr = s1.split(",");
//        System.out.println(Arrays.toString(arr));

//        String s = "1\n2\t3\"abc";
//        System.out.println(s);

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

