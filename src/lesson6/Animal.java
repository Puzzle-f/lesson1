package lesson6;

public class Animal {

String name;



public Animal (String name){
    this.name = name;
}

    public void run (int distanceRun){
        if ((distanceRun < 0)||(distanceRun > 200)){
             System.out.println("столько пробежать невозможно");
            return;
        }
          System.out.println(name + " Пробежит " + distanceRun + " метров");
    }


    public  void swum (int distanceSwum){
        if ((distanceSwum < 0)||(distanceSwum > 200)){
            System.out.println("столько проплыть невозможно");
            return;
        }
        System.out.println(name + " Проплывёт " + distanceSwum  +" метров");
    }
}
