package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{
	Product getByProductName(String productName);
	Product getByProductNameAndCategoryId(String productName, int categoryId);
	List<Product> getByProductNameOrCategoryId(String productName, int categoryId);
	List<Product> getByCategoryId(int categoryId);
	List<Product> getByNameContains(String productName);
	List<Product> getByNameStartsWith(String productName);
	
	@Query("")
	List<Product> getByNameAndCategory(String productName, int categoryId);
}
