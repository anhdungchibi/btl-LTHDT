
package trungtamtinhocnn;
import java.util.*;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
public class DSHD {
    ArrayList<HOADON> lstHD;
    int n;
    KHOAHOC kh = new KHOAHOC();
    private static final Scanner sc = new Scanner(System.in);
    public DSHD() {
        lstHD = new ArrayList<HOADON>();
    }
    public void nhapHD() {
        System.out.println("NHAP SO LUONG HOA DON: ");
        int nhd = sc.nextInt();
        for (int i = 0; i < nhd; i++) {
            System.out.println("NHAP HOA DON THU " + (i + 1));
            HOADON hd = new HOADON();
            hd.nhaphd();
            lstHD.add(hd);
        }
    }
    public void xuatHD() {
        for (int i = 0; i < lstHD.size(); i++) {
            System.out.println("==>>HOA DON THU " + (i + 1));
            lstHD.get(i).xuathd();
        }
    }
    public float tongtien() {
        float tt = 0;
        for (HOADON p : lstHD)
            tt += ((HOADON) p).gettg();
        return tt;
    }
    public void SXt() {
        Collections.sort(lstHD, new SXHoTen());
        xuatHD();
    }
    class SXHoTen implements Comparator<HOCVIEN> {
        @Override
        public int compare(HOCVIEN o1, HOCVIEN o2) {
            return o1.getTen().compareTo(o2.getTen());
        }
    }
    public void xoatheomhd(String mhd) {
        for (HOADON h : lstHD) {
            if ((h.getMHD().equalsIgnoreCase(mhd))) {
                lstHD.remove(h);
                break;
            }
        }
    }
    public void inhd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma hoa don: ");
        String mhd = sc.nextLine();
        for (HOADON h : lstHD) {
            if (h.getMHD().equalsIgnoreCase(mhd)) {
                h.xuathd();
            }
        }
    }
    public void themhd(){
        System.out.println("nhap so luong hoa don ban muon them: ");
        int them = sc.nextInt();
        System.out.println("NHAP THONG TIN HOA DON BAN MUON THEM ");
        for(int i=0;i<them;i++)
        {
            System.out.println("THEM HOA DON THU "+(i+1));
            HOADON h = new HOADON();
            h.nhaphd();
            lstHD.add(h);
        }
        System.out.println("DANH SACH SAU KHI THEM!!");
        for(HOADON h :lstHD){
            h.xuathd();
        }
    }
    public void suahd(){
        sc.nextLine();
        System.out.println("nhap ma hoa don ban muon sua: ");String mhd = sc.nextLine();
        for(HOADON h : lstHD){
            if(h.getMHD().equalsIgnoreCase(mhd)){
                System.out.println("nhap ma hoa don moi: ");
                h.setMHD(sc.nextLine());
                System.out.println("nhap ngay lap hoa don moi: ");
                h.setNX(sc.nextLine());
            }
        }

        System.out.println(" DANH SACH HOA DON SAU KHI SUA");
        for(HOADON h : lstHD){
            h.xuathd();
        }
    }
    public void lietke(){
        sc.nextLine();
        System.out.println("nhap hoc phi K: ");float k = sc.nextFloat();
        int dem = 0;
        for(HOADON h : lstHD){
            if(k<h.gettg()){
                System.out.println("------------HOA DON CO HOC PHI > K-------------");
                h.xuathd();
                dem ++;
            }
        }
        if(dem==0)
        {
            System.out.println("khong co hoa don nao hoc phi > "+k);
        }
    }
    public void demhd(){
        int dem = 0;
        System.out.println("nhap hoc phi F: ");
        float f = sc.nextFloat();
        for(HOADON h : lstHD){
            if(f<h.gettg())
            {
                dem ++;
            }
        }
        System.out.println("==>> so luong hoa don co hoc phi > F :"+dem);
    }
    public void ghifileHD()
    {
        try
        {
            FileOutputStream fileOut = new FileOutputStream("HOADON.dat");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(lstHD);
            System.out.println("ghi file thành công!");
            objectOut.close();
            fileOut.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public void docfileHD()
    {
        try
        {
            FileInputStream filein = new FileInputStream("HOADON.dat");
            ObjectInputStream fileo = new ObjectInputStream(filein);
            lstHD=(ArrayList)fileo.readObject();
            fileo.close();
            filein.close();
            System.out.println("dữ liệu trong file!");
        }catch(FileNotFoundException e)
        {
            System.out.println("khong tim thay file!");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}

