/*
 Course: IST 311
 Instructor: Phil O'Connell (pxo4)
 Student: JiaJia Liu
 Email: jpl5840@psu.edu
 Assignment: LB20
*/

public class Address
{
  // Address fields
  private String street;  // e.g., 123 Sycamore
  private String city;    // e.g., Philadelphia
  private String state;   // e.g., PA
  private String zip;     // e.g., 19020-1234

  private Address() {}

  // Assign Builder fields to Address fields
  public Address(Builder builder) {
    this.street = builder.buildStreet;
    this.city = builder.buildCity;
    this.state = builder.buildState;
    this.zip = builder.buildZip;
  }

  public static class Builder {
    // Builder fields
    String buildStreet;
    String buildCity;
    String buildState;
    String buildZip;

    //Builder constructor
    public Builder() {}

    /* Assemble methods for each field
     * Each assemble method returns the Builder instance, "chain" the assemble method together.
     */

    public Builder street(String buildStreet) {
      this.buildStreet = buildStreet;
      return this;
    }

    public Builder city(String buildCity) {
      this.buildCity = buildCity;
      return this;
    }

    public Builder state(String buildState) {
      this.buildState = buildState;
      return this;
    }

    public Builder zip(String buildZip) {
      this.buildZip = buildZip;
      return this;
    }

    // New instance of an Address is created
    public Address build() {
      return new Address(this);
    }
  }

}
