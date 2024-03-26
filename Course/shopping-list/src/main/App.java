package main;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       var shoppingList = new ArrayList<String>();
       var keyboard = new Scanner(System.in);

       while (true){
           System.out.printf("Add new item (1), remove item (2), print items (3), quit (4)");
           var option = keyboard.nextInt();
           keyboard.nextLine();

           if (option == 1){
               System.out.println("New item :");
               var item = keyboard.nextLine();
               if (!shoppingList.contains(item)){
               shoppingList.add(item);}
           } else if (option ==2){
               System.out.println("Remove item :");
               var item = keyboard.nextLine();
               shoppingList.remove(item);
           }else if (option == 3 ){
               for (var item : shoppingList){
               System.out.println(item);
           }
           }else if (option == 4){
               break;
           } else
               System.out.println("Invalid option selected");
       }
    }
}
