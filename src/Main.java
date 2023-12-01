import java.util.ArrayList;
import java.util.Scanner;


class Planet {

    private String name; // The name of the planet
    private double mass; // The mass of the planet in kilograms
    private double distance; // The distance of the planet from the sun in meters
    private double xPos; // The x-coordinate of the planet in meters
    private double yPos; // The y-coordinate of the planet in meters
    private double xVel; // The x-component of the velocity of the planet in meters per second
    private double yVel; // The y-component of the velocity of the planet in meters per second


    public Planet(String name, double mass, double distance, double xPos, double yPos, double xVel, double yVel) {
        this.name = name;
        this.mass = mass;
        this.distance = distance;
        this.xPos = xPos;
        this.yPos = yPos;
        this.xVel = xVel;
        this.yVel = yVel;
    }

    // Methods
    // A method to move the planet according to its velocity and the gravitational force from the sun
    public void move(Sun theSun, double timeStep) {
        // Calculate the gravitational force from the sun
        double g = 6.674e-11; // The gravitational constant in m^3/kg/s^2
        double dx = theSun.getXPos() - this.xPos; // The x-distance between the sun and the planet
        double dy = theSun.getYPos() - this.yPos; // The y-distance between the sun and the planet
        double r = Math.sqrt(dx * dx + dy * dy); // The distance between the sun and the planet
        double f = g * theSun.getMass() * this.mass / (r * r); // The magnitude of the gravitational force
        double fx = f * dx / r; // The x-component of the gravitational force
        double fy = f * dy / r; // The y-component of the gravitational force

        // Update the velocity of the planet
        this.xVel = this.xVel + fx / this.mass * timeStep; // Apply the x-component of the force
        this.yVel = this.yVel + fy / this.mass * timeStep; // Apply the y-component of the force

        // Update the position of the planet
        this.xPos = this.xPos + this.xVel * timeStep; // Move the planet along the x-axis
        this.yPos = this.yPos + this.yVel * timeStep; // Move the planet along the y-axis

        // Update the distance of the planet from the sun
        this.distance = Math.sqrt(this.xPos * this.xPos + this.yPos * this.yPos); // Use the Pythagorean theorem
    }

    // Getters and setters for the instance variables
    public String getName() {
        return this.name;
    }

    public double getMass() {
        return this.mass;
    }

    public double getDistance() {
        return this.distance;
    }

    public double getXPos() {
        return this.xPos;
    }

    public double getYPos() {
        return this.yPos;
    }

    public double getXVel() {
        return this.xVel;
    }

    public double getYVel() {
        return this.yVel;
    }

    public void setXPos(double xPos) {
        this.xPos = xPos;
    }

    public void setYPos(double yPos) {
        this.yPos = yPos;
    }

    public void setXVel(double xVel) {
        this.xVel = xVel;
    }

    public void setYVel(double yVel) {
        this.yVel = yVel;
    }
}

// A class to represent the sun
class Sun {
    // Instance variables
    private String name; // The name of the sun
    private double mass; // The mass of the sun in kilograms
    private double xPos; // The x-coordinate of the sun in meters
    private double yPos; // The y-coordinate of the sun in meters

    // Constructor
    public Sun(String name, double mass, double xPos, double yPos) {
        this.name = name;
        this.mass = mass;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    // Getters and setters for the instance variables
    public String getName() {
        return this.name;
    }

    public double getMass() {
        return this.mass;
    }

    public double getXPos() {
        return this.xPos;
    }

    public double getYPos() {
        return this.yPos;
    }

    public void setXPos(double xPos) {
        this.xPos = xPos;
    }

    public void setYPos(double yPos) {
        this.yPos = yPos;
    }
}

// A class to represent a solar system
class SolarSystem {
    // Instance variables
    private Sun theSun; // The sun of the solar system
    public ArrayList<Planet> planets; // The planets of the solar system

    // Constructor
    public SolarSystem(Sun theSun) {
        this.theSun = theSun; // Set the sun of the solar system
        this.planets = new ArrayList<Planet>(); // Create an empty list of planets
    }

    // Methods
    // A method to add a planet to the solar system
    public void addPlanet(Planet aPlanet) {
        this.planets.add(aPlanet); // Add the planet to the list
    }

    // A method to show the planets of the solar system
    public void showPlanets() {
        System.out.println("The solar system has " + this.planets.size() + " planets."); // Print the number of planets
        for (Planet p : this.planets) { // Loop through each planet
            System.out.println(p.getName() + " has a mass of " + p.getMass() + " kg, a distance of " + p.getDistance() + " m from the sun, a position of (" + p.getXPos() + ", " + p.getYPos() + ") m, and a velocity of (" + p.getXVel() + ", " + p.getYVel() + ") m/s."); // Print the details of the planet
        }
    }

    // A method to move the planets of the solar system
    public void movePlanets(double timeStep) {
        for (Planet p : this.planets) { // Loop through each planet
            p.move(this.theSun, timeStep); // Move the planet according to the sun and the time step
        }
    }
}

// A class to represent a simulation
class Simulation {
    // Instance variables
    private SolarSystem aSolarSystem; // The solar system to simulate
    private double timeStep; // The time step of the simulation in seconds

    // Constructor
    public Simulation(SolarSystem aSolarSystem, double timeStep) {
        this.aSolarSystem = aSolarSystem; // Set the solar system to simulate
        this.timeStep = timeStep; // Set the time step of the simulation
    }

    // Methods
    // A method to run the simulation
    public void run() {
        Scanner input = new Scanner(System.in); // Create a scanner object for user input
        boolean running = true; // A flag to indicate if the simulation is running
        while (running) { // Loop while the simulation is running
            System.out.println("What do you want to do?");
            System.out.println("1. Show the planets of the solar system");
            System.out.println("2. Move the planets of the solar system");
            System.out.println("3. Get or set the position or velocity of a planet");
            System.out.println("4. Quit the simulation");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt(); // Get the user's choice
            switch (choice) { // Perform different actions based on the choice
                case 1: // Show the planets of the solar system
                    this.aSolarSystem.showPlanets(); // Call the showPlanets method of the solar system
                    break;
                case 2: // Move the planets of the solar system
                    System.out.print("How many time steps do you want to move? ");
                    int steps = input.nextInt(); // Get the number of time steps to move
                    for (int i = 0; i < steps; i++) { // Loop for the number of time steps
                        this.aSolarSystem.movePlanets(this.timeStep); // Call the movePlanets method of the solar system
                    }
                    break;
                case 3: // Get or set the position or velocity of a planet
                    System.out.print("Enter the name of the planet: ");
                    String planetName = input.next(); // Get the name of the planet
                    Planet thePlanet = null; // A variable to store the planet object
                    for (Planet p : this.aSolarSystem.planets) { // Loop through the planets of the solar system
                        if (p.getName().equals(planetName)) { // If the name matches
                            thePlanet = p; // Set the planet object
                            break; // Exit the loop
                        }
                    }
                    if (thePlanet == null) { // If the planet object is null
                        System.out.println("There is no planet with that name in the solar system."); // Print an error message
                    }
            }
        }
    }
}


public class Main {
    // A main method to test the simulation
    public static void main(String[] args) {
        // Create a solar system object
        SolarSystem mySolarSystem = new SolarSystem(new Sun("Sun", 1.989e30, 0.0, 0.0)); // Create a sun object and pass it to the solar system constructor

        // Add some planets to the solar system
        mySolarSystem.addPlanet(new Planet("Mercury", 3.285e23, 5.791e10, 5.791e10, 0.0, 0.0, 4.736e4)); // Create a planet object and pass it to the addPlanet method
        mySolarSystem.addPlanet(new Planet("Venus", 4.867e24, 1.082e11, 1.082e11, 0.0, 0.0, 3.502e4));
        mySolarSystem.addPlanet(new Planet("Earth", 5.972e24, 1.496e11, 1.496e11, 0.0, 0.0, 2.978e4));
        mySolarSystem.addPlanet(new Planet("Mars", 6.39e23, 2.279e11, 2.279e11, 0.0, 0.0, 2.413e4));
        mySolarSystem.addPlanet(new Planet("Jupiter", 1.898e27, 7.785e11, 7.785e11, 0.0, 0.0, 1.307e4));
        mySolarSystem.addPlanet(new Planet("Saturn", 5.683e26, 1.433e12, 1.433e12, 0.0, 0.0, 9.69e3));
        mySolarSystem.addPlanet(new Planet("Uranus", 8.681e25, 2.872e12, 2.872e12, 0.0, 0.0, 6.8e3));
        mySolarSystem.addPlanet(new Planet("Neptune", 1.024e26, 4.495e12, 4.495e12, 0.0, 0.0, 5.43e3));

        // Create a simulation object with a time step of 86400 seconds (one day)
        Simulation mySimulation = new Simulation(mySolarSystem, 86400);

        // Run the simulation
        mySimulation.run();
    }
}