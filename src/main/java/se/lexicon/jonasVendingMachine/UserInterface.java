package se.lexicon.jonasVendingMachine;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;


public class UserInterface {


  public static void main(String[] args) {
    double cashAndStuff1[] = new double[13];

    VendingMachineImpl vending1 = new VendingMachineImpl();

    Drink drink1 = new Drink();
    String item1[] = {"1", "8", "250ml Mer", "Mer"};
    drink1.setItem1(item1);
    String item2[] = {"2", "10", "330ml Pepsi", "Pepsi"};
    drink1.setItem2(item2);
    String item3[] = {"3", "9", "330ml Trocadero", "Trocadero"};
    drink1.setItem3(item3);

    Food food1 = new Food();
    String item4[] = {"4", "25", "1200kc Pizza", "Pizza"};
    food1.setItem1(item4);
    String item5[] = {"5", "35", "1500kc Korvstroganoff", "Korvstroganoff"};
    food1.setItem2(item5);
    String item6[] = {"6", "30", "1400kc Bolognese", "Bolognese"};
    food1.setItem3(item6);

    Fruit fruit1 = new Fruit();
    String item7[] = {"7", "5", "1% fat Apple", "Apple"};
    fruit1.setItem1(item7);
    String item8[] = {"8", "6", "2% fat Orange", "Orange"};
    fruit1.setItem1(item8);
    String item9[] = {"9", "4", "3% fat Kiwi", "Kiwi"};
    fruit1.setItem1(item9);

    Snack snack1 = new Snack();
    String item10[] = {"10", "7", "30% sugar Japp", "Japp"};
    snack1.setItem1(item10);
    String item11[] = {"11", "6", "35% sugar Raider", "Raider"};
    snack1.setItem1(item11);
    String item12[] = {"12", "10", "50% sugar Donut", "Donut"};
    snack1.setItem1(item12);

//----

    System.out.println("During the end of your tourist city stroll, you encounter a vending machine.");
    System.out.println("You decide to at least have a look, and walk over to it.");
    System.out.println("It's still filled with various drinks and edibles, with prices ranging from 4 to 35 credits per item.");
    System.out.println("It greets you with a welcome screen that reads:\n");
    System.out.println("\"Welcome to the snack bar vending machine!\"");
    System.out.println("\"We have multiple choices that may please your appetite.\"");
    System.out.println("\"Please insert your credit card to begin purchasing.\"\n");
    System.out.println("(Type in \"1\" to leave, or any other number to use your credit card.)");

    Scanner chooser1 = new Scanner(System.in);
    Scanner chooser2 = new Scanner(System.in);
    Scanner chooser3 = new Scanner(System.in);
    Scanner chooser4 = new Scanner(System.in);
//----
    int choice1 = chooser1.nextInt();
//------------------------------------------------

    if (choice1 == 1) {
      System.out.println("\nYou decide the vending machine isn't really worth your time and head back to the hotel instead...");
      System.out.println("End of city stroll. (And this vending machine program is now shut down as well...)");
      System.exit(1);
    } else {

      System.out.println("\n\"There are fixed credit amounts that will be withdrawn from your platinum credit card by your choice.\"");
      System.out.println("\"Unused credits will be returned to your credit card before you have it returned from the machine.\"");
      System.out.println("\"Please select the amount you wish to withdraw from your credit card:\"");
      System.out.println("The given credit amounts on the Vending machine screen are: ");
      System.out.println("1, 2, 5, 10, 20, 50, 100, 200, 500 or 1000 credits.\n");
      System.out.println("(Type in your chosen amount(s), or type in anything else to stop stuffing the vending machine with your credits.)");
    }

//---------------------------------------------------
    Boolean creditStuffing = true;
//-----
    while (creditStuffing == true) {

      String choice2 = chooser2.nextLine();

      switch (choice2) {
        case "1":
          cashAndStuff1[0] = cashAndStuff1[0]+1;
          System.out.println("+1 credits added to your vending machine credit pool.");
          System.out.println("Total amount of vending machine's credit pool is now: " + cashAndStuff1[0] + " credits.\n");
          System.out.println("\"Enter more credits?\" (1, 2, 5, 10, 20, 50, 100, 200, 500 or 1000 - or other input to stop.)");
          break;

        case "2":
          cashAndStuff1[0] = cashAndStuff1[0]+2;
          System.out.println("+2 credits added to your vending machine credit pool.");
          System.out.println("Total amount of vending machine's credit pool is now: " + cashAndStuff1[0] + " credits.");
          System.out.println("\"Enter more credits?\" (1, 2, 5, 10, 20, 50, 100, 200, 500 or 1000 - or other input to stop.)");
          break;

        case "5":
          cashAndStuff1[0] = cashAndStuff1[0]+5;
          System.out.println("+5 credits added to your vending machine credit pool.");
          System.out.println("Total amount of vending machine's credit pool is now: " + cashAndStuff1[0] + " credits.");
          System.out.println("\"Enter more credits?\" (1, 2, 5, 10, 20, 50, 100, 200, 500 or 1000 - or other input to stop.)");
          break;

        case "10":
          cashAndStuff1[0] = cashAndStuff1[0]+10;
          System.out.println("+10 credits added to your vending machine credit pool.");
          System.out.println("Total amount of vending machine's credit pool is now: " + cashAndStuff1[0] + " credits.");
          System.out.println("\"Enter more credits?\" (1, 2, 5, 10, 20, 50, 100, 200, 500 or 1000 - or other input to stop.)");
          break;

        case "20":
          cashAndStuff1[0] = cashAndStuff1[0]+20;
          System.out.println("+20 credits added to your vending machine credit pool.");
          System.out.println("Total amount of vending machine's credit pool is now: " + cashAndStuff1[0] + " credits.");
          System.out.println("\"Enter more credits?\" (1, 2, 5, 10, 20, 50, 100, 200, 500 or 1000 - or other input to stop.)");
          break;

        case "50":
          cashAndStuff1[0] = cashAndStuff1[0]+50;
          System.out.println("+50 credits added to your vending machine credit pool.");
          System.out.println("Total amount of vending machine's credit pool is now: " + cashAndStuff1[0] + " credits.");
          System.out.println("\"Enter more credits?\" (1, 2, 5, 10, 20, 50, 100, 200, 500 or 1000 - or other input to stop.)");
          break;

        case "100":
          cashAndStuff1[0] = cashAndStuff1[0]+100;
          System.out.println("+100 credits added to your vending machine credit pool.");
          System.out.println("Total amount of vending machine's credit pool is now: " + cashAndStuff1[0] + " credits.");
          System.out.println("\"Enter more credits?\" (1, 2, 5, 10, 20, 50, 100, 200, 500 or 1000 - or other input to stop.)");
          break;

        case "200":
          cashAndStuff1[0] = cashAndStuff1[0]+200;
          System.out.println("+200 credits added to your vending machine credit pool.");
          System.out.println("Total amount of vending machine's credit pool is now: " + cashAndStuff1[0] + " credits.");
          System.out.println("\"Enter more credits?\" (1, 2, 5, 10, 20, 50, 100, 200, 500 or 1000 - or other input to stop.)");
          break;

        case "500":
          cashAndStuff1[0] = cashAndStuff1[0]+500;
          System.out.println("+500 credits added to your vending machine credit pool.");
          System.out.println("Total amount of vending machine's credit pool is now: " + cashAndStuff1[0] + " credits.");
          System.out.println("\"Enter more credits?\" (1, 2, 5, 10, 20, 50, 100, 200, 500 or 1000 - or other input to stop.)");
          break;

        case "1000":
          cashAndStuff1[0] = cashAndStuff1[0]+1000;
          System.out.println("+1000 credits added to your vending machine credit pool.");
          System.out.println("Total amount of vending machine's credit pool is now: " + cashAndStuff1[0] + " credits.");
          System.out.println("\"Enter more credits?\" (1, 2, 5, 10, 20, 50, 100, 200, 500 or 1000 - or other input to stop.)");
          break;

        default:
          System.out.println("And there you stopped putting credits into the machine.");
          System.out.println("Time to buy some stuff for up to " + cashAndStuff1[0] + " credits in the vending machine.");
          creditStuffing = false;
          break;
      }//switch
    }//while


//-------------------------------------------
//---- present products ---- public void[] presentProducts(){
    System.out.println("\nHere's the list and prices of the current products in the vending machine:");

for (int i = 1; i < 4; i++){
      int productId = i;
      String name = drink1.getName(productId);
      String price = drink1.getPrice(productId);

  System.out.println("Product nr: " + productId + ".\t" + name + "\t\t\t Price: " + price + " credits.");

  if (i % 3 == 0) {
    System.out.println();
  } else {}  //if else

    }//for 1-3

    for (int i = 4; i < 7; i++){
      int productId = i;
      String name = food1.getName(productId);
      String price = food1.getPrice(productId);

      System.out.println("Product nr: " + productId + ".\t" + name + "\t\t\t Price: " + price + " credits.");

      if (i % 3 == 0) {
        System.out.println();
      } else {}  //if else

    }//for 4-6

    for (int i = 7; i < 10; i++){
      int productId = i;
      String name = fruit1.getName(productId);
      String price = fruit1.getPrice(productId);

      System.out.println("Product nr: " + productId + ".\t" + name + "\t\t\t Price: " + price + " credits.");

      if (i % 3 == 0) {
        System.out.println();
      } else {}  //if else

    }//for 7-9

    for (int i = 10; i < 13; i++){
      int productId = i;
      String name = snack1.getName(productId);
      String price = snack1.getPrice(productId);

      System.out.println("Product nr: " + productId + ".\t" + name + "\t\t\t Price: " + price + " credits.");

      if (i % 3 == 0) {
        System.out.println();
      } else {}  //if else

    }//for 9-12

//    }//presentProducts


//-------------------------------------------------
//---- buy products ----    public double[] buyProducts(double cashAndStuff1[]){
    boolean buy = true;

    while (buy == true){
      System.out.println("\nType in a number from 1 to 12 to attempt to buy a product. Type in anything else to stop buying.");
      String choice3 = chooser3.nextLine();


      switch (choice3) {
        case "1":
        case "2":
        case "3":
        int productId = Integer.parseInt(choice3);
         cashAndStuff1 = drink1.buyProduct(cashAndStuff1, productId);
          System.out.println();

      break;
        case "4":
        case "5":
        case "6":
          productId = Integer.parseInt(choice3);
          cashAndStuff1 = food1.buyProduct(cashAndStuff1, productId);
          System.out.println();

      break;
        case "7":
        case "8":
        case "9":
          productId = Integer.parseInt(choice3);
          cashAndStuff1 = fruit1.buyProduct(cashAndStuff1, productId);
          System.out.println();

      break;
        case "10":
        case "11":
        case "12":
          productId = Integer.parseInt(choice3);
          cashAndStuff1 = snack1.buyProduct(cashAndStuff1, productId);
          System.out.println();

      break;

        default:
        buy = false;

        break;

      }//switch
      }//buy



   // return cashAndStuff1;
   // }
//-------------------------------------------
//---- inventory check ----     public void getInventory(double cashAndStuff1[]){
    System.out.print("\nYou currently have: ");

    for (int i = 1; i < 4; i++){
      int productId = i;
      String name = drink1.getName(productId);
      System.out.print(cashAndStuff1[i] + " " + name + ", ");

      if (i % 3 == 0) {
        System.out.println();
      } else {}  //if else
    }//for 1-3

    for (int i = 4; i < 7; i++){
      int productId = i;
      String name = food1.getName(productId);
      System.out.print(cashAndStuff1[i] + " " + name + ", ");

      if (i % 3 == 0) {
        System.out.println();
      } else {}  //if else
    }//for 4-6

    for (int i = 7; i < 10; i++){
      int productId = i;
      String name = fruit1.getName(productId);
      System.out.print(cashAndStuff1[i] + " " + name + ", ");

      if (i % 3 == 0) {
        System.out.println();
      } else {}  //if else
    }//for 7-9

    for (int i = 10; i < 13; i++){
      int productId = i;
      String name = snack1.getName(productId);
      System.out.print(cashAndStuff1[i] + " " + name + ", ");

      if (i % 3 == 0) {
        System.out.println();
      } else {}  //if else
    }//for 10-12


//----------------------------
//    public double useProduct(double cashAndStuff[], int productId){
    System.out.println("You now have an opportunity to consume what you have bought.");
    System.out.println("Type \"1\" to consume something you have bought, or any other number to check out from the vending machine.");
    Boolean mums = false;

    int choice4 = chooser4.nextInt();

    if (choice4 == 1){
      mums = true;
    } else{}

    while (mums == true){
      System.out.println("Which product would you like to consume?");

    }
//--------------------------------------------------
//--------------------------------------------------

    // build the continuation of the consume method - that is already written in the product classes...
//    }//useProduct

 //   public void checkOut(double cashAndStuff1[]){
      System.out.println("You check out from the machine and get " + cashAndStuff1[0] + "credits deposited back at your card.");
      System.out.println("Before you head back to the hotel, you also take whatever items you didn't eat or drink and ");
      System.out.println("put them in your spacious backpack.");
      System.out.println("Carpe noctum. End of vending machine program...");
      for(int i = 0; i < 13; i++){
        cashAndStuff1[i] = 0;}
      System.exit(1);
//    }

//-----------------------------------------------------------------------------------------------
  }//main
/*
//------ unimplemented product methods of inventory, buy, consume and examine below.
  public double[] buyProduct(double cashAndStuff[], int productId) {
    getProductPrice(productId); //whatever it is...
    if (price > cashAndStuff[0]) {
      System.out.println("Sorry buddy, but you only have " + cashAndStuff[0] + " credits left in the vending machine to buy for.");
      return cashAndStuff;
    } else {

      getProductName(productId);
      String name = productName;
      cashAndStuff[0] = cashAndStuff[0] - price;
      int integer = productId;
      cashAndStuff[integer]++;
      System.out.println("You bought a " + name + ".");
      System.out.println("You now have " + cashAndStuff[0] + " credits left in the vending machine.");
      return cashAndStuff;
    }//else
  }//buyProduct

//---
    public double[] useProduct(double cashAndStuff[], int productId) {
      if (cashAndStuff[productId] > 0) {
        getProductName(productId); //or whatever goes here...
        String name = productName;
        System.out.println("You eat a " + name + ".");
        cashAndStuff[productId]--;
        System.out.println("You now have " + cashAndStuff[productId] + " " + name + " left.");
        return cashAndStuff;

      } else {
        System.out.println("You can't eat what you don't have in your inventory.");
        return cashAndStuff;
      }//else

      }//use product

//---
    public void examineProduct(int productId){
    getProductName(productId);
    String description = productName;
      System.out.println("The product's description says: " + description + ".");

    }//examineProduct

//---
*/

//1-6 Mer, Pepsi, Trocadero, Pizza, Korvstroganoff, Bolognese
//7-12 Apple, Orange, Kiwi, Japp, Raider, Donut
/*    public void getInventory(double cashAndStuff1[]){
    System.out.print("You currently have: ");

    for (int i = 1; i < 4; i++){
      int productId = i;
      String name = drink1.getName(productId);
      System.out.print(cashAndStuff1[i] + " " + name + ", ");

      if (i % 3 == 0) {
        System.out.println();
      } else {}  //if else
      }//for 1-3

      for (int i = 4; i < 7; i++){
        int productId = i;
        String name = food1.getName(productId);
        System.out.print(cashAndStuff1[i] + " " + name + ", ");

        if (i % 3 == 0) {
          System.out.println();
        } else {}  //if else
      }//for 4-6

      for (int i = 7; i < 10; i++){
        int productId = i;
        String name = fruit1.getName(productId);
        System.out.print(cashAndStuff1[i] + " " + name + ", ");

        if (i % 3 == 0) {
          System.out.println();
        } else {}  //if else
      }//for 7-9

      for (int i = 10; i < 13; i++){
        int productId = i;
        String name = snack1.getName(productId);
        System.out.print(cashAndStuff1[i] + " " + name + ", ");

        if (i % 3 == 0) {
          System.out.println();
        } else {}  //if else
      }//for 10-12

    }//getInventory


    public void checkOut(double cashAndStuff[]){
      System.out.println("You checkout from the machine and get " + cashAndStuff[0] + "credits deposited back at your card.");
      System.out.println("Before you head back to the hotel, you also take whatever items you didn't eat or drink and ");
      System.out.println("put them in your backpack.");
      System.out.println("Carpe noctum. End of vending machine program...");
      for(int i = 0; i < 13; i++){
      cashAndStuff[i] = 0;}
      System.exit(1);
    }
*/
//--- under construction
/*
String s="200";
//Converting String into int using Integer.parseInt()
int i=Integer.parseInt(s);
*/
  


}//class