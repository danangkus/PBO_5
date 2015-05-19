public class TestBangun {
	public static void main(String[] args) {
		Segitiga sg3 = new Segitiga(6, 8, 10);
		sg3.cetakSegitiga();
		System.out.println("");
		sg3.luasSegitiga();
		System.out.println();
		System.out.println();
		Lingkaran lkr = new Lingkaran(10);
		lkr.cetakLingkaran();
		System.out.println("");
		lkr.luasLingkaran();
	}
}