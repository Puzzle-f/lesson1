package lesson2;

import java.util.Arrays;
import java.util.Random;

public class Les2 {

    public static void main(String[] args) {

        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] arrayShift = {1,2,3,4,5,6,7};

    replace(array);               //1
        fill();                   //2
    multiplication();             //3
      square();                   //4
       errMinMax(errRandom());    //5
       checkAmount(array);        //6
        shift(arrayShift, -2); //7

    }

// 7 Задание

    public static void /*int[]*/ shift(int[] arr, int n){

        System.out.println(Arrays.toString(arr));

        if (n > arr.length-1){
            n = n - arr.length;
        } else if (n < 0) {
            n = arr.length + n;
        }


        for (int i = 0; i < n; i++) {
            int  b = arr[arr.length-1];
            int j = arr.length - 1;
            while ((j -1) >= 0) {
                arr[j] = arr[j-1];
                j --;
            }
arr[0] = b;
        }

            System.out.println(Arrays.toString(arr));

        }




// 6. Задание
    public static boolean checkAmount(int[] n) {
         boolean b = false;
        for (int i = 1; i < n.length - 2; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int j = 0; j < i; j++) {
                sumLeft = sumLeft + n[j];
            }
            for (int j = n.length - 1; j > i; j--) {
                sumRight = sumRight + n[j];
            }
            if (sumLeft == sumRight){
                b = true;
                System.out.println("Арифметическая середина находится на " + i + " элементе массива");
                System.out.println(b);
                return b;

            }
        }
        return b;
    }


// 5. Задание

    public static int[] errRandom() {
        Random rand = new Random();
        int[] randArr = new int[10];
        for (int i = 0; i < randArr.length; i++) {
            randArr[i] = rand.nextInt(20);
        }
        System.out.println(Arrays.toString(randArr));
        return randArr;
    }

    public static void errMinMax(int[] n) {
        int min = n[0];
        int max = n[0];

       // Arrays.sort(n); //Или так
       // min = n[0];
        // max = n[n.length-1];
        // System.out.printf("минимальное значение %d, максимальное значение %d", min, max);

        for (int i = 0; i < n.length; i++) {
            if (n[i] < min){
                min = n[i];
            } else if (n[i] > max){
                max = n[i];
            }
        }
        System.out.printf("минимальное значение %d, максимальное значение %d", min, max);
    }


// 4. Задание

        public static void square () {
            int[][] sqr = new int[5][5];

            for (int i = 0; i < sqr.length; i++) {
                for (int j = 0; j < sqr[i].length; j++) {
                    if (i == j || (i + j) == (sqr[i].length - 1)) {
                        sqr[i][j] = 1;
                    }
                    System.out.printf("%5d", sqr[i][j]);
                }
                System.out.println();
            }

        }


// 3. Задание
        public static void multiplication () {

            int[] err = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < err.length; i++) {
                if (err[i] < 6) {
                    err[i] = err[i] * 2;
                }
            }
            System.out.println(Arrays.toString(err));
        }


// 2. Задание
        public static void fill () {

            int[] emptyArr = new int[8];
            for (int i = 0; i < emptyArr.length; i++) {
                emptyArr[i] = i * 3;
            }
            System.out.println(Arrays.toString(emptyArr));
        }


// 1. Задание
        public static int[] replace ( int[] arr){

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    arr[i] = 0;
                } else {
                    arr[i] = 1;
                }
            }
            System.out.println(Arrays.toString(arr));
            return arr;
        }
    }
