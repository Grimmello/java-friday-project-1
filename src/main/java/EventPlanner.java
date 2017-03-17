import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.io.Console;

public class EventPlanner{
  public String mNameOfEvent = "";
  public Integer mNumberOfGuests = 0;
  public List<String> mFoodArray = new ArrayList<String>();
  public String mFoodString = "";
  public List<String> mDrinks = new ArrayList<String>();
  public String mDrinkString = "";
  public String mEntertainment = "";
  public boolean mEventComplete = false;
  public boolean mStillRunning = true;
  private Integer mPrice = 0;

  public String runGuests (String input) {
    mNumberOfGuests = Integer.parseInt(input);
    return (mNumberOfGuests +" guests expected");
  }
  public String runFood (String input) {
    mFoodArray.add(input);
    String[] foodArray = mFoodArray.toArray(new String[0]);
    String foodString = Arrays.toString(foodArray);
    foodString = foodString.replace("[", "");
    foodString = foodString.replace("]", "");
    mFoodString = foodString;
    mPrice += 300;
    return foodString;
  }
  public String runDrinks (String input) {
    mDrinks.add(input);
    String[] drinkArray = mDrinks.toArray(new String[0]);
    String drinkString = Arrays.toString(drinkArray);
    drinkString = drinkString.replace("[", "");
    drinkString = drinkString.replace("]", "");
    mDrinkString = drinkString;
    return drinkString;
  }
  public String runEntertainment (String input) {
    mEntertainment = input;
    if (!mEntertainment.equals("None")) {
      mPrice += 100;
    }
    return mEntertainment;
  }
  public Integer runPrice() {
    boolean mStillRunning = false;
    return mPrice;
  }
  public String runEventName(String input) {
    mNameOfEvent = input;
    return mNameOfEvent;
  }
}
