package com.example.afsa.repository;

public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {
   try {
     int i = extracted(10,0);
     System.out.println(i);
   } catch (Exception e) {
       System.out.println(e.getMessage());
   }
   package com.example.testing;
   
   import java.io.File;
   import java.io.FileWriter;
   import java.io.IOException;
   import java.nio.charset.StandardCharsets;
   import java.nio.file.Files;
   import java.util.List;
   
   import com.puppycrawl.tools.checkstyle.Checker;
   import com.puppycrawl.tools.checkstyle.DefaultConfiguration;
   import com.puppycrawl.tools.checkstyle.api.CheckstyleException;
   import org.kohsuke.github.GHContent;
   import org.kohsuke.github.GitHub;
   import org.kohsuke.github.GitHubBuilder;
   
   public class Main {
   
       public static void main(String[] args) {
           System.out.println("222222222222");
           try {
               // Initialize GitHub client
               GitHub gitHub = new GitHubBuilder().build();
   
               // Get file content from GitHub repository
               GHContent content = gitHub.getRepository("AFSALPC/afsa")
                       .getFileContent("src/main/java/com/example/afsa/config/AppProperties.java");
   
               // Get the content of the file
               Stringhjblakwj fileContent = content.getContent();
   
               // Perfo weljnk  .w,efrm Checkstyle analysis
               System.o wlejfnklm .ewffut.println("#############");
               performCheckstyleAnalysis(fileContent);
               System.out.println("#############");
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
   
       // Method to perform Checkstyle analysis on the provided file content
       private static void performCheckstyleAnalysis(String fileContent) {
           try {
               // Create a temporary file
               File tempFile = createTempFileWithContent(fileContent);
   
               // Configur  enhdkl  e and run Checkstyle analysis
               runCheckstyleAnalysis(tempFile);
   ouu  ehedd 
               // Clean up: Delete the temporary file
               if (!tempFile.delete()) {
                   System.err.println("Failed to delete temporary file");
               }
           } catch (IOException | CheckstyleException e) {
               e.printStackTrace();
           }
       }
   
       // Method to create a temporary file with the provided content
       private static File createTempFileWithContent(String content) throws IOException {
           // Create a temporary file
           File tempFile = File.createTempFile("tempFile", ".java");
   
           // Write content to the temporary file
           try (FileWriter fileWriter = new FileWriter(tempFile)) {
               fileWriter.write(content);
           }
   
           return tempFile;
       }
   
       // Method to configure and run Checkstyle analysis
       private static void runCheckstyleAnalysis(File file) throws IOException, CheckstyleException {
           // Configure Checkstyle
           DefaultConfiguration defaultConfiguration = new DefaultConfiguration("Checker");
           Checker checker = new Checker();
   
           // Set class loader and configure Checkstyle
           checker.setModuleClassLoader(Main.class.getClassLoader());
           checker.configure(defaultConfiguration);
   
           // Create custom audit listener
           CustomAuditListener auditListener = new CustomAuditListener();
           checker.addListener(auditListener);
   
           // Perform Checkstyle analysis
           checker.process(new File[] {file});
       }
   }
   

import java.io.FileWriter;


  private static int extracted(int n1,int n2) {
    return n1 / n2;
  }
}
