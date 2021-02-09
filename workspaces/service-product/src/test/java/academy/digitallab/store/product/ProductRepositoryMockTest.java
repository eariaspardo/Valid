package academy.digitallab.store.product;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import academy.digitallab.store.product.entity.Category;
import academy.digitallab.store.product.entity.Product;
import academy.digitallab.store.product.repository.ProductRepository;

@DataJpaTest
public class ProductRepositoryMockTest {

    @Autowired
    private ProductRepository productRepository;
    
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Test
    public void whenFindByCategory_thenReturnListProduct(){
        /*Product product01 = Product.builder()
                .name("computer")
                .category(Category.builder().id(1L).build())
                .description("")
                .stock(Double.parseDouble("10"))
                .price(Double.parseDouble("1240.99"))
                .status("Created")
                .createAt(new Date()).build();
        productRepository.save(product01);*/
    	
    	Product product01 = new Product();
    	Category category = new Category();
    	category.setId(1L);
    	category.setName("Shoes");
    	product01.setCategory(category);

        //List<Product> founds= productRepository.findByCategory(category);
    	
        List<Product> founds= productRepository.findByCategory(product01.getCategory());
        if (Assertions.assertThat(founds.size()).isEqualTo(2) == null) {
        	log.info("==== TIENE MAS DE DOS DATOS =======================");
        }else{
        	log.info("==== TIENE DOS DATOS ==========================" + Assertions.assertThat(founds.size()).isEqualTo(2)+ " ================");
        };
        


    }
}