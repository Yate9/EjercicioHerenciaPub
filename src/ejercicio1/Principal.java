package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Instancia un ArrayList de objetos Integer (ya que no puede almacenar tipos primitivos)
 * Haz un método de tal forma que el ArrayList se rellene con 5 números que meta el usuario
 * por teclado, ni más, ni menos y devuelva el ArrayList completo con los números
 */
public class Principal {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = rellenarArrayList();
        System.out.println("Números introducidos: " + numeros);
    }

    public static ArrayList<Integer> rellenarArrayList() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros.add(sc.nextInt());
        }

        return numeros;
    }
}
