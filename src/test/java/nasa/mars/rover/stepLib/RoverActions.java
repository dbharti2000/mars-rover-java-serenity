package nasa.mars.rover.stepLib;

import marsrover.Rover;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class RoverActions extends Rover {


    @Steps
    Rover rover;

    private Integer facing = N;
    private Integer x = 0;
    private Integer y = 0;

    public void setDirectionFacing(Integer ch) {
        rover.facing = ch;
    }

    public void setXCoordinate(Integer xCoordinate) {
        rover.x = xCoordinate;
    }

    public void setYCoordinate(Integer yCoordinate) {
        rover.y = yCoordinate;
    }

    public Integer getDirectionFacing() {
        return rover.facing;
    }

    public Integer getXCoordinates() {
        return rover.x;
    }

    public Integer getYCoordinates() {
        return rover.y;
    }

    public void setRoverPosition(Integer x, Integer y, Integer ch) {
        rover.setPosition(x, y, ch);
    }

    public void initialisePosition(Integer xCoordinate, Integer yCoordinate, Integer facingDirection) {
        rover.setPosition(xCoordinate, yCoordinate, facingDirection);
    }

    public void checkDirectionAndPositionOfRover() {
        rover.printPosition();
    }

    public void processCommand(String command){
        rover.process(command);
    }

    public void turnRoverToLeft() {
        rover.process("L");
    }

    public void turnRoverToRight() {
        rover.process("R");
    }


    public void assertXCoordinatePosition(Integer expectedCoordinateValue) {
        assertThat("Asserting  X co-ordinate position value", rover.x, equalTo(expectedCoordinateValue));
    }

    public void assertYCoordinatePosition(Integer expectedCoordinateValue) {
        assertThat("Asserting Y co-ordinate position value", rover.y, equalTo(expectedCoordinateValue));
    }

    public void assertFacingDirection(Integer expectedFacingDirectionValue) {
        assertThat("Asserting facing direction value", rover.facing, equalTo(expectedFacingDirectionValue));
    }

}
