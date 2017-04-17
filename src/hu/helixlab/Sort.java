package hu.helixlab;

/**
 * Created by Hp_Workplace on 2017. 04. 17..
 */
public class Sort implements ISort {

    public void bubbleSort(int array[]) {
/*
        for (int i = array.length - 1; i >= 1; --i) {
            for (int j = 0; j <= i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int v = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = v;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        } */

        for (int i = array.length - 1; i >= 1; --i) {
            int swap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int v = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = v;
                    ++swap;
                }
            }
            if (swap == 0) {
                break;
            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public void insertionSort(int array[]) {
    }

    public void selectionSort(int array[]) {
    }

    public void mergeSort(int array[]) {
    }

    public void quickSort(int array[]) {
    }
}