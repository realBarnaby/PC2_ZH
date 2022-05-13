import java.util.Scanner;

public class Scheduler extends Methods{

    public void setTimestamp() {

        Scanner button = new Scanner(System.in);

        Boolean check = false;

        while(!check) {

            System.out.print("\nAdd meg az időpontot: ");
            int ido = button.nextInt();


            System.out.print("\nMelyik órához szeretné rendelni? Add meg a nevét: ");
            String name = button.nextLine();
            button.nextLine();

            for (int i = 0; i < timetable.size(); i++) {

                if (timetable.get(i).courseName.equals(name)) {
                    timetable.get(i).setTimestamp(ido);
                }

            }

            System.out.println("Befejezed az időpontok beállítását?");
            if (button.nextLine().equals("Y")) { check = true; }

        }

    }

}
