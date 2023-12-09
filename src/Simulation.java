import java.util.ArrayList;
import java.util.List;

// Simulation class
class Simulation {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem();
        solarSystem.addPlanet(new Planet("Earth", 6371, 5.97E24, 0, 65.8, 0, 29783, 0));
        solarSystem.addSun(new Sun("Sun", 696340, 1.989E30, 5778));

        solarSystem.showPlanets();
        solarSystem.movePlanets();
        solarSystem.showPlanets();
    }
}

