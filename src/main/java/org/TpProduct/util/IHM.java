package org.TpProduct.util;

import java.util.Scanner;

public class IHM {

    Scanner scanner = new Scanner(System.in);


    public void start(){



        int choix;
        do {

            choix = scanner.nextInt();
            switch (choix) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (choix == 0);

    }
    private void menu() {
        System.out.println("1 - Add a new product ");
        System.out.println("2 - Show all products");
        System.out.println("3 - Modify / update a product");
        System.out.println("4 - Delete a product from the list");
        System.out.println("0 - leave");

    }

    private void addProductAction(){
        System.out.println("Please enter the name of the product");



    }









}
