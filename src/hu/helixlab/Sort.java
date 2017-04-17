package hu.helixlab;

/**
 * Created by Hp_Workplace on 2017. 04. 17..
 */
public class Sort implements ISort {

    public void bubbleSort(int array[]) {

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
        }
    }
}
