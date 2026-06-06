package nivell03.exercici01;

import java.util.ArrayList;
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
            System.out.println(" -> La teva opció: ");
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

                    Redactor redactor = null;
                    Noticia noticia = null;

                    do{
                        int pos = -1;
                        do{
                            System.out.println("*===================================*");
                            System.out.println("*       INTRODUÏR NOTICIA           *");
                            System.out.println("*===================================*");
                            System.out.printf(" -> Introdueix el NIF del redactor:\n");

                            String nif = input.nextLine();
                            pos = redaccio.findEditorByNif(nif);

                            if(pos < 0){
                                System.out.println("=== Redactor desconegut ===");
                            }
                        } while(pos < 0);

                        redactor = redaccio.getEditors().get(pos);
                        System.out.printf("Notícia assignada a %s:\n\n", redactor.getName());

                        System.out.println("*===================================*");
                        System.out.println("*       SEL·LECCIONA EL TIPUS:      *");
                        System.out.println("*                                   *");
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

                    TipusNoticia tipusNoticia = TipusNoticia.values()[userChoice - 1];

                    switch (tipusNoticia){
                        case NOTICIA_FUTBOL: {
                            System.out.println("*===================================*");
                            System.out.println("*       NOVA NOTÍCIA FUTBOL         *");
                            System.out.println("*===================================*");
                            System.out.println(" -> Introdueix un titular:");
                            String titularNoticia = input.nextLine();
                            System.out.println(" -> Introdueix un competició:");
                            String competicio = input.nextLine();
                            System.out.println(" -> Introdueix un club:");
                            String club = input.nextLine();
                            System.out.println(" -> Introdueix un jugador:");
                            String jugador = input.nextLine();

                            noticia = new NoticiaFutbol(titularNoticia, competicio, club, jugador);

                            break;
                        }
                        case NOTICIA_BASQUET: {
                            System.out.println("*===================================*");
                            System.out.println("*       NOVA NOTÍCIA BASQUET        *");
                            System.out.println("*===================================*");
                            System.out.println(" -> Introdueix un titular:");
                            String titularNoticia = input.nextLine();
                            System.out.println(" -> Introdueix un competició:");
                            String competicio = input.nextLine();
                            System.out.println(" -> Introdueix un club:");
                            String club = input.nextLine();

                            noticia = new NoticiaBasquet(titularNoticia, competicio, club);
                            break;
                        }
                        case NOTICIA_TENIS: {
                            System.out.println("*===================================*");
                            System.out.println("*       NOVA NOTÍCIA TENIS          *");
                            System.out.println("*===================================*");
                            System.out.println(" -> Introdueix un titular:");
                            String titularNoticia = input.nextLine();
                            System.out.println(" -> Introdueix un competició:");
                            String competicio = input.nextLine();

                            ArrayList<String> tenistes = new ArrayList<>();
                            System.out.println(" -> Introdueix tenistes:");

                            boolean scape = false;
                            do{
                                System.out.println(" -> Nom:");
                                String tenista = input.nextLine();
                                tenistes.add(tenista);
                                System.out.println("Introduïr més tenistes? ");
                                System.out.println("SÍ (S)   NO (N) ");
                                char userInput = input.nextLine().charAt(0);
                                if(userInput == 'N' || userInput == 'n'){
                                    scape = true;
                                }
                            } while(!scape);

                            noticia = new NoticiaTenis(titularNoticia, competicio, tenistes);
                            break;
                        }
                        case NOTICIA_F1: {
                            System.out.println("*===================================*");
                            System.out.println("*       NOVA NOTÍCIA F1             *");
                            System.out.println("*===================================*");
                            System.out.println(" -> Introdueix un titular:");
                            String titularNoticia = input.nextLine();
                            System.out.println(" -> Introdueix escuderia:");
                            String escuderia = input.nextLine();

                            noticia = new NoticiaF1(titularNoticia, escuderia);
                            break;
                        }
                        case NOTICIA_MOTOCICLISME: {
                            System.out.println("*===================================*");
                            System.out.println("*       NOVA NOTÍCIA MOTOCICLISME   *");
                            System.out.println("*===================================*");
                            System.out.println(" -> Introdueix un titular:");
                            String titularNoticia = input.nextLine();
                            System.out.println(" -> Introdueix equip:");
                            String equip = input.nextLine();

                            noticia = new NoticiaMotociclisme(titularNoticia, equip);
                            break;
                        }
                    }
                    redactor.addNewsPiece(noticia);
                }
                case 4: {
                    System.out.println("*===================================*");
                    System.out.println("*       ELIMINAR NOTICIA            *");
                    System.out.println("*===================================*");
                    System.out.printf(" -> Introdueix el NIF del redactor:\n");

                    String nif = input.nextLine();
                    int pos = redaccio.findEditorByNif(nif);

                    System.out.printf(" -> Introdueix el titular:\n");
                    String titular = input.nextLine();

                    redaccio.getEditors().get(pos).deleteNewsPiece(titular);
                }
                case 5: {
                    System.out.println("*===================================*");
                    System.out.println("*   MOSTRAR NOTÍCIES DE REDACTOR    *");
                    System.out.println("*===================================*");

                    System.out.printf(" -> Introdueix el NIF del redactor:\n");
                    String nif = input.nextLine();

                    int pos = redaccio.findEditorByNif(nif);
                    redaccio.getEditors().get(pos).showAllNews();
                }
                case 6: {
                    System.out.println("*=======================================*");
                    System.out.println("*   CALCULAR PUNTUACIÓ D'UNA NOTÍCIA    *");
                    System.out.println("*=======================================*");

                    System.out.printf(" -> Introdueix el titular de la notícia:\n");
                    String titular = input.nextLine();
                    System.out.printf("Puntuació: %d", redaccio.getNewsByHeader(titular).computeScore());
                }
                case 7: {
                    System.out.println("*=======================================*");
                    System.out.println("*      CALCULAR PREU D'UNA NOTÍCIA      *");
                    System.out.println("*=======================================*");

                    System.out.printf(" -> Introdueix el titular de la notícia:\n");
                    String titular = input.nextLine();
                    System.out.printf("Preu: %d", redaccio.getNewsByHeader(titular).computePrice());

                }
            }
        } while (userChoice != 8);
    }
}

