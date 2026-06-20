package exercise3;
class Order{
    int orderId;
    String customerName;
    double totalPrice;
    Order(int orderId,String customerName,double totalPrice){
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }
    void display(){
        System.out.println("Id: " + orderId +
                ", Name: " + customerName +
                ", Price: " + totalPrice);
    }
    static void bubbleSort(Order[] orders){
        int n = orders.length-1;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(orders[j].totalPrice>orders[j+1].totalPrice){
                    Order temp = orders[j];
                    orders[j] = orders[j+1];
                    orders[j+1] = temp;
                }
            }
        }
    } 
    static void quickSort(Order[] orders,int low,int high){
        if(low<high){
            int pivotIndex = partition(orders,low,high);
            quickSort(orders,low,pivotIndex-1);
            quickSort(orders,pivotIndex+1,high);
        }
    }
    static int partition(Order[] orders,int low,int high){
        int i=low-1;
        double pivot = orders[high].totalPrice;
        for(int j=low;j<high;j++){
            if(orders[j].totalPrice < pivot){
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i+1];
        orders[i+1] = orders[high];
        orders[high] = temp;
        return i+1;
    }
}
public class sortingCustomers {
    public static void main(String args[]){
        Order[] orders = {
            new Order(105,"Karthik",7000),
            new Order(102,"Mohan",6700),
            new Order(100,"Chetan",8400),
            new Order(106,"Karthikeyan",8000),
            new Order(103,"Satvik",1000)
        };
        Order.quickSort(orders,0,orders.length-1);
        for(Order o : orders){
            o.display();
        }
    }
}
