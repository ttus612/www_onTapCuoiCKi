package vn.edu.iuh.ontapckwww;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.ontapckwww.backend.models.Category;
import vn.edu.iuh.ontapckwww.backend.models.Product;
import vn.edu.iuh.ontapckwww.backend.repositories.CategoryRepository;
import vn.edu.iuh.ontapckwww.backend.repositories.ProductRepository;

import java.util.Random;

@SpringBootApplication
public class OnTapCkwwwApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnTapCkwwwApplication.class, args);
	}

	@Autowired private CategoryRepository categoryRepository;
	@Autowired private ProductRepository productRepository;

//	@Bean
//	CommandLineRunner initData(){
//		return args -> {
//			Random random = new Random();
//			for (int i = 1; i <= 5; i++) {
//				Category category = new Category(i, "Category"+i);
//				categoryRepository.save(category);
//			}
//			for (int i = 1; i <= 100 ; i++) {
//				Product product = new Product(i, "Product"+i, random.nextDouble(100), new Category(random.nextInt(5)+1));
//				productRepository.save(product);
//			}
//		};
//	}

}
