import java.util.Random;

public class Exercicio2 {
    public static void main(String args[]) {
        int lOfArray = 32;
        Random rd = new Random();
        int[] arr = new int[lOfArray];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(); 
        }
        Exercicio2 array = new Exercicio2();

        long start = System.currentTimeMillis();

        System.out.print(array.maxVal1(arr, arr.length));
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.print("Time in milliseconds:"+ elapsedTime);
    }

    int maxVal1(int A[], int n) {
        int max = A[0];
        for (int i = 1; i < n; i++) {  
            if( A[i] > max ) 
               max = A[i];
        }
        return max;
    }
}
