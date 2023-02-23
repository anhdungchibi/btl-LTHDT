
package trungtamtinhocnn;
import java.io.Serializable;
import java.util.*;
public class HOADON extends HOCVIEN implements Serializable{
    private String MHD;
    private String NX;
    DSKH ds=new DSKH();
    public HOADON()
    {
        super();
        MHD="";NX="";
    }
    public HOADON(String mhv,String ten,String tuoi,String dc,String sdt,String cc,String mhd,String nx)
    {
        super(mhv,ten,tuoi,dc,sdt,cc);
        MHD=mhd;NX=nx;
    }
    public void nhaphd()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Nhap ma hoa don: ");MHD=sc.nextLine();
        super.nhap();
        System.out.println(" Nhap ngay xuat: ");NX=sc.nextLine();
        ds.nhapds();
    }
    public void xuathd()
    {	System.out.print("\n------------------------------------***HOA DON***-----------------------------------");
        System.out.print("\n \tMA HOA DON: "+MHD);
        System.out.println("                                            NGAY XUAT : "+NX);
        System.out.println("------------------------------------------------------------------------------------");
        super.xuat();
        System.out.println("------------------------------------------------------------------------------------");
        System.out.print("\n\n   Cac Khoa Hoc Tham Gia");
        System.out.print("\n\nMakhoahoc\tTenKhoaHoc\tSoBuoiHoc\tSotien1buoi\ttienhoc1khoa");
        ds.xuatds();
        System.out.print("\n                                          HOC PHI : "+ds.tiennop());
        System.out.print("\n\n-----------------------------------*************-------------------------------------\n\n\n");
    }
    public float gettg()
    {
        float tg=ds.tiennop();
        return tg;
    }
    public String getMHD(){
        return MHD;
    }
    public void setMHD(String MHD) {
        this.MHD = MHD;
    }
    public void setNX(String NX) {
        this.NX = NX;
    }
    public String getNX() {
        return NX;
    }
}
   
