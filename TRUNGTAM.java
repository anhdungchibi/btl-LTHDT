
package trungtamtinhocnn;
import java.util.*;
public class TRUNGTAM
{
    public static void main(String[] args)  {
        DSHD DS=new DSHD();
        Scanner sc=new Scanner(System.in);
        int chon;
        do {
            System.out.println(" |=====================MENU=====================================|");
            System.out.println(" | 1. nhap thong tin vao danh sach và luu vao file HOADON.dat   |");
            System.out.println(" | 2. In danh sach và đọc thông tin từ file HOADON.dat          |");
            System.out.println(" | 3. Tong Tien Tat ca hoa don                                  |");
            System.out.println(" | 4. Xap xep hoa don theo ten hoc vien tu A-Z                  |");
            System.out.println(" | 5. xoa hoa don theo ma hoa don                               |");
            System.out.println(" | 6. tim hoa don theo ma hoa don                               |");
            System.out.println(" | 7. them hoa don vao danh sach hoa don                        |");
            System.out.println(" | 8. sua thong tin hoa don                                     |");
            System.out.println(" | 9. liet ke hoa don co hoc phi > k                             |");
            System.out.println(" | 10.dem so luong hoa don co hoc phi >F                        |");
            System.out.println(" | 0. Thoat                                                     |");
            System.out.println(" |==============================================================|");
            System.out.println("          Moi ban chon:");
            chon = sc.nextInt();
            switch(chon)
            {
                case 1:
                    DS.nhapHD();DS.ghifileHD();
                    break;
                case 2:
                    DS.docfileHD();DS.xuatHD();
                    break;
                case 3:
                    System.out.println("\n Tong Tien Danh Sach Hoa Don: "+DS.tongtien());
                    break;
                case 4:
                    System.out.println("\n Danh Sach Hoa Don Xap Xep Theo Ho Ten");
                    DS.SXt();
                    break;
                case 5:
                    sc.nextLine();
                    System.out.print("\n Nhap ma hoa don ban muon xoa: ");
                    String Mhd=sc.nextLine();
                    DS.xoatheomhd(Mhd);
                    DS.xuatHD();
                    break;
                case 6:
                    DS.inhd();
                    break;
                case 7: DS.themhd();break;
                case 8: DS.suahd();break;
                case 9: DS.lietke();break;
                case 10: DS.demhd();break;
            }
        }
        while(chon !=0);
    }
}
