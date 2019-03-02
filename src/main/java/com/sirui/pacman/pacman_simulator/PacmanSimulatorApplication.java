package com.sirui.pacman.pacman_simulator;

import com.sirui.pacman.pacman_simulator.model.PacMan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PacmanSimulatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PacmanSimulatorApplication.class, args);
		String filePath = Params.FILEPATH;
		runSimulation(filePath);
	}

	public static void runSimulation(String filePath){
		PacMan pacMan = new PacMan(-1, -1, Params.NORTH);
		CommandsProcessor commandsProcessor = new CommandsProcessor(pacMan, filePath);
		commandsProcessor.processFile();
	}

}
