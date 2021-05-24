import javax.script.ScriptContext;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bài tập cần kiểm tra: ");
        int o = sc.nextInt();
        switch (o) {
            case 1: {
                System.out.println("Bài tập 9: In tam giác");
                BaiTapBuoi8_1.baitap9();
                break;
            }
            case 2: {
                System.out.println("Bài tập 10: In hình chữ nhật");
                BaiTapBuoi8_1.baitap10();
                break;
            }
            default: {
                System.out.println("Không có bài tập này");
            }
        }
    }
}