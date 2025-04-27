/**
 * FileOperations.java
 *
 * Description: Java program to demonstrate reading, writing,
 * and modifying text files with precision and clarity.
 *
 * Author: Pratibha.
 * Date: 2025-04-27
 */

 import java.io.*;
 import java.nio.file.*;
 
 public class file_handling {
 
     private static final String FILE_PATH = "example.txt";
 
     public static void main(String[] args) {
         try {
             writeFile("Initial content in the file.\n");
             readFile();
             modifyFile("This is the new content replacing the old one.\n");
             readFile();
         } catch (IOException e) {
             System.err.println("Operation failed: " + e.getMessage());
         }
     }
 
     /**
      * Writes content to a file. Creates the file if it does not exist.
      *
      * @param content The text to write to the file.
      * @throws IOException if an I/O error occurs.
      */
     public static void writeFile(String content) throws IOException {
         Files.write(Paths.get(FILE_PATH), content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
         System.out.println("[WRITE] File created and initial content written.");
     }
 
     /**
      * Reads and prints the content of the file.
      *
      * @throws IOException if an I/O error occurs.
      */
     public static void readFile() throws IOException {
         String content = Files.readString(Paths.get(FILE_PATH));
         System.out.println("[READ] Current file content:\n" + content);
     }
 
     /**
      * Modifies the existing file by overwriting it with new content.
      *
      * @param newContent The new text to replace existing file content.
      * @throws IOException if an I/O error occurs.
      */
     public static void modifyFile(String newContent) throws IOException {
         Files.write(Paths.get(FILE_PATH), newContent.getBytes(), StandardOpenOption.TRUNCATE_EXISTING);
         System.out.println("[MODIFY] File content successfully updated.");
     }
 }