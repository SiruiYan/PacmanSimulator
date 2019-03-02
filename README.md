## Description
- The application is a simulation of Pacman moving on in a grid, of dimensions 5 units x 5 units.
- There are no other obstructions on the grid.
- Pacman is free to roam around the surface of the grid, but must be prevented from moving off the grid. Any movement that would result in Pacman moving off the grid must be prevented, however further valid movement commands must still be allowed.
- Create an application that can read in commands of the following form
```sh
PLACE X,Y,F

MOVE

LEFT

RIGHT

REPORT
```
- PLACE will put the Pacman on the grid in positon X,Y and facing NORTH,SOUTH, EAST or WEST.
- The origin (0,0) can be considered the SOUTH WEST most corner.
- The first valid command to Pacman is a PLACE command, after that, any sequence of commands may be issued, in any order, including another PLACE command. The application should discard all commands in the sequence until a valid PLACE command has been executed.
- MOVE will move Pacman one unit forward in the direction it is currently facing.
- LEFT and RIGHT will rotate Pacman 90 degrees in the specified direction without changing the position of Pacman.
- REPORT will announce the X,Y and F of Pacman. This can be in any form, but standard output is sufficient.
- Pacman that is not on the grid can choose the ignore the MOVE, LEFT, RIGHT and REPORT commands.
- Input can be from a file, or from standard input, as the developer chooses.
- Provide test data to exercise the application.

Constraints:
- Pacman must not move off the grid during movement. This also includes the initial placement of Pacman.
- Any move that would cause Pacman to fall must be ignored.

## How to run
This is a gradle project. To run this project, open the project in Intellij and run PacmanSimulatorApplication.java.\
You can also run the project using command line, see https://docs.gradle.org/current/userguide/command_line_interface.html#sec:command_line_bootstrapping_projects for more details.\
The input of this program is the file with default file path(src/main/resources/commands). You can modify the commands in this file or change the default file path in Params.java.

## Test
To run all the unit tests, run PacmanSimulatorApplicationTests.java.\
All test cases can be found under src/main/resources/test_cases folder.\
Test results can be found at src/main/resources/Test Results - PacmanSimulatorApplicationTests.html
