package base;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


    }

    //TODO afisarea elementelor de la 1 la n,la puterea a 3.
    static void func1(int a, int b) {
        if (a > b || a == b) {
            System.out.println("a must be less than b");
        } else {
            for (int i = a; i <= b; i++) {
                System.out.println((int) Math.pow(i, 3));
            }
        }

    }

    //TODO afisearea celui mai lung cuvint din sir.
    static void func2(String[] str) {
        int index = 0;
        int elementA = str[0].length();
        for (int i = 1; i < str.length; i++) {
            if (str[i].length() > elementA) {
                index = i;
                elementA = str[i].length();
            }
        }
        System.out.println(str[index]);
        System.out.println(elementA);
    }

    //TODO tabla inmultirii.
    static void func3(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (i + 1) * (j + 1);
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    //TODO aranjarea elementelor in oridne crescatoare.
    static void func4(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


}
