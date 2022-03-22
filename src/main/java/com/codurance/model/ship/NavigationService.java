package com.codurance.model.ship;

import com.codurance.model.crosscutting.Coordinates;

public class NavigationService {

    private SteeringService steeringService;
    private PropulsionService propulsionService;
    private Ship ship;
    private static final Distance OptimalStoppingDistance = new Distance(10, "metres");

    public NavigationService() {
    }

    public void to(Coordinates coordinates) throws InterruptedException {
        throw new UnsupportedOperationException("Not yet implemented!");
    }

    private Distance distanceBetween(Coordinates startingCoordinates, Coordinates destinationCoordinates) {
        throw new UnsupportedOperationException("Not yet implemented!");
    }


    private Direction directionTo(Coordinates startingCoordinates, Coordinates destinationCoordinates) {
        throw new UnsupportedOperationException("Not yet implemented!");
    }
}
