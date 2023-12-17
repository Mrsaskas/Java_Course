import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Product {
    private String name;
    private double manufacturerPrice;

    private double price;

    public Product(String name, double manufacturerPrice, double price) {
        this.name = name;
        this.manufacturerPrice = manufacturerPrice;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getManufacturerPrice() {
        return manufacturerPrice;
    }

    public double getprice()
    {
        return price;
    }
}

class OnlineStore {
    private String storeName;
    private List<Product> products;

    public OnlineStore(String storeName) {
        this.storeName = storeName;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        // Перевірка наявності товару з однаковою назвою
        for (Product existingProduct : products) {
            if (existingProduct.getName().equals(product.getName())) {
                return; // Якщо товар уже існує в магазині
            }
        }

        products.add(product);
    }

    public double getPriceForProduct(String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                return products.get(products.indexOf(product)).getprice();
            }
        }
        return -1; // Повертає -1, якщо товар не знайдено
    }




    public double getManufacturerPriceForProduct(String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                return products.get(products.indexOf(product)).getManufacturerPrice();
            }
        }
        return -1; // Повертає -1, якщо товар не знайдено
    }

    public String getStoreName() {
        return storeName;
    }
}

class ProductSearchService {
    private List<OnlineStore> onlineStores;

    public ProductSearchService() {
        this.onlineStores = new ArrayList<>();
    }

    public void addOnlineStore(OnlineStore store) {
        onlineStores.add(store);
    }


    // task 1
    // типізований ітератор

    public double findMinPrice(String productName) {
        double minPrice = 0.0;
        Iterator<OnlineStore> iterator = onlineStores.iterator();

        while (iterator.hasNext()) {
            OnlineStore store = iterator.next();

            double price = store.getPriceForProduct(productName);
            if (minPrice == 0.0) {
                minPrice = price;
            } else if (price < minPrice) {
                minPrice = price;
            }

        }


        return minPrice;
    }


    // Task 2
    // for each

    public List<String> findStoresWithMinPrice(String productName) {
        double minPrice = findMinPrice(productName);
        List<String> storesWithMinPrice = new ArrayList<>();

        for (OnlineStore store : onlineStores) {
            double price = store.getPriceForProduct(productName);
            if (price == minPrice) {
                storesWithMinPrice.add(store.getStoreName());
            }
        }

        return storesWithMinPrice;
    }


    // Task 3
    // не типізований ітератор

    public boolean canBuyAtManufacturerPrice(String productName) {


        Iterator iterator = onlineStores.iterator();

        while (iterator.hasNext()) {

            OnlineStore store = (OnlineStore) iterator.next();

            double price = store.getManufacturerPriceForProduct(productName);
            if (price < findMinPrice(productName)) {
                return false;
            }
        }
        return true;
    }
}


public class Main {
    public static void main(String[] args) {
        // Приклад використання
        ProductSearchService searchService = new ProductSearchService();

        OnlineStore store1 = new OnlineStore("Store1");
        store1.addProduct(new Product("Product1", 10.0, 12.0));
        store1.addProduct(new Product("Product2", 15.0, 12.0));
        searchService.addOnlineStore(store1);

        OnlineStore store2 = new OnlineStore("Store2");
        store2.addProduct(new Product("Product1", 10.0, 7.5));
        store2.addProduct(new Product("Product2", 15.0, 11.0));
        searchService.addOnlineStore(store2);

        double minPrice = searchService.findMinPrice("Product1");
        System.out.println("Min price for Product1: " + minPrice);

        List<String> storesWithMinPrice = searchService.findStoresWithMinPrice("Product1");
        System.out.println("Stores with min price for Product1: " + storesWithMinPrice);

        boolean canBuyAtManufacturerPrice = searchService.canBuyAtManufacturerPrice("Product1");
        System.out.println("Can buy Product1 at manufacturer price: " + canBuyAtManufacturerPrice);
    }
}


