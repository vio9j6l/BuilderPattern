/*
 Course: IST 311
 Instructor: Phil O'Connell (pxo4)
 Student: JiaJia Liu
 Email: jpl5840@psu.edu
 Assignment: LB20
*/

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Address address = new Address("1600 Woodland Ave.", "Abington", "PA", "19001");

        Person person01 = new Person("Alfred");
        Person person02 = new Person("Alfred", "Neuman");
        Person person03 = new Person("Alfred", "Edward", "Neuman");
        Person person04 = new Person("Alfred", "Edward", "Neuman", LocalDate.parse("1894-12-02"));
        Person person05 = new Person("Alfred", "Edward", "Neuman", LocalDate.parse("1894-12-02"), address);
        Person person06 = new Person("Alfred", "Edward", "Neuman", LocalDate.parse("1894-12-02"), address, "215-867-9713");

        /*
         * What if you wanted to provide a constructor for just:
         *   first name
         *   last name
         *   phone number
         *
         * Person (String, String, String)
         * There's no way for Java to know the difference between this:
         *   Person person = new Person("Alfred", "Edward", "Neuman");
         * and this:
         *   Person person = new Person("Alfred", "Neuman", "215-867-9713");
         *
         * Because both signatures are String, String, String
         */
    }
}
