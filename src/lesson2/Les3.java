package lesson2;

import java.util.Random;
import java.util.Scanner;

public class Les3 {


    public static void main(String args[]) {

        int attempts = 3;   // количество попыток
        //guessNumber(generatingNumber(9), attempts);
        fieldWonders();


    }
//    1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю
//        дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить
//    больше ли указанное пользователем число чем загаданное, или меньше. После победы или
//    проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).


    public static int generatingNumber(int length) {          // генерируем рандом число
        Random rand = new Random();
        int number = rand.nextInt(length);
        return number;
    }

    public static void guessNumber(int rand, int attempts) {        // игра
        Scanner user = new Scanner(System.in);
        String resum = "Вы проиграли";
        for (int i = 0; i < attempts; i++) {
            System.out.println("Введите число от 0 до 9");
            int numberUser = user.nextInt();
            if (numberUser == rand) {
                System.out.println("Поздравляю, вы угадали!");
                break;
            } else if (numberUser > rand) {
                System.out.println("Не угадали, загаданное число меньше");
                if (i == attempts) {
                    System.out.println(resum);
                }
            } else {
                System.out.println("Не угадали, загаданное число больше");
                if (i == attempts) {
                    System.out.println(resum);
                }

            }
        }
        replay();
    }

    public static void replay() {                                   // Повтор игры
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        Scanner user = new Scanner(System.in);
        int numberUser = user.nextInt();
        if (numberUser == 1) {                                      // Если пользователь согласен
            guessNumber(generatingNumber(9), 3);     // Возвращаемся в метод игры. !!!???? вместо параметра "3" длжна быть переменная int attempts = 6,
        } else if (numberUser == 0) {                               // объявленная в методе main, но здесь её не видно. Как сделать видимой?
            System.out.println("Конец игры");
        } else {
            System.out.println("некорректная команда");
            replay();
        }
    }


//2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
//        "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//        сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
//        apple – загаданное
//        apricot - ответ игрока
//        ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//        Для сравнения двух слов посимвольно, можно пользоваться:
//        String str = "apple";
//        str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//        Играем до тех пор, пока игрок не отгадает слово
//        Используем только маленькие буквы



    //С ОПЕРАЦИЯМИ НАД СТРОКАМИ НЕ РАЗОБРАЛСЯ, ПРОГРАММА НЕ РАБОТАЕТ

    public static void fieldWonders() {
        String result = "###############";                                                      // Строка для вывода
        StringBuilder res = new StringBuilder(result);                                          // переводим строку в StringBuilder для редактирования
        String[] arr = {"apple", "orange"};                                                     // для наглядности сократил массив

//                "lemon", "banana", "apricot", "avocado",
//                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
//                "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
//                "pepper", "pineapple", "pumpkin", "potato"



        int selectedNum = generatingNumber(arr.length);                 // выбираем номер слова в массиве

        String computerWord = arr[selectedNum];                         // инициализируем слово
        String user = "q";                                              // временный заведомо неправильный ответ

        do {
            System.out.println("Угадайте слово");
            Scanner player = new Scanner(System.in);
            String userAnswer = player.nextLine();                      // запрашиваем ответ пользователя
            for (int i = 0; i < computerWord.length(); i++) {            // сравниваем побуквенно ответ со словом
                //char s = result.charAt(i);
                if (computerWord.charAt(i) == userAnswer.charAt(i)) {    // если совпадает
                    String s = String.valueOf(computerWord.charAt(i));    // переводим букву в String
                    res.replace(i, i, s);                                // и добавляем её вместо #
                }

            }
            System.out.println(res);
            user = userAnswer;                                            // присваиваем ответу значение, переданное пользователем
        }

        while (user != computerWord);                                    // пока ответ не равен верному, но мне это условие не нравится
        System.out.println("Вы победили!");
    }
}