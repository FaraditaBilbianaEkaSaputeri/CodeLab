
public class Mahasiswa {
	String[] nama = new String[50];
	String[] nim = new String[50]; 
	String[] jurusan = new String[50];
	
	public String tampilDataMahasiswa(){
		System.out.println(tampilUniversitas());
		for (int i = 0; i < nama.length; i++) {
            if (nama[i] != null) {
                System.out.println("Nama: " +nama[i]);
                System.out.print(", Nim: "+nim[i]);
                System.out.print(", Jurusan: "+jurusan[i]);
            }
		}
		return null;
	}
	
	static String tampilUniversitas(){
		String univ = "Universitas Muhammadiyah Malang";
		return univ;
	}
}
