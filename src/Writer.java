import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Writer {
    PrintWriter outputFile;

    public Writer(String fileName) throws IOException{
        outputFile = new PrintWriter(fileName);
    }

    public void closeWriter() {
        outputFile.print("End of file.");
        outputFile.close();
    }

    /** Student Self-Explanation
     * We create a new empty arraylist called reverse
     * we then use a for loop where i starts as the size of the list and decrements by 1 until it is == 0
     * each iteration of the for loop is adding the end value of fileContents to the reverse list
     * then we print it to the new file
     */
    public void logReverse(ArrayList<String> fileContents) {
        ArrayList<String> reverse = new ArrayList<String>();

        for(int i = fileContents.size() - 1; i >= 0; i--){
            reverse.add(fileContents.get(i));
        }

        outputFile.println("Reversed file contents: ");
        for(String num : reverse){
            outputFile.println(num);
        }

        //TODO Student
    }
    /** Student Self-Explanation
     * for logMax the program will set an int variable 'max' to 0
     * It will then run a for loop and a nested if statement to check for the converted num in the file to be greater than the max
     * if it is then the max var is changed to the num value.
     */
    public void logMax(ArrayList<String> fileContents) {
        int max = 0;
        for(String num : fileContents){
            int newNum = Integer.parseInt(num);
            if(newNum > max){
                max = newNum;
            }
        }

        outputFile.printf("The largest number in the file is: %d\n", max);
        //You will want to print your max number on this line.
    }
    /** Student Self-Explanation
     * 
     */
    public void logDuplicates(ArrayList<String> fileContents) {

        for(String num : fileContents){
            int newNum = Integer.parseInt(num);
            /////CONTINUE WORKING
        }

        outputFile.print("Duplicates found: ");

        //TODO Student
    }
}
