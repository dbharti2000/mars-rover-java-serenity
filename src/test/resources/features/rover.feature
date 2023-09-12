@Sanity
Feature: Rover movement
  As a NASA engineer,
  I want to move robotics rovers on Mar's plateau
  So that they can get a complete view of surrounding terrain to send back to Earth

    # Testing task a
  @TaskA
  Scenario: Verify Rover's direction facing and positioning after setting it to 2,2,3 (direction 1=North, 2=East, 3=South, 4=West)
    Given rover's x position 2, y position 2 and facing direction 3
    When I check the direction and position of rover
    Then I should see rover's x co-ordinate position is 2
    And I should see rover's y co-ordinate position is 2
    And I should see rover's facing direction is 3

      # Testing task b
  @TaskB
  Scenario: Verify Rover's direction facing after turning to it's Left or Right (direction 1=North, 2=East, 3=South, 4=West)
    Given rover's x position 2, y position 2 and facing direction 3
    When I turn the rover to it's right
    Then I should see rover's facing direction is 4
    When I turn the rover to it's left
    Then I should see rover's facing direction is 3

    # Testing task b
  @TaskB
  Scenario: Verify Rover's positioning after processing command MMRMM (direction 1=North, 2=East, 3=South, 4=West)
    Given rover's x position 2, y position 2 and facing direction 1
    When rover receives the command 'MMRMM'
    When I check the direction and position of rover
    Then I should see rover's x co-ordinate position is 4
    And I should see rover's y co-ordinate position is 4
    And I should see rover's facing direction is 2


  # Testing task c
  @TaskC
  Scenario: Verify Rover's positioning after processing command LMLMLMLMM (direction 1=North, 2=East, 3=South, 4=West)
    Given rover's x position 1, y position 2 and facing direction 1
    When rover receives the command 'LMLMLMLMM'
    And I check the direction and position of rover
    Then I should see rover's x co-ordinate position is 1
    And I should see rover's y co-ordinate position is 3
    And I should see rover's facing direction is 1