package exercise2;
class Produc{
    int productId;
    String productName;
    String category;
    Produc(int productId,String productName,String category){
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
    void display(){
        System.out.println("ID: " + productId +
                ", Name: " + productName +
                ", category: "+category);
    }
    static Produc linearSearch(Produc[] products,String target){
        for(int i=0;i<products.length;i++){
            if(products[i].productName.equals(target)){
                return products[i];
            }
        }
        return null;
    }
    static Produc binarySearch(Produc[] products,String key){
        int low = 0;
        int high = products.length-1;
        int mid;
        while(low<=high){
            mid = low+(high-low)/2;
            int res = products[mid].productName.compareTo(key);
            if(res==0){
                return products[mid];
            }
            else if(res<0){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return null;
    }
}    

public class EcommerceSearch {
    public static void main(String args[]){
        Produc[] products = {
            new Produc(101,"shoes","Accessories"),
            new Produc(102,"Phone","Electronics"),
            new Produc(103,"Mouse","Electronics"),
            new Produc(104,"Watch","Accessories"),
            new Produc(105,"Laptop","Electronics")
        };
        Produc p = Produc.linearSearch(products,"Laptop");
        if(p!=null){
            p.display();
        }
        else{
            System.out.println("Product not found");
        }
    }
}
