package com.systex.quiz2.ch01;

import java.io.UnsupportedEncodingException;

public class MyFilePrinter {

    /**
     * print the file name
     *
     * @param list
     */
    public final void print(String[] list) {
        for (String f : list) {
            System.out.println(f);
        }
    }

    /**
     * print the file content
     */
    public final void print(String content) throws UnsupportedEncodingException {
        System.out.println(new String(content.getBytes("UTF-8"), "UTF-8"));
    }
}
