package com.sirui.pacman.pacman_simulator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PacmanSimulatorApplicationTests {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@After
	public void restoreStreams() {
		System.setOut(originalOut);
		System.setErr(originalErr);
	}

	@Test
	public void test1() {
		String filePath = "src/main/resources/test_cases/test1";
		PacmanSimulatorApplication.runSimulation(filePath);
		assertEquals("", outContent.toString());
	}

	@Test
	public void test2() {
		String filePath = "src/main/resources/test_cases/test2";
		PacmanSimulatorApplication.runSimulation(filePath);
		assertEquals("", outContent.toString());
	}

	@Test
	public void test3() {
		String filePath = "src/main/resources/test_cases/test3";
		PacmanSimulatorApplication.runSimulation(filePath);
		assertEquals("", outContent.toString());
	}

	@Test
	public void test4() {
		String filePath = "src/main/resources/test_cases/test4";
		PacmanSimulatorApplication.runSimulation(filePath);
		assertEquals("Output: 0,0,NORTH", outContent.toString());
	}

	@Test
	public void test5() {
		String filePath = "src/main/resources/test_cases/test5";
		PacmanSimulatorApplication.runSimulation(filePath);
		assertEquals("Output: 4,4,EAST", outContent.toString());
	}

	@Test
	public void test6() {
		String filePath = "src/main/resources/test_cases/test6";
		PacmanSimulatorApplication.runSimulation(filePath);
		assertEquals("Output: 0,0,NORTH", outContent.toString());
	}

	@Test
	public void test7() {
		String filePath = "src/main/resources/test_cases/test7";
		PacmanSimulatorApplication.runSimulation(filePath);
		assertEquals("Output: 4,4,NORTH", outContent.toString());
	}

	@Test
	public void test8() {
		String filePath = "src/main/resources/test_cases/test8";
		PacmanSimulatorApplication.runSimulation(filePath);
		assertEquals("Output: 4,4,EAST", outContent.toString());
	}

	@Test
	public void test9() {
		String filePath = "src/main/resources/test_cases/test9";
		PacmanSimulatorApplication.runSimulation(filePath);
		assertEquals("Output: 3,4,WEST", outContent.toString());
	}

	@Test
	public void test10() {
		String filePath = "src/main/resources/test_cases/test10";
		PacmanSimulatorApplication.runSimulation(filePath);
		assertEquals("Output: 3,4,WEST", outContent.toString());
	}

	@Test
	public void test11() {
		String filePath = "src/main/resources/test_cases/test11";
		PacmanSimulatorApplication.runSimulation(filePath);
		assertEquals("Output: 4,3,SOUTH", outContent.toString());
	}

	@Test
	public void test12() {
		String filePath = "src/main/resources/test_cases/test12";
		PacmanSimulatorApplication.runSimulation(filePath);
		assertEquals("Output: 4,3,SOUTH", outContent.toString());
	}

	@Test
	public void test13() {
		String filePath = "src/main/resources/test_cases/test13";
		PacmanSimulatorApplication.runSimulation(filePath);
		assertEquals("", outContent.toString());
	}

	@Test
	public void test14() {
		String filePath = "src/main/resources/test_cases/test14";
		PacmanSimulatorApplication.runSimulation(filePath);
		assertEquals("", outContent.toString());
	}

	@Test
	public void test15() {
		String filePath = "src/main/resources/test_cases/test15";
		PacmanSimulatorApplication.runSimulation(filePath);
		assertEquals("", outContent.toString());
	}

	@Test
	public void test16() {
		String filePath = "src/main/resources/test_cases/test16";
		PacmanSimulatorApplication.runSimulation(filePath);
		assertEquals("Output: 0,4,NORTH", outContent.toString());
	}

	@Test
	public void test17() {
		String filePath = "src/main/resources/test_cases/test17";
		PacmanSimulatorApplication.runSimulation(filePath);
		assertEquals("", outContent.toString());
	}

	@Test
	public void test18() {
		String filePath = "src/main/resources/test_cases/test18";
		PacmanSimulatorApplication.runSimulation(filePath);
		assertEquals("Output: 0,0,WEST", outContent.toString());
	}

	@Test
	public void test19() {
		String filePath = "src/main/resources/test_cases/test19";
		PacmanSimulatorApplication.runSimulation(filePath);
		assertEquals("Output: 3,3,WEST", outContent.toString());
	}

	@Test
	public void test20() {
		String filePath = "src/main/resources/test_cases/test20";
		PacmanSimulatorApplication.runSimulation(filePath);
		assertEquals("Output: 3,3,NORTH", outContent.toString());
	}

	@Test
	public void test21() {
		String filePath = "src/main/resources/test_cases/test21";
		PacmanSimulatorApplication.runSimulation(filePath);
		assertEquals("Output: 0,0,WEST", outContent.toString());
	}

	@Test
	public void test22() {
		String filePath = "src/main/resources/test_cases/test22";
		PacmanSimulatorApplication.runSimulation(filePath);
		assertEquals("Output: 0,1,NORTH", outContent.toString());
	}

}
