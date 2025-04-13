import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        //1. Realizar un programa que genere un número aleatorio,
        // entre 1 y 10, y le pida al usuario que adivine el número, sin límite de intentos.
        //Ayuda: para generar el nro:  (int)(Math.random() * 10 + 1);


        Scanner sc= new Scanner(System.in);
        int nroAzar= (int)(Math.random() * 10 + 1);
        int cantIntentos=0;
        boolean sigueJugando=true;
        int nroUsuario=0;

        System.out.println("Ingrese el nro que crees que es al azar");

        do{
            cantIntentos++;
            nroUsuario= sc.nextInt();
            if (nroUsuario==nroAzar){
                sigueJugando=true;
                System.out.printf("El numero ingresado es correcto");
            }else{
                sigueJugando=false;
                System.out.println("El numero ingresado es incorrecto");
            }


        }while(sigueJugando==false);


        System.out.print("Felicitaciones");

    }}