package Main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Array uno...");
        Integer[] arr1 = llenarArray(sc);
        System.out.println("Array dos...");
        Integer[] arr2 = llenarArray(sc);
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        set1.retainAll(Arrays.asList(arr2));
        System.out.println("Los valores que se intersectan en los arreglos uno y dos son: " + set1);

    }
    private static Integer[] llenarArray(Scanner sc){
        Integer [] datos = crearArray(size(sc));
        for (int i=0; i < datos.length; i++){
            System.out.println("Ingresa los datos: ");
            datos[i] = sc.nextInt();
         }
        return  datos;
    }
    private static Integer[] crearArray(int size){
        return new Integer[size];
    }
    private static int size(Scanner sc){
        System.out.println("Indica el numero de elementos a capturar: ");
        return sc.nextInt();
    }

}

