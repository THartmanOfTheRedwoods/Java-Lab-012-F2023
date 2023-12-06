public class Simulation {
    public static void main(String[] args) {
        // Create Sun
        Sun sun = new Sun("Sun", 1.989 * Math.pow(10, 30), 6.96 * Math.pow(10, 8));

        // Create Solar System
        SolarSystem solarSystem = getSolarSystem(sun);

        // Print initial positions
        printSolarSystemState(solarSystem);

        // Simulate movement (update positions) for a certain time period
        simulateMovement(solarSystem);  // Adjust the time period as needed

        // Print final positions
        printSolarSystemState(solarSystem);
    }

    private static SolarSystem getSolarSystem(Sun sun) {
        SolarSystem solarSystem = new SolarSystem(sun);

        // Create Planets
        Planet earth = new Planet("Earth", 5.972 * Math.pow(10, 24), 6.371 * Math.pow(10, 6),
                new Vector2D(1.0, 0.0), new Vector2D(0.0, 29783.0), 1.0);

        Planet mars = new Planet("Mars", 6.4171 * Math.pow(10, 23), 3.3895 * Math.pow(10, 6),
                new Vector2D(1.52, 0.0), new Vector2D(0.0, 24100.0), 1.52);

        // Add Planets to Solar System
        solarSystem.addPlanet(earth);
        solarSystem.addPlanet(mars);
        return solarSystem;
    }

    private static void simulateMovement(SolarSystem solarSystem) {
        // Simulate the movement of the planets for the given time period
        // Update positions based on gravitational interactions, etc.
        // This is a simplified simulation and does not include complex physics calculations.
        for (int i = 0; i < 100000; i++) {
            for (Planet planet : solarSystem.getPlanets()) {
                // Update planet positions based on gravitational interactions, velocity, etc.
                // This is where a physics simulation would be implemented.
                // For simplicity, we are just updating the x-coordinate.
                planet.getPosition().setX(planet.getPosition().getX() + planet.getVelocity().getX());
            }
        }
    }

    private static void printSolarSystemState(SolarSystem solarSystem) {
        // Print the current state of the solar system
        System.out.println("Solar System State:");
        System.out.println("Sun Position: " + solarSystem.getSun().getPosition().getX() +
                ", " + solarSystem.getSun().getPosition().getY());

        for (Planet planet : solarSystem.getPlanets()) {
            System.out.println(planet.getName() + " Position: " +
                    planet.getPosition().getX() + ", " + planet.getPosition().getY() +
                    " Distance from Sun: " + planet.getDistanceFromSun());
        }

        System.out.println();
    }
}

