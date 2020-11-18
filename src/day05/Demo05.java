package day05;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Map 映射  key:value
1.HashMap、TreeMap、LinkedHashMap、Properties的实现类
2.HashMap、Properties（读写配置文件 *.ini）是比较常用的
3.
 */
public class Demo05 {
    public static void main(String[] args) {
        Map<String,String>maps = new HashMap<>();
        // 添加
        maps.put("CNY","人民币");
        maps.put("USD","美元");
        maps.put("JPY","日元");
        maps.put("HkD","港元");
        //修改
        maps.put("CNY","Chinese Yuan");
        //取
        System.out.println(maps.get("CNY"));
        //删除 remove
        // 大小 size
        // 包含 containsKey containsValue

        maps.remove("JPY","日元");
        System.out.println(maps.size());

        Set<String> keys =  maps.keySet();  // 所有的key
        for(String key : keys){
            System.out.println("key:"+key+", value:"+maps.get(key));
        }



    }
}



