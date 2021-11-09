import com.sun.jdi.connect.Connector;

import javax.management.remote.SubjectDelegationPermission;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    String speciality;

    Doctor (String _name, String _email) {
        super(_name, _email);
        System.out.println("EL nombre del doctor es:" + super.getName());
    }
    //Setter
    public void setSpeciality(String _especiality) {
        this.speciality = _especiality;
    }
    //Getter
    public String getSpeciality() {
        return speciality;
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList();

    public void addAvailableAppointment (Date _date, String _time) {
        this.availableAppointments.add(new Doctor.AvailableAppointment(_date, _time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return this.availableAppointments;
    }

    public static class AvailableAppointment {
        String time;
        Date date;
        AvailableAppointment (Date _date, String _time) {
            this.date = _date;
            this.time = _time;
        }
        public Date getDate() {
            return this.date;
        }
        public String getTime() {
            return this.time;
        }
    }

}
