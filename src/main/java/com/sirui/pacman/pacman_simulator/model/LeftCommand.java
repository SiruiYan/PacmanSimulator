package com.sirui.pacman.pacman_simulator.model;

public class LeftCommand extends Command{
    public void process(PacMan pacMan){
        pacMan.turnLeft();
    }
}
