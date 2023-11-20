package com.systex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.systex")
public class Main {

    public Main(){
        System.out.println("Main 容器初始化......");
    }

    @Autowired
    private ZooManager manager;

    public static void main(String args[]) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);
//        從container取出Main，再從Main使用當中的ZooManager
        ZooManager beanFromAutowired = ctx.getBean(Main.class).manager;

//        呼叫ZooManager中的各方法，以說明ZooManager運作正常
        beanFromAutowired.getZooService().sellTicket();
        beanFromAutowired.getZooService().feedAnimal(beanFromAutowired.getLandAnimalList());
        beanFromAutowired.getZooService().feedAnimal(beanFromAutowired.getSeaAnimalList());
//
        ZooManager beanFromContainer = ctx.getBean(ZooManager.class);
//        驗證spring container中scope
        System.out.println("兩個ZooManager實體是否一致(管理員可以不同)："+ (beanFromAutowired == beanFromContainer)); // false
        System.out.println("兩個ZooService實體是否一致(提供的服務相同)："+ (beanFromAutowired.getZooService() == beanFromContainer.getZooService())); //true
        ctx.close();
    }
}
