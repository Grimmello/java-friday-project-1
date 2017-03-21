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
								Integer price = newEvent.runPrice();
								System.out.println("Do you have a coupon code? If so, enter it below. If not, press enter. Or type 'Quit' to quit.");
								String coupon = myConsole.readLine();

								if (coupon.equals("Quit")) {
									newEvent.mStillRunning = false;
								} else if (coupon.equals("Wedding")||coupon.equals("Sister")) {
									String stringPrice = String.valueOf(price);
									Float floatPrice = Float.parseFloat(stringPrice);
									Float newPrice = newEvent.runNewPrice(floatPrice);
									System.out.println("-----------------------------");
									System.out.println("Your event details are below:");
									System.out.println("Event Name: "+newEvent.mNameOfEvent);
									System.out.println("Guest Size: "+newEvent.mNumberOfGuests);
									System.out.println("Food :"+newEvent.mFoodString);
									System.out.println("Drink type :"+newEvent.mDrinkString);
									System.out.println("Entertainment : "+newEvent.mEntertainment);
									System.out.println("Coupon: Yes");
									System.out.println("Old Price: $"+price);
									System.out.println("New Price: $" + newPrice);
									System.out.println("Thank you for scheduling with us!");
									System.out.println("-----------------------------");
									newEvent.mStillRunning = false;
								} else if (coupon.equals("")){
									System.out.println("-----------------------------");
									System.out.println("Your event details are below:");
									System.out.println("Event Name: "+newEvent.mNameOfEvent);
									System.out.println("Guest Size: "+newEvent.mNumberOfGuests);
									System.out.println("Food : "+newEvent.mFoodString);
									System.out.println("Drink type: "+newEvent.mDrinkString);
									System.out.println("Entertainment: "+newEvent.mEntertainment);
									System.out.println("Coupon: No");
									System.out.println("$" + price);
									System.out.println("Thank you for scheduling with us!");
									System.out.println("-----------------------------");
									newEvent.mStillRunning = false;
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
							if (!drinks.equals("")&& (drinks.equals("Alcoholic") || drinks.equals("Non-Alcoholic"))) {
								newEvent.runDrinks(drinks);
							} else {
								System.out.println("Please enter a valid input");
								System.out.println("--------------------------");
							}
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
