/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trungtamtinhocnn;
import java.io.Serializable;
import java.util.*;
public class DSKH implements Serializable {
    ArrayList<KHOAHOC>lstKH;
    private static final Scanner sc = new Scanner( System.in);
    public DSKH() {
        lstKH=new ArrayList();
    }
    public void nhapds()
    {	Scanner sc=new Scanner(System.in);
        System.out.print("\n NHAP SO KHOA HOC THAM GIA: ");
        int sk=sc.nextInt();
        for(int i=0;i<sk;i++)
        {
            System.out.print("\n KHOA HOC THU "+(i+1));
            KHOAHOC x=new KHOAHOC();
            x.nhap();
            lstKH.add(x);
        }
    }
    public void xuatds()
    {
        for(KHOAHOC p:lstKH)
        {
            p.xuat();
        }
    }
    public float tiennop()
    {
        float tn=0;
        for(KHOAHOC p:lstKH)
        {
            tn=tn+((KHOAHOC)p).getHP();
        }
        return tn;
    }
}

