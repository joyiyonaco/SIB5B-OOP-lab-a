import java.time.LocalDateTime;

public class ProviderTelecom {
    String name;
    int mobileBalance;
    int mobileData;
    LocalDateTime expiredmobileBalance;
    LocalDateTime expiredmobileData;

    public void getInfo() {
        System.out.println("ini adalah informasi kartumu");
    }
    public void tambahpulsa(int a){
        mobileBalance = a;
        System.out.println("pulsa anda di tambah " + a + "Rupiah");
    }
    public void kurangipulsa(int a){
        mobileBalance = mobileBalance - a;
        System.out.println("sisa pulsa anda " + mobileBalance + "Rupiah");
    }
    public void tambahkuota(int a){
        mobileBalance = a ;
        System.out.println("kuota anda di tambah" + a + "GB");
    }
    
    public void kurangikuota(int a){
        mobileBalance = mobileBalance - a;
        System.out.println("kuota anda di kurangi" + a + "GB");
    }
}
