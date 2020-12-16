/*
* The Bike program is an extension from the Vehicle program.
*
* @author  Ben Whitten
* @version 1.0
* @since   2020-12-16
*/

///////////////////////////////////////////////////////////////////////////////

public class Bike extends Vehicle {

  public int cadence = 1;

  public Bike() {
    super();
  }

  public int ringBell() {
    return cadence;
  }
  
}
