public class Segitiga {
	private int alas;
	private int tinggi;
	private int sisiMiring;
	private double luas;
	private double keliling;

	public Segitiga(int a, int t, int s){
		alas = a;
		tinggi = t;
		sisiMiring = s;
	}

	public void cetakSegitiga(){
		System.out.println("::: SEGITIGA :::");
		System.out.println("Alas = " +alas);
		System.out.println("Tinggi = " +tinggi);
		System.out.println("Sisi Miring = " +sisiMiring);
	}

	public void luasSegitiga(){
		luas = 0.5*alas*tinggi;
		System.out.println("Luas Segitiga = 1/2 x alas x tinggi = " +luas);

		keliling = alas+tinggi+sisiMiring;
		System.out.println("Keliling Segitiga = sisi 1 + sisi 2 + Sisi 3 = " +keliling);
	}
}