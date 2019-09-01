package shop;


import entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import repositories.ProductRepository;


@SpringBootApplication
public class Shop implements CommandLineRunner {

    @Autowired
    ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run (Shop.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (Product product:productRepository.findAll ()){
            System.out.println ("Id" + product.getId ());
            System.out.println ("Name" + product.getName ());
            System.out.println ("Price" + product.getPrice ());
            System.out.println ("Quantity" + product.getQuantity ());
            System.out.println ("Description" + product.getDescription ());
            System.out.println ("Photo" + product.getPhoto ());
            System.out.println ("Featured" + product.isFeatured ());
            System.out.println ("====================================");

        }
    }
}
