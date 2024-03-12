package ciudades;

import java.util.Scanner;

public class Ciudades {

    public static void main(String[] args) {

        int vuelos[][] = new int[6][3];
        Scanner teclado = new Scanner(System.in);

        //carga asientos disponibles 
        for (int f = 0; f < 6; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingresar cantidad de asientos disponibles en el vuelo "
                        + f + " horario " + c);
                vuelos[f][c] = teclado.nextInt();
            }
        }

        //venta de asientos 
        Scanner teclado2 = new Scanner(System.in);
        String bandera = "";
        int destino, horario, asiento;

        while (!bandera.equalsIgnoreCase("finish")) {

            System.out.println("Ingrese numero de destino");
            destino = teclado.nextInt();

            System.out.println("Ingrese numero del horario");
            horario = teclado.nextInt();

            System.out.println("Ingrese cantidad de asientos");
            asiento = teclado.nextInt();

            if (destino >= 0 && destino <= 5) {

                if (horario >= 0 && horario <= 2) {

                    if (vuelos[destino][horario] >= asiento) {
                        vuelos[destino][horario] = vuelos[destino][horario] - asiento;
                        System.out.println("Asiento reservado, quedan " + vuelos[destino][horario]);
                    } else {
                        System.out.println("Cantidad de asientos llenos ");
                    }
                } else {
                    System.out.println("Horario incorrecto, ingrese entre 0 y 2 ");
                }
            } else {
                System.out.println("Destino no encontrado, ingrese entre 0 y 5");
            }

            System.out.println("Desea continuar? Presione S para cerrar Finish");
            bandera = teclado2.next();
        }

    }

}
