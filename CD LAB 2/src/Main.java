import java.util.Scanner;

public class Main {
	 static void menu() {
		System.out.println("Menu:");
		System.out.println("1. Tambah Data Mahasiswa");
		System.out.println("2. Tampilkan Data Mahasiswa");
		System.out.println("3. Keluar");
		System.out.print("Pilihan Anda: ");
	}

	public static void main(String[] args) {
		int choose;
		int idx = 0;
		Mahasiswa dataMahasiswa = new Mahasiswa();
		Scanner input = new Scanner(System.in);
		
		do {
		menu();
		choose = input.nextInt();
		input.nextLine();
			
		switch(choose) {
		case 1:
			System.out.print("Masukan nama mahasiswa: ");
			String nama = input.nextLine();
			dataMahasiswa.nama[idx] = nama;
			
			String nim = null;
			while(nim.length()!=15) {
				System.out.print("Masukan NIM mahasiswa: ");
				nim =input.nextLine();
				dataMahasiswa.nim[idx] = nim;
					if(nim.length() != 15) {
						System.out.println("NIM harus 15 digit");
					}
			}
				
			System.out.print("Masukan jurusan mahasiswa: ");
			String jurusan = input.nextLine();
			dataMahasiswa.jurusan[idx] = jurusan;
			idx++;
			break;
		case 2:
				dataMahasiswa.tampilDataMahasiswa();
			break;
		case 3:
			System.out.println("terima kasih");
			break;
		}
		}while(choose!=3);
		input.close();
	}
}
