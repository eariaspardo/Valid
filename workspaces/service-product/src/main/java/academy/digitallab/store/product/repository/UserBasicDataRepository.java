package academy.digitallab.store.product.repository;

import org.springframework.data.repository.CrudRepository;

import academy.digitallab.store.product.entity.UserBasicData;

public interface UserBasicDataRepository extends CrudRepository<UserBasicData, Long> {

	
}
