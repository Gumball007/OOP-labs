package Ana.lab6;

import java.util.Calendar;
import java.util.Date;

public interface Staff extends Person, Department {
    Date joined = new Date(2020, Calendar.FEBRUARY, 1); // deprecated constructor
    String education = "";
    String certification = "";
    String languages = "";

}
