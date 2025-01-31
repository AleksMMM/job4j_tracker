package pojo;

public class ShopDrop {

    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        for (Product pro: products) {
            System.out.println(pro.getName());
        }
        System.out.println();

        products[1] = null;
        for (Product pro: products) {
            if (pro != null) {
                System.out.println(pro.getName());
            }else {
                System.out.println("null");
            }
        }

        products[1] = products[2];
        products[2] = null;
        
    }

    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length -1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length -1] = null;
        return products;
    }
}
