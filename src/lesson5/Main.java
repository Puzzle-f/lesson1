package lesson5;

import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        Person Person1 = new Person("Jurij Telegin", "machinist", "puzzleuri@mail.ru", "8664953", 100000, 30);

        Person1.info();
        arr();

    }

    public static void arr() {
        Person[] personsArray = new Person[5];
        personsArray[0] = new Person("Kulagin Evgenij", "boss", "culaginpapa@mail.ru", "5465464", 155003, 32);
        personsArray[1] = new Person("Chika Sergej", "nub", "chikanub@gemail.com", "65464644664", 10001, 30);
        personsArray[2] = new Person("Gennadij Bober", "Homyak", "vsyovdom@laet.ua", "03", 200000, 45);
        personsArray[3] = new Person("Vova Dlinnij", "Pisaka", "gurchitruchey@gizn'.go", "-", 15000, 47);
        personsArray[4] = new Person("Natalya Zaya", "Dizainer", "milashka@ushlaotmenya.nesud'ba", "65464", 30000, 38);



        for (int i = 0; i < personsArray.length; i++) {
            if (personsArray[i].age > 40) {
                personsArray[i].info();
            }
        }
    }
}



