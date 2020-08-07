package lesson6;

public class Main {
    public static void main(String[] args) {
int quantityDog = 0;
int quantityCat = 0;

        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Тузик");
        animals[1] = new Cat("Леопольд");
        animals[2] = new Dog("Бобик");
        animals[3] = new Cat("Кот");

        animals[0].run(200);
        animals[1].swum(5);
        animals[2].swum(5);
        animals[3].run(300);

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Dog){
                quantityDog++;
            } else {
                quantityCat++;
            }
        }

        System.out.printf("Всего животных %d, котов %d, собак %d", quantityCat + quantityDog, quantityCat, quantityDog);

    }
}
