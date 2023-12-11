import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Simulation {
    public static void menu(){
        System.out.println("Solar Control Menu:" +'\n' +
                """
                1) Move the Planets
                2) Show the Planets
                Q) Quit Program
                """);
    }
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem();
        String name = "The Sun";
        double sun_radius = 696340;
        double sun_mass = 1.989e30;
        double sun_temp = 5500;

        Sun sun = new Sun(name, sun_radius, sun_mass, sun_temp);

        List<Planet> planets = new ArrayList<>();
        planets.add(new Planet("Earth", 6371, 5.972e24, 14960000.0 ,29.78,0.0));
        planets.add(new Planet("Mars", 5371, 5.97e24, 15960000.0, 1000.0, 100.0));
        planets.add(new Planet("Venus", 7371, 5.972e24, 13960000.0, 73612.65, 10.0));

        SolarSystem ss = new SolarSystem();
        ss.addSun(sun);
        ss.addPlanets(planets);

        Scanner s = new Scanner(System.in);
        String userCommand;
        while(true){
            menu();
            userCommand = s.nextLine();
            switch (userCommand) {
                case "1" -> ss.movePlanets();
                case "2" -> ss.showPlanets();
                case "Q" -> System.exit(0);
                default -> System.out.println("Bad option");
            }
        }
    }
}