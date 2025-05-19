package com.scaler.practice.productservicemay25aravinth.services;

import com.scaler.practice.productservicemay25aravinth.exceptions.CatgeoryNotFoundException;
import com.scaler.practice.productservicemay25aravinth.models.Category;
import com.scaler.practice.productservicemay25aravinth.models.Product;
import com.scaler.practice.productservicemay25aravinth.repositories.CategoryRepository;
import com.scaler.practice.productservicemay25aravinth.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("selfProductService")
//@Primary
public class SelfProductServiceImpl implements ProductService {

    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    public SelfProductServiceImpl(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Product getSingleProduct(Long productId) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product createProduct(Product product) throws CatgeoryNotFoundException {
        Category category = product.getCategory();
        if(category==null){
            throw new CatgeoryNotFoundException("Product cannot be created without category");
        }

        //Find the category with title

        Optional<Category> optionalCategory = categoryRepository.findByCategoryName(category.getCategoryName());

        if(optionalCategory.isEmpty()){
            category =  categoryRepository.save(category);
        }

        return this.productRepository.save(product);
    }

    @Override
    public boolean deleteProduct(Long productId) {
        return false;
    }

    /*
    * {
    *   "title" : "Apple airpods"
    *   "description" : "for calls"
    *   "price" : "20000"
    *   "category" :
    *       {
    *           "title" : "accessories"
    *        }
    * }
    * */
}
