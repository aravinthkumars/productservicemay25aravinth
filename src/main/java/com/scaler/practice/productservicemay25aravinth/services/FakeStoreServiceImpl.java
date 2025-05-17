package com.scaler.practice.productservicemay25aravinth.services;

import com.scaler.practice.productservicemay25aravinth.dtos.FakeStoreProductDTO;
import com.scaler.practice.productservicemay25aravinth.models.Category;
import com.scaler.practice.productservicemay25aravinth.models.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service("fakeProductService")
public class FakeStoreServiceImpl implements ProductService{

    private RestTemplate restTemplate;

    public FakeStoreServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getSingleProduct(Long productId) {
        ResponseEntity<FakeStoreProductDTO> fakeStoreProductDTOResponseEntity = restTemplate.getForEntity(
                "https://fakestoreapi.com/products/" + productId,
                FakeStoreProductDTO.class);
        //https://fakestoreapi.com/products/2
        FakeStoreProductDTO fakeStoreProductDTO = fakeStoreProductDTOResponseEntity.getBody();
        //Convert FakeStoreProductDTO to Product
        return convertFakeStoreProduct(fakeStoreProductDTO);
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public boolean deleteProduct(Long productId) {
        return false;
    }

    private Product convertFakeStoreProduct(FakeStoreProductDTO fakeStoreProductDTO) {
        if(fakeStoreProductDTO == null){
            return null;
        }
        Product product = new Product();
        product.setId(fakeStoreProductDTO.getId());
        product.setTitle(fakeStoreProductDTO.getTitle());
        product.setPrice(fakeStoreProductDTO.getPrice());
        product.setDescription(fakeStoreProductDTO.getDescription());
        product.setImage(fakeStoreProductDTO.getImage());

        Category category = new Category();
        category.setName(fakeStoreProductDTO.getCategory());
        product.setCategory(category);

        return product;
    }
}
