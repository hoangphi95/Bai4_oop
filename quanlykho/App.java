package quanlykho;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Controller ct=new Controller();
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("1.Để xem danh sách");
            System.out.println("2.Để thêm sản phẩm");
            System.out.println("3.Để tìm Sản phẩm");
            System.out.println("4. Để xuất kho");
            System.out.println("5. Để nhập kho");
            int chon=sc.nextInt();
            switch (chon){
                case 1:
                    ct.realAll();
                    break;
                case 2:
                    ct.add();
                    break;
                case 3:
                    ct.sreachSp();
                    break;
                case 4:
                    ct.xuatKho();
                    break;
                case 5:
                    ct.nhapKho();
                    break;
            }


        }while (true);
    }
}
