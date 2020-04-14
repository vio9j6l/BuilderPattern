/*
 Course: IST 311
 Instructor: Phil O'Connell (pxo4)
 Student: JiaJia Liu
 Email: jpl5840@psu.edu
 Assignment: LB20
*/

import java.security.InvalidParameterException;
import java.time.LocalDate;

public class Person
{
  String firstName;
  String lastName;
  String middleName;
  Address address;
  LocalDate birthday;
  String phoneNumber;

  private Person() {}

  // Pass in Builder builder to the Person constructor
  public Person(Builder builder) {
    this.firstName = builder.buildFirstName;
    this.lastName = builder.buildLastName;
    this.middleName = builder.buildMiddleName;
    this.birthday = builder.buildBirthday;
    this.address = builder.buildAddress;
    this.phoneNumber = builder.buildPhoneNumber;
  }

  public static class Builder {
    String    buildFirstName;
    String    buildLastName;
    String    buildMiddleName;
    Address   buildAddress;
    LocalDate buildBirthday;
    String    buildPhoneNumber;

    // Assembly method
    public Builder() {}

    public Builder firstName(String buildFirstName) {
      this.buildFirstName = buildFirstName;
      return this;
    }

    public Builder lastName(String buildLastName) {
      this.buildLastName = buildLastName;
      return this;
    }

    public Builder middleName(String buildMiddleName) {
      this.buildLastName = buildLastName;
      return this;
    }

    public Builder birthday(String buildBirthday) {
      this.buildBirthday = buildBirthday;
      return this;
    }

    public Builder address(String buildAddress) {
      this.buildAddress = buildAddress;
      return this;
    }

    public Builder phoneNumber(String buildPhoneNumber) {
      this.buildPhoneNumber = buildPhoneNumber;
      return this;
    }

  }




/*
  public Person(String firstName) {
    this(firstName, null, null, null, null, null);
  }

  public Person(String firstName, String lastName) {
    this(firstName, null, lastName, null, null, null);
  }

  public Person(String firstName, String middleName, String lastName) {
    this(firstName, middleName, lastName, null, null, null);
  }

  public Person(String firstName, String middleName, String lastName, LocalDate birthday) {
    this(firstName, middleName, lastName, birthday, null, null);
  }

  public Person(String firstName, String middleName, String lastName, LocalDate birthday, Address address) {
    this(firstName, middleName, lastName, birthday, address, null);
  }

 */

}
