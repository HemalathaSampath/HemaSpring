package net.hema.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import net.hema.spring.model.Product;

@Component
public class ProductDAO {
	

	

		// Dummy database. Initialize with some dummy values.
		private static List<Product> products;
		{
			products = new ArrayList<Product>();
			products.add(new Product(101, "laptop", "A laptop computer is a portable personal computer powered by a battery, or an AC cord plugged into an electrical outlet, which is also used to charge the battery.", "laptop agreement","HCL", 65000));
			products.add(new Product(201, "Desktop", "A desktop computer is a personal computer that fits on or under a desk", "laptop agreement","HCL", 65000));
			products.add(new Product(301, "MobilePhone", "The mobile phone can be used to communicate over long distances without wires.", "laptop agreement","HCL", 65000));
			products.add(new Product(401, "Tab", "It is smaller than a typical laptop, but significantly larger than the average smartphone.", "laptop agreement","HCL", 65000));
		}

		/**
		 * Returns list of customers from dummy database.
		 * 
		 * @return list of customers
		 */
		public List<Product> list() {
			return products;
		}

		/**
		 * Return customer object for given id from dummy database. If customer is
		 * not found for id, returns null.
		 * 
		 * @param id
		 *            customer id
		 * @return customer object for given id
		 */
		public Product get(int id) {

			for (Product p : products) {
				if (p.getProduct_id() == id) {
					return p;
				}
			}
			return null;
		}

		/**
		 * Create new customer in dummy database. Updates the id and insert new
		 * customer in list.
		 * 
		 * @param customer
		 *            Customer object
		 * @return customer object with updated id
		 */
		public Product create(Product product) {
			product.setProduct_id((int)System.currentTimeMillis());
			products.add(product);
			return product;
		}

		/**
		 * Delete the customer object from dummy database. If customer not found for
		 * given id, returns null.
		 * 
		 * @param id
		 *            the customer id
		 * @return id of deleted customer object
		 */
		public Object delete(int id) {

			for (Product c : products) {
				if (c.getProduct_id()==id) {
					products.remove(c);
					return id;
				}
			}

			return null;
		}

		/**
		 * Update the customer object for given id in dummy database. If customer
		 * not exists, returns null
		 * 
		 * @param id
		 * @param customer
		 * @return customer object with id
		 */
		public Product update(int id, Product product) {

			for (Product c : products) {
				if (c.getProduct_id() == id) {
					product.setProduct_id(c.getProduct_id());
					products.remove(c);
					products.add(product);
					return product;
				}
			}

			return null;
		}

	}


