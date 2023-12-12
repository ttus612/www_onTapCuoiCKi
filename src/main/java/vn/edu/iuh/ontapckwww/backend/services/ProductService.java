package vn.edu.iuh.ontapckwww.backend.services;

import vn.edu.iuh.ontapckwww.backend.models.Product;

import java.util.Collection;
import java.util.Optional;

public interface ProductService {
    Collection<Product> getAllProducts();
    Collection<Product> getProductsByCategoryId(long categoryId);

    void addProduct(Product product);

    void updateProduct(Product product);

    void deleteProduct(Product product);

    Optional<Product> getProductById(long productId);
}
