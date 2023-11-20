package com.systex.quiz2.ch03;

import java.io.*;

public class MyFileCreator implements FileCreator {


    /**
     * Create file
     * @param fileFullPath
     * @param fileName
     */
    @Override
    public void create(String fileFullPath, String fileName) {
        BufferedReader br = null;
        String strLine = "";

        try {
            File myObj = new File("src\\main\\java\\com\\systex\\quiz2\\ch03\\new_"+ fileName);
            if (myObj.createNewFile()) {
//                如果是繁體及英文文件
//                br = new BufferedReader(new InputStreamReader(new FileInputStream(fileFullPath), "x-windows-950"));
//                如果是簡體文件
                br = new BufferedReader(new InputStreamReader(new FileInputStream(fileFullPath), "GB2312"));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src\\main\\java\\com\\systex\\quiz2\\ch03\\new_"+fileName), "UTF-8"));
                while ((strLine = br.readLine()) != null) {
                    bw.write(strLine);
                    bw.newLine();
                }

                br.close();
                bw.close();

                System.out.println("File created: " + myObj.getName());

            } else {
                System.out.println("File already exists.");
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }

    }
}

