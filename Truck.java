/*
* The Truck program is an extension from the Vehicle program.
*
* @author  Ben Whitten
* @version 1.0
* @since   2020-12-16
*/

///////////////////////////////////////////////////////////////////////////////

public class Truck extends Vehicle {

  public String licenseplateNumber;
  
  public Truck() {
    super();
  }

  public void provideAir() {
    super.accelerate();
    super.accelerate();
  }

}
