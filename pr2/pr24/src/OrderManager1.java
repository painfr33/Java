// Класс для управления заказами
/*class OrderManager {
    private final Map<Integer, Order> tableOrders;
    private final Map<String, Order> addressOrders;

    public OrderManager() {
        this.tableOrders = new HashMap<>();
        this.addressOrders = new HashMap<>();
    }

    public void addOrder(Order order, int tableNumber) {
        if (tableOrders.containsKey(tableNumber) || addressOrders.containsValue(order)) {
            throw new OrderAlreadyAddedException("Order already added for the table or address");
        }
        tableOrders.put(tableNumber, order);
    }

    public void addOrder(Order order, String address) {
        if (addressOrders.containsKey(address) || tableOrders.containsValue(order)) {
            throw new OrderAlreadyAddedException("Order already added for the table or address");
        }
        addressOrders.put(address, order);
    }

    public Order getOrder(int tableNumber) {
        return tableOrders.get(tableNumber);
    }

    public Order getOrder(String address) {
        return addressOrders.get(address);
    }

    public void removeOrder(int tableNumber) {
        tableOrders.remove(tableNumber);
    }

    public void removeOrder(String address) {
        addressOrders.remove(address);
    }

    public void addItem(int tableNumber, MenuItem item) {
        Order order = tableOrders.get(tableNumber);
        if (order != null) {
            order.add(item);
        } else {
            throw new IllegalTableNumber("Table number not found");
        }
    }

    public void addItem(String address, MenuItem item) {
        Order order = addressOrders.get(address);
        if (order != null) {
            order.add(item);
        } else {
            throw new IllegalArgumentException("Order not found for the given address");
        }
    }

    public Order[] getInternetOrders() {
        return addressOrders.values().toArray(new Order[0]);
    }

    public double getTotalInternetOrdersCost() {
        return addressOrders.values().stream().mapToDouble(Order::costTotal).sum();
    }

    public int getTotalItemQuantity(String itemName) {
        return addressOrders.values().stream().mapToInt(order -> order.itemQuantity(itemName)).sum();
    }
}
*/