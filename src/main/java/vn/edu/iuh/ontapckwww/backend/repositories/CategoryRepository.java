package vn.edu.iuh.ontapckwww.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.ontapckwww.backend.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
