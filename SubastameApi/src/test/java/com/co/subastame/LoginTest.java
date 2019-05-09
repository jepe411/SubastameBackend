package com.co.subastame;

import static io.restassured.RestAssured.get;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.equalTo;
import org.junit.Test;

public class LoginTest {
	
	@Test
	  public void testLista() {
	    get("/validateUser/fabio.libre@gmail.com/8fc514659eb7719ff9a617e1c790aaaf").then().statusCode(200);
	  }
	
//	@Test
//	  public void testOrdenador() {
//	    get("/validateUser/useremail").then().body("modelo", equalTo("Yoga"));
//	  }

}
