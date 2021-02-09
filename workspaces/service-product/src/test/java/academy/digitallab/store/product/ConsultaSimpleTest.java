package academy.digitallab.store.product;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import academy.digitallab.store.product.entity.UserBasicData;
import academy.digitallab.store.product.service.UserBasicDataService;

@RunWith(SpringRunner.class)
@WebAppConfiguration
public class ConsultaSimpleTest {

	@Autowired
	private UserBasicDataService userBasicDataService;

	@Autowired
	private MockMvc mockMvc;

	  @Before
	  public void setup() {
	    //this.mockMvc = webAppContextSetup(this.wac).build();
	  }

	  @Test
	  public void getFoo() throws Exception {
	    /*this.mockMvc.perform(get("/foo").accept("application/json"))
	        .andExpect(status().isOk())
	        .andExpect(content().mimeType("application/json"))
	        .andExpect(jsonPath("$.username").value("Lee"));*/
	  }
	
	
}
