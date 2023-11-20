package com.systex;

import com.systex.animal.LandAnimal;
import com.systex.animal.SeaAnimal;
import com.systex.service.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;


// @Scope : 用來設定Spring Container中的Bean的生命週期
// 1. singleton : 一個Spring Container中只有一個實體
// 2. prototype : 每次呼叫都會產生一個新的實體
// 3. request : 每次HTTP Request都會產生一個新的實體
// 4. session : 每次HTTP Session都會產生一個新的實體
// 5. globalSession : 一個Portlet的Session都會產生一個新的實體
@Component
@Scope("prototype")
public class ZooManager {

    @Autowired
    private ZooService zooService;

    @Autowired
    private List<LandAnimal> landAnimalList;

    @Autowired
    private List<SeaAnimal> seaAnimalList;

    public ZooService getZooService(){
        return this.zooService;
    }

    public List<LandAnimal> getLandAnimalList(){
        return this.landAnimalList;
    }

    public List<SeaAnimal> getSeaAnimalList(){
        return this.seaAnimalList;
    }

}
