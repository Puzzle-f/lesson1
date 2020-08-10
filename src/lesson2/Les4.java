package lesson2;

import java.util.Random;
import java.util.Scanner;

public class Les4 {
    static final int SIZE = 5;
//    static final int DOTS_TO_WIN = 3;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';
    static final int WINLENGTH = 3;

    static char[][] map;

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWinNew(DOT_X)) {
                System.out.println("Ты победил! ");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья!");
                break;
            }


            terminatorT800(DOT_O, DOT_X);
            printMap();
            if (checkWinNew(DOT_O)) {
                System.out.println("Компьютер победил! ");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья!");
                break;
            }

        }
    }


    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x, y;

        do {
            System.out.println("Input X, Y ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));

        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static void aiTurn() {
        int x, y;

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(y, x));

        map[y][x] = DOT_O;
    }

    public static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean checkWinNew(char c) {


        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {

                int counterDiagonal1 = 0;
                int counterDiagonal2 = 0;
                int counterWinLine = 0;
                int counterWinColumn = 0;

                for (int k = 1; k < WINLENGTH; k++) {

                    if ((map[i][j] == c) && ((j + k) < SIZE) &&                         // если в строке стоит "х"
                        (map[i][j + k] == c)) {                                         // и в следующих двух клетках строки - тоже
                        counterWinLine++;
                    }
                    if ((map[j][i] == c) && ((j + k) < SIZE) &&                         // если в столбце стоит "х"
                        ((map[j + k][i]) == c)) {                                       // и в следующих двух клетках столбца - тоже
                        counterWinColumn++;
                    }
                    if ((map[i][j] == c) && ((j + k) < SIZE) && ((i + k) < SIZE) &&     // диагональ нисходящая
                        (map[i + k][j + k] == c)) {
                        counterDiagonal1++;
                    }
                    if ((map[i][j] == c) && ((i - k) >= 0) && ((j + k) < SIZE) &&       // диагональ восходящая
                        (map[i - k][j + k] == c)) {
                        counterDiagonal2++;
                    }
                }
                if (counterWinLine == (WINLENGTH - 1) || counterWinColumn == (WINLENGTH - 1) ||
                        counterDiagonal1 == (WINLENGTH - 1) || counterDiagonal2 == (WINLENGTH - 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void terminatorT800(char worldDomination, char humanity) {     // T800 сражается за  мировое господство worldDomination,
        for (int i = 0; i < SIZE; i++) {                                         // против человечества humanity.
            for (int j = 0; j < SIZE; j++) {
                                                            // ПОБЕДА
                if (map[i][j] == DOT_EMPTY){                 // если место пустое,
                    map[i][j] = worldDomination;             // заполяем его элементом Т800,
                    if (checkWinNew(worldDomination)){       // если T800 победит
                        return;                               //  - оставляем
                    } else {
                        map[i][j] = DOT_EMPTY;                // иначе делаем пустым обратно.
                    }
                }
    if (map[i][j] == DOT_EMPTY){                    // БЛОКИРОВАНИЕ
        map[i][j] = humanity;                       // заполяем его элементом пользователя,
        if (checkWinNew(humanity)){                 // если пользователь победит
            map[i][j] = worldDomination;            // заполняем элементом Т800.
            return;
        } else {
            map[i][j] = DOT_EMPTY;                  // иначе делаем пустым обратно.
        }
    }
                    }
                }
        int x, y;                               // случайный ход
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(y, x));

        map[y][x] = worldDomination;
            }

                }


