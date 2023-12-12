package vn.edu.iuh.ontapckwww.backend.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.ontapckwww.backend.models.Product;
import vn.edu.iuh.ontapckwww.backend.repositories.ProductRepository;
import vn.edu.iuh.ontapckwww.backend.services.ProductService;

import java.util.Collection;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired private ProductRepository productRepository;

    @Override
    public Collection<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Collection<Product> getProductsByCategoryId(long categoryId) {
        return productRepository.getProductsByCategoryId(categoryId);
    }

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void updateProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(Product product) {
        productRepository.delete(product);
    }

    @Override
    public Optional<Product> getProductById(long productId) {
        return productRepository.findById(productId) != null ? Optional.of(productRepository.findById(productId).get()) : Optional.empty();
    }


}
