package Algodat3D;

/**
 *
 * @author Rofiif
 */
public class Driver {

    public static void main(String[] args) {

        ArrayLinearList a = new ArrayLinearList();
        {

            a.add(0, "A");
            a.add(1, "B");
            a.add(2, "C");
            a.add(3, "D");
            a.add(4, "E");
            a.add(5, "F");
            a.add(6, "G");
            a.add(7, "H");
            a.add(8, "I");
            a.add(9, "J");
            System.out.println("Panjang Array Awal untuk soal no 5\t :" + a.element.length);
            System.out.println("Apakah kosong?      : " + a.isEmpty());
            System.out.println("Size                : " + a.size);
            System.out.println("Isi dari index      : " + a.get(1));
            System.out.println("Index Of            : " + a.indexOf("B"));
            System.out.println("\t\t\t\t*Soal nomor 12*");
            
            Object[] x= new Object[20];
            System.out.println("Setelah di clone    : "+a.clone(x));

            System.out.println("\t\t\t\t*Soal nomor 3*");

            Object[][] Keluarga = {
                {"1", "Budi", "Wirausaha"},
                {"2", "Indra", "Travel"},
                {"3", "Luna", "Dokter"},};

            System.out.println("Panjang awal array = [" + Keluarga.length + "]" + "[" + Keluarga[0].length + "]");
            // ukuran array sebelum dirubah

            Object[][] Change = Array2D.changeLength2D(Keluarga, 3, 4);
            // untuk mengubah array sebelumnya

            System.out.println("Panjang array setelah di rubah =  [" + Change.length + "]" + "[" + Change[0].length + "]");

            for (Object[] ganti2 : Change) {
                for (int i = 0; i < Change[0].length; i++) {
                    System.out.println(ganti2[i]);

                }
            }
        
            System.out.println("\t\t\t\t*Soal nomor 5*");

            //memotong panjang array sesuai dengan array yang terisi
            a.add(10, "K");
            a.add(11, "L");
            a.trimToSize();
            System.out.println("Panjang Array Setelah di Potong \t :" + a.element.length);

            System.out.println("\t\t\t\t*Soal nomor 6*");

            //untuk menentukan panjang Array yang dipilih
            a.setSize(5);
            System.out.println("Setelah Dilakukan SetSize adalah\t :" + a.toString());

            System.out.println("\t\t\t\t*Soal nomor 9*");

            a.removeRange(0, 1);
            System.out.println("Setelah di removeRange : " + a.toString());

            System.out.println("\t\t\t\t*Soal nomor 8*");

            //Untuk Menghapus semua Isi Array yang ada 
            a.clear();
            System.out.println("Isi array setelah clear \t:" + a.toString());

            

        }

    }
}
