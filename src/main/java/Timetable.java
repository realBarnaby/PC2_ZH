import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Timetable {

    String courseName;
    int timestamp;

    public Timetable(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

}

class Methods {

    List<Timetable> timetable = new ArrayList<>();

    //newCourse method
    public void newCourse() {

        Scanner button = new Scanner(System.in);

        Boolean check = false;

        while (!check) {

            System.out.print("Add meg a hozzáadandó nevet: ");
            String name = button.nextLine();

            Timetable t = new Timetable(name);

            timetable.add(t);

            System.out.println("Befejezed új elemek felvételét?");
            if (button.nextLine().equals("Y")) { check = true; }

        }

    }


    //removeCourse method
    public void removeCourse() {

        Scanner button = new Scanner(System.in);

        System.out.print("Add meg a törlendő elem nevét: ");
        String name = button.nextLine();

        for (int i=0; i<timetable.size(); i++) {

            if (timetable.get(i).courseName.equals(name)) { timetable.remove(i); }

        }

    }


    //getCourses
    public void getCourses() {

        for (var x: timetable) { System.out.println("course name: " + x.courseName + " -- timestamp: " + x.timestamp); }

    }

}


