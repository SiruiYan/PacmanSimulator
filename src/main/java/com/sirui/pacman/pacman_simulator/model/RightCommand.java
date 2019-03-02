package com.sirui.pacman.pacman_simulator.model;

public class RightCommand extends Command{
    public void process(PacMan pacMan){
        pacMan.turnRight();
    }
}
