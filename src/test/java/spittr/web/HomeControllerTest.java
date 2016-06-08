package spittr.web;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import spitter.web.HomeController;

public class HomeControllerTest {
    @Test
    public void testHomePage() throws Exception {
	HomeController controller = new HomeController();
	assertEquals("home", controller.home());
    }
}
