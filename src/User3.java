/**
 * 测试Static语句块
 */

public class User3 {
    int id;
    String name;
    String pwd;
    static String company;
    static {
        System.out.println("执行类的初始化工作");
        company = "北京尚学堂";
        printCompany();
    }
    public static void printCompany(){
        System.out.println(company);
    }
    public static void main(String[] args) {
        User3 u3= null;
        System.out.println("111154545");
    }
}
