package by.epam.training.iofundamentals;

import java.io.*;
import java.util.Scanner;

public class MainTask {

    static int amountOfFile;
    static int amountOfFolder;
    static int lengthOfTheFileName;

    public static void writeInFile(String message) throws IOException {
        PrintWriter write = new PrintWriter(new FileWriter("IOFundamentalFileForWriting.txt", true), true);
        write.write(message);
        write.close();
    }

    static void scanningPath(File[] array, int level) throws IOException {
        for (File file : array) {
            if (file.isFile()) {
                amountOfFile++;
                writeInFile("\t┃---" + file.getName() + "\n");
                lengthOfTheFileName += file.getName().length();
            } else if (file.isDirectory()) {
                amountOfFolder++;
                writeInFile("\n" + "✉" + file.getName() + "✉" + "\n");
                scanningPath(file.listFiles(), level + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a path to the folder which you want to scan and write to the file:  ");
        String mainDirectoryPath = scanner.nextLine();

        File mainDirectory = new File(mainDirectoryPath);
        if (mainDirectory.exists() && mainDirectory.isDirectory()) {
            File array[] = mainDirectory.listFiles();
            writeInFile("**********************************************");
            writeInFile("\n" + "Files from main directory : " + mainDirectory);
            writeInFile("\n" + "**********************************************");
            scanningPath(array, 0);
        }

        writeInFile("\n" + "Amount of Folder:  " + amountOfFolder);
        writeInFile("\n" + "Amount of File:  " + amountOfFile);
        writeInFile("\n" + "Average number of files in the folder:  " + (amountOfFile / amountOfFolder));
        writeInFile("\n" + "Average length of the file name:  " + (lengthOfTheFileName / amountOfFile));
    }
}

