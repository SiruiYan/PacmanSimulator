package com.sirui.pacman.pacman_simulator.model;

import com.sirui.pacman.pacman_simulator.validator.LegalPositionValidator;

/**
 * PacMan.java models the state and possible actions of a pacman
 * @author Sirui Yan
 */

public class PacMan {
    //x axis on grid
    private int positionX;
    //y axis position on grid
    private int positionY;
    //the direction the pacman is facing
    private Direction direction;

    public PacMan(int positionX, int positionY, String direction){
        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = Direction.valueOf(direction);
    }

    //rotate the pacman 90 degree clockwise
    public void turnRight(){
        this.direction = this.direction.turnRight();
    }

    //rotate the pacman 90 degree anticlockwise
    public void turnLeft(){
        this.direction = this.direction.turnLeft();
    }

    //move forward in the direction the pacman is currently facing
    public void move(){
        LegalPositionValidator legalPositionValidator = new LegalPositionValidator();
        int nextX = positionX;
        int nextY = positionY;

        switch (direction){
            case NORTH:
                nextY ++;
                break;
            case SOUTH:
                nextY --;
                break;
            case EAST:
                nextX ++;
                break;
            case WEST:
                nextX --;
                break;
        }

        //check whether the position pacman moves to is legal
        boolean isLegalMove = legalPositionValidator.validate(nextX, nextY);
        if(isLegalMove){
            this.positionX = nextX;
            this.positionY = nextY;
        }
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = Direction.valueOf(direction);
    }
}

