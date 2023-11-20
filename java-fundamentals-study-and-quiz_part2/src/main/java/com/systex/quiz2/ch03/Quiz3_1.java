package com.systex.quiz2.ch03;

import com.systex.quiz2.ch02.MyFileReader;

import java.io.*;

public class Quiz3_1 {

//    public static void main(String[] args) {

//        origin code
//        try {
//            File myObj = new File("filename.txt");
//            if (myObj.createNewFile()) {
//                System.out.println("File created: " + myObj.getName());
//            } else {
//                System.out.println("File already exists.");
//            }
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }

//        version 1
        //將讀取回來的txt檔案轉為utf8編碼並另存為new.txt
//        BufferedReader br = null;
//        String strLine = "";
//
//        try {
//            //自動創建文件時，如果文件存在，則printl"File already exists.")
//            File myObj = new File("src\\main\\java\\com\\systex\\quiz2\\ch03\\new.txt");
//            if (myObj.createNewFile()) {
//                br = new BufferedReader(new InputStreamReader(new FileInputStream("src\\main\\java\\com\\systex\\quiz2\\ch02\\tw.txt"), "x-windows-950"));
//                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src\\main\\java\\com\\systex\\quiz2\\ch03\\new.txt"), "UTF-8"));
//                while ((strLine = br.readLine()) != null) {
//                    bw.write(strLine);
//                    bw.newLine();
//                }
//                br.close();
//                bw.close();
//                System.out.println("File created: " + myObj.getName());
//            } else {
//                System.out.println("File already exists.");
//            }
//        } catch (FileNotFoundException e) {
//            System.err.println("File not found");
//        } catch (IOException e) {
//            System.err.println("Unable to read the file.");
//        }
//
//
//    }



}
