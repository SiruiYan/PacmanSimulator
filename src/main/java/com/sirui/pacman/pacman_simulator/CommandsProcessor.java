package com.sirui.pacman.pacman_simulator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.sirui.pacman.pacman_simulator.model.Command;
import com.sirui.pacman.pacman_simulator.model.PacMan;
import com.sirui.pacman.pacman_simulator.validator.LegalPositionValidator;

/**
 * process all the commands in the file with filepath
 * @author SiruiYan
 */

public class CommandsProcessor {
    private PacMan pacMan;
    private String filePath;
    private LegalPositionValidator legalPositionValidator;

    public CommandsProcessor(PacMan pacMan, String filePath) {
        this.pacMan = pacMan;
        this.filePath = filePath;
        this.legalPositionValidator = new LegalPositionValidator();
    }

    public void processFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String command = reader.readLine();
            while(command != null){
                command.trim();
//                System.out.println(command);
                processCommand(command);
                command = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void processCommand(String commandStr) {
        Command command = new Command();
        command.creatCommand(commandStr,pacMan).process(pacMan);
    }
}
