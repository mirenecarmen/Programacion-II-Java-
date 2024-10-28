package clase11Matrices.leccion10.test;

import clase11Matrices.leccion10.domain.Personas;

public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);
        edades[0][0] = 5; // Llenado manual
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;
        edades[2][0] = 2;
        edades[2][1] = 0;

        System.out.println("edades 0-0 = " + edades[0][0]);
        System.out.println("edades 0-1 = " + edades[0][1]);
        System.out.println("edades 1-0 = " + edades[1][0]);
        System.out.println("edades 1-1 = " + edades[1][1]);
        System.out.println("edades 2-0 = " + edades[2][0]);
        System.out.println("edades 2-1 = " + edades[2][1]);

        // Iteramos usando ciclos for
        System.out.println("Recorremos la matriz a través del ciclo FOR:");
        for (int fila = 0; fila < edades.length; fila++) {
            for (int col = 0; col < edades[fila].length; col++) {
                System.out.println("edades " + fila + "-" + col + ": " + edades[fila][col]);
            }
        }

        // Sintaxis simplificada para inicializar una matriz
        String frutas[][] = {{"Limon", "Pomelo"}, {"Ciruela", "Mango"}, {"Naranja", "Melón"}};
        for (int i = 0; i < frutas.length; i++) {
            for (int j = 0; j < frutas[i].length; j++) {
                System.out.println("frutas " + i + "-" + j + ": " + frutas[i][j]);
            }
        }

        // Creamos una matriz de objetos de tipo Personas
        Personas personas[][] = new Personas[2][3];
        personas[0][0] = new Personas("Ariel");
        personas[0][1] = new Personas("Osvaldo");
        personas[0][2] = new Personas("Pablo");
        personas[1][0] = new Personas("Paula");
        personas[1][1] = new Personas("Luis");
        personas[1][2] = new Personas("Ana");

        // Llamamos al método para imprimir la matriz de personas
        imprimir(personas);
    }

    public static void imprimir(Object matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz " + i + "-" + j + ": " + matriz[i][j]);
            }
        }
    }
}

