import org.junit.*;
import static org.junit.Assert.*;

public class EventPlannerTest {
  @Test
  public void newEventPlanner_returnsInput_String(){
    EventPlanner testEventPlanner = new EventPlanner();
    String resultExpected = "Test";
    assertEquals(resultExpected, testEventPlanner.runEventName("Test"));
  }
  @Test
  public void newEventPlanner_returnsSecondInput_String(){
    EventPlanner testEventPlanner = new EventPlanner();
    testEventPlanner.runEventName("Other");
    String resultExpected = "1 guests expected";
    assertEquals(resultExpected, testEventPlanner.runGuests("1"));
  }
  @Test
  public void newEventPlanner_returnsFoodStringFromArray_String(){
    EventPlanner testEventPlanner = new EventPlanner();
    testEventPlanner.runEventName("Other");
    testEventPlanner.runGuests("1");
    String resultExpected = "Cheese";
    assertEquals(resultExpected, testEventPlanner.runFood("Cheese"));
  }
  @Test
  public void newEventPlanner_returnsMultipleFoodsFromArray_String(){
    EventPlanner testEventPlanner = new EventPlanner();
    testEventPlanner.runEventName("Other");
    testEventPlanner.runGuests("1");
    testEventPlanner.runFood("Bread");
    testEventPlanner.runFood("Crackers");
    String resultExpected = "Bread, Crackers, Cheese";
    assertEquals(resultExpected, testEventPlanner.runFood("Cheese"));
  }
  @Test
  public void newEventPlanner_returnsDrinkStringFromArray_String(){
    EventPlanner testEventPlanner = new EventPlanner();
    testEventPlanner.runEventName("Other");
    testEventPlanner.runGuests("1");
    testEventPlanner.runFood("Bread");
    testEventPlanner.runFood("Crackers");
    testEventPlanner.runFood("Cheese");
    String resultExpected = "Beer";
    assertEquals(resultExpected, testEventPlanner.runDrinks("Beer"));
  }
  @Test
  public void newEventPlanner_returnsEntertainment_String(){
    EventPlanner testEventPlanner = new EventPlanner();
    testEventPlanner.runEventName("Other");
    testEventPlanner.runGuests("1");
    testEventPlanner.runFood("Bread");
    testEventPlanner.runFood("Crackers");
    testEventPlanner.runFood("Cheese");
    testEventPlanner.runDrinks("Beer");
    String resultExpected = "Band";
    assertEquals(resultExpected, testEventPlanner.runEntertainment("Band"));
  }
}
