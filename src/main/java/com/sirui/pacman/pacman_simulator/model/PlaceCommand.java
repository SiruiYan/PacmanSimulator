package com.sirui.pacman.pacman_simulator.model;

public class PlaceCommand extends Command{
    private int positionX;
    private int positionY;
    private String direction;

    public PlaceCommand(int positionX, int positionY, String direction){
        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = direction;
    }

    public void process(PacMan pacMan){
        pacMan.setPositionX(positionX);
        pacMan.setPositionY(positionY);
        pacMan.setDirection(direction);
    }
}
