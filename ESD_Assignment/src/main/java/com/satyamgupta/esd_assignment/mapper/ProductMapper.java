package com.satyamgupta.esd_assignment.mapper;
import com.satyamgupta.esd_assignment.dto.ProductRequest;
import com.satyamgupta.esd_assignment.dto.ProductResponse;
import com.satyamgupta.esd_assignment.entity.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductMapper {

    public Product toProduct(ProductRequest request) {
        return Product.builder()
                .productName(request.productName())
                .productDesc(request.productDesc())
                .quantity(request.quantity())
                .brand(request.brand())
                .categoryId((long) request.categoryId())
                .price((long) request.price())
                .build();
    }
    public ProductResponse toProductResponse(Product product) {
        return new ProductResponse(product.getProductName());
    }
}
