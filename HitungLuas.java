public class HitungLuas {
	 public static void main (String[] args){
		 int panjang = 6;
		 int lebar = 5;
		 float keliling;
		 float luas;
		 System.out.println("panjang="+panjang);
		 System.out.println("lebarnya="+lebar);
		 keliling = (float)2*(panjang+lebar);
			System.out.println("jadi keliling persegi panjang adalah="+panjang+lebar*2);
			luas = (float)(panajang*lebar);
				System.out.println("luasnya adalah="+panjang*lebar);
				//luas lingkaran
	double phi = 3.14;
	double r, luas1,keliling1;

System.out.println("Program Luas Lingkaran\n");
System.out.print("Masukkan Panjang Jari-jari : ");
r = input.nextDouble();

luas1 = phi * r * r;
keliling1 = 2 * phi * r;

System.out.print("Luas Lingkaran = " + (int)luas1 + " \nKeliling lingkaran = "+ (int)keliling1);
	 }
	 }
