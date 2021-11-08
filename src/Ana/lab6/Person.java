package Ana.lab6;

import java.util.Calendar;
import java.util.Date;

public interface Person {
    String title = "";
    String givenName = "";
    String middleName = "";
    String familyName = "";
    String name = title + " " + givenName + " " + middleName + " " + familyName;
    Date birthDate = new Date(2000, Calendar.AUGUST, 7); // deprecated constructor
    char gender = 'F';
    String homeAddress = "";
    String phone = "";
}
