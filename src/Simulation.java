import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Simulation {
    public static void main(String[] args) {

        System.out.println("press enter to run program");
        String name = "the Sun";
        double sun_radius = 696340;
        double sun_mass = 1.989e30;
        double sun_temp = 5500;

        Sun sun = new Sun(name, sun_radius, sun_mass, sun_temp);

        List<Planet> planets = new LinkedList<>();
        planets.add(
                new Planet("earth", 6371, 5.972e24, 149600000,53612.65 , 0.0));
        planets.add(
                new Planet("mars",5371,  5.972e24, 149600000, 53612.65, 0.0));
        planets.add(
                new Planet("venus", 6371, 5.972e24, 149600000, 53612.65, 0.0));

        SolarSystem ss = new SolarSystem();
        ss.addSun(sun);
        ss.addPlanets(planets);

        while(true){
            Scanner s = new Scanner(System.in);
            String userCommand = s.nextLine().trim().toUpperCase(); // Trim and convert to uppercase
            System.out.printf("enter 1 to move planets %nenter 2 to show current position of planets %nenter Q to quit%n");
            switch (userCommand){
                case "1" -> ss.movePlanets();
                case "2" -> ss.showPlanets();
                case "Q" -> System.exit(0);

            }
        }
    }

}
