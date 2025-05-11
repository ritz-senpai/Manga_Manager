package org.example;

import dao.MangaDao;
import model.Manga;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MangaDao mangaDAO = new MangaDao();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("\nManga Manager");
            System.out.println("1. Add Manga");
            System.out.println("2. View All Manga");
            System.out.println("3. Delete Manga");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();
          switch (choice){
              case 1:
                  System.out.println("Enter Manga Name : ");
                  String name = sc.nextLine();
                  System.out.println("Enter Manga Category : ");
                  String category = sc.nextLine();
                  System.out.println("Enter Manga Rating : ");
                  float rating = sc.nextFloat();

                  Manga manga = new Manga(name,category,rating);
                  mangaDAO.saveManga(manga);
                  System.out.println("Manga added successfully.......!");
                  break;

              case 2:
                  List<Manga> mangaList = mangaDAO.getAllManga();
                  for (Manga m: mangaList
                       ) {
                      System.out.println(m);
                  }
                  break;

              case 3:
                  System.out.println("Enter manga ID to be deleted : : ");
                  if (!sc.hasNextInt()) {
                      System.out.println("Invalid input! Please enter a valid manga ID.");
                      sc.nextLine();  // Consume invalid input
                      continue;
                  }
                  int id = sc.nextInt();
                  sc.nextLine();
                  mangaDAO.deleteManga(id);
                  break;
              case 4:
                  System.out.println("Exiting...");
                  sc.close();
                  System.exit(0);
              default:
                  System.out.println("Invalid choice .........! Try again");

          }
        }//end of while loop
    }//end of main
}