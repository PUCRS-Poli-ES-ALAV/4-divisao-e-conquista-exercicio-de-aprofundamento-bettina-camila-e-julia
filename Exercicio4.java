// teste-o para os 3 casos de valores inteiros: com 4 bits, com 16 bits e com 64 bits. 
//Nestes testes, contabilize o número de iterações que o algoritmo executa, e o tempo gasto.
import java.math.*;

public class Exercicio4 {
        public static void main(String args[]) {
            long a = 1500;
            long b = 1000;
            long n = 64;
            Exercicio4 exer = new Exercicio4();
            System.out.println(exer.MULTIPLY(a, b, n));
        }
    
    long MULTIPLY(long x,long y,long n) {  
        int count = 0;
        if (n == 1){
            count = count + 1;
            return x * y;
        } else {
        long m = n / 2;
        long a = x / (long)Math.pow(2, m); 
        long b = x % (long)Math.pow(2, m);
        long c = y / (long)Math.pow(2, m); 
        long d = y % (long)Math.pow(2, m);
        long e = MULTIPLY(a, c, m);
        long f = MULTIPLY(b, d, m);
        long g = MULTIPLY(b, c, m);
        long h = MULTIPLY(a, d, m);
        
        return ((long)Math.pow(2, (2*m)))*e + ((long)Math.pow(2, m)*(g + h) + f);
        }
    }
}