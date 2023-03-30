package quanlykho;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Servicer s=new Servicer();
    Model m=new Model();
    Scanner sc=new Scanner(System.in);
    public void realAll(){
        ArrayList<Model>list=s.xem();
        for (Model x:list){
            System.out.println(x.toString());
        }
    }
    public void sreachSp(){
        sc.nextLine();
        System.out.println("Nhập vào id sản Phẩm");
        String tk= sc.nextLine();
        s.timKiem(tk);
    }
    public void add(){
        System.out.println("Nhập iD sản phẩm");
        m.setIdSanPham(sc.nextLine());
        System.out.println("Nhập tên sản phẩm");
        m.setTenSanPham(sc.nextLine());
        System.out.println("Nhập trạng thái");
        m.setTinhTrang(sc.nextLine());
        System.out.println("Nhập vào số lượng");
        m.setSl(sc.nextInt());
        s.them(m);
    }
    public void xuatKho(){
        System.out.println("Nhập vào id sản phẩm");
        m.setIdSanPham(sc.nextLine());
        s.xuatKho(m);
        System.out.println("Nhập vào số lượng sau khi xuất");
        m.setSl(sc.nextInt());
        s.xuatKho(m);
    }
    public void nhapKho(){
        System.out.println("Nhập vào id sản phẩm");
        m.setIdSanPham(sc.nextLine());
        System.out.println("Nhập vào số sau khi nhập");
        m.setSl(sc.nextInt());
        s.nhapKho(m);
    }
}
