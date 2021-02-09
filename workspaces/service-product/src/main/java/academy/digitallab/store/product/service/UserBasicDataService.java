package academy.digitallab.store.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import academy.digitallab.store.product.entity.UserBasicData;

@Service
public interface UserBasicDataService {

    public List<UserBasicData> listAllUserBasicData();
    public List<UserBasicData> deleteUser(Long id);
    public List<UserBasicData> listAllCriteria();
    public UserBasicData findByIdCriteria(Long id);
    public UserBasicData saveBasicData();
}
