import java.util.Random;

public class Exercicio3 {
    public static void main(String args[]) {
        int lOfArray = 32;
        Random rd = new Random();
        int[] arr = new int[lOfArray];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(); 
        }
        Exercicio3 array = new Exercicio3();

        long start = System.currentTimeMillis();
        
        System.out.print(array.maxVal2(arr, 0, arr.length-1));
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.print("Time in milliseconds:"+ elapsedTime);
    }

    int max(int n, int x) {
        if (n > x){
            return n;
        } else {
            return x;
        }
    }

    int maxVal2(int A[], int init, int end) {  
        if (end - init <= 1)
            return max(A[init], A[end]);  
        else {
            int m = (init + end)/2;
            int v1 = maxVal2(A,init,m);   
            int v2 = maxVal2(A,m+1,end);  
            return max(v1,v2);
        }
    }
}