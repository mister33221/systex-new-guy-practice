package com.systex.quiz2.ch01;

public enum FileType {
    PY, JAVA, TXT;

    /**
     * @return the extension
     *
     * @return String
     */
    public String getExtension() {
        switch (this) {
            case PY:
                return ".py";
            case JAVA:
                return ".java";
            case TXT:
                return ".txt";
            default:
                return "";
        }
    }
}
