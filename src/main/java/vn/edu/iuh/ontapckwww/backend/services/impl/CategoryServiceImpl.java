package vn.edu.iuh.ontapckwww.backend.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.ontapckwww.backend.models.Category;
import vn.edu.iuh.ontapckwww.backend.models.Product;
import vn.edu.iuh.ontapckwww.backend.repositories.CategoryRepository;
import vn.edu.iuh.ontapckwww.backend.services.CategoryService;

import java.util.Collection;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired private CategoryRepository categoryRepository;

    @Override
    public Collection<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

}
