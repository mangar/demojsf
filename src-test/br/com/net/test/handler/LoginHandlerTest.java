/**
 * 
 */
package br.com.net.test.handler;

import org.openqa.selenium.server.SeleniumServer;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestCase;
import com.thoughtworks.selenium.Selenium;

/**
 * @author mangar
 * 
 */
public class LoginHandlerTest extends SeleneseTestCase {

	private static final String MAX_WAIT_TIME_IN_MS = "60000";
	private static final String BASE_URL = "http://localhost:8080";
	private Selenium selenium = new DefaultSelenium("localhost", 4444,
			"*firefox", BASE_URL);
	private SeleniumServer seleniumServer;

	public void setUp() throws Exception {
		seleniumServer = new SeleniumServer();
		seleniumServer.start();
		selenium.start();
	}

	public void tearDown() throws Exception {
		selenium.stop();
		seleniumServer.stop();
	}

	public void testClickingLink() throws Exception {
		// selenium.open(BASE_URL);
		// selenium.click("link=Test Page For Selenium Remote Control");
		// selenium.waitForPageToLoad(MAX_WAIT_TIME_IN_MS);
		// String expectedTitle =
		// "Bit Motif È Test Page For Selenium Remote Control";
		// assertEquals(expectedTitle, selenium.getTitle());

		selenium.open("/demojsf/index.jsf");
		selenium.type("j_id_jsp_1522537910_1:j_id_jsp_1522537910_3", "adm");
		selenium.type("j_id_jsp_1522537910_1:j_id_jsp_1522537910_5", "adm");
		selenium.click("j_id_jsp_1522537910_1:j_id_jsp_1522537910_6");
		selenium.waitForPageToLoad(MAX_WAIT_TIME_IN_MS);

		assertTrue(selenium.isTextPresent("Registro salvo com sucesso!"));

		tearDown();
	}

	// @Test
	// public void testNew() throws Exception {
	//
	// SeleniumServer server = new SeleniumServer();
	// server.start();
	//
	// selenium.open("/demojsf/index.jsf");
	// selenium.type("j_id_jsp_1522537910_1:j_id_jsp_1522537910_3", "adm");
	// selenium.type("j_id_jsp_1522537910_1:j_id_jsp_1522537910_5", "adm");
	// selenium.click("j_id_jsp_1522537910_1:j_id_jsp_1522537910_6");
	// selenium.waitForPageToLoad("30000");
	// selenium
	// .click("j_id_jsp_1113189555_5:1:j_id_jsp_1113189555_20:j_id_jsp_1113189555_21");
	// selenium.click("j_id_jsp_1113189555_27:j_id_jsp_1113189555_30");
	// selenium.waitForPageToLoad("30000");
	// selenium.click("link=Create Supplier");
	// selenium.waitForPageToLoad("30000");
	// selenium.type("j_id_jsp_1116280183_1:_form_name", "Marcio Mangar");
	// selenium.type("j_id_jsp_1116280183_1:_form_email",
	// "marcio@mangar.com.br");
	// selenium.type("j_id_jsp_1116280183_1:_form_email2",
	// "marcio@mangar.com.br");
	// selenium.type("j_id_jsp_1116280183_1:_form_city", "SP");
	// selenium.type("j_id_jsp_1116280183_1:_form_creditcard",
	// "0000111122223333");
	// selenium.type("j_id_jsp_1116280183_1:_form_age", "30");
	// selenium.type("j_id_jsp_1116280183_1:_form_date_start", "10/10/2009");
	// selenium.type("j_id_jsp_1116280183_1:_form_phone", "1 11 3633 5303");
	// selenium.click("j_id_jsp_1116280183_1:j_id_jsp_1116280183_42");
	// selenium.waitForPageToLoad("30000");
	//
	// assertTrue(selenium.isTextPresent("Registro salvo com sucesso!"));
	//
	// server.stop();
	//
	// }

}
