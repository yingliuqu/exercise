
public class User2 {
    int id;
    String name;
    String pwd;
    static String company = "北京尚学堂";


    public  User2(int id,String name){
        this.id = id;
        this.name = name;
    }

    public void login(){
        System.out.println("登录"+name);
    }

    public static void printCompany(){  //调用静态方法
        System.out.println(company);

    }


    public static void main(String[] args) {
        User2 u = new User2(101,"高小齐");
        User2.printCompany();
        User2.company = "阿里爷爷";
        User2.printCompany();
    }
}

