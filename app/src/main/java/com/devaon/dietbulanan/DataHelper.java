package com.devaon.dietbulanan;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "db_diet.db";
    private static final int DATABASE_VERSION = 1;

    public DataHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("PRAGMA foreign_keys=ON");
        //tabel user
        db.execSQL("create table data_user (" +
                "id_user int primary key," +
                "jenis_kelamin text null," +
                "usia int null," +
                "tinggi int null," +
                "berat int null);");
        //tabel materi
        db.execSQL("create table data_materi (" +
                "id_materi int null," +
                "judul text null," +
                "konten text null," +
                "gambar text null);");
        //tabel program
        db.execSQL("create table data_program (" +
                "id_program int null," +
                "id_hari int null," +
                "menu_satu text null," +
                "menu_dua text null," +
                "menu_tiga text null," +
                "optional text null);");
        //tabel simpan data program
//        db.execSQL("create table data_program_diet (" +
//                "id_hari int null," +
//                "id_program int null," +
//                "menu_satu int null," +
//                "menu_dua int null," +
//                "menu_tiga int null," +
//                "optional int null);");

        //insert data materi
        db.execSQL("insert into data_materi values (" +
                "1," +
                "'Diet Mayo'," +
                "'Diet Mayo merupakan jenis diet sehat yang bisa menjadikan tubuh menjadi cepat menuju angka yang diharapkan. Prinsip utama diet mayo adalah menghindari garam. Menurut penelitian, sebagian garam yang kita konsumsi akan tertinggal di tubuh dan akan menyerap banyak air sehingga menyebabkan tubuh menjadi lebih berat dan tampak gemuk. Oleh karena itu, diet mayo mengharuskan kita untuk menghindari makanan asin guna membersihkan diri dari garam. Nah, dalam diet ini anda dilarang mengkonsumsi apapun yang mengandung garam. Dalam waktu 2 minggu, anda diharuskan untuk menghindari garam dan apabila anda melanggar dipertengahan menjalani diet maka anda harus mengulang diet dari awal karena hal tersebut dianggap gagal. Karena itulah diet mayo sangat memerlukan konsistensi oleh orang yang menjalankannya.\n" +
                "Resep : dianjurkan agar anda sering mengkonsumsi atau minum air putih ( air mineral ) . minimal anda harus minum air putih sebanyak 8 gelas setiap harinya.\n\n\n" +
                "Sumber : http://www.sarankesehatan.com/pengertian-dan-prinsip-diet-mayo/'," +
                "'diet_mayo');");
        db.execSQL("insert into data_materi values (" +
                "2," +
                "'Diet Clean Eating'," +
                "'Makan-makanan yang sebenarnya (real food) karena di tengah zaman modern ini, harus pintar memilih makanan yang baik untuk kesehatan kita dan jauhi dari makanan yang tidak baik untuk kesehatan. Jangan pula terbawa mitos,pahami bahan-bahan ,manfaat yang dibuat untuk makanan tersebut ,dan resiko untuk kesehatan kita. Disaat yang bersamaan,kurangi/hentikan konsumsi makanan yang tidak sehat (makanan proses,makanan cepat saji,gula,tepung proses,lemak tidak sehat dan susu),serta produk makanan yang terbuat dari susu\n" +
                "Makan selalu dengan komposisi,porsi,serta cara yang benar (sehat) perkarya diri dengan informasi dan ilmu yang benar. Perkaya diri dengan pengetahuan dasar tentang tubuh kita dan cara kerjanya.\n" +
                "Bila kamu lapar  makan apa saja boleh. Kamu bisa memilih dari 5 list makanan yang harus di focuskan di atas. Makan jam berapapun tidak masalah. Ini bukanlah diet tanpa karbohidrat. Karbohidrat masih ada kok dari buah dan sayur kita cuma batasi saja.Berapa banyak buah yang di perbolehkan sehari ? maximal 3 butir buah besar seperti apel, pisang, pear, semangka ,melon dll. Kalau buah buah kecil kaya anggur , blueberries, strawberry makan saja sampe puas. Karena buah buah besar juga mengandung kalori dan gula. \n" +
                "Disini kamu tidak harus lapar, kamu bisa makan hingga 5x sehari setiap 2-3 jam sekali. Kalau lapar lagi snack setelah dinner juga tidak masalah kok. Ingat rumus ini : Breakfast, snack , lunch , snack, dinner, snack lagi.\n\n\n" +
                "Sumber : https://www.vemale.com/kesehatan/71786-mengenal-arti-clean-eating-dan-manfaatnya.html'," +
                "'diet_clean_eating');");
        db.execSQL("insert into data_materi values (" +
                "3," +
                "'Diet Food Combining'," +
                "'Food combining (FC) adalah istilah untuk pendekatan gizi yang menganjurkan kombinasi spesifik makanan sebagai pusat kesehatan yang baik (seperti tidak mencampur makanan kaya karbohidrat dan makanan kaya protein dalam makanan yang sama)\n" +
                "Ketika makanan yang tidak satu kelompok dikonsumsi bersamaan, alkali dan asam bertemu sehingga menetralisir satu sama lain dan akhirnya menghambat pencernaan. Oleh karenanya, diet food combining tidak menyarankan orang-orang untuk menyantap nasi, lauk pauk, sayuran, dan buah sekaligus dalam 1 jam makan.\n" +
                "Dalam pola makan food combining tidak mencampurkan konsumsi karbohidrat dan protein hewati karena dapat memperberat kerja sistem pencernaan. Makanan tinggi pati dan tinggi protein akan sulit dicerna bila jumlahnya sama-sama banyak. Food combining mempertimbangkan juga efektivitas penyerapan zat gizi dan fitonutrien dalam makanan. Oleh karena itu, asupan makanan diatur mengikuti siklus alami tubuh.\n\n\n" +
                "Sumber : http://lagizi.com/penjelasan-tentang-food-combining/'," +
                "'diet_food_combining');");
        db.execSQL("insert into data_materi values (" +
                "4," +
                "'Diet Paleo'," +
                "'Diet paleo adalah diet yang mengatur pola makan kita mengikuti pola makan nenek moyang. Diet paleo ini menggunakan prinsip-prinsip yang ada pada jaman dulu yang dipakai sama nenek moyang di jaman batu. Kamu bakal makan makanan yang beneran makanan sehat bebas bahan pengawet. Dan, kamu nggak boleh makan segala jenis makanan seperti nasi, ketan gandum, maupun kentang. \n" +
                "Makanan yang Dianjurkan Dalam Diet Paleo adalah buah dan sayuran organik yang belum tercampur bahan kimia, biji-bijian, umbi, daging, telur, dan ikan.\n\n\n" +
                "Sumber : http://www.prosesdetox.com/diet-sehat-dalam-waktu-2-minggu-dengan-metode-paleo-diet/'," +
                "'diet_paleo');");

        //insert data program
        //program mayo
        db.execSQL("insert into data_program values (" +
                "1, 1," +
                "'1 gelas kopi atau teh plus gula (tanpa susu)'," +
                "'Telur rebus 2 butir dan 1 tomat dikombinasi dengan rebusan bayam'," +
                "'Daging bakar tanpa kulit sebanyak 150 gram yang dikombinasikan daun selada yang dicampur dengan air jeruk lemon atau air jeruk nipis yang dicampur dengan 1 sendok makan minyak zaitun'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 2," +
                "'1 gelas kopi atau teh plus gula (tanpa susu)'," +
                "'Daging bakar atau daging rebus satu potong dan daun selada yang dicampurkan dengan air jeruk lemon atau jeruk nipis yang dicampur dengan 1 sendok makan minyak zaitun dan juga 1 buah segar'," +
                "'Daging ayam yang direbus tanpa bumbu dan yoghurt 1 gelas'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 3," +
                "'1 gelas kopi atau teh plus gula (tanpa susu) dan roti bakar satu potong'," +
                "'Kukusan daun seledri, tomat 1 buah dan buah segar kesukaan satu buah'," +
                "'Telur rebus 2 butir, ham 2 iris atau ayam rebus dan daun selada yang dicampurkan dengan air jeruk lemon atau air jeruk nipis yang dicampur juga dengan 1 sendok makan minyak zaitun'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 4," +
                "'1 gelas kopi atau teh plus gula (tanpa susu) dan roti bakar satu potong'," +
                "'Rebusan telur 1 buah , jus wortel 1 buah dan 60 gram keju'," +
                "'Buah dengan ukuran kecil sebanyak satu kaleng kecil daun selada yang dicampurkan dengan air jeruk lemon atau air jeruk nipis yang dicampur juga dengan 1 sendok makan minyak zaitun dan 1 gelas yoghurt'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 5," +
                "'Parutan atau jus dari wortel dengan ukuran besar lalu tambahkan lemon untuk penyedapnya'," +
                "'Ikan agak besar yang dipepes atau dibakar tanpa bumbu'," +
                "'Daging yang dibakar tanpa bumbu atau direbus 1 potong saja dan daun selada yang dicampurkan dengan air jeruk lemon atau air jeruk nipis yang dicampur dengan 1 sendok makan minyak zaitun dan kukusan daun seledri'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 6," +
                "'1 gelas kopi atau teh plus gula (tanpa susu) dan roti bakar satu potong'," +
                "'Satu buah dada ayam tanpa kulit rebus dan daun selada yang dicampurkan dengan air jeruk lemon atau air jeruk nipis yang dicampur dengan 1 sendok makan minyak zaitun dan lemon'," +
                "'Telur rebus 2 butir saja dan jus wortel'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 7," +
                "'Segelas teh jangan pakai gula'," +
                "'Daging rebus atau daging yang dibakar sebanyak 1 potong dan buah-buahan segar'," +
                "'Puasa makan, namun masih bisa minum air putih dalam jumlah banyak'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 8," +
                "'1 gelas kopi atau teh plus gula (tanpa susu)'," +
                "'Telur rebus 2 butir dan 1 tomat dikombinasi dengan rebusan bayam'," +
                "'Daging bakar tanpa kulit sebanyak 150 gram yang dikombinasikan daun selada yang dicampur dengan air jeruk lemon atau air jeruk nipis yang dicampur dengan 1 sendok makan minyak zaitun'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 9," +
                "'1 gelas kopi atau teh plus gula (tanpa susu)'," +
                "'Daging bakar atau daging rebus satu potong dan daun selada yang dicampurkan dengan air jeruk lemon atau jeruk nipis yang dicampur dengan 1 sendok makan minyak zaitun dan juga 1 buah segar'," +
                "'Daging ayam yang direbus tanpa bumbu dan yoghurt 1 gelas'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 10," +
                "'1 gelas kopi atau teh plus gula (tanpa susu) dan roti bakar satu potong'," +
                "'Kukusan daun seledri, tomat 1 buah dan buah segar kesukaan satu buah'," +
                "'Telur rebus 2 butir, ham 2 iris atau ayam rebus dan daun selada yang dicampurkan dengan air jeruk lemon atau air jeruk nipis yang dicampur juga dengan 1 sendok makan minyak zaitun'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 11," +
                "'1 gelas kopi atau teh plus gula (tanpa susu) dan roti bakar satu potong'," +
                "'Rebusan telur 1 buah , jus wortel 1 buah dan 60 gram keju'," +
                "'Buah dengan ukuran kecil sebanyak satu kaleng kecil daun selada yang dicampurkan dengan air jeruk lemon atau air jeruk nipis yang dicampur juga dengan 1 sendok makan minyak zaitun dan 1 gelas yoghurt'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 12," +
                "'Parutan atau jus dari wortel dengan ukuran besar lalu tambahkan lemon untuk penyedapnya'," +
                "'Ikan agak besar yang dipepes atau dibakar tanpa bumbu'," +
                "'Daging yang dibakar tanpa bumbu atau direbus 1 potong saja dan daun selada yang dicampurkan dengan air jeruk lemon atau air jeruk nipis yang dicampur dengan 1 sendok makan minyak zaitun dan kukusan daun seledri'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 13," +
                "'1 gelas kopi atau teh plus gula (tanpa susu) dan roti bakar satu potong'," +
                "'Satu buah dada ayam tanpa kulit rebus dan daun selada yang dicampurkan dengan air jeruk lemon atau air jeruk nipis yang dicampur dengan 1 sendok makan minyak zaitun dan lemon'," +
                "'Telur rebus 2 butir saja dan jus wortel'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 14," +
                "'Mulai normal ke menu makanan yang biasa dikonsumsi. Dianjurkan kurangi makanan yang menganduk banyak gula dan lemak'," +
                "'Mulai normal ke menu makanan yang biasa dikonsumsi. Dianjurkan kurangi makanan yang menganduk banyak gula dan lemak'," +
                "'Mulai normal ke menu makanan yang biasa dikonsumsi. Dianjurkan kurangi makanan yang menganduk banyak gula dan lemak'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 15," +
                "'1 gelas kopi atau teh plus gula (tanpa susu)'," +
                "'Telur rebus 2 butir dan 1 tomat dikombinasi dengan rebusan bayam'," +
                "'Daging bakar tanpa kulit sebanyak 150 gram yang dikombinasikan daun selada yang dicampur dengan air jeruk lemon atau air jeruk nipis yang dicampur dengan 1 sendok makan minyak zaitun'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 16," +
                "'1 gelas kopi atau teh plus gula (tanpa susu)'," +
                "'Daging bakar atau daging rebus satu potong dan daun selada yang dicampurkan dengan air jeruk lemon atau jeruk nipis yang dicampur dengan 1 sendok makan minyak zaitun dan juga 1 buah segar'," +
                "'Daging ayam yang direbus tanpa bumbu dan yoghurt 1 gelas'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 17," +
                "'1 gelas kopi atau teh plus gula (tanpa susu) dan roti bakar satu potong'," +
                "'Kukusan daun seledri, tomat 1 buah dan buah segar kesukaan satu buah'," +
                "'Telur rebus 2 butir, ham 2 iris atau ayam rebus dan daun selada yang dicampurkan dengan air jeruk lemon atau air jeruk nipis yang dicampur juga dengan 1 sendok makan minyak zaitun'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 18," +
                "'1 gelas kopi atau teh plus gula (tanpa susu) dan roti bakar satu potong'," +
                "'Rebusan telur 1 buah , jus wortel 1 buah dan 60 gram keju'," +
                "'Buah dengan ukuran kecil sebanyak satu kaleng kecil daun selada yang dicampurkan dengan air jeruk lemon atau air jeruk nipis yang dicampur juga dengan 1 sendok makan minyak zaitun dan 1 gelas yoghurt'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 19," +
                "'Parutan atau jus dari wortel dengan ukuran besar lalu tambahkan lemon untuk penyedapnya'," +
                "'Ikan agak besar yang dipepes atau dibakar tanpa bumbu'," +
                "'Daging yang dibakar tanpa bumbu atau direbus 1 potong saja dan daun selada yang dicampurkan dengan air jeruk lemon atau air jeruk nipis yang dicampur dengan 1 sendok makan minyak zaitun dan kukusan daun seledri'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 20," +
                "'1 gelas kopi atau teh plus gula (tanpa susu) dan roti bakar satu potong'," +
                "'Satu buah dada ayam tanpa kulit rebus dan daun selada yang dicampurkan dengan air jeruk lemon atau air jeruk nipis yang dicampur dengan 1 sendok makan minyak zaitun dan lemon'," +
                "'Telur rebus 2 butir saja dan jus wortel'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 21," +
                "'Segelas teh jangan pakai gula'," +
                "'Daging rebus atau daging yang dibakar sebanyak 1 potong dan buah-buahan segar'," +
                "'Puasa makan, namun masih bisa minum air putih dalam jumlah banyak'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 22," +
                "'1 gelas kopi atau teh plus gula (tanpa susu)'," +
                "'Telur rebus 2 butir dan 1 tomat dikombinasi dengan rebusan bayam'," +
                "'Daging bakar tanpa kulit sebanyak 150 gram yang dikombinasikan daun selada yang dicampur dengan air jeruk lemon atau air jeruk nipis yang dicampur dengan 1 sendok makan minyak zaitun'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 23," +
                "'1 gelas kopi atau teh plus gula (tanpa susu)'," +
                "'Daging bakar atau daging rebus satu potong dan daun selada yang dicampurkan dengan air jeruk lemon atau jeruk nipis yang dicampur dengan 1 sendok makan minyak zaitun dan juga 1 buah segar'," +
                "'Daging ayam yang direbus tanpa bumbu dan yoghurt 1 gelas'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 24," +
                "'1 gelas kopi atau teh plus gula (tanpa susu) dan roti bakar satu potong'," +
                "'Kukusan daun seledri, tomat 1 buah dan buah segar kesukaan satu buah'," +
                "'Telur rebus 2 butir, ham 2 iris atau ayam rebus dan daun selada yang dicampurkan dengan air jeruk lemon atau air jeruk nipis yang dicampur juga dengan 1 sendok makan minyak zaitun'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 25," +
                "'1 gelas kopi atau teh plus gula (tanpa susu) dan roti bakar satu potong'," +
                "'Rebusan telur 1 buah , jus wortel 1 buah dan 60 gram keju'," +
                "'Buah dengan ukuran kecil sebanyak satu kaleng kecil daun selada yang dicampurkan dengan air jeruk lemon atau air jeruk nipis yang dicampur juga dengan 1 sendok makan minyak zaitun dan 1 gelas yoghurt'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 26," +
                "'Parutan atau jus dari wortel dengan ukuran besar lalu tambahkan lemon untuk penyedapnya'," +
                "'Ikan agak besar yang dipepes atau dibakar tanpa bumbu'," +
                "'Daging yang dibakar tanpa bumbu atau direbus 1 potong saja dan daun selada yang dicampurkan dengan air jeruk lemon atau air jeruk nipis yang dicampur dengan 1 sendok makan minyak zaitun dan kukusan daun seledri'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 27," +
                "'1 gelas kopi atau teh plus gula (tanpa susu) dan roti bakar satu potong'," +
                "'Satu buah dada ayam tanpa kulit rebus dan daun selada yang dicampurkan dengan air jeruk lemon atau air jeruk nipis yang dicampur dengan 1 sendok makan minyak zaitun dan lemon'," +
                "'Telur rebus 2 butir saja dan jus wortel'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 28," +
                "'Mulai normal ke menu makanan yang biasa dikonsumsi. Dianjurkan kurangi makanan yang menganduk banyak gula dan lemak'," +
                "'Mulai normal ke menu makanan yang biasa dikonsumsi. Dianjurkan kurangi makanan yang menganduk banyak gula dan lemak'," +
                "'Mulai normal ke menu makanan yang biasa dikonsumsi. Dianjurkan kurangi makanan yang menganduk banyak gula dan lemak'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 29," +
                "'Mulai normal ke menu makanan yang biasa dikonsumsi. Dianjurkan kurangi makanan yang menganduk banyak gula dan lemak'," +
                "'Mulai normal ke menu makanan yang biasa dikonsumsi. Dianjurkan kurangi makanan yang menganduk banyak gula dan lemak'," +
                "'Mulai normal ke menu makanan yang biasa dikonsumsi. Dianjurkan kurangi makanan yang menganduk banyak gula dan lemak'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "1, 30," +
                "'Mulai normal ke menu makanan yang biasa dikonsumsi. Dianjurkan kurangi makanan yang menganduk banyak gula dan lemak'," +
                "'Mulai normal ke menu makanan yang biasa dikonsumsi. Dianjurkan kurangi makanan yang menganduk banyak gula dan lemak'," +
                "'Mulai normal ke menu makanan yang biasa dikonsumsi. Dianjurkan kurangi makanan yang menganduk banyak gula dan lemak'," +
                "'-');");

        //program diet food combining
        db.execSQL("insert into data_program values (" +
                "2, 1," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Nasi dan Sop sayuran kacang merah dan Perkedel kentang dan Yogurt polos'," +
                "'Ayam jahe dan Muntahu dan Tumis sayur kombinasi'," +
                "'-');");
        db.execSQL("insert into data_program values (" +
                "2, 2," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Nasi dan Soto tanpa daging dan Perkedel Jagung dan ¾ gelas susu kedelai'," +
                "'Filet dada ayam goreng dan Salad sayuran dan Saus thousand island'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "2, 3," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Siomay dan Kentang dan Tahu dan Sup sayuran dan Pangsit isi sayuran dan Segelas kacang yang disangrai'," +
                "'Tim ikan dan Sayur rebus dan salad mentimun'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "2, 4," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Gado-gado lontong dan Kerupuk dan ¾ gelas susu kedelai'," +
                "'Nasi dan Bokcoy tumis dan Tahu goreng'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "2, 5," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Filet bumbu bali dan Urap sayur dan Kerupuk kembang tahu dan yogurt'," +
                "'Mi kuah jamur dan Selada + Salad sayuran'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "2, 6," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Nasi dan Sop sayuran kacang merah dan Perkedel kentang dan Yogurt polos'," +
                "'Ayam jahe dan Muntahu dan Tumis sayur kombinasi'," +
                "'-');");
        db.execSQL("insert into data_program values (" +
                "2, 7," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Nasi dan Soto tanpa daging dan Perkedel Jagung dan ¾ gelas susu kedelai'," +
                "'Filet dada ayam goreng dan Salad sayuran dan Saus thousand island'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "2, 8," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Siomay dan Kentang dan Tahu dan Sup sayuran dan Pangsit isi sayuran dan Segelas kacang yang disangrai'," +
                "'Tim ikan dan Sayur rebus dan salad mentimun'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "2, 9," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Gado-gado lontong dan Kerupuk dan ¾ gelas susu kedelai'," +
                "'Nasi dan Bokcoy tumis dan Tahu goreng'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "2, 10," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Filet bumbu bali dan Urap sayur dan Kerupuk kembang tahu dan yogurt'," +
                "'Mi kuah jamur dan Selada + Salad sayuran'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "2, 11," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Nasi dan Sop sayuran kacang merah dan Perkedel kentang dan Yogurt polos'," +
                "'Ayam jahe dan Muntahu dan Tumis sayur kombinasi'," +
                "'-');");
        db.execSQL("insert into data_program values (" +
                "2, 12," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Nasi dan Soto tanpa daging dan Perkedel Jagung dan ¾ gelas susu kedelai'," +
                "'Filet dada ayam goreng dan Salad sayuran dan Saus thousand island'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "2, 13," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Siomay dan Kentang dan Tahu dan Sup sayuran dan Pangsit isi sayuran dan Segelas kacang yang disangrai'," +
                "'Tim ikan dan Sayur rebus dan salad mentimun'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "2, 14," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Gado-gado lontong dan Kerupuk dan ¾ gelas susu kedelai'," +
                "'Nasi dan Bokcoy tumis dan Tahu goreng'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "2, 15," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Filet bumbu bali dan Urap sayur dan Kerupuk kembang tahu dan yogurt'," +
                "'Mi kuah jamur dan Selada + Salad sayuran'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "2, 16," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Nasi dan Sop sayuran kacang merah dan Perkedel kentang dan Yogurt polos'," +
                "'Ayam jahe dan Muntahu dan Tumis sayur kombinasi'," +
                "'-');");
        db.execSQL("insert into data_program values (" +
                "2, 17," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Nasi dan Soto tanpa daging dan Perkedel Jagung dan ¾ gelas susu kedelai'," +
                "'Filet dada ayam goreng dan Salad sayuran dan Saus thousand island'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "2, 18," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Siomay dan Kentang dan Tahu dan Sup sayuran dan Pangsit isi sayuran dan Segelas kacang yang disangrai'," +
                "'Tim ikan dan Sayur rebus dan salad mentimun'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "2, 19," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Gado-gado lontong dan Kerupuk dan ¾ gelas susu kedelai'," +
                "'Nasi dan Bokcoy tumis dan Tahu goreng'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "2, 20," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Filet bumbu bali dan Urap sayur dan Kerupuk kembang tahu dan yogurt'," +
                "'Mi kuah jamur dan Selada + Salad sayuran'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "2, 21," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Nasi dan Sop sayuran kacang merah dan Perkedel kentang dan Yogurt polos'," +
                "'Ayam jahe dan Muntahu dan Tumis sayur kombinasi'," +
                "'-');");
        db.execSQL("insert into data_program values (" +
                "2, 22," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Nasi dan Soto tanpa daging dan Perkedel Jagung dan ¾ gelas susu kedelai'," +
                "'Filet dada ayam goreng dan Salad sayuran dan Saus thousand island'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "2, 23," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Siomay dan Kentang dan Tahu dan Sup sayuran dan Pangsit isi sayuran dan Segelas kacang yang disangrai'," +
                "'Tim ikan dan Sayur rebus dan salad mentimun'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "2, 24," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Gado-gado lontong dan Kerupuk dan ¾ gelas susu kedelai'," +
                "'Nasi dan Bokcoy tumis dan Tahu goreng'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "2, 25," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Filet bumbu bali dan Urap sayur dan Kerupuk kembang tahu dan yogurt'," +
                "'Mi kuah jamur dan Selada + Salad sayuran'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "2, 26," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Nasi dan Sop sayuran kacang merah dan Perkedel kentang dan Yogurt polos'," +
                "'Ayam jahe dan Muntahu dan Tumis sayur kombinasi'," +
                "'-');");
        db.execSQL("insert into data_program values (" +
                "2, 27," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Nasi dan Soto tanpa daging dan Perkedel Jagung dan ¾ gelas susu kedelai'," +
                "'Filet dada ayam goreng dan Salad sayuran dan Saus thousand island'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "2, 28," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Siomay dan Kentang dan Tahu dan Sup sayuran dan Pangsit isi sayuran dan Segelas kacang yang disangrai'," +
                "'Tim ikan dan Sayur rebus dan salad mentimun'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "2, 29," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Gado-gado lontong dan Kerupuk dan ¾ gelas susu kedelai'," +
                "'Nasi dan Bokcoy tumis dan Tahu goreng'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "2, 30," +
                "'1-2 Gelas air putih dan Perasan jeruk nipis / lemon dan Buah segar / jus segar'," +
                "'Filet bumbu bali dan Urap sayur dan Kerupuk kembang tahu dan yogurt'," +
                "'Mi kuah jamur dan Selada + Salad sayuran'," +
                "'-');");

        //program diet paleo
        db.execSQL("insert into data_program values (" +
                "3, 1," +
                "'Telur rebus (2 butir), teh hijau'," +
                "'Dada ayam panggang tanpa kulit + tomat, wortel kukut, apel (satu buah)'," +
                "'Ikan panggang atau daging merah, salad sayuran dengan minyak zaitun, brokoli kukus, buah beri dan segenggam kacang almond'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "3, 2," +
                "'Omelet Paleo (telur, tuna, sedikit mayo, bawang bombay, dan daun parsley)'," +
                "'Salad sayuran dengan daging favorit anda yang tanpa lemak (daging ayam atau sapi)'," +
                "'Salmon panggang dan brokoli'," +
                "'Potongan apel dengan almond butter');");

        db.execSQL("insert into data_program values (" +
                "3, 3," +
                "'Pancake pisang'," +
                "'Sup ayam'," +
                "'Red curry chicken'," +
                "'Paleo trail mix (campuran kacang mede sangrai, kismis, chocolate chip, biji labu, dan sedikit garam)');");

        db.execSQL("insert into data_program values (" +
                "3, 4," +
                "'Brocolli egg bake'," +
                "'Tuna avocado lettuce wrap (tuna, alpukat, dan daun selada)'," +
                "'Almond crusted chicken (dada ayam dilapisi remahan kacang almond)'," +
                "'Kale chips');");

        db.execSQL("insert into data_program values (" +
                "3, 5," +
                "'Telur rebus, bayam kukus, daging asap, dan tomat potong'," +
                "'Tom zucchini, olive, salad'," +
                "'Tuna patty (almond, bawang bombay, tuna kaleng, perasan lemon, tepung kelapa, dan taburan kacang almond)'," +
                "'Pisang');");

        db.execSQL("insert into data_program values (" +
                "3, 6," +
                "'Granola, telur rebus'," +
                "'Paleo salad – ubi jalar rebus, alpukat, kacang sangrai, paprika merah, toge, daun parsley. Campur dengan minyak zaitun'," +
                "'Fillet ikan dan jamur. Masak dengan menggunakan minyak zaitun'," +
                "'Kacang mede sangrai, coklat potong kecil-kecil');");

        db.execSQL("insert into data_program values (" +
                "3, 7," +
                "'Ubi jalar atau talas rebus'," +
                "'Salad dada ayam kukus yang dicampur dengan daun kemangi, lada hitam, siram dengan minyak zaitun'," +
                "'Steak daging, wortel rebus, bunga kol'," +
                "'Pisang dan pepaya potong');");

        db.execSQL("insert into data_program values (" +
                "3, 8," +
                "'Telur rebus (2 butir), teh hijau'," +
                "'Dada ayam panggang tanpa kulit + tomat, wortel kukut, apel (satu buah)'," +
                "'Ikan panggang atau daging merah, salad sayuran dengan minyak zaitun, brokoli kukus, buah beri dan segenggam kacang almond'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "3, 9," +
                "'Omelet Paleo (telur, tuna, sedikit mayo, bawang bombay, dan daun parsley)'," +
                "'Salad sayuran dengan daging favorit anda yang tanpa lemak (daging ayam atau sapi)'," +
                "'Salmon panggang dan brokoli'," +
                "'Potongan apel dengan almond butter');");

        db.execSQL("insert into data_program values (" +
                "3, 10," +
                "'Pancake pisang'," +
                "'Sup ayam'," +
                "'Red curry chicken'," +
                "'Paleo trail mix (campuran kacang mede sangrai, kismis, chocolate chip, biji labu, dan sedikit garam)');");

        db.execSQL("insert into data_program values (" +
                "3, 11," +
                "'Brocolli egg bake'," +
                "'Tuna avocado lettuce wrap (tuna, alpukat, dan daun selada)'," +
                "'Almond crusted chicken (dada ayam dilapisi remahan kacang almond)'," +
                "'Kale chips');");

        db.execSQL("insert into data_program values (" +
                "3, 12," +
                "'Telur rebus, bayam kukus, daging asap, dan tomat potong'," +
                "'Tom zucchini, olive, salad'," +
                "'Tuna patty (almond, bawang bombay, tuna kaleng, perasan lemon, tepung kelapa, dan taburan kacang almond)'," +
                "'Pisang');");

        db.execSQL("insert into data_program values (" +
                "3, 13," +
                "'Granola, telur rebus'," +
                "'Paleo salad – ubi jalar rebus, alpukat, kacang sangrai, paprika merah, toge, daun parsley. Campur dengan minyak zaitun'," +
                "'Fillet ikan dan jamur. Masak dengan menggunakan minyak zaitun'," +
                "'Kacang mede sangrai, coklat potong kecil-kecil');");

        db.execSQL("insert into data_program values (" +
                "3, 14," +
                "'Ubi jalar atau talas rebus'," +
                "'Salad dada ayam kukus yang dicampur dengan daun kemangi, lada hitam, siram dengan minyak zaitun'," +
                "'Steak daging, wortel rebus, bunga kol'," +
                "'Pisang dan pepaya potong');");

        db.execSQL("insert into data_program values (" +
                "3, 15," +
                "'Telur rebus (2 butir), teh hijau'," +
                "'Dada ayam panggang tanpa kulit + tomat, wortel kukut, apel (satu buah)'," +
                "'Ikan panggang atau daging merah, salad sayuran dengan minyak zaitun, brokoli kukus, buah beri dan segenggam kacang almond'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "3, 16," +
                "'Omelet Paleo (telur, tuna, sedikit mayo, bawang bombay, dan daun parsley)'," +
                "'Salad sayuran dengan daging favorit anda yang tanpa lemak (daging ayam atau sapi)'," +
                "'Salmon panggang dan brokoli'," +
                "'Potongan apel dengan almond butter');");

        db.execSQL("insert into data_program values (" +
                "3, 17," +
                "'Pancake pisang'," +
                "'Sup ayam'," +
                "'Red curry chicken'," +
                "'Paleo trail mix (campuran kacang mede sangrai, kismis, chocolate chip, biji labu, dan sedikit garam)');");

        db.execSQL("insert into data_program values (" +
                "3, 18," +
                "'Brocolli egg bake'," +
                "'Tuna avocado lettuce wrap (tuna, alpukat, dan daun selada)'," +
                "'Almond crusted chicken (dada ayam dilapisi remahan kacang almond)'," +
                "'Kale chips');");

        db.execSQL("insert into data_program values (" +
                "3, 19," +
                "'Telur rebus, bayam kukus, daging asap, dan tomat potong'," +
                "'Tom zucchini, olive, salad'," +
                "'Tuna patty (almond, bawang bombay, tuna kaleng, perasan lemon, tepung kelapa, dan taburan kacang almond)'," +
                "'Pisang');");

        db.execSQL("insert into data_program values (" +
                "3, 20," +
                "'Granola, telur rebus'," +
                "'Paleo salad – ubi jalar rebus, alpukat, kacang sangrai, paprika merah, toge, daun parsley. Campur dengan minyak zaitun'," +
                "'Fillet ikan dan jamur. Masak dengan menggunakan minyak zaitun'," +
                "'Kacang mede sangrai, coklat potong kecil-kecil');");

        db.execSQL("insert into data_program values (" +
                "3, 21," +
                "'Ubi jalar atau talas rebus'," +
                "'Salad dada ayam kukus yang dicampur dengan daun kemangi, lada hitam, siram dengan minyak zaitun'," +
                "'Steak daging, wortel rebus, bunga kol'," +
                "'Pisang dan pepaya potong');");

        db.execSQL("insert into data_program values (" +
                "3, 22," +
                "'Telur rebus (2 butir), teh hijau'," +
                "'Dada ayam panggang tanpa kulit + tomat, wortel kukut, apel (satu buah)'," +
                "'Ikan panggang atau daging merah, salad sayuran dengan minyak zaitun, brokoli kukus, buah beri dan segenggam kacang almond'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "3, 23," +
                "'Omelet Paleo (telur, tuna, sedikit mayo, bawang bombay, dan daun parsley)'," +
                "'Salad sayuran dengan daging favorit anda yang tanpa lemak (daging ayam atau sapi)'," +
                "'Salmon panggang dan brokoli'," +
                "'Potongan apel dengan almond butter');");

        db.execSQL("insert into data_program values (" +
                "3, 24," +
                "'Pancake pisang'," +
                "'Sup ayam'," +
                "'Red curry chicken'," +
                "'Paleo trail mix (campuran kacang mede sangrai, kismis, chocolate chip, biji labu, dan sedikit garam)');");

        db.execSQL("insert into data_program values (" +
                "3, 25," +
                "'Brocolli egg bake'," +
                "'Tuna avocado lettuce wrap (tuna, alpukat, dan daun selada)'," +
                "'Almond crusted chicken (dada ayam dilapisi remahan kacang almond)'," +
                "'Kale chips');");

        db.execSQL("insert into data_program values (" +
                "3, 26," +
                "'Telur rebus, bayam kukus, daging asap, dan tomat potong'," +
                "'Tom zucchini, olive, salad'," +
                "'Tuna patty (almond, bawang bombay, tuna kaleng, perasan lemon, tepung kelapa, dan taburan kacang almond)'," +
                "'Pisang');");

        db.execSQL("insert into data_program values (" +
                "3, 27," +
                "'Granola, telur rebus'," +
                "'Paleo salad – ubi jalar rebus, alpukat, kacang sangrai, paprika merah, toge, daun parsley. Campur dengan minyak zaitun'," +
                "'Fillet ikan dan jamur. Masak dengan menggunakan minyak zaitun'," +
                "'Kacang mede sangrai, coklat potong kecil-kecil');");

        db.execSQL("insert into data_program values (" +
                "3, 28," +
                "'Ubi jalar atau talas rebus'," +
                "'Salad dada ayam kukus yang dicampur dengan daun kemangi, lada hitam, siram dengan minyak zaitun'," +
                "'Steak daging, wortel rebus, bunga kol'," +
                "'Pisang dan pepaya potong');");

        db.execSQL("insert into data_program values (" +
                "3, 29," +
                "'Mulai normal ke menu makanan yang biasa dikonsumsi'," +
                "'Mulai normal ke menu makanan yang biasa dikonsumsi'," +
                "'Mulai normal ke menu makanan yang biasa dikonsumsi'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "3, 30," +
                "'Mulai normal ke menu makanan yang biasa dikonsumsi'," +
                "'Mulai normal ke menu makanan yang biasa dikonsumsi'," +
                "'Mulai normal ke menu makanan yang biasa dikonsumsi'," +
                "'-');");

        //program diet eat cleaning
        db.execSQL("insert into data_program values (" +
                "4, 1," +
                "'Pisang sereal, 1 cangkir sereal dan 1 buah pisang (iris) campurkan dengan susu'," +
                "'Tuna sandwich, potongan tuna, olive oil (atau bisa dengan alpukat yang sudah dihaluskan), greek yogurt, sedikit bawang dan seledri cincang, satu sendok jeruk lemon, campur semuanya. Ambil dua buah roti gandum, taruh adonan tuna ditengahnya'," +
                "'Fillet ayam panggang'," +
                "'Chocolate 100gram, pisang dan selai kacang');");

        db.execSQL("insert into data_program values (" +
                "4, 2," +
                "'Salad buah, Potongan buah dicampur dengan yogurt'," +
                "'Ayam panggang dengan potongan kentang rebus'," +
                "'Dada ayam panggang dan tumis sayuran'," +
                "'1 mangkuk irisan buah');");

        db.execSQL("insert into data_program values (" +
                "4, 3," +
                "'Yogurt Crunch, campurkan satu cangkir sereal, greek yogurt dan irisan buah (bisa strawbery, kiwi, anggur, mangga maupun pisang)'," +
                "'Gado-gado dengan telur rebus'," +
                "'Ikan bakar'," +
                "'2 crackers fat free, pisang dan selai kacang');");

        db.execSQL("insert into data_program values (" +
                "4, 4," +
                "'Banana & Peach Smoothie, peach bisa diganti buah lain sesuai selera'," +
                "'Dada ayam bakar dan mashed potato'," +
                "'Salmon, grilled dengan tumisan sayur'," +
                "'2 buah cracker, 2 buah pisang dan selai kacang');");

        db.execSQL("insert into data_program values (" +
                "4, 5," +
                "'Grape sereal, 1 cangkir sereal, potongan anggur dan susu'," +
                "'Satu mangkok tumis ayam dengan potongan kacang'," +
                "'Siomay'," +
                "'2 crackers fat free, pisang dan selai kacang');");

        db.execSQL("insert into data_program values (" +
                "4, 6," +
                "'Omelette, kocok telur dan susu, tambahkan sedikit mozarela, campurkan dengan potongan tomat. Masak di atas wajan teflon sampai matang'," +
                "'Sop ayam dan kentang rebus'," +
                "'Satu mangkok capcay tanpa nasi'," +
                "'Pisang, selai kacang, minthy smoothie: blend susu, blueberry, mint dan es');");

        db.execSQL("insert into data_program values (" +
                "4, 7," +
                "'Banana & Peach Smoothie, peach bisa diganti buah lain sesuai selera'," +
                "'Ikan bakar, lalapan dan kentang rebus'," +
                "'Steak ayam/sapi'," +
                "'Roti panggang, selai kacang, irisan pisang, dan satu mangkuk irisan buah');");

        db.execSQL("insert into data_program values (" +
                "4, 8," +
                "'Pisang sereal, 1 cangkir sereal dan 1 buah pisang (iris) campurkan dengan susu'," +
                "'Tuna sandwich, potongan tuna, olive oil (atau bisa dengan alpukat yang sudah dihaluskan), greek yogurt, sedikit bawang dan seledri cincang, satu sendok jeruk lemon, campur semuanya. Ambil dua buah roti gandum, taruh adonan tuna ditengahnya'," +
                "'Fillet ayam panggang'," +
                "'Chocolate 100gram, pisang dan selai kacang');");

        db.execSQL("insert into data_program values (" +
                "4, 9," +
                "'Salad buah, Potongan buah dicampur dengan yogurt'," +
                "'Ayam panggang dengan potongan kentang rebus'," +
                "'Dada ayam panggang dan tumis sayuran'," +
                "'1 mangkuk irisan buah');");

        db.execSQL("insert into data_program values (" +
                "4, 10," +
                "'Yogurt Crunch, campurkan satu cangkir sereal, greek yogurt dan irisan buah (bisa strawbery, kiwi, anggur, mangga maupun pisang)'," +
                "'Gado-gado dengan telur rebus'," +
                "'Ikan bakar'," +
                "'2 crackers fat free, pisang dan selai kacang');");

        db.execSQL("insert into data_program values (" +
                "4, 11," +
                "'Banana & Peach Smoothie, peach bisa diganti buah lain sesuai selera'," +
                "'Dada ayam bakar dan mashed potato'," +
                "'Salmon, grilled dengan tumisan sayur'," +
                "'2 buah cracker, 2 buah pisang dan selai kacang');");

        db.execSQL("insert into data_program values (" +
                "4, 12," +
                "'Grape sereal, 1 cangkir sereal, potongan anggur dan susu'," +
                "'Satu mangkok tumis ayam dengan potongan kacang'," +
                "'Siomay'," +
                "'2 crackers fat free, pisang dan selai kacang');");

        db.execSQL("insert into data_program values (" +
                "4, 13," +
                "'Omelette, kocok telur dan susu, tambahkan sedikit mozarela, campurkan dengan potongan tomat. Masak di atas wajan teflon sampai matang'," +
                "'Sop ayam dan kentang rebus'," +
                "'Satu mangkok capcay tanpa nasi'," +
                "'Pisang, selai kacang, minthy smoothie: blend susu, blueberry, mint dan es');");

        db.execSQL("insert into data_program values (" +
                "4, 14," +
                "'Banana & Peach Smoothie, peach bisa diganti buah lain sesuai selera'," +
                "'Ikan bakar, lalapan dan kentang rebus'," +
                "'Steak ayam/sapi'," +
                "'Roti panggang, selai kacang, irisan pisang, dan satu mangkuk irisan buah');");

        db.execSQL("insert into data_program values (" +
                "4, 15," +
                "'Pisang sereal, 1 cangkir sereal dan 1 buah pisang (iris) campurkan dengan susu'," +
                "'Tuna sandwich, potongan tuna, olive oil (atau bisa dengan alpukat yang sudah dihaluskan), greek yogurt, sedikit bawang dan seledri cincang, satu sendok jeruk lemon, campur semuanya. Ambil dua buah roti gandum, taruh adonan tuna ditengahnya'," +
                "'Fillet ayam panggang'," +
                "'Chocolate 100gram, pisang dan selai kacang');");

        db.execSQL("insert into data_program values (" +
                "4, 16," +
                "'Salad buah, Potongan buah dicampur dengan yogurt'," +
                "'Ayam panggang dengan potongan kentang rebus'," +
                "'Dada ayam panggang dan tumis sayuran'," +
                "'1 mangkuk irisan buah');");

        db.execSQL("insert into data_program values (" +
                "4, 17," +
                "'Yogurt Crunch, campurkan satu cangkir sereal, greek yogurt dan irisan buah (bisa strawbery, kiwi, anggur, mangga maupun pisang)'," +
                "'Gado-gado dengan telur rebus'," +
                "'Ikan bakar'," +
                "'2 crackers fat free, pisang dan selai kacang');");

        db.execSQL("insert into data_program values (" +
                "4, 18," +
                "'Banana & Peach Smoothie, peach bisa diganti buah lain sesuai selera'," +
                "'Dada ayam bakar dan mashed potato'," +
                "'Salmon, grilled dengan tumisan sayur'," +
                "'2 buah cracker, 2 buah pisang dan selai kacang');");

        db.execSQL("insert into data_program values (" +
                "4, 19," +
                "'Grape sereal, 1 cangkir sereal, potongan anggur dan susu'," +
                "'Satu mangkok tumis ayam dengan potongan kacang'," +
                "'Siomay'," +
                "'2 crackers fat free, pisang dan selai kacang');");

        db.execSQL("insert into data_program values (" +
                "4, 20," +
                "'Omelette, kocok telur dan susu, tambahkan sedikit mozarela, campurkan dengan potongan tomat. Masak di atas wajan teflon sampai matang'," +
                "'Sop ayam dan kentang rebus'," +
                "'Satu mangkok capcay tanpa nasi'," +
                "'Pisang, selai kacang, minthy smoothie: blend susu, blueberry, mint dan es');");

        db.execSQL("insert into data_program values (" +
                "4, 21," +
                "'Banana & Peach Smoothie, peach bisa diganti buah lain sesuai selera'," +
                "'Ikan bakar, lalapan dan kentang rebus'," +
                "'Steak ayam/sapi'," +
                "'Roti panggang, selai kacang, irisan pisang, dan satu mangkuk irisan buah');");

        db.execSQL("insert into data_program values (" +
                "4, 22," +
                "'Pisang sereal, 1 cangkir sereal dan 1 buah pisang (iris) campurkan dengan susu'," +
                "'Tuna sandwich, potongan tuna, olive oil (atau bisa dengan alpukat yang sudah dihaluskan), greek yogurt, sedikit bawang dan seledri cincang, satu sendok jeruk lemon, campur semuanya. Ambil dua buah roti gandum, taruh adonan tuna ditengahnya'," +
                "'Fillet ayam panggang'," +
                "'Chocolate 100gram, pisang dan selai kacang');");

        db.execSQL("insert into data_program values (" +
                "4, 23," +
                "'Salad buah, Potongan buah dicampur dengan yogurt'," +
                "'Ayam panggang dengan potongan kentang rebus'," +
                "'Dada ayam panggang dan tumis sayuran'," +
                "'1 mangkuk irisan buah');");

        db.execSQL("insert into data_program values (" +
                "4, 24," +
                "'Yogurt Crunch, campurkan satu cangkir sereal, greek yogurt dan irisan buah (bisa strawbery, kiwi, anggur, mangga maupun pisang)'," +
                "'Gado-gado dengan telur rebus'," +
                "'Ikan bakar'," +
                "'2 crackers fat free, pisang dan selai kacang');");

        db.execSQL("insert into data_program values (" +
                "4, 25," +
                "'Banana & Peach Smoothie, peach bisa diganti buah lain sesuai selera'," +
                "'Dada ayam bakar dan mashed potato'," +
                "'Salmon, grilled dengan tumisan sayur'," +
                "'2 buah cracker, 2 buah pisang dan selai kacang');");

        db.execSQL("insert into data_program values (" +
                "4, 26," +
                "'Grape sereal, 1 cangkir sereal, potongan anggur dan susu'," +
                "'Satu mangkok tumis ayam dengan potongan kacang'," +
                "'Siomay'," +
                "'2 crackers fat free, pisang dan selai kacang');");

        db.execSQL("insert into data_program values (" +
                "4, 27," +
                "'Omelette, kocok telur dan susu, tambahkan sedikit mozarela, campurkan dengan potongan tomat. Masak di atas wajan teflon sampai matang'," +
                "'Sop ayam dan kentang rebus'," +
                "'Satu mangkok capcay tanpa nasi'," +
                "'Pisang, selai kacang, minthy smoothie: blend susu, blueberry, mint dan es');");

        db.execSQL("insert into data_program values (" +
                "4, 28," +
                "'Banana & Peach Smoothie, peach bisa diganti buah lain sesuai selera'," +
                "'Ikan bakar, lalapan dan kentang rebus'," +
                "'Steak ayam/sapi'," +
                "'Roti panggang, selai kacang, irisan pisang, dan satu mangkuk irisan buah');");

        db.execSQL("insert into data_program values (" +
                "4, 29," +
                "'Mulai normal ke menu makanan yang biasa dikonsumsi'," +
                "'Mulai normal ke menu makanan yang biasa dikonsumsi'," +
                "'Mulai normal ke menu makanan yang biasa dikonsumsi'," +
                "'-');");

        db.execSQL("insert into data_program values (" +
                "4, 30," +
                "'Mulai normal ke menu makanan yang biasa dikonsumsi'," +
                "'Mulai normal ke menu makanan yang biasa dikonsumsi'," +
                "'Mulai normal ke menu makanan yang biasa dikonsumsi'," +
                "'-');");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
