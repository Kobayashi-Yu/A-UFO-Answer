import java.util.Scanner;
class Main {
    public static void main(String[] args){
        int index = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        while(true) {
            index = S.indexOf("ZONe",index)+1;
            if(index ==0){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
