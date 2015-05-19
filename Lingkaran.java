public class Lingkaran {
	private int jari;
	private double luasLingk;
	private double kelLingk;

	public Lingkaran(int r){
		jari = r;
	}

	public void cetakLingkaran(){
		System.out.println("::: LINGKARAN :::");
		System.out.println("Jari-jari Lingkaran = "+jari);
	}

	public void luasLingkaran(){
		luasLingk = Math.PI*jari*jari;
		System.out.println("Luas Lingkaran = 3,14 x jari-jari x jari-jari = "+luasLingk);

		kelLingk = Math.PI*(jari+jari);
		System.out.println("Kelililng Lingkaran = 3,14 x diameter = " +kelLingk);
	}
}