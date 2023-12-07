package Special;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;
import java.util.Set;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2023/11/23 12:22
 */
public class Demo01 {
    public static void main(String[] args) throws Exception {
//        File file = new File("SpecialFile\\src\\Special\\test.properties");
//        System.out.println(file.exists());

        Properties properties = new Properties();
        properties.load(new FileReader("F:\\CodeBase\\JAVA\\JavaDemo01\\SpecialFile\\src\\Special\\test.properties"));
        System.out.println(properties);

        properties.setProperty("001","小小怪将军");
        properties.setProperty("002","大大怪将军");
        properties.setProperty("003","喜洋洋");
        properties.store(new FileWriter("F:\\CodeBase\\JAVA\\JavaDemo01\\SpecialFile\\src\\Special\\test01.properties"),"测试properties写入性能");


        System.out.println(properties.getProperty("001"));
        System.out.println("--0-0-0-0-0-0-0-0-0-0-0");
        Set<String> key = properties.stringPropertyNames();
        for (String s : key) {
            System.out.println(properties.getProperty(s));
        }
        System.out.println("-=------------------------");
        //Map集合可以使用这种方式进行遍历
        properties.forEach((k,v)->{
            System.out.println(k+":"+v);
        });
    }
}
