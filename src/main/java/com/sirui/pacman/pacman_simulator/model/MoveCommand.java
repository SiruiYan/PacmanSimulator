package com.sirui.pacman.pacman_simulator.model;

public class MoveCommand extends Command{
    public void process(PacMan pacMan){
        pacMan.move();
    }
}
