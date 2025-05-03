package FileHandling;

import java.time.Instant;

public class FileProcess {
public  int countNoOfWordsInString(String fileContent){
    String[] world=fileContent.split("");
    return world.length;
}

}
