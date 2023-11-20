package com.systex.quiz2.ch01;



import java.io.File;
import java.io.FilenameFilter;

public class MyFilenameFilter implements FilenameFilter {

    private FileType fileType;

    /**
     * check the file is accept or not
     * @param dir    the directory in which the file was found.
     * @param name   the name of the file.
     * @return
     */
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(fileType.getExtension());
    }

    public MyFilenameFilter(FileType fileType) {
        this.fileType = fileType;
    }


}
