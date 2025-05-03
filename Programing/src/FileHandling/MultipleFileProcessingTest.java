package FileHandling;

import java.time.Instant;
import java.util.List;

public class MultipleFileProcessingTest {
    public static void main(String[] args) {

        String folderPath="C:\\Users\\Gourav\\Desktop\\JavaClass";

        FileService fileService =new FileService();
        FileProcess fileProcess=new FileProcess();
        Instant start=Instant.now();
        int totoalNoOfWordsInFile=fileService.getFileFromTheFolderPath(folderPath).parallelStream().map(fileService::readContentOfFile).map(fileProcess::countNoOfWordsInString).mapToInt(Integer::intValue).sum();

        System.out.println("Total No Of File"+totoalNoOfWordsInFile);
        System.out.println(fileService.getFileFromTheFolderPath(folderPath));
        System.out.println(fileProcess.countNoOfWordsInString(folderPath));

    }
}
