
package javaduainadlawan;


public class Reciept {
    String fname, pname;
    int quan, price, cash;
    
    public void processReceipt(String fullname,String productname, int Quantity, int Price, int Cash){
        
        this.fname = fullname;
        this.pname = productname;
        this.quan = Quantity;
        this.price = Price;
        this.cash = Cash;
        

    }
    public void viewReceipt(){
        System.out.println("________________________");
        System.out.println("Receipt");
        System.out.println("________________________");
        System.out.println("Name:"+fname);
        System.out.println("Item:"+pname);
        System.out.println("Quantity"+quan);
        System.out.println("________________________");
        System.out.println("Total due:"+ (quan*price));
        
        
        System.out.println("Cash:"+cash);
        System.out.println("________________________");
        System.out.println("Change:"+(cash-(quan*price)));
        System.out.println("________________________");
        
    }

    void getreceipt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

