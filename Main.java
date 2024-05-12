
public class Main {
	public static void main(String[] args) {
		CustomSavingsBond obligasi = new CustomSavingsBond(12); 
		obligasi.setBalance(20000);
		System.out.println("Uang Pendapatan: " + obligasi.hitungKenaikan());
	}
}
