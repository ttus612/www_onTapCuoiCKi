package vn.edu.iuh.ontapckwww.frontend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import vn.edu.iuh.ontapckwww.backend.models.Product;
import vn.edu.iuh.ontapckwww.backend.services.CategoryService;
import vn.edu.iuh.ontapckwww.backend.services.ProductService;

@Controller
public class PageController {
    @Autowired private CategoryService categoryService;
    @Autowired private ProductService productService;
    @GetMapping("/")
    public String index() {
//        productService.getAllProducts().forEach(System.out::println);
        return "index";
    }

    //Category
    @GetMapping("/categories")
    public String categories(Model model) {
        model.addAttribute("categories", categoryService.getAllCategory());
        return "category/index";
    }

    //Product
    @GetMapping("product-all")
    public String productAll(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "product/index";
    }

    @GetMapping("products")
    public String products(@Param("categoryId") long categoryId, Model model) {
        model.addAttribute("products", productService.getProductsByCategoryId(categoryId));
        return "product/index";
    }

    //Thêm
    @GetMapping("products/create")
    public String create(Model model) {
        model.addAttribute("product",new Product());
        model.addAttribute("categories", categoryService.getAllCategory());
        return "product/create";
    }

    @PostMapping("products/create")
    public String create(Product product) {
        productService.addProduct(product);
        return "redirect:/products?categoryId=" + product.getCategory().getId();
    }

    //Xóa
    @GetMapping("products/delete/{id}")
    public String delete(@PathVariable int id) {
        Product product = productService.getProductById(id).get();
        productService.deleteProduct(product);
        return "redirect:/products?categoryId=" + product.getCategory().getId();
    }

    //Cập nhật
    @GetMapping("/products/edit/{id}")
    public String edit(Model model, @PathVariable int id) {
        model.addAttribute("product", productService.getProductById(id).get() != null ? productService.getProductById(id).get() : new Product());
        model.addAttribute("categories", categoryService.getAllCategory());
        return "product/edit";
    }

    @PostMapping("/products/edit")
    public String edit(Product product) {
        productService.updateProduct(product);
        return "redirect:/products?categoryId=" + product.getCategory().getId();
    }

}
