package tut9.chain_of_responsibility.middleware;

/**
 * ConcreteHandler. Checks a user's role.
 */
public class RoleCheckMiddleware extends Middleware {
	//TO-DO: Implement the check() method
    public boolean check(String email, String password) {
    	/*if email = 'admin@example.com' => display welcome message for admin then return true
        else, display welcome message for normal user */

        if (email.equalsIgnoreCase("admin@example.com")){
            System.out.println("Welcome admin");
            return true;
        }
        System.out.println("Welcome user");
        return checkNext(email, password);
    }
}