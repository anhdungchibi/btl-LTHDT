
package trungtamtinhocnn;
import java.io.Serializable;
import java.util.*;
public class KHOAHOC implements Serializable{
    private String Mkh;
    private String TenK;
    private int SoB;
    private float Sotien1b;
    public KHOAHOC()
    {
        Mkh="";TenK="";SoB=0;Sotien1b=0;
    }
    public KHOAHOC(String mkh,String tk,int sb,float hp,float sotien1b)
    {
        Mkh=mkh;TenK=tk;SoB=sb;Sotien1b=sotien1b;
    }
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Nhap Ma khoa hoc :");Mkh=sc.nextLine();
        System.out.print("\n Nhap Ten khoa hoc: ");TenK=sc.nextLine();
        System.out.print("\n Nhap so buoi     : ");SoB=sc.nextInt();
        System.out.print("\n Nhap so tien 1 buoi     : ");Sotien1b=sc.nextFloat();
    }
    public void xuat()
    {
System.out.print("\n"+Mkh+"\t\t\t\t"+TenK+"\t\t\t"+SoB+"\t\t\t"+Sotien1b+"\t\t\t"+getHP());
    }
    public String toString()
    {
        return "\nMa khoa hoc: "+Mkh+"\tTen khoa hoc: "+TenK+"\tso buoi:"+SoB+"\tSo tien1b"+Sotien1b+"\ttien hoc 1 khoa:"+getHP();
    }
    public String getTenK()
    {
        return TenK;
    }
    public int getSoB()
    {
        return SoB;
    }
    public float getHP()
    {
        float HP = 0;
        return HP=SoB*Sotien1b;
    }
    public void setMkh(String mkh) {
        Mkh = mkh;
    }
    public void setTenK(String tenK) {
        TenK = tenK;
    }
    public void setSoB(int soB) {
        SoB = soB;
    }
    public void setSotien1b(float sotien1b) {
        Sotien1b = sotien1b;
    }
}
