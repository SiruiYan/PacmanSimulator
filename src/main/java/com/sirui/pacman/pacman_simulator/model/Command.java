package com.sirui.pacman.pacman_simulator.model;

import com.sirui.pacman.pacman_simulator.Params;
import com.sirui.pacman.pacman_simulator.validator.LegalDirectionValidator;
import com.sirui.pacman.pacman_simulator.validator.LegalPositionValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Command {

    public Command(){

    }

    //foctory method that returns the instance of Command subclass based on pacman state and command content
    public Command creatCommand(String commandStr, PacMan pacMan){
        Command command = new InvalidCommand();
        if (isLegal(pacMan)){
            switch (commandStr) {
                case Params.LEFT:
                    command = new LeftCommand();
                    break;
                case Params.RIGHT:
                    command = new RightCommand();
                    break;
                case Params.MOVE:
                    command = new MoveCommand();
                    break;
                case Params.REPORT:
                    command = new ReportCommand();
                    break;
            }
        }

        //find a valid PLACE command and create a PlaceCommand based on the command information
        String pattern = "PLACE ([0-9]+),([0-9]+),([A-Z]+)";
        Matcher matcher = Pattern.compile(pattern).matcher(commandStr);

        if (matcher.find()) {
            int positionX = Integer.parseInt(matcher.group(1));
            int positionY = Integer.parseInt(matcher.group(2));
            String direction = matcher.group(3);

            if (LegalDirectionValidator.validate(direction))
                command = new PlaceCommand(positionX, positionY, direction);
        }

        return command;
    }

    public void process(PacMan pacMan){

    }

    //check if the current position of pacman is legal (on the grid)
    public boolean isLegal(PacMan pacMan){
        return LegalPositionValidator.validate(pacMan.getPositionX(), pacMan.getPositionY());
    }
}
