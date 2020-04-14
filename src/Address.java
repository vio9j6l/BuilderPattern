/*
 Course: IST 311
 Instructor: Phil O'Connell (pxo4)
 Student: JiaJia Liu
 Email: jpl5840@psu.edu
 Assignment: LB20
*/

public class Address
{
  private String street;  // e.g., 123 Sycamore
  private String city;    // e.g., Philadelphia
  private String state;   // e.g., PA
  private String zip;     // e.g., 19020-1234

  private Address() {} ;

  public Address(String street, String city, String state, String zip) {
    this.street = street;
    this.city = city;
    this.state = state;
    this.zip = zip;
  }

}
