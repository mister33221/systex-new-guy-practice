package com.systex.quiz2.ch01;


public class Quiz1_1 {

    public static final void main(String a[]) {

//        origin code

//        File file = new File("src/home/students");
//        String[] list = file.list(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                if (name.toLowerCase().endsWith(".py")) {
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//        });
//        for (String f : list) {
//            System.out.println(f);
//        }
//    }


//        version 1

        MyFile myFile = new MyFile("src/home/students");

        String[] list = myFile.list(new MyFilenameFilter(FileType.TXT));

        MyFilePrinter printer = new MyFilePrinter();

        printer.print(list);

    }
}






//solid原則
//1.單一職責原則(Single Responsibility Principle): 一個類別只做一件事，每個人負責屬於自己的職責，不該承擔太多職責，大家各自做自己應該做的事情，且不會互相干擾。
//2.開放封閉原則(Open-Closed Principle): 一個類別應「對擴充開放，對修改封閉」: 需求變動時，可以對既有的程式碼進行擴展，而不須修改原有的程式碼。
//3.里氏替換原則(Liskov Substitution Principle): 子類別繼承父類別可以擴充新的功能，不應覆寫原本父類定義的功能，若要覆寫就必須符合原來預期的行為。
//4.介面隔離原則(Interface Segregation Principle): 龐大的介面拆分為更小且具體的介面，讓客戶只需實作他們需要的方法，不應有用不到的功能可以呼叫。
//5.依賴反轉原則(Dependency Inversion Principle): 高層模組不應該依賴低層模組，兩者都應該依賴其抽象









