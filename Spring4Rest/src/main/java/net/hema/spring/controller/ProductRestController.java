package net.hema.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.hema.spring.dao.ProductDAO;
import net.hema.spring.model.Product;

@RestController
public class ProductRestController {
	
	@Autowired
	ProductDAO productDAO;
	
	@GetMapping("/api/getproductdetails")
	public List<Product> getCustomers() {
		return productDAO.list();
	}

	@GetMapping("/api/getproductdetails/{id}")
	public ResponseEntity<Product> getCustomer(@PathVariable("id") int id) {

		Product product = productDAO.get(id);
		if (product == null) {
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}

	@PostMapping(value = "/api/getproductdetails")
	public ResponseEntity<Product> createCustomer(@RequestBody Product product) {

		productDAO.create(product);

		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}

	@DeleteMapping("/api/getproductdetails/{id}")
	public ResponseEntity<Integer> deleteCustomer(@PathVariable int id) {

		if (null == productDAO.delete(id)) {
			return new ResponseEntity<Integer>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Integer>(id, HttpStatus.OK);

	}

	@PutMapping("/api/getproductdetails/{id}")
	public ResponseEntity<Product> updateCustomer(@PathVariable int id, @RequestBody Product product) {

		product = productDAO.update(id, product);

		if (null == product) {
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}

}
