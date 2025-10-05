/**
 * ============================================
 * 📚 Sistema de Gerenciamento de Biblioteca
 * ============================================
 *
 * @autor
 *     Riquelmy Soares Vasconcelos
 *
 * @data
 *     Finalizado em: 04/10/2025 às 23:15
 *
 * @projeto
 *     Sistema de biblioteca orientado a objetos em Java
 *
 * @descrição
 *     Este programa simula um sistema simples de biblioteca onde é possível:
 *     - Criar e registrar itens: Livro, Revista e Mídia Digital
 *     - Armazenar todos os itens em uma lista com uso de polimorfismo (ArrayList<LibraryItem>)
 *     - Utilizar herança para definir os diferentes tipos de itens
 *     - Usar composição para permitir que o usuário empreste múltiplos itens
 *     - Navegar por um menu interativo no terminal para gerenciar o sistema
 *
 * @funcionalidades
 *     ✅ Herança (classe base LibraryItem + subclasses Book, Magazine, DigitalMedia)
 *     ✅ Polimorfismo (método showItems sobrescrito em cada classe)
 *     ✅ Composição (classe User contém uma lista de itens emprestados)
 *     ✅ Criação dinâmica de itens via entrada do usuário com Scanner
 *     ✅ Organização de código clara e objetiva para fins educacionais
 *
 * @linguagem
 *     Java (estrutura e menus em inglês)
 *
 * @ferramentas
 *     IDE: IntelliJ IDEA
 *     JDK: Java 23.0.2 (build 23.0.2+7-58)
 *     Sistema Operacional: Windows
 *
 * @licença
 *     Uso educacional – Faculdade Unileste /  Estudos pessoais
 *
 * ============================================
 */


package library;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<LibraryItem> library = new ArrayList<>();

        System.out.print("Enter user's name: ");
        String userName = sc.nextLine();
        User user = new User(userName);

        int option;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Add item to library");
            System.out.println("2. Show library items");
            System.out.println("3. Lend item to user");
            System.out.println("4. Show borrowed items");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            option = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (option) {
                case 1:
                    System.out.println("\nWhat type of item do you want to add?");
                    System.out.println("1. Book");
                    System.out.println("2. Magazine");
                    System.out.println("3. Digital Media");
                    int type = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Publication year: ");
                    int pubYear = sc.nextInt();
                    sc.nextLine();

                    switch (type) {
                        case 1: // Book
                            System.out.print("Author: ");
                            String author = sc.nextLine();
                            System.out.print("Number of pages: ");
                            int pages = sc.nextInt();
                            sc.nextLine();
                            Book book = new Book(title, pubYear, author, pages);
                            library.add(book);
                            System.out.println("Book added successfully.");
                            break;

                        case 2: // Magazine
                            System.out.print("Edition: ");
                            String edition = sc.nextLine();
                            Date date = new Date(); // using current date
                            Magazine magazine = new Magazine(edition, date, title, pubYear);
                            library.add(magazine);
                            System.out.println("Magazine added successfully.");
                            break;

                        case 3: // DigitalMedia
                            System.out.print("File type: ");
                            String fileType = sc.nextLine();
                            System.out.print("Storage size (MB): ");
                            double size = sc.nextDouble();
                            sc.nextLine();
                            DigitalMedia digital = new DigitalMedia(fileType, size, title, pubYear);
                            library.add(digital);
                            System.out.println("Digital Media added successfully.");
                            break;

                        default:
                            System.out.println("Invalid type.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- LIBRARY ITEMS ---");
                    if (library.isEmpty()) {
                        System.out.println("The library is currently empty.");
                    } else {
                        int count = 1;
                        for (LibraryItem item : library) {
                            System.out.println("Item " + count++);
                            item.showItems();
                            System.out.println("----------------------");
                        }
                    }
                    break;

                case 3:
                    if (library.isEmpty()) {
                        System.out.println("No items available to lend.");
                        break;
                    }
                    System.out.println("\nSelect the item to lend:");
                    for (int i = 0; i < library.size(); i++) {
                        System.out.println((i + 1) + " - " + library.get(i).getItem());
                    }
                    System.out.print("Enter the item number: ");
                    int choice = sc.nextInt();
                    sc.nextLine();

                    if (choice >= 1 && choice <= library.size()) {
                        LibraryItem selected = library.get(choice - 1);
                        user.lendItem(selected);
                        System.out.println("Item successfully lent to " + user.getName());
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- BORROWED ITEMS ---");
                    user.viewItems();
                    break;

                case 0:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (option != 0);

        sc.close();
    }
}
