package clase11Matrices.leccion10.test;

public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int [3]; //del lado izq estamos declarando la variable edades,del lado derecho estamos instanciado
        //un objeto del tipo array
        System.out.println("edades = "+edades); //ahora veremos como modificar uno o varios elemetnos
        edades[0] = 17;
        System.out.println("edades 0 =" +edades[0]);
        //ahora modificaremos el indice 1 y 2
        edades[1] = 23;
        System.out.println("edades 1 =" +edades[1]);
        edades[2] = 50;
        System.out.println("edades 2 =" +edades[2]);

        //edades[3] = 7;  dará error,fuera de rango
        //ahora haremos una iteracion de todos los elemetnos usando un ciclo FOR
        for (int i = 0; i < edades.length;i++){
            System.out.println(" edades  y sus elemetnos=" + i +": " + edades[i]);

        }

    }
}
