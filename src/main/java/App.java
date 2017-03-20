import java.io.Console;

public class App{
	public static void main(String[] args) {
		EventPlanner newEvent = new EventPlanner();
		while (newEvent.mStillRunning) {
			Console myConsole = System.console();
	    if ( newEvent.mNameOfEvent.length() >0 ) {
	      if (newEvent.mNumberOfGuests > 0) {
	        if (newEvent.mFoodArray.size() == 3) {
	          if(newEvent.mDrinks.size() == 1){
	            if (!newEvent.mEntertainment.equals("")){
								System.out.println("Your event details are below:");
								Integer price = newEvent.runPrice();
								System.out.println("Event Name: "+newEvent.mNameOfEvent);
								System.out.println("Guest Size: "+newEvent.mNumberOfGuests);
								System.out.println(newEvent.mFoodString);
								System.out.println(newEvent.mDrinkString);
								System.out.println(newEvent.mEntertainment);
								System.out.println(price);
								System.out.println("Do you have a coupon code? If so, enter it below, or type 'Quit' to quit.");
								String coupon = myConsole.readLine();
								if (coupon.equals("Quit")) {
									newEvent.mStillRunning = false;
								} else if (coupon.equals("Wedding"||"Sister")) {
									price = price * 0.8
								} else {
									System.out.println("Sorry, we didn't recognize your coupon code. Please try again.");
									String tryAgain = myConsole.readLine();
								}
	            } else {
	              System.out.println("What type of entertainment would you like? Band, DJ, or None?");
	              String entertainment = myConsole.readLine();
								newEvent.runEntertainment(entertainment);
	            }
	          } else {
	            System.out.println("What kind of drinks would you like to serve:");
	            System.out.println("'Alcoholic' or 'Non-Alcoholic'?");
	            String drinks = myConsole.readLine();
							newEvent.runDrinks(drinks);
	          }
	        } else {
	          System.out.println("Enter three food items to serve:");
	       		String foodItem = myConsole.readLine();
						newEvent.runFood(foodItem);
	        }
	      } else {
	        System.out.println("How many guests do you expect?");
	        String guestNumber = myConsole.readLine();;
					newEvent.runGuests(guestNumber);
	      }
	    } else {
			System.out.println("What is the name of your event?");
			String eventName = myConsole.readLine();
			newEvent.runEventName(eventName);
	    }
		}
	}
}
