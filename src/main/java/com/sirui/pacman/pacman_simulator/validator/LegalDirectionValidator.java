package com.sirui.pacman.pacman_simulator.validator;

import com.sirui.pacman.pacman_simulator.Params;
import com.sun.tools.javac.util.List;

public class LegalDirectionValidator {
    private static final List<String> directions = List.of(Params.NORTH, Params.SOUTH, Params.EAST, Params.WEST);

    public boolean validate(String direction){
        if (directions.contains(direction)){
            return true;
        }
        return false;
    }
}
