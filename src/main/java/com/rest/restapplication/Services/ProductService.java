package com.rest.restapplication.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.restapplication.model.Product;
@Service
public class ProductService {
    List<Product> products=new ArrayList<>( Arrays.asList(new Product(101, "Iphone", 50000),new Product(1002, "Samsung", 60000), new Product(1003, "Canon Event", 1)));
    public List<Product> getProducts(){
        return products;
    }
    public Product getProductById(int prodId){
        return products.stream()
                    .filter(p->p.getProdId()==prodId)
                    .findFirst().orElse(new Product(100, "No Item", 0));
    }

    public void addProduct(Product prod){
        products.add(prod);
    }

    public void updateProduct(Product prod){
        int index=0;
        for (int i=0;i<products.size();i++){
            if(products.get(i).getProdId()==prod.getProdId()){
                index=i;
            }
        }
        products.set(index,prod);
    }

    public void deleteProduct(int prodId){
        int index=0;
        for (int i=0;i<products.size();i++){
            if(products.get(i).getProdId()==prodId){
                index=i;
            }
        }
        products.remove(index);
    }
}
