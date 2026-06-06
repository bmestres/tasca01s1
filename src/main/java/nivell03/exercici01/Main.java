package nivell03.exercici01;

import java.util.Scanner;

// Mainline control
public class Main {

    public static void main(String[] args) {

        // Create objects
        Menu userMenu = new Menu();
        Scanner input = new Scanner(System.in);
        Redaccio redaccio = new Redaccio();
        int userChoice;

        do {
            userMenu.displayMenu();
            userChoice = input.nextInt();
            input.nextLine();

            // Ensure user choice is in range
            //if(userChoice < 1 || userChoice > 7){
            //  System.out.println("=== Incorrect number. Choose an option from 1 to 7. ===");
            // }

            switch (userChoice) {
                case 1: {
                    System.out.println("*=================================*");
                    System.out.println("*      INTRODUÏR REDACTOR:        *");
                    System.out.println("*=================================*");
                    System.out.println(" -> Introdueix nom:");
                    String name = input.nextLine();
                    System.out.println(" -> Introdueix NIF: ");
                    String nif = input.nextLine();

                    Redactor redactor = new Redactor(name, nif);
                    redaccio.addEditor(redactor);

                    System.out.println("=== Redactor introduït amb exit ===");
                    break;
                }
                case 2: {
                    String nif;
                    boolean found = false;
                    int pos = -1;

                    do {
                        System.out.println("*=================================*");
                        System.out.println("*       ELIMINAR REDACTOR:        *");
                        System.out.println("*=================================*");
                        System.out.println(" -> Introdueix NIF:");
                        nif = input.nextLine();
                        pos = redaccio.findEditorByNif(nif);

                        if (pos < 0) {
                            found = false;
                            System.out.printf("=== Redactor amb NIF %s no trobat ===\n", nif);
                            System.out.println();
                        } else {
                            found = true;
                        }
                    } while (!found);

                    Redactor redactor = redaccio.getEditors().get(pos);

                    System.out.printf("Segur que vols elminar a\n%s?\n\n", redactor.toString());
                    System.out.println("Sí (s) / No (n)");

                    char userConf = input.nextLine().charAt(0);

                    if (userConf == 's') {
                        redaccio.getEditors().remove(pos);
                        System.out.printf("=== Redactor amb NIF %s eliminat ===\n", nif);
                    }
                    break;
                }
                case 3: {
                    do{
                        System.out.println("*===================================*");
                        System.out.println("*       INTRODUÏR NOTICIA           *");
                        System.out.println("*===================================*");
                        System.out.println("*       Sel·lecciona el tipus:      *");
                        System.out.println("*       Futbol:      (1)            *");
                        System.out.println("*       Basquet:     (2)            *");
                        System.out.println("*       Tenis:       (3)            *");
                        System.out.println("*       F1:          (4)            *");
                        System.out.println("*       Motociclisme:(5)            *");
                        System.out.println("*===================================*");

                        userChoice = input.nextInt();
                        input.nextLine();

                        if(userChoice < 1 || userChoice > 5){
                            System.out.println("=== Sel·lecciona una opció entre 1 i 5 ===");
                        }
                    } while(userChoice < 1 || userChoice > 5);

                    switch (userChoice){
                        case 1: {
                            if(userChoice = )

                        }
                    }
                }
            }
        } while (userChoice != 8);
    }
}

