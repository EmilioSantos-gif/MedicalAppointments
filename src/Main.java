import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main (String[] args) {

        Doctor myDoctor = new Doctor("Emilio Santos", "emilio@gmial.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");

        for (Doctor.AvailableAppointment aA :myDoctor.getAvailableAppointments()) {
            System.out.println("Date: " + aA.getDate() + "  Time " + aA.getTime());
        }

        System.out.println(myDoctor.getName());
        //Doctor myDoctor = new Doctor("Emilio Santos", "Endocrinologo");
        //System.out.println(myDoctor.name);

/*
        System.out.println(myDoctor.name);

        Doctor myDoctor2 = new Doctor("Aurelio Opio", "Endocrinologo");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor2.name);
        //System.out.println(Doctor.name);*/

    }
}