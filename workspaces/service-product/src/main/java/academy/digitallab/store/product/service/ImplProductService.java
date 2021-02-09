package academy.digitallab.store.product.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import academy.digitallab.store.product.entity.Category;
import academy.digitallab.store.product.entity.Product;
import academy.digitallab.store.product.entity.UserBasicData;
import academy.digitallab.store.product.repository.ProductRepository;
import academy.digitallab.store.product.repository.UserBasicDataRepository;

@Service
public class ImplProductService implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> listAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public Product getProduct(Long id) {
		return productRepository.findById(id).orElse(null);
	}

	@Override
	public Product createProduct(Product product) {
		product.setStatus("CREATED");
		product.setCreateAt(new Date());
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		
		if (product.getId() == null) {
			return null;
		}
		
		return productRepository.save(product);
	}

	@Override
	public Product deleteProduct(Long id) {
		
		
		Product producto = getProduct(id);

		if (producto.getId() == null) {
			return null;
		}
		
		producto.setStatus("DELETE");
		
		return productRepository.save(producto);
	}

	@Override
	public List<Product> findByCategory(Category category) {
		return productRepository.findByCategory(category);
	}

	@Override
	public Product updateStock(Long id, Double quantity) {
		
		Product productDB = getProduct(id);

		if (productDB.getId() == null) {
			return null;
		}
		
		productDB.setStock(productDB.getStock()+quantity);
		return productRepository.save(productDB);
	}

}
