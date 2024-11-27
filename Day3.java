import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *  Purpose: starter code for AdventOfCode
 *  Available objects BufferedReader read, Scanner scan that have access to the file specified when running.
 */
public class Day3 extends AbstractAOC {

    public Day3(String filename) throws FileNotFoundException {
	super(filename);
    }

    // TODO: write code for part 1 here
    public String part1() {
	return "unfinished";
    }

    // TODO: write code for part 2 here
    public String part2() {
	return "unfinished";
    }

    public static void main(String[] args) {
	Class<? extends AbstractAOC> myClass = Day3.class;
	String inputFilename = "Day3.input";
	try{
	    run(myClass,inputFilename); // don't ask for a filename
	} catch (RuntimeException e) {
	    run(myClass); // ask for filename
	}
    }
}
