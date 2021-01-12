package se.lexicon.jonasVendingMachine;

public abstract class ProductAbstract {

private String item1[];
private String item2[];
private String item3[];


    public String[] getItem1() {
        return item1;
    }

    public void setItem1(String[] item1) {
        this.item1 = item1;
    }

    public String[] getItem2() {
        return item2;
    }

    public void setItem2(String[] item2) {
        this.item2 = item2;
    }

    public String[] getItem3() {
        return item3;
    }

    public void setItem3(String[] item3) {
        this.item3 = item3;
    }


//--
    public void examineProduct(int productId) {    }

//--
    public double[] buyProduct(double cashAndStuff1[], int productId) {

        return cashAndStuff1;
    }
//--
    public double[] useProduct(double cashAndStuff1[], int productId) {

        return cashAndStuff1;
    }
//--
    public String getName(int productId){
        return item1[3];
    }

    public String getPrice(int productId){ return item1[1];}
//--

}//class
