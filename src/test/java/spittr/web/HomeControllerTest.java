package spittr.web;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import spitter.web.HomeController;

public class HomeControllerTest {
    @Test
    public void testHomePage() throws Exception {
	HomeController controller = new HomeController();
	MockMvc mocMvc = MockMvcBuilders.standaloneSetup(controller).build();
	mocMvc.perform(MockMvcRequestBuilders.get("/")).andExpect(MockMvcResultMatchers.view().name("home"));
    }
}
