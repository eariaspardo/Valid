package academy.digitallab.store.product;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import academy.digitallab.store.product.controller.ServicioRestLibreriaController;
import academy.digitallab.store.product.entity.UserBasicData;
import academy.digitallab.store.product.service.UserBasicDataService;

@RunWith(SpringRunner.class)
@WebMvcTest(ServicioRestLibreriaController.class)
class ServiceProductApplicationTests {

	@Autowired
    private MockMvc mvc;
	
	@MockBean
    private UserBasicDataService userBasicDataService;
	
	@Test
	void userAllTest() throws Exception {
		
		UserBasicData alex = new UserBasicData().setId(8L)
							.setUsername("alex")
							.setLastName("diaz")
							.setEmail("alexger@hotmail.com");
		
		List<UserBasicData> allEmployees = Arrays.asList(alex);
		
		when(userBasicDataService.listAllUserBasicData()).thenReturn(allEmployees);
		
		mvc.perform(MockMvcRequestBuilders.get("/prueba/get")).andExpect(status().isOk());
		
		
	    //given(userBasicDataService.listAllUserBasicData()).willReturn(allEmployees);
		
	   /* mvc.perform(get("/prueba/get")
	      .contentType(MediaType.APPLICATION_JSON))
	      .andExpect(status().isOk())
	      .andExpect(jsonPath("$", hasSize(1)))
	      .andExpect(jsonPath("$[0].name", is(alex.getName())));*/
		
	}
	
	/*@Test
	  public void getFoo() throws Exception {
	    this.mvc.perform(get("/prueba/get").accept(""))
	        .andExpect(status().isOk())
	        .andExpect(content().mimeType("application/json"))
	        .andExpect(jsonPath("$.name").value("Lee"));
	  }*/

}
