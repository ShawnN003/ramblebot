import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Shawn Nguru 
 * SDEV 301 RambleBot
 * 1-21-25 
 * 
 * Problems/Bugs/Issues: 
 * 
 * 
 * Notes/plans: 
 * Iterate through the String (1)
 * split(String regex) a Split method by the spaces and symbols (2)
 * Insert the strings into a list of strings (3)
 */

/**
 * A tokenizer that converts text input to lowercase and splits it 
 * into a list of tokens, where each token is either a word or a period.
 */
public class LowercaseSentenceTokenizer implements Tokenizer {
  /**
   * Tokenizes the text from the given Scanner. The method should 
   * convert the text to lowercase and split it into words and periods.
   * Words are separated by spaces, and periods are treated as separate tokens.
   * 
   * For example:
   * If the input text is: "Hello world. This is an example."
   * The tokenized output should be: ["hello", "world", ".", "this", "is", "an", "example", "."]
   * 
   * Notice that the text is converted to lowercase, and each period is treated as a separate token.
   * 
   * However, a period should only be considered a separate token if it occurs at the end
   * of a word. For example:
   * 
   * If the input text is: "Hello world. This is Dr.Smith's example."
   * The tokenized output should be: ["hello", "world", ".", "this", "is", "dr.smith's", "example", "."]
   * 
   * The internal period in Dr.Smith's is not treated as its own token because it does not occur at the end of the word.
   * 
   * @param scanner the Scanner to read the input text from
   * @return a list of tokens, where each token is a word or a period
   */
  public List<String> tokenize(Scanner scanner) {
    List<String> textList =new ArrayList<String>();

    String text = scanner.nextLine();    //put the input text in a string array

    String[] arr = text.split(" ");   //split the array based on spaces in the text

    for(int i = 0; i<= arr.length-1; i++)   //add the content of the array into the list of strings
    {



      if(arr[i] == " " || arr[i] == "  " || arr[i] == "")    //filtering out the extra spaces inside the arrayList
      {

      }
      else if(arr[i].endsWith("."))
      {
       arr[i] = arr[i].replace('.', ' ');
       textList.add(arr[i].trim().toLowerCase());
       textList.add(".");
      }
      else
      {
        textList.add(arr[i].toLowerCase());
      }
    }


return textList;
  }
}

