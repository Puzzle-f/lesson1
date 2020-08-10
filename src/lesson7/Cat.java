package lesson7;

public class Cat {

    private String name;
    private int appetite;
    boolean satiety;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        System.out.println(name + " eat");
        satiety = plate.decreaseFood(appetite);
        System.out.println(satiety);
    }
     }


