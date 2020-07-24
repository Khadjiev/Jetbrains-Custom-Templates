#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

#parse("File Header.java")
public class ${NAME} {

    public static void main(String[] args) {
        new ${NAME}().init();
    }

    /**
     * Initializing the solution by taking input values from the console
     */
    public void init() {
        // Reading input from the console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // The number of test cases
        int tc;
        // Input values per each case, separated by space
        String[] inputValues;

        try {
            tc = Integer.parseInt(reader.readLine());
            while (tc-- != 0) {
                inputValues = reader.readLine().split(" ");
                solveProblem(inputValues);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    /**
     * Main solution method
     * @param inVals input values separated by space
     */
    private void solveProblem(String[] inVals) {
        //[Optional] if int array is needed
        // int[] arr = new int[inVals.length];
        
        for (String val : inVals) {
            // walk with the solution
        }
    }
}
