package exercise1;
import java.util.*;
class Product{
    int productId;
    String productName;
    double quantity;
    double price;
    Product(int productId,String productName,double quantity,double price){
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    void display(){
        System.out.println("ID: " + productId +
                ", Name: " + productName +
                ", Quantity: " + quantity +
                ", Price: " + price);
    }
}
//add, update, and delete products 
class Inventory{
    HashMap<Integer,Product> products = new HashMap<>();
    void addProduct(Product p){
        products.put(p.productId,p);
        System.out.println("Product added successfully");  
    }
    void updateProduct(int id,double quantity,double price){
        if(products.containsKey(id)){
            Product p = products.get(id);
            p.quantity = quantity;
            p.price = price;
            System.out.println("Product updated successfully");
        }
        else{
            System.out.println("Product not found");
        }
    }
    void deleteProduct(int id){
        if(products.containsKey(id)){
            products.remove(id);
            System.out.println("Product deleted successfully");
        }
        else{
            System.out.println("Product not found");
        }
    }
    void displayProducts(){
        for(Product p : products.values()){
            p.display();
        }
    }
}
public class inventorySystem{
    public static void main(String args[]){
        Inventory inventory = new Inventory();
        inventory.addProduct(new Product(101,"Laptop",10,50000));
        inventory.addProduct(new Product(102,"mobile",15,30000));
        inventory.displayProducts();
        inventory.updateProduct(101,20,55000);
        inventory.deleteProduct(102);
        System.out.println("After Deletion");
        inventory.displayProducts();
        
    }
}