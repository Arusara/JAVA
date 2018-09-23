import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class Copyfile {

    public static void main(String arg[]) throws IOException {

        System.setProperty("file.separator", "_");

        String fileSeparator = System.getProperty("file.separator");
        System.out.println(fileSeparator);


        public final String SOURCE="";
        public final String DESTINATION
                
        Path src=Paths.get(SOURCE);
        Path des=Paths.get(DESTINATION);


        // It will copy the file from one source to destination
        Files.copy(src,des);
    }


}
