package 集合;

import java.util.*;

/**
 * 测试存储表格数据
 * ORM简单思想：map表示一行数据，多个map表示多行数据，将map放入list中，做成一个表格
 */
public class TsetStoreData {
    public static void main(String[] args) {
        //第一行数组
        Map<String,Object> row1 = new HashMap<>();
        row1.put("id",1001);
        row1.put("姓名","张三");
        row1.put("薪水",50000);
        row1.put("入职日期","2015.3.6");

        //第二行数组
        Map<String,Object> row2 = new HashMap<>();
        row2.put("id",1002);
        row2.put("姓名","李四");
        row2.put("薪水",10000);
        row2.put("入职日期","2018.2.5");

        //第三行数组
        Map<String,Object> row3 = new HashMap<>();
        row3.put("id",1003);
        row3.put("姓名","王五");
        row3.put("薪水",8000);
        row3.put("入职日期","2022.3.3");

        //将三行数据存入list中
        List<Map<String,Object>> list = new ArrayList<>();
        list.add(row1);
        list.add(row2);
        list.add(row3);

        for (Map<String,Object> row:list) {
            System.out.println(row);
        }

    }
}
