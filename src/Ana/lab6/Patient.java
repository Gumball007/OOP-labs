package Ana.lab6;

import java.util.Calendar;
import java.util.Date;

public interface Patient extends Person {
    String id = "";
    String sickness = "";
    String prescriptions = "";
    String allergies = "";
    String specialReqs = "";
    Date accepted = new Date(2021, Calendar.DECEMBER, 8); // deprecated constructor

}
