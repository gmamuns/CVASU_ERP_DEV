
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import jdk.nashorn.internal.codegen.CompilerConstants;

public class Html_creator {
       

    public static void main(String[] args) throws IOException {
	
	//html directory and file name
        String file_name = "web/sample.html";  

        //Task 01 : Create a .html filed
            File file = new File(file_name);
            /*If file gets created then the createNewFile() 
	      * method would return true or if the file is 
	      * already present it would return false
             */
            boolean fvar = file.createNewFile();
            if (fvar) {
                System.out.println("File has been created successfully");
            } else {
                System.out.println("File already present at the specified location");
            }
        } catch (IOException e) {
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }

        //End Task : 01
        //Task 02 : Edit files with data collected from DataBase
          Html_creator html = new Html_creator();
        
        String header = "<!DOCTYPE html>\n"
                + "<!--\n"
                + "To change this license header, choose License Headers in Project Properties.\n"
                + "To change this template file, choose Tools | Templates\n"
                + "and open the template in the editor.\n"
                + "-->\n"
                + "<html>\n"
                + "    <head>\n"
                + "        <title>TODO supply a title</title>\n"
                + "        <meta charset=\"UTF-8\">\n"
                + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "    </head>\n"
                + "    <body>";
        String footer = "</body>\n"
                + "</html>";
        String content = "<h1>This is Sample Page's Heading</h1>";
        String page = header+content+footer;
     
      html.whenWriteStringUsingBufferedWritter_thenCorrect(file_name, page);

        //End  Task : 02
        //Task 03 : Write a log to file
        //End Task : 3
    }

    private void whenWriteStringUsingBufferedWritter_thenCorrect(String file_name, String page) throws IOException {
        
        BufferedWriter writer = new BufferedWriter(new FileWriter(file_name));
        writer.write(page);

        writer.close();
        System.out.println("Data write is done");
    }

    

}
