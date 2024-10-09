public class Main {
    public static void main(String[] args) {
            //ProviderTelecom provider = new ProviderTelecom();

            //provider.getInfo();
            //provider.tambahpulsa(50000);
            //provider.kurangipulsa(5000);
            //provider.tambahkuota(100);
           //provider.kurangikuota(1000);
           
           Player player = new Player(0, 0);
           System.out.println("Informasi Pemain Awal:");
           System.out.println(player.getInfo());  // Informasi awal
   
           player.moveRight();
           player.moveUp();
           System.out.println("\nSetelah Bergerak:");
           System.out.println(player.getInfo());  // Informasi setelah bergerak
   
           player.getDamage();  // Mengambil damage
           System.out.println("\nSetelah Mengambil Damage:");
           System.out.println(player.getInfo());  // Informasi setelah damage
   
           player.firstSkill();  // Menggunakan skill pertama
           player.secondSkill(); // Menggunakan skill kedua
           player.ultimateSkill(); // Menggunakan skill ultimate  
    }
}