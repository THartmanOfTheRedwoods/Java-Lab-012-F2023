import java.util.ArrayList;
import java.util.List;

class SolarSystem {
    private List<Planet> planets;
    private Sun theSun;

    public SolarSystem() {
        this.planets = new ArrayList<>();
        this.theSun = null;
    }

    public void addPlanet(Planet planet) {
        planets.add(planet);
    }

    public void addPlanets(List<Planet> planets) {
        this.planets = planets;
    }

    public void addSun(Sun sun) {
        theSun = sun;
    }

    public void showPlanets() {
        System.out.println("Planets in the Solar System:");
        for (Planet planet : planets) {
            System.out.println(planet.toString());
        }
        System.out.println("The Sun: " + theSun.toString());
        System.out.println();
    }

    public void movePlanets() {
        System.out.println("Moving planets...");
        for (Planet planet : planets) {
            double newX = planet.getXPos() + planet.getXVel();
            double newY = planet.getYPos() + planet.getYVel();
            planet.moveTo(newX, newY);
        }
        System.out.println("Planets moved.\n");
    }
}
