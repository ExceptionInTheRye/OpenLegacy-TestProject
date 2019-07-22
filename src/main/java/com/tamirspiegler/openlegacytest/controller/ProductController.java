package com.tamirspiegler.openlegacytest.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tamirspiegler.openlegacytest.dto.updateItemAmountDTO;
import com.tamirspiegler.openlegacytest.entities.Product;
import com.tamirspiegler.openlegacytest.services.ProductJPARepository;
import com.tamirspiegler.openlegacytest.util.DTO;

@RestController
public class ProductController {

	@Autowired
	private ProductJPARepository productService;

	@PostMapping("/products")
	public String addNewProduct(@RequestBody Product product) {
		productService.save(product);
		return "Item added";
	}

	@GetMapping("/products")
	public List<Product> getProducts() {
		return productService.findAll();
	}

	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable int id) {
		return productService.findById(id).get();
	}

	@GetMapping("/amount/{id}")
	public Integer getProductAmountById(@PathVariable int id) {
		return productService.findById(id).get().getItemAmount();
	}

	@PutMapping("/product/{id}")
	ResponseEntity<Product> updateProduct(@Valid @RequestBody Product product) {
		Product result = productService.save(product);
		return ResponseEntity.ok().body(result);
	}
	
	@PutMapping("/patch/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void updateItemAmount(@DTO(updateItemAmountDTO.class) Product product) {
		productService.save(product);
	}
	
	@DeleteMapping("/products/{id}")
	public String deleteProductById(@PathVariable int id) {
		productService.deleteById(id);
		return "Item deleted";
	}

}
