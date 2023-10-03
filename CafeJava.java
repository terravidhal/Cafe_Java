
public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = ", Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
		double dripCoffee = 1.5;
        double latte = 2.5;
        double cappuccino = 6.5;

		
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
		
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
       // System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        
        
        //Cindhuri
        System.out.println('\n'+ generalGreeting + customer1); 
		if(isReadyOrder1 == false) {
          System.out.println(customer1 + pendingMessage);
        }
        else {
           System.out.println(customer1 + readyMessage);
        }


        //Noah
        System.out.println('\n'+ generalGreeting + customer4); 
		if(isReadyOrder4 == false) {
          System.out.println(customer4 + pendingMessage);
        }
        else {
           System.out.println(customer4 + readyMessage );
           System.out.println(customer4 + displayTotalMessage + cappuccino );
        }


        //Sam
        System.out.println('\n'+ generalGreeting + customer2); 
		if(isReadyOrder2 == false) {
          System.out.println(customer2 + pendingMessage);
        }
        else {
           System.out.println(customer2 + readyMessage );
           System.out.println(customer2 + displayTotalMessage + 2 * latte );
        }


        //Jimmy
        System.out.println('\n'+ generalGreeting + customer3); 
		if(isReadyOrder3 == false) {
          System.out.println(customer3 + pendingMessage);
        }
        else {
           System.out.println(customer3 + readyMessage );
           System.out.println(customer3 + displayTotalMessage +  (latte - dripCoffee) );
        }
    }
}
