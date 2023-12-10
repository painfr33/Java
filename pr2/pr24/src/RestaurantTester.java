import java.util.Arrays;

public class RestaurantTester {
    public static void main(String[] args) {
        testOrderManager();
        testInternetOrder();
        //testRemoveOrderException();
    }



    private static void testOrderManager() {
        OrderManager orderManager = new OrderManager(3);
        // Create a sample order
        InternetOrder internetOrder = new InternetOrder();
        Dish dish = new Dish("Spaghetti", "Delicious pasta");
        Drink drink = new Drink(5, "Cola", "Refreshing cola", false, 0, DrinkTypeEnum.SODA);
        internetOrder.add(dish);
        internetOrder.add(drink);

        // Test adding orders to the order manager
        orderManager.add(internetOrder, 1); // Add order to table 1

        // Try adding the same order to the same table, should throw an exception
        try {
            orderManager.add(internetOrder, 1);
        } catch (OrderAlreadyAddedException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Try adding the same order to a different table, should not throw an exception
        orderManager.add(internetOrder, 2);

        // Test getting orders from the order manager
        Order orderTable1 = orderManager.getOrder(1);
        Order orderTable2 = orderManager.getOrder(2);


        // Test removing orders from the order manager
        orderManager.removeOrder(1);
        orderManager.removeOrder(2);

    }

    private static void testInternetOrder() {
        // Test creating an InternetOrder
        InternetOrder internetOrder = new InternetOrder();

        // Test adding items to the order
        Dish dish = new Dish("Pizza", "Cheesy goodness");
        Drink drink = new Drink(7, "Wine", "Red wine", true, 12, DrinkTypeEnum.WINE);
        internetOrder.add(dish);
        internetOrder.add(dish);
        internetOrder.add(drink);

        // Test removing an item by name
        internetOrder.removeItem("Pizza");

        // Test removing all items with a certain name
        internetOrder.add(dish);
        internetOrder.add(dish);
        int removedCount = internetOrder.removeAll("Pizza");

        // Test sorting items by cost
        MenuItem[] sortedItems = internetOrder.SortedItemsByCostDesc();

        // Print results
        System.out.println("Removed count: " + removedCount);
        System.out.println("Sorted items: " + Arrays.toString(sortedItems));

        // Test getting the total cost
        double totalCost = internetOrder.getTotalCost();
        System.out.println("Total cost: " + totalCost);

        // Test getting item quantity by name
        int pizzaQuantity = internetOrder.getItemQuantity("Pizza");
        System.out.println("Pizza quantity: " + pizzaQuantity);

        // Test getting unique item names
        String[] uniqueItemNames = internetOrder.getUniqueItemNames();
        System.out.println("Unique item names: " + Arrays.toString(uniqueItemNames));

        // Test getting the order size
        int orderSize = internetOrder.getOrderSize();
        System.out.println("Order size: " + orderSize);
    }
}
