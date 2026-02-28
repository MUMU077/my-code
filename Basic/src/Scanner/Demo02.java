package Scanner;
import java.util.Scanner;
public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner=new scanner(System.in);
        System.out.println("使用next方式接收:");
        if(scanner.hasNext());
        //使用next方式接收
        String str=scanner.next();//程序会等待用户输入完毕
        System.out.println("输出的内容为:"+str);
        scanner.close();
    }
}
