import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuổi");
        String input = sc.nextLine();
        System.out.println(input);
        System.out.print("Nhập kiểm tra sô lần xuất hiện");
        char inputtext =sc.next().charAt(0);
        int count =0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==inputtext){
                count+=1;
            }
        }
        System.out.print("số lần xuất hiện chữ " + inputtext + " là" +count);
    }
}
