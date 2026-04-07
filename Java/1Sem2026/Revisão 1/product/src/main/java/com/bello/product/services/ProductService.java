package com.bello.product.services;

import com.bello.product.models.ProductModel;
import com.bello.product.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {

    @Autowired
    ProductRepository productRepository;

    public ProductModel add(ProductModel productModel){
        return productRepository.save(productModel);
    }

    public List<ProductModel> listar(){
        return productRepository.findAll();
    }

    public Optional<ProductModel> buscar(Long id){
        return productRepository.findById(id);
    }

    public void deletar(Long id){
        productRepository.deleteById(id);
    }

    public ProductModel atualizar(Long id, ProductModel productModel){
        ProductModel model = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Registro não encontrado"));

        model.setNome(productModel.getNome());
        model.setPreco(productModel.getPreco());

        return productRepository.save(model);
    }
}
