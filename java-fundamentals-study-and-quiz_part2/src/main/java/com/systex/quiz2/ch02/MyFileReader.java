package com.systex.quiz2.ch02;

import java.io.*;


public class MyFileReader implements FileReader {

    /**
     * Read file content
     * @param fileFullPath
     * @return
     */
    @Override
    public final String read(String fileFullPath) {
        BufferedReader br = null;
        String strLine = "";
        String content = "";
        try {
//            如果是繁體及英文文件
//            br = new BufferedReader(new InputStreamReader(new FileInputStream(fileFullPath), "x-windows-950"));
//            如果是簡體文件
            br = new BufferedReader(new InputStreamReader(new FileInputStream(fileFullPath), "GB2312"));

            while ((strLine = br.readLine()) != null) {
                content += strLine + "\n";
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
        return content;
    }
}
