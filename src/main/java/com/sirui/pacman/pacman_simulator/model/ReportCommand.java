package com.sirui.pacman.pacman_simulator.model;

public class ReportCommand extends Command {
    public void process(PacMan pacMan){
        System.out.print("Output: "+pacMan.getPositionX()+","+pacMan.getPositionY()+","+pacMan.getDirection());
    }
}
