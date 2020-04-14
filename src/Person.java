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

  public Person(String firstName, String middleName, String lastName, LocalDate birthday, Address address, String phoneNumber) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.birthday = birthday;
    this.address = address;
    this.phoneNumber = phoneNumber;
  }

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

}
