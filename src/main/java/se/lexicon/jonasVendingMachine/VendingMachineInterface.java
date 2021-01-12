package se.lexicon.jonasVendingMachine;

public interface VendingMachineInterface {


       static String[] addMoney(String cashAndStuff1[]) {



           return cashAndStuff1;
        }

      static void getBalance(String cashAndStuff1[]){
      String cash = cashAndStuff1[0];
          System.out.println("You currently have " + cash + " credits to use in the vending machine.");
       }

       static void presentProducts(){
          }

        static String[] productBuy(String cashAndStuff1[], int prodNum){
        return cashAndStuff1;
        }
//----
        static void getInventory(double cashAndStuff1[]){

    }

        static void returnChange(){
        }





//-----------


}//class
