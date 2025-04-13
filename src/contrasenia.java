import java.util.Scanner;

public class contrasenia {
    public static void main(String[] args) {

// 2. Realizar un programa que indique usuario y contraseña con un máximo de 3 intentos.
// Si supera la cantidad de intentos con datos
//inválidos: mostrar un mensaje indicando que se ha bloqueado el usuario.


        Scanner sc= new Scanner(System.in);
        int cantIntentos=0;
        String contIng="";
        String cont="admin";

        System.out.println("Ingrese la contraseña");

        do{
            cantIntentos++;
            contIng= sc.next();
            if (contIng.equals(cont)){
                cantIntentos=3;
                System.out.printf("La Contraseña ingresado es correcto");
            }else{
                System.out.println("La Contraseña ingresado es incorrecto");
            }


        }while(cantIntentos<3);

        if (cantIntentos==3 && (!contIng.equals(cont))){
            System.out.println("Supero los 3 intentos");
        }else{
            System.out.print("Ingreso");

        }

    }

}

