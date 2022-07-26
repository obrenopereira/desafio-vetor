package application;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("How many rooms will be rented? ");
        int n = read.nextInt();

        Rent[] vect = new Rent[10];

        for(int i = 1; i<=n; i++){
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            read.nextLine();
            String name = read.nextLine();

            System.out.println();
            System.out.print("Email: ");
            String email = read.nextLine();

            System.out.println("Room: ");
            int room = read.nextInt();

            vect[room] = new Rent(name, email);
        }

        System.out.println("Busy rooms: ");
        for(int i = 1; i<=10; i++){
            if(vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }


    }

}
