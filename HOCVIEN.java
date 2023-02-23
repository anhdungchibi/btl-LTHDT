
package trungtamtinhocnn;
import java.io.Serializable;
import java.util.*;
public class HOCVIEN implements Serializable{
    private String MHV;
    private String Ten;
    private String Tuoi;
    private String DiaChi;
    private String Sdt;
    private String TheCC;
    public HOCVIEN()
    {
      MHV="";Ten="";Tuoi="";DiaChi="";Sdt="";TheCC="";
    }
    public HOCVIEN(String mhv,String ten,String tuoi,String dc,String sdt,String cc)
    {
        MHV=mhv;Ten=ten;Tuoi=tuoi;DiaChi=dc;Sdt=sdt;TheCC=cc;
    }
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Nhap ma the hoc vien: ");MHV=sc.nextLine();
        System.out.println(" Nhap ho ten hoc vien: ");Ten=sc.nextLine();
        System.out.println(" Nhap nam sinh: ");Tuoi=sc.nextLine();
        System.out.println(" Nhap dia chi hoc vien: ");DiaChi=sc.nextLine();
        System.out.println(" Nhap so dien thoai hoc vien: ");Sdt=sc.nextLine();
        System.out.println(" Nhap so the can cuoc cua hoc vien :");TheCC=sc.nextLine();
    }
    public void xuat()
    {
        System.out.println(" ma the hoc vien: "+MHV);
        System.out.println(" ho ten hoc vien: "+Ten);
        System.out.println(" nam sinh       : "+Tuoi);
        System.out.println(" dia chi        : "+DiaChi);
        System.out.println(" Sdt            : "+Sdt);
        System.out.println(" so the can cuoc: "+TheCC);
    }
    public String toString ()
    {
        return "\n ma the hoc vien: "+MHV+"\t ho ten hoc vien: "+Ten+"\t nam sinh: "+Tuoi+"\t dia chi: "+DiaChi+"\tSdt:"+Sdt+"\t so the can cuoc:"+TheCC;
    }
    public String getMHV()
    {
        return MHV;
    }
    public String getTen()
    {
        return Ten;
    }
    public String getTuoi()
    {
        return Tuoi;
    }
    public String getDiaChi()
    {
        return DiaChi;
    }
    public String getTheCC()
    {
        return TheCC;
    }
    public String getSdt(){
        return Sdt;
    }
}

