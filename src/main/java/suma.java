import java.util.Scanner;
public class suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Introduzca primer número");
        int num1 = scanner.nextInt();

        System.out.println("Introduzca segundo número");
        int num2 = scanner.nextInt();
        
        System.out.println("Introduzca tercer número");
        int num3 = scanner.nextInt();
       
        System.out.println("Introduzca tercer número");
        int num4 = scanner.nextInt();
        
        System.out.println("El resultado de la suma es");
        int resultado = num1 + num2 + num3 + num4;
        
        System.out.println ("Si sumamos "+num1+" más "+num2+", "+num3+" y "+num4+" nos da como resultado "+resultado+"");

        scanner.close();
    }
}

//*ALEJANDRO KNOBLOK*//