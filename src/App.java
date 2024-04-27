import java.util.Scanner;
//Gustavo Rafael Fuentes Corea 2024-1347U 
public class App {
   
        public static int num1;
    public static int num2;
    public static int num3;
    // suma de numeros pequeños 
    public static int sumarpequeños (int num1,int num2, int num3){
        int menor= Math.min(num1, num2) ;
        int menor2= Math.min(Math.max(num1, num2), num3) ;
        return menor2+menor; 
    }
    //Resta de numeros grandes 
    public static int restagrandes (int num1, int num2, int num3){
        int mayor= Math.max(num1, num2);
        int mayor2= Math.max(Math.min(num1, num2), num3); 
        if (mayor2>mayor) {
            return mayor2-mayor;
        }else {
            return mayor-mayor2; 
        }
    }
    // Encontrar el numero mayor 
    public static int numeromayor (int num1, int num2, int num3) {
        int mayor2= Math.max(Math.max(num1, num2), num3); 
        return mayor2; 
    }
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        do {

            try {
                System.out.println("Ingrese tres numeros enteros diferentes");
                num1 = leer.nextInt();
                num2 = leer.nextInt();
                num3 = leer.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ingrese valores correctos");
                leer.nextLine();
            }

    } while (num1 == num2 || num1 == num3 || num2 == num3);

    // Se muestran las operaciones ya efectuadas 
    
    System.out.println("La suma de los números más pequeños es "+sumarpequeños(num1, num2, num3));
    System.out.println("La resta de los números más grandes es  "+restagrandes(num1, num2, num3));
    System.out.println("El número mayor es "+numeromayor(num1, num2, num3)); 
    leer.close();
}
}
