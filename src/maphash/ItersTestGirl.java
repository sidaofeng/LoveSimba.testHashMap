package maphash;

import org.junit.Test;
import java.util.*;


public class ItersTestGirl {

    ItermapCreateMan itmanCreate = new ItermapCreateMan();
    HashMap<String, Integer> ihashMap = itmanCreate.CreateHashMap();

    @Test
    //使用map接口中的默认方法 JAVA8的特性s
    public  void itorMethod_byJDKOld() {

        System.out.println("遍历hashmap:使用map接口循环遍历每个元素。");
        ihashMap.forEach((key,value)->{
            System.out.println("遍历hashmap:"+key+"---"+value);
        });
        System.out.println("+++++++++++++++++++++++++++++++++++++");
    }

    @Test
    //根据key的值遍历每个元素
    //有性能问题。不建议使用
    public  void itorMethod_byKeys() {
        System.out.println("遍历hashmap:根据key值，使用for循环遍历每个元素。");
        Set<String> keys = ihashMap.keySet();
        for (String key:keys){
            Integer value = ihashMap.get(key);;
            System.out.println(key+"------"+value);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++");
    }


    @Test
    //使用Iterator迭代器遍历
    public  void itorMethod_iterator() {
        System.out.println("遍历hashmap:使用Iterator循环遍历每个元素。");
        Set<Map.Entry<String,Integer>> entries = ihashMap.entrySet();
        for(Iterator<Map.Entry<String,Integer>> it = entries.iterator(); it.hasNext();){
            Map.Entry<String,Integer> entry = it.next() ;
            System.out.println(entry.getKey()+"---"+entry);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++");
    }

     @Test
    //分别遍历Key和Values
    public  void itorMethod_byEveryOne() {
         System.out.println("遍历hashmap:使用for循环分别遍历Key和Values。");
        //获取所有的key
        Set<String> keys = ihashMap.keySet();
        for(String key:keys){
            System.out.println(key);
        }
        //获取所有的value
        Collection<Integer> values = ihashMap.values();
        for(Integer value:values){
            System.out.println(value);
        }
         System.out.println("+++++++++++++++++++++++++++++++++++++");
    }

}
