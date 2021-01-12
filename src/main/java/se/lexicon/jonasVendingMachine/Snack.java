package se.lexicon.jonasVendingMachine;

public class Snack extends ProductAbstract{

    private String item1[]; // = {"10", "7", "30% sugar Japp", "Japp"};
    private String item2[]; // = {"11", "6", "35% sugar Raider", "Raider"};
    private String item3[]; // = {"12", "10", "50% sugar Donut", "Donut"};

    @Override
    public String[] getItem1() {
        return item1;
    }

    @Override
    public void setItem1(String[] item10) {
        this.item1 = item10;
    }

    @Override
    public String[] getItem2() {
        return item2;
    }

    @Override
    public void setItem2(String[] item11) {
        this.item2 = item11;
    }

    @Override
    public String[] getItem3() {
        return item3;
    }

    @Override
    public void setItem3(String[] item12) {
        this.item3 = item12;
    }


    public void snack(){
        String item1[] = this.item1;
        String item2[] = this.item2;
        String item3[] = this.item3;
    }

    @Override
    public double[] buyProduct(double cashAndStuff1[], int productId) {
        int A = Integer.parseInt(item1[0]);
        int B = Integer.parseInt(item2[0]);
        int C = Integer.parseInt(item3[0]);

        if (productId == A) {

            int price = Integer.parseInt(item1[1]);

            if (price > cashAndStuff1[0]) {
                System.out.println("Sorry buddy, but you only have " + cashAndStuff1[0] + " credits left in the vending machine to buy for.");
                return cashAndStuff1;

            } else {

                String name = item1[3];
                cashAndStuff1[0] = cashAndStuff1[0] - price;
                int integer = productId;
                cashAndStuff1[integer]++;
                System.out.println("You bought a " + name + ".");
                System.out.println("You now have " + cashAndStuff1[0] + " credits left in the vending machine.");
                return cashAndStuff1;
            }//else
//----
        } else if (productId == B) {

            int price = Integer.parseInt(item2[1]);

            if (price > cashAndStuff1[0]) {
                System.out.println("Sorry buddy, but you only have " + cashAndStuff1[0] + " credits left in the vending machine to buy for.");
                return cashAndStuff1;

            } else {

                String name = item2[3];
                cashAndStuff1[0] = cashAndStuff1[0] - price;
                int integer = productId;
                cashAndStuff1[integer]++;
                System.out.println("You bought a " + name + ".");
                System.out.println("You now have " + cashAndStuff1[0] + " credits left in the vending machine.");
                return cashAndStuff1;
            }//else
//----
        } else if (productId == C) {
            int price = Integer.parseInt(item3[1]);

            if (price > cashAndStuff1[0]) {
                System.out.println("Sorry buddy, but you only have " + cashAndStuff1[0] + " credits left in the vending machine to buy for.");
                return cashAndStuff1;

            } else {

                String name = item3[3];
                cashAndStuff1[0] = cashAndStuff1[0] - price;
                int integer = productId;
                cashAndStuff1[integer]++;
                System.out.println("You bought a " + name + ".");
                System.out.println("You now have " + cashAndStuff1[0] + " credits left in the vending machine.");
                return cashAndStuff1;
            }//else
        } else {
            System.out.println("Program Error, product not found in category.");
        }

        return cashAndStuff1;

    }//buyProduct

    @Override
    public void examineProduct(int productId) {
        int A = Integer.parseInt(item1[0]);
        int B = Integer.parseInt(item2[0]);
        int C = Integer.parseInt(item3[0]);

        if (productId == A){
            String description = item1[2];
            System.out.println("The product's description says: \"" + description + ".\"");

        } else if (productId == B) {
            String description = item2[2];
            System.out.println("The product's description says: \"" + description + ".\"");

        } else if (productId == C) {
            String description = item3[2];
            System.out.println("The product's description says: \"" + description + ".\"");

        } else {
            System.out.println("Program Error, product not found in category.");
        }

    }//examineProduct

    @Override
    public double[] useProduct(double cashAndStuff1[], int productId) {

        int A = Integer.parseInt(item1[0]);
        int B = Integer.parseInt(item2[0]);
        int C = Integer.parseInt(item3[0]);

        if (productId == A) {

            if (cashAndStuff1[productId] > 0) {
                String name = item1[3];
                System.out.println("You eat a " + name + ".");
                cashAndStuff1[productId]--;
                System.out.println("You now have " + cashAndStuff1[productId] + " " + name + " left.");
                return cashAndStuff1;

            } else {
                System.out.println("You can't eat what you don't have in your inventory.");
                return cashAndStuff1;
            }//else
        }//if A

        if (productId == B) {

            if (cashAndStuff1[productId] > 0) {
                String name = item2[3];
                System.out.println("You eat a " + name + ".");
                cashAndStuff1[productId]--;
                System.out.println("You now have " + cashAndStuff1[productId] + " " + name + " left.");
                return cashAndStuff1;

            } else {
                System.out.println("You can't eat what you don't have in your inventory.");
                return cashAndStuff1;
            }//else

        }// if B

        if (productId == C) {

            if (cashAndStuff1[productId] > 0) {
                String name = item3[3];
                System.out.println("You eat a " + name + ".");
                cashAndStuff1[productId]--;
                System.out.println("You now have " + cashAndStuff1[productId] + " " + name + " left.");
                return cashAndStuff1;

            } else {
                System.out.println("You can't eat what you don't have in your inventory.");
                return cashAndStuff1;
            }//else

        }// if C
        else {
            System.out.println("Program Error, product not found in category.");
            return cashAndStuff1;}
    }//use product

    @Override
    public String getName(int productId){
        int A = Integer.parseInt(item1[0]);
        int B = Integer.parseInt(item2[0]);
        int C = Integer.parseInt(item3[0]);

        String namnet = new String();

        if (productId == A) {
            namnet = this.item1[3];
            return namnet;}

        if (productId == B) {
            namnet = this.item2[3];
            return namnet;}

        if (productId == C) {
            namnet = this.item3[3];
            return namnet;}
        else {
            System.out.println("Error, product not found.");}

        return namnet;
    }// getName

    @Override
    public String getPrice(int productId){

        int A = Integer.parseInt(item1[0]);
        int B = Integer.parseInt(item2[0]);
        int C = Integer.parseInt(item3[0]);

        String priset = new String();

        if (productId == A) {
            priset = this.item1[1];
            return priset;}

        if (productId == B) {
            priset = this.item2[1];
            return priset;}

        if (productId == C) {
            priset = this.item3[1];
            return priset;}
        else {
            System.out.println("Error, product not found.");}

        return priset;

    }//getPrice

}//class
