package maphash;

import org.junit.Test;

import java.util.*;

/*
* hashmap的三种遍历方式
* */
public class ItermapCreateMan {

    public  HashMap<String, Integer> CreateHashMap() {
        //创建HashMap集合
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("柳岩",18);
        hm.put("杨幂",28);
        hm.put("刘德华",40);
        hm.put("柳岩",20);

        return hm;

        /*
        itorMethod_byEveryOne(hm);
        itorMethod_iterator(hm);
        itorMethod_byKeys(hm);
        itorMethod_byJDKOld(hm);
        */
    }



    
    
}
