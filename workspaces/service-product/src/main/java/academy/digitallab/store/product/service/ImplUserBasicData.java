package academy.digitallab.store.product.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import academy.digitallab.store.product.entity.UserBasicData;
import academy.digitallab.store.product.repository.UserBasicDataRepository;

@Service
public class ImplUserBasicData implements UserBasicDataService {
	
	@Autowired
	private UserBasicDataRepository userBasicDataRepository;

	@Override
	public List<UserBasicData> listAllUserBasicData() {
		return (List<UserBasicData>) userBasicDataRepository.findAll();
	}
	
	@Override
	public List<UserBasicData> deleteUser(Long id) {
		UserBasicData usuario = userBasicDataRepository.findById(id).orElse(null);
		if (usuario == null) {
			return null;
		}
		userBasicDataRepository.deleteById(usuario.getId());
		return listAllUserBasicData();
	}

	@Override
	public List<UserBasicData> listAllCriteria() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-unit");;
		//EntityManager em = emf.createEntityManager();
		EntityManager em = emf.createEntityManager();
		
		CriteriaBuilder cri_bui = em.getCriteriaBuilder();
		
		CriteriaQuery<UserBasicData> usuario = cri_bui.createQuery(UserBasicData.class);
		Root<UserBasicData> raiz = usuario.from(UserBasicData.class);
		usuario.select(raiz);
		
		List<UserBasicData> userBasic = em.createQuery(usuario).getResultList();
		
		return userBasic;
	}

	@Override
	public UserBasicData findByIdCriteria(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserBasicData saveBasicData() {
		// TODO Auto-generated method stub
		return null;
	}

}
