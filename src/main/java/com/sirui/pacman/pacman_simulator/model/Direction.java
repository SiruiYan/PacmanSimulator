package com.sirui.pacman.pacman_simulator.model;

public enum Direction{
    NORTH,
    EAST,
    SOUTH,
    WEST;

    public Direction turnRight(){
        int itemNum = Direction.values().length;
        return Direction.values()[(this.ordinal() + 1) % itemNum];
    }

    public Direction turnLeft(){
        int itemNum = Direction.values().length;
        return Direction.values()[(this.ordinal() - 1 + itemNum) % itemNum];
    }
}
