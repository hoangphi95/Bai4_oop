package quanlykho;

import java.util.ArrayList;

public class Servicer {
    ArrayList<Model> list;

    public ArrayList<Model> xem() {
        if (list == null) {
            list = new ArrayList<>();
            Model m = new Model("121", "IPhone", "còn", 36);
            Model m1 = new Model("122", "SamSungS22", "còn", 25);
            Model m2 = new Model("132", "SamSungS21", "hết", 89);
            Model m3 = new Model("145", "Opp", "còn", 39);
            Model m4 = new Model("156", "bkav", "hết", 26);
            Model m5 = new Model("189", "noikia", "còn", 14);
            list.add(m);
            list.add(m1);
            list.add(m2);
            list.add(m3);
            list.add(m4);
            list.add(m5);
        }
        return list;
    }

    public void them(Model model) {
        xem();
        list.add(model);
    }

    public void timKiem(String tk) {
        xem();
        for (int i=0;i< list.size();i++) {
            if (list.get(i).getIdSanPham().equals(tk)) {
                System.out.println(list.get(i));
            }
        }

    }

    public void xuatKho(Model model) {
       xem();
        for (int i=0;i< list.size();i++) {
            if (list.get(i).getIdSanPham().equals(model)&&list.get(i).getTinhTrang().equals("còn hàng")) {
                list.add(model);
            } else if (list.get(i).getTinhTrang().equals("hết")) {
                System.out.println("Hết hàng");
                break;
            }
        }
    }
    public void nhapKho(Model model) {
        xem();
        for (int i=0;i< list.size();i++) {
            if (list.get(i).getIdSanPham().equals(model)) {
                list.add(model);
            } else {
                System.out.println("Ko có sản phẩm");
            }
        }
    }
}
