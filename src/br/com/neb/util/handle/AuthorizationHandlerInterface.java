/**
 * 
 */
package br.com.neb.util.handle;

/**
 * @author mangar
 *
 */
public interface AuthorizationHandlerInterface {

	/**
	 *  TODO check the resource and the permissions from that user to the resource
	 *  - check if the user is logged in
	 *  - check if the requested url is in the user bean stored in the session
	 *  - throws an exception
	 *  - return OK / throws an exception
	 *  - redirect to a fail/main page
	 *  
	 * @throws Exception
	 */
	public void checkSecurity() throws AuthorizationException;
	
}
