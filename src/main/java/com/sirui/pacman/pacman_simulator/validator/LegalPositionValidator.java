package com.sirui.pacman.pacman_simulator.validator;

import com.sirui.pacman.pacman_simulator.Params;

public class LegalPositionValidator {
    public static boolean validate(int positionX, int positionY) {
        if (positionX >= Params.ZERO && positionX < Params.GRID_WIDTH
                && positionY >= Params.ZERO && positionY < Params.GRID_HEIGHT) {
            return true;
        }
        return false;
    }
}
