package com.systex.quiz2.ch02;

import com.systex.quiz2.ch01.MyFilePrinter;
import com.systex.quiz2.ch03.MyFileCreator;

import java.io.*;

public class Quiz2_1 {


    public static void main(String a[]) throws IOException {

//        origin code

//        BufferedReader br = null;
//        String strLine = "";
//        try {
//            br = new BufferedReader( new FileReader("/home/students/test.txt"));
//            while( (strLine = br.readLine()) != null){
//                System.out.println(strLine);
//            }
//            br.close();
//        } catch (FileNotFoundException e) {
//            System.err.println("File not found");
//        } catch (IOException e) {
//            System.err.println("Unable to read the file.");
//        }


//        version 1
        String filePath = "src\\main\\java\\com\\systex\\quiz2\\ch02\\cn.txt";

        MyFileReader myFileReader;
        MyFilePrinter myFilePrinter;
        MyFileCreator myFileCreator;

//        get the file name
        String fileName = filePath.substring(filePath.lastIndexOf("\\") + 1);

//         reed
        myFileReader = new MyFileReader();
        String fileConent = myFileReader.read(filePath);

//        print
        myFilePrinter = new MyFilePrinter();
        myFilePrinter.print(fileConent);

//         create
        myFileCreator = new MyFileCreator();
        myFileCreator.create(filePath, fileName);

    }
}


