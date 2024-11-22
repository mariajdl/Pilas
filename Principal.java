import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Principal {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Stack<Integer>pilaF=new Stack<>();

        Random aleatorio=new Random();
       
        System.out.println("Ingrese el tamaño del vector: ");
        int tam=sc.nextInt();
        int vector[]=new int[tam];

        for (int i = 0; i < vector.length; i++) {
            vector[i]=aleatorio.nextInt(10);
            
        }
        System.out.println("Mostrar vector");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Posicion " + i + ": "+ vector[i]);
        }

        Principal numero = new Principal();

        Stack<Integer> pilaFacto = numero.Factorial(vector);

        System.out.println("\nFactoriales de los elementos del vector:");

            System.out.println(pilaFacto);
        

    }
        public Stack<Integer> Factorial(int vector[]){
            Stack<Integer>pilaF=new Stack<>();
            for (int num : vector) {
                int factorial = 1;
                for (int i = 2; i <= num; i++) {
                    factorial *= i;


                }
                pilaF.push(factorial);

                
            }
            return pilaF;
        }

    }


