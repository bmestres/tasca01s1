package tascaS101.nivell03.exercici01;

import java.util.ArrayList;
import java.util.Scanner;

// Mainline control
public class Main {

    public static void main(String[] args) {

        // Create objects
        Menu userMenu = new Menu();
        Scanner input = new Scanner(System.in);
        Redaccio redaccio = new Redaccio();
        int userChoice = -1;

        // Display menu and prompt user for action choice
        do {
            userMenu.displayMenu();
            System.out.println(" -> La teva opció: ");
            userChoice = input.nextInt();
            input.nextLine();

            switch (userChoice) {
                // Prompt user for editor's info
                case 1: {
                    System.out.println("*=================================*");
                    System.out.println("*      INTRODUÏR REDACTOR:        *");
                    System.out.println("*=================================*");
                    System.out.println(" -> Introdueix nom:");
                    String name = input.nextLine();
                    System.out.println(" -> Introdueix NIF: ");
                    String nif = input.nextLine();

                    // Add new editor to editorial team database
                    Redactor redactor = new Redactor(name, nif);
                    redaccio.addEditor(redactor);

                    // Show success message
                    System.out.println("=== Redactor introduït amb exit ===");
                    break;
                }
                case 2: {
                    // Prompt user for editor's id
                    System.out.println("*=================================*");
                    System.out.println("*       ELIMINAR REDACTOR:        *");
                    System.out.println("*=================================*");
                    System.out.println(" -> Introdueix NIF:");
                    String nif = input.nextLine();

                    // Search for editor in database
                    int pos = redaccio.findEditorByNif(nif);
                    // Show error message if editor is not found
                    if (pos < 0) {
                        System.out.printf("=== Redactor amb NIF %s no trobat ===\n", nif);
                        System.out.println();
                    } else {
                        // Get found editor
                        Redactor redactor = redaccio.getEditors().get(pos);
                        // Prompt user for confirmation
                        System.out.printf("Segur que vols elminar a\n%s?\n\n", redactor.toString());
                        System.out.println("Sí (s) / No (n)");
                        char userConf = input.nextLine().charAt(0);
                        // Remove editor after confirmation and show success message
                        if (userConf == 's') {
                            redaccio.getEditors().remove(pos);
                            System.out.printf("=== Redactor amb NIF %s eliminat amb exit===\n", nif);
                            System.out.println();
                        }
                    }
                    break;
                }
                case 3: {
                    // Initialize variables
                    Noticia noticia = null;

                    // Prompt user for editor's id
                    System.out.println("*===================================*");
                    System.out.println("*       INTRODUÏR NOTICIA           *");
                    System.out.println("*===================================*");
                    System.out.printf(" -> Introdueix el NIF del redactor:\n");

                    String nif = input.nextLine();
                    // Search for editor in database
                    int pos = redaccio.findEditorByNif(nif);
                    // Send error message if element is not found
                    if (pos < 0) {
                        System.out.println("=== Redactor desconegut ===");
                    } else {
                        // Get editor and confirm editor is found
                        Redactor redactor = redaccio.getEditors().get(pos);
                        System.out.printf("=== Notícia assignada a %s ===\n\n", redactor.getName());
                        // Declare variables
                        int typeChoice;
                        do {
                            // Prompt user for type of news choice
                            System.out.println("*===================================*");
                            System.out.println("*       SEL·LECCIONA EL TIPUS:      *");
                            System.out.println("*       Futbol:      (1)            *");
                            System.out.println("*       Basquet:     (2)            *");
                            System.out.println("*       Tenis:       (3)            *");
                            System.out.println("*       F1:          (4)            *");
                            System.out.println("*       Motociclisme:(5)            *");
                            System.out.println("*===================================*");

                            typeChoice = input.nextInt();
                            input.nextLine();
                            // Send error message if input is incorrect
                            if (typeChoice < 1 || typeChoice > 5) {
                                System.out.println("=== Sel·lecciona una opció entre 1 i 5 ===");
                            }
                        } while (typeChoice < 1 || typeChoice > 5);
                        // Format user's choice int enum type
                        TipusNoticia tipusNoticia = TipusNoticia.values()[typeChoice - 1];

                        switch (tipusNoticia) {
                            // Prompt user for football new's data
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

                                // Create and fill new football's new and show success message
                                noticia = new NoticiaFutbol(titularNoticia, competicio, club, jugador);
                                System.out.println("=== Notícia introduïda amb exit ===");
                                System.out.println();
                                break;
                            }
                            // Prompt user for basketball new's data
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

                                // Create and fill new basketball's new and show success message
                                noticia = new NoticiaBasquet(titularNoticia, competicio, club);
                                System.out.println("=== Notícia introduïda amb exit ===");
                                System.out.println();
                                break;
                            }
                            // Prompt user for tennis new's data
                            case NOTICIA_TENIS: {
                                System.out.println("*===================================*");
                                System.out.println("*       NOVA NOTÍCIA TENIS          *");
                                System.out.println("*===================================*");
                                System.out.println(" -> Introdueix un titular:");
                                String titularNoticia = input.nextLine();
                                System.out.println(" -> Introdueix un competició:");
                                String competicio = input.nextLine();

                                // Create new tennis player's array and prompt user for tennists data
                                ArrayList<String> tenistes = new ArrayList<>();
                                System.out.println(" -> Introdueix tenistes:");

                                boolean escape = false;
                                do {
                                    // Get tennis player's data
                                    System.out.println(" -> Nom:");
                                    String tenista = input.nextLine();
                                    tenistes.add(tenista);
                                    // Confirm user wants to add more elements
                                    System.out.println("Introduïr més tenistes? ");
                                    System.out.println("SÍ (S)   NO (N) ");
                                    char userInput = input.nextLine().charAt(0);
                                    if (userInput == 'N' || userInput == 'n') {
                                        escape = true;
                                    }
                                } while (!escape);
                                // Create and fill new tennis new and show success message
                                noticia = new NoticiaTenis(titularNoticia, competicio, tenistes);
                                System.out.println("=== Notícia introduïda amb exit ===");
                                System.out.println();
                                break;
                            }
                            // Prompt user for F1 new's data
                            case NOTICIA_F1: {
                                System.out.println("*===================================*");
                                System.out.println("*       NOVA NOTÍCIA F1             *");
                                System.out.println("*===================================*");
                                System.out.println(" -> Introdueix un titular:");
                                String titularNoticia = input.nextLine();
                                System.out.println(" -> Introdueix escuderia:");
                                String escuderia = input.nextLine();

                                // Create and fill new tennis new and show success message
                                noticia = new NoticiaF1(titularNoticia, escuderia);
                                System.out.println("=== Notícia introduïda amb exit ===");
                                System.out.println();
                                break;
                            }
                            // Prompt user for motorcycling new's data
                            case NOTICIA_MOTOCICLISME: {
                                System.out.println("*===================================*");
                                System.out.println("*       NOVA NOTÍCIA MOTOCICLISME   *");
                                System.out.println("*===================================*");
                                System.out.println(" -> Introdueix un titular:");
                                String titularNoticia = input.nextLine();
                                System.out.println(" -> Introdueix equip:");
                                String equip = input.nextLine();

                                // Create and fill new motorcycling new and show success message
                                noticia = new NoticiaMotociclisme(titularNoticia, equip);
                                System.out.println("=== Notícia introduïda amb exit ===");
                                System.out.println();
                                break;
                            }
                        }
                        redactor.addNewsPiece(noticia);
                    }
                    break;
                }
                case 4: {
                    // Initialize variables
                    int pos = -1;
                    // Prompt user for editor's identifier
                    System.out.println("*===================================*");
                    System.out.println("*       ELIMINAR NOTICIA            *");
                    System.out.println("*===================================*");
                    System.out.printf(" -> Introdueix el NIF del redactor:\n");

                    // Find editor in database
                    String nif = input.nextLine();
                    pos = redaccio.findEditorByNif(nif);

                    // Send message if not found and prompt user again
                    if (pos < 0) {
                        System.out.println("=== Redactor desconegut ===");
                    } else {
                        // Confirm editor and prompt user for news header
                        System.out.printf("Notícies de %s\n", redaccio.getEditors().get(pos).getName());
                        System.out.println(" -> Introdueix el titular:");
                        String titular = input.nextLine();
                        // Confirm action with user
                        System.out.println("Confirmes que vols el·lminar la notícia");
                        System.out.println("Sí (s) / No (n)");
                        char userConf = input.nextLine().charAt(0);
                        // Delete element if action is confirmed
                        if (userConf == 's') {
                            redaccio.getEditors().get(pos).deleteNewsPiece(titular);
                            System.out.println("=== Notícia eliminada amb exit ===");
                            System.out.println();
                        }
                    }
                    break;
                }
                case 5: {
                    // Prompt user for editor's id
                    System.out.println("*===================================*");
                    System.out.println("*   MOSTRAR NOTÍCIES DE REDACTOR    *");
                    System.out.println("*===================================*");
                    System.out.printf(" -> Introdueix el NIF del redactor:\n");
                    String nif = input.nextLine();

                    // Find editor in database
                    int pos = redaccio.findEditorByNif(nif);

                    // Send not found message if editor is not found
                    if (pos < 0) {
                        System.out.println("=== Redactor desconegut ===");
                    } else {
                        // Show all editor's news on screen
                        redaccio.getEditors().get(pos).showAllNews();
                    }
                    break;
                }
                case 6: {
                    // Prompt user for news owner
                    System.out.println("*=======================================*");
                    System.out.println("*   CALCULAR PUNTUACIÓ D'UNA NOTÍCIA    *");
                    System.out.println("*=======================================*");
                    System.out.printf(" -> Introdueix el titular de la notícia:\n");
                    String titular = input.nextLine();

                    // Get news piece from database
                    Noticia noticia = redaccio.getNewsByHeader(titular);

                    // Send message if news piecxe is not found
                    if (noticia == null) {
                        System.out.println("=== Notícia no trobada ===");
                    } else {
                        // Show score on screen
                        System.out.printf("Puntuació: %d\n", noticia.computeScore());

                    }
                    break;

                }
                case 7: {
                    // Prompt user for news owner
                    System.out.println("*=======================================*");
                    System.out.println("*      CALCULAR PREU D'UNA NOTÍCIA      *");
                    System.out.println("*=======================================*");
                    System.out.printf(" -> Introdueix el titular de la notícia:\n");
                    String titular = input.nextLine();

                    // Get news piece from database
                    Noticia noticia = redaccio.getNewsByHeader(titular);
                    // Handle not found element
                    if (noticia == null) {
                        System.out.println("=== Notícia no trobada ===");
                    } else {
                        // Show new's price on screen
                        System.out.printf("Preu: %.2f\n", noticia.computePrice());
                    }
                    break;
                }
                default: {
                    System.out.println("=== Tria un nombre entre 1 i 8 ===");
                }
            }
        } while (userChoice != 8);
    }
}

