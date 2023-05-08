package com.pperezm;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Lista list = new Lista();
        String dato = "";
        Scanner sc= new Scanner(System.in);
        while (!dato.equalsIgnoreCase("fin")) {
            dato = sc.nextLine();
            if (!dato.equalsIgnoreCase("fin"))
                list.insertar(dato);
        }
        list.visualizar();

    }

}
