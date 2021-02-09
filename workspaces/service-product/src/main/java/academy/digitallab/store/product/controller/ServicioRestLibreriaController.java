package academy.digitallab.store.product.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import academy.digitallab.store.product.entity.UserBasicData;
import academy.digitallab.store.product.service.UserBasicDataService;


@RestController
@RequestMapping(path = "/prueba")
public class ServicioRestLibreriaController {

	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserBasicDataService userBasicDataService;
	
	@PostMapping("/post/{nombre}")
	public UserBasicData servicioPost(@PathVariable(name="nombre") String nombre, 
			@RequestBody String apellido, 
			@RequestBody String correo,
			@RequestBody Long id) {
		
		
		UserBasicData user = new UserBasicData().setUsername(nombre)
												.setLastName(apellido)
												.setEmail("edilson.arias@valid.com");
		return user;
	}
	
	@PostMapping("/postDes")
	public UserBasicData servicioPostDes(@RequestBody UserBasicData user) {
		
		UserBasicData userDes = user;
		return userDes;
	}
	
	
	@GetMapping("/get")
	public List<UserBasicData> servicioGet() {
		List<UserBasicData> usuarios = userBasicDataService.listAllUserBasicData();
		return usuarios;
	}
	
	@GetMapping("/criteria/get")
	public List<UserBasicData> servicioGetCriteria() {
		List<UserBasicData> usuarios = userBasicDataService.listAllCriteria();
		return usuarios;
	}
	
	@PutMapping("/put/{dato}")
	public UserBasicData servicioPut(@PathVariable String dato) {
		UserBasicData user = new UserBasicData().setUsername(dato)
												.setLastName("Arias")
												.setEmail("edilson.arias@valid.com");
		return user;
	} 
	
	/*
	@PutMapping("/putDos/{dato}")
	public UserBasicData servicioPutDos(@RequestBody String dato) {
		
		return userBasicDataService.save;
	} */
	
	@DeleteMapping("/delete")
	public List<UserBasicData> servicioDelete(@RequestBody UserBasicData user) {
		userBasicDataService.deleteUser(user.getId());
		return userBasicDataService.listAllUserBasicData();
	} 
	
}
