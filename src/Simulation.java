import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Simulation {

    public static void menu() {
        System.out.println("""
                1) Move Planets
                2) Show Planets
                Q) Quit
                """);
    }

    public static void main(String[] args) {
        String name = "The Sun";
        double sun_radius = 696349;
        double sun_mass = 1.989e30;
        double sun_temp = 5500;


        Sun sun = new Sun(name, sun_radius, sun_mass, sun_temp);

        List<Planet> planets = new ArrayList<Planet>();
        planets.add(new Planet("Earth", 6371, 5.972e24, 149600000.0, 29.78, 0));

        SolarSystem ss = new SolarSystem();
        ss.addSun(sun);
        ss.addPlanets(planets);


        Scanner s = new Scanner(System.in);
        String userCommand;
        menu();
        while (!(userCommand = s.nextLine()).equalsIgnoreCase("Q")) {
            switch (userCommand) {
                case "1":
                    ss.movePlanets();
                    break;
                case "2":
                    ss.showPlanets();
                    break;
                case "Q":
                    System.exit(0);
                default:
                    System.out.println("Bad option");
            }

        }
    }
}



