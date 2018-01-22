// Call Python From Java

//Requirement : helloPython.py in "/home/norbert/python/helloPython.py" directory
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PythonCaller {

    public static void main(String[] args) throws IOException {
        String pythonScriptPath = "/home/norbert/python/helloPython.py";
        String[] cmd = new String[2];
        cmd[0] = "python"; // check version of installed python: python -V
        cmd[1] = pythonScriptPath;

// create runtime to execute external command
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec(cmd);

// retrieve output from python script
        BufferedReader bfr = new BufferedReader(new InputStreamReader(pr.getInputStream()));
        String line = "";
        while ((line = bfr.readLine()) != null) {
// display each output line form python script
            System.out.println(line);
        }
    }

}
