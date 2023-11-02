package banking;

public class Customer {
    String name;
    String address;

    public Customer(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getName(){
        return this.name; //retourne le nom d'un clien
    }
    public  String getAddress(){
        return  this.address;
    }

}
