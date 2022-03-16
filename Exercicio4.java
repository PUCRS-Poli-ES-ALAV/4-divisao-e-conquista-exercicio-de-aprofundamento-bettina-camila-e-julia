// teste-o para os 3 casos de valores inteiros: com 4 bits, com 16 bits e com 64 bits. 
//Nestes testes, contabilize o número de iterações que o algoritmo executa, e o tempo gasto.
import java.math.*;

public class Exercicio4 {// E Exercicio5 tbm
        public static void main(String args[]) {
            long a = 1.0;
            long b = 1.0;
            long n = 0.0;
            Exercicio4 exer = new Exercicio4();
            exer.MULTIPLY(a, b, n);
        }
    
    long MULTIPLY(long x,long y,long n) {  
        // if (n == 1){
        //     return x * y;
        // } else {
        // long m = Math.ceil(n / 2);
        // long a = Math.floor(x / Math.pow(2, m)); 
        // long b = x % Math.pow(2, m);
        // long c = Math.floor(y / Math.pow(2, m)); 
        // long d = y % Math.pow(2, m);
        // long e = MULTIPLY(a, c, m);
        // long f = MULTIPLY(b, d, m);
        // long g = MULTIPLY(b, c, m);
        // long h = MULTIPLY(a, d, m);
        // return Math.pow(2, (2*m))*e + Math.pow(2, m)*(g + h) + f;
        // }
    }
}