// teste-o para os 3 casos de valores inteiros: com 4 bits, com 16 bits e com 64 bits. 
//Nestes testes, contabilize o número de iterações que o algoritmo executa, e o tempo gasto.
import java.math.*;

public class Exercicio4 {
        public static void main(String args[]) {
            double a = 3.456;
            double b = 3.456;
            double n = 64;
            Exercicio4 exer = new Exercicio4();
            System.out.println(exer.MULTIPLY(a, b, n));
        }
    
    double MULTIPLY(double x,double y,double n) {  
         if (n == 1){
             return x * y;
         } else {
         double m = Math.ceil(n / 2);
         double a = Math.floor(x / Math.pow(2, m)); 
         double b = x % Math.pow(2, m);
         double c = Math.floor(y / Math.pow(2, m)); 
         double d = y % Math.pow(2, m);
         double e = MULTIPLY(a, c, m);
         double f = MULTIPLY(b, d, m);
         double g = MULTIPLY(b, c, m);
         double h = MULTIPLY(a, d, m);
         return Math.pow(2, (2*m))*e + Math.pow(2, m)*(g + h) + f;
         }
    }
}