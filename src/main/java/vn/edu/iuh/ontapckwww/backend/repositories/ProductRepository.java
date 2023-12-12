package vn.edu.iuh.ontapckwww.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import vn.edu.iuh.ontapckwww.backend.models.Product;

import java.util.Collection;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE p.category.id = ?1")
    Collection<Product> getProductsByCategoryId(long categoryId);
}
