package Sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.SortedMap;

public class BubbleSort {

    private static int[] bubbleSortAlgo(int[] mas){
        int [] sortedMas = mas;

        boolean isSorted = false;
        int temp;
        while (!isSorted){
            isSorted = true;

            for (int i=1; i<sortedMas.length; i++){
                if(sortedMas[i] < sortedMas[i-1]){
                    temp = sortedMas[i-1];
                    sortedMas[i-1] = sortedMas[i];
                    sortedMas[i] = temp;
                    isSorted = false;
                }
            }
        }

        return sortedMas;
    }

    public static void main(String[] args) {
        Random random = new Random();

        int n = 1_000_000;

        int[] mas = new int[n];

        for (int i =0; i<n; i++){
            mas[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(mas));
        mas = BubbleSort.bubbleSortAlgo(mas);

        System.out.println(Arrays.toString(mas));
    }


}
