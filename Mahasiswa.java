public class Mahasiswa {
	private String nama;
	private int umur;
	public Mahasiswa(String n, int u) {
		nama = n;
		umur = u;
	} 
	public void tampilkanBiodata() {
		System.out.println("::: BIODATA :::");
		System.out.println("Nama:\t"+nama);
		System.out.println("Umur:\t"+umur);
	}
	public String getNama(){
		return nama;
	}
	public void setNama(String n){
		this.nama = n;
	}
	public int getUmur(){
		return umur;
	}
	public void setUmur(int u){
		this.umur = u;
	}
}  