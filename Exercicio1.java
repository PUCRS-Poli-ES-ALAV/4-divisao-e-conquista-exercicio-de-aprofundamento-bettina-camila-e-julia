import java.util.Random;

public class Exercicio1 {
    public static void main(String args[]) {
        int lOfArray = 32;
        Random rd = new Random();
        int[] arr = new int[lOfArray];
        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(); 
        }

        if (arr.length == 0){
            for (int i = 0; i < arr.length; ++i)
                System.out.print(arr[i] + " ");
        } else {
            Exercicio1 array = new Exercicio1();
            array.sort(arr, 0, arr.length - 1);
    
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
        }
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.print("Time in milliseconds:"+ elapsedTime);
    }

    void merge(int array[], int A, int middle, int B) {
        int n1 = middle - A + 1;
        int n2 = B - middle;
  
        int Lft[] = new int[n1];
        int Rght[] = new int[n2];
  
        for (int i = 0; i < n1; ++i)
            Lft[i] = array[A + i];
        for (int j = 0; j < n2; ++j)
            Rght[j] = array[middle + 1 + j];

        int i = 0, j = 0;
  
        int k = A;
        while (i < n1 && j < n2) {
            if (Lft[i] <= Rght[j]) {
                array[k] = Lft[i];
                i++;
            }
            else {
                array[k] = Rght[j];
                j++;
            }
            k++;
        }
  
        while (i < n1) {
            array[k] = Lft[i];
            i++;
            k++;
        }
  
        while (j < n2) {
            array[k] = Rght[j];
            j++;
            k++;
        }
    }
  
    void sort(int array[], int left, int right) {
        if (left < right) {
            int x =left+ (right-left)/2;
  
            sort(array, left, x);
            sort(array, x + 1, right);
  
            merge(array, left, x, right);
        }
    }
}