
public class Project {

    public static void main(String[] args) {
        // write your code here

        boolean bool = true;
        char ch = 10;
        byte by = 100;
        short sh = 1000;
        long l = 10000L;
        float flo = 10.1F;
        double d = 10.12;


        System.out.println(calculation(2,2,2,2));
        System.out.println(sum(3,100));
        defin(5);
        System.out.println(task6(8));
        hello7("Фанзиль");

        leapYear(7);
        leapYear(600);
        leapYear(8);
        leapYear(800);

    }

    public static void leapYear(int a){
        String no = "НЕ високосный";
        String yes = "високосный";
        String res;
        if(a%4 != 0 ){
            res = no;
        } else if(a%100 != 0) {
            res = yes;
        } else if(a%400 ==0){
            res = yes;
        } else{
            res = no;
        }
        System.out.println(a + " год " + res);

    }

    public static String hello7(String name){
        String hi = "Привет, " + name + "!";
        System.out.println(hi);
        return hi;
    }

    public static boolean task6(int a){
        return  (a<0);
        }

    public static void defin(int a){
        if (a>=0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean sum(int a, int b){
        int s = a + b;
        return s >= 10 && s <= 20;
    }
    public static float calculation(float a, float b, float  c, float  d){
        return a * (b + (c / d));
    }
}