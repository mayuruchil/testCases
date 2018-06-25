package webapp.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

public class ActionControllerTest {
	
	@Mock
	Service service;
	
	public void setUp(){
	}
	
	@Test
	public void testControllerActionMethod(){
		ControllerAction controllerAction = new ControllerAction();
		
		Service service = mock(Service.class);
		controllerAction.setService(service);
		int id = 1;
		when(service.getName(1)).thenReturn("Chill" + id);
		
		String actual = controllerAction.getDetails(1);
		
		String expected = "Chill1";
		assertEquals(actual, expected);
	}

}
