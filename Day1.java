import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 *  Purpose: starter code for AdventOfCode
 *  Available objects BufferedReader read, Scanner scan that have access to the file specified when running.
 */
public class Day1 extends AbstractAOC {

    public Day1(String filename) throws FileNotFoundException {
	super(filename);
    }

    // TODO: write code for part 1 here
    public String part1() {
	    int total = 0;
        int[] list1 = new int[1000];
        int[] list2 = new int[1000];
        for(int i = 0; i < 1000; i++) {
            list1[i] = scan.nextInt();
            list2[i] = scan.nextInt();
        }
        Arrays.sort(list1);
        Arrays.sort(list2);
        for(int i = 0; i < 1000; i++) {
            if(list1[i] > list2[i])
                total += list1[i] - list2[i];
            else
                total += list2[i] - list1[i];
        }
        return String.valueOf(total);
    }

    // TODO: write code for part 2 here
    public String part2() {
        int total = 0;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < 1000; i++) {
            list1.add(scan.nextInt());
            list2.add(scan.nextInt());
        }
        for (int num : list2) {
            if(list1.contains(num))
                map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : list1) {
            if (map.containsKey(num)) {
                total += num * map.get(num);
            }
        }

        return String.valueOf(total);
    }

    public static void main(String[] args) {
	Class<? extends AbstractAOC> myClass = Day1.class;
	String inputFilename = "Day1.input";
	try{
	    run(myClass,inputFilename); // don't ask for a filename
	} catch (RuntimeException e) {
	    run(myClass); // ask for filename
	}
    }
}
