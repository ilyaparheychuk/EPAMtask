package JavaIOFundamentals;

import java.io.*;

public class MainTask {

    static int amountOfFile;
    static int amountOfFolder;
    static int lengthOfTheFileName;

    public static void writeInFile(String message) throws IOException {
        PrintWriter write = new PrintWriter(new FileWriter("file.txt", true), true);
        write.write(message);
        write.close();
    }

    static void RecursivePrint(File[] arr, int level) throws IOException {

        for (File f : arr){
            if(f.isFile()){
                amountOfFile++;
                writeInFile("\t┃---"+f.getName()+"\n");
                lengthOfTheFileName += f.getName().length();
            }
            else if(f.isDirectory()){
                amountOfFolder++;
                writeInFile("\n"+"✉" + f.getName() + "✉"+"\n");
                RecursivePrint(f.listFiles(), level + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        String mainDirectoryPath = "D:\\studyautomate\\EPAM COURCE\\Java\\JavaTask\\6JavaIOFubdamentals\\Example";
        File mainDirectory = new File(mainDirectoryPath);
        if(mainDirectory.exists() && mainDirectory.isDirectory()){
            File arr[] = mainDirectory.listFiles();
            writeInFile("**********************************************");
            writeInFile("\n"+"Files from main directory : " + mainDirectory);
            writeInFile("\n"+"**********************************************");
            RecursivePrint(arr, 0);
        }
        writeInFile("\n" + "Amount of Folder:  "+ amountOfFolder);
        writeInFile("\n" + "Amount of File:  "+ amountOfFile);
        writeInFile("\n" + "Average number of files in the folder:  " + (amountOfFile/amountOfFolder));
        writeInFile("\n" + "Average length of the file name:  "+ (lengthOfTheFileName/amountOfFile));
    }
}

