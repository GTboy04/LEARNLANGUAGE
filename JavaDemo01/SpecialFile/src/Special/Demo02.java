package Special;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileInputStream;
import java.util.List;


/**
 * @author Gt_boy
 * @description: TODO
 * @date 2023/11/23 13:19
 */
public class Demo02 {
    public static void main(String[] args) throws Exception {
//        创建Dom4j解析器对象
        SAXReader reader = new SAXReader();
//        使用read()方法把XML文件读成document
        Document document = reader.read(new FileInputStream("F:\\CodeBase\\JAVA\\JavaDemo01\\SpecialFile\\src\\Special\\test.xml"));

//        System.out.println(document.getRootElement().getName());
//        通过上述方法获得document对象后，使用如下方法获得根元素
        Element root = document.getRootElement();
//        通过getName()方法获得元素的名字
        System.out.println(root.getName());
//        通过elements()方法获得根元素下的所有第一子元素
        List<Element> elements01 = root.elements();
//        使用上述方法返回的是一个列表，然后我通过循环遍历每一个对象拿到他们的元素名称
        for (Element element : elements01) {
            System.out.println(element.getName());
        }
        System.out.println("----------------------------");
//        使用elements()方法的重载，获取指定名字的元素的列表
        List<Element> elements02 = root.elements("admin");
        for (Element element : elements02) {
            System.out.println(element.getName());
//             使用element()方法获得指定名字的子标签，如果有多个获取第一个
//            getText()获得该元素下的文本内容
            System.out.println(element.element("name").getText());
        }
//        使用elementText()获取指定名字子元素的文本内容
        System.out.println("----------------------");
        Element admin = root.element("admin");
        System.out.println(admin.elementText("adress"));
        System.out.println("--------------------");
        System.out.println(admin.attributeValue("id"));
        Attribute id = admin.attribute("id");
        System.out.println(id.getName()+":"+id.getValue());


    }
}
