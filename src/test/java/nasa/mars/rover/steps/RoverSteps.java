package nasa.mars.rover.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nasa.mars.rover.stepLib.RoverActions;
import net.thucydides.core.annotations.Steps;

public class RoverSteps {

    @Steps
    RoverActions roverActions;

    @Given("^rover's facing direction is set to ([0-9]*)$")
    public void rover_s_facing_direction_is_set_to_n(Integer facing) {
        roverActions.setDirectionFacing(facing);
    }

    @Given("^rover's x position is set to ([0-9]*)$")
    public void rover_s_x_position_is_set_to(Integer xCoordinate) {
        roverActions.setXCoordinate(xCoordinate);
    }

    @Given("^rover's y position is set to ([0-9]*)$")
    public void rover_s_y_position_is_set_to(Integer yCoordinate) {
        roverActions.setYCoordinate(yCoordinate);
    }

    @Given("^rover's x position ([0-9]), y position ([0-9]) and facing direction ([0-9])$")
    public void rover_s_x_y_position_initialise(Integer xCoordinate, Integer yCoordinate, Integer facingDirection) {
        roverActions.initialisePosition(xCoordinate, yCoordinate, facingDirection);
    }

    @When("^I turn the rover to it's (.*)$")
    public void i_turn_the_rover_to_left(String direction) {
        if (direction.equalsIgnoreCase("left")) {
            roverActions.turnRoverToLeft();
        } else
            roverActions.turnRoverToRight();
    }


    @When("^I check the direction and position of rover$")
    public void i_check_the_direction_and_position_of_rover() {
        roverActions.checkDirectionAndPositionOfRover();
    }

    @When("^rover receives the command '(.*)'$")
    public void i_rover_receives_the_command(String command) {
        roverActions.processCommand(command);
    }


    @Then("I should see rover's facing direction is ([0-9]*)$")
    public void i_should_see_rover_s_facing_direction_is_n(Integer expectedFacingDirection) {
        roverActions.assertFacingDirection(expectedFacingDirection);
    }

    @Then("I should see rover's x co-ordinate position is ([0-9]*)$")
    public void i_should_see_rover_s_x_coordinate_position_is(Integer expectedXPosition) {
        // Write code here that turns the phrase above into concrete actions
        roverActions.assertXCoordinatePosition(expectedXPosition);
    }

    @Then("I should see rover's y co-ordinate position is ([0-9]*)$")
    public void i_should_see_rover_s_y_coordinate_position_is(Integer expectedYPosition) {
        // Write code here that turns the phrase above into concrete actions
        roverActions.assertYCoordinatePosition(expectedYPosition);
    }


}
