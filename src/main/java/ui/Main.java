package ui;


import structures.HashTable;

import java.util.Scanner;

public class Main {
    public static String suma(int[] arr, int s) {
        HashTable<Integer, Integer> table = new HashTable<>(arr.length);
        int currentS = 0;
        for (int i = 0; i < arr.length; i++) {
            currentS += arr[i];
            if (currentS == s)
                return "(0, " + i + ")";
            Integer prevIndex = table.get(currentS - s);
            if (prevIndex != null)
                return "(" + (prevIndex + 1) + ", " + i + ")";
            table.put(currentS, i);
        }
        return "-1";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números de la lista: ");
        int cap = sc.nextInt();
        int[] arr = new int[cap];

        System.out.println("Ingrese los números de la lista:");
        for (int i = 0; i < cap; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Ingrese el número S:");
        int s = sc.nextInt();
        System.out.println(findSubArr(arr, s));
    }
}
