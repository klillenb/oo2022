public class Restaurant{
    // klient esitab tellimuse
    // teenindaja võtab tellimuse ja esitab kööki
    // köök ütleb valmimisaja
    public static void main(String[] arg){
        Customer c1 = new Customer();
        String waiterName = c1.askWaiter();
        Waiter w1 = new Waiter(waiterName);

        String order = c1.order();
        w1.orderToKitchen(order);
        System.out.println(w1);
    }
}