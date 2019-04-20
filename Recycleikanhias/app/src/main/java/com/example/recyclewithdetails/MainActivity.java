package com.example.recyclewithdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private String title = "Mode List";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    private ArrayList<String> gambarUrls = new ArrayList<>();
    private ArrayList<String> penjelasan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:started.");
        initImageBitmaps();
    }

    private void initImageBitmaps() {
        gambarUrls.add("https://wanipira.com/wp-content/uploads/2018/03/lohan-1024x704.jpeg");
        mNames.add("LOUHAN EXHOTIS");
        mDesc.add("Ikan Hias yang sangat elegant");
        penjelasan.add("Ikan hias Louhan pernah sangat populer di tahun 2000-an. Ikan ini sangat cocok dijadikan sebagai ikan hias air tawar aquarium. Diantara ciri khas ikan ini adalah memiliki benjolan besar dikepalanya. Ikan hias Louhan bukanlah ikan hias murni yang memiliki bentuk fisik indah dengan sendirinya. Ikan ini adalah hasil dari perkawinan silang antara ikan-ikan Cichlid yang berasal dari Amerika.\n" +
                "\n" +
                "Dari hasil persilangan itu didapat beberapa jenis ikan Louhan yang ada seperti saat ini, diantaranya adalah Chencu/ Zhen Zhu yang merupakan hasil persilangan dari Trimac Cichlid, Kamfa hasil persilangan dari genus Vieja, dan Red Texas louhan hasil dari persilangan antara Kingkong Parrots dan Green Texas Cichlid.");

        gambarUrls.add("https://i2.wp.com/gdmorganic.com/wp-content/uploads/2017/05/Keindahan-warna-ikan-koi.jpg?fit=750%2C600&ssl=1");
        mNames.add("Koi");
        mDesc.add("Ikan Keberuntungan");
        penjelasan.add("Ikan hias Koi adalah ikan hias yang sangat populer dikalangan pecinta ikan hias air tawar aquarium. Ikan ini memiliki warna corak yang sangat indah, lebih-lebih jika dilihat dari atas, keindahannya akan semakin jelas terlihat. Ikan hias koi biasanya dipelihara dalam kolam, namun tak ada salahnya memeliharanya dalam aquarium. Ikan hias Koi tetap terlihat indah walau dilihat dari samping, karena keindahan ikan Koi terpancar dari segala arah dan sudut.");

        gambarUrls.add("https://i1.wp.com/www.hewan.id/wp-content/uploads/2017/12/Ikan-Koki-Mutiara.jpg?resize=800%2C575&ssl=1");
        mNames.add("Ikan Hias Wakin");
        mDesc.add("Ikan yang sangat menggemaskan");
        penjelasan.add("Ikan hias Wakin ini masih termasuk dalam golongan ikan mas biasa. Orang-orang Jepang menamakannya Wakin karena bentuk fisiknya belum banyak berubah layaknya Karper Krusian yang merupakan cikal bakal ikan Mas Koki. Jika Karper Krusian bentuknya memanjang dan langsing, maka ikan Wakin memiliki bentuk yang agak bundar dan memiliki ekor yang lebih lebar dan panjang.\n" +
                "\n" +
                "Diantara ciri khas ikan hias Wakin adalah memiliki gerakan yang lincah dan atraktif. Oleh sebab itu ikan Wakin akan kurang cocok jika dikumpulkan dengan ikan Mas Koki type lain yang gerakannya cenderung lamban dan tenang seperti Koki Tosa (Veiltail) dan Kepala Singa (Lion Head).");

        gambarUrls.add("https://tanahkaya.com/wp-content/uploads/2019/03/Ikan-Komet.jpg");
        mNames.add("Ikan Hias Komet");
        mDesc.add("Ikan yang sangat di sukai karna mudah di pelihara");
        penjelasan.add("Ikan hias Komet adalah salah satu ikan hias air tawar aquarium yang sudah populer di kalangan para pecinta ikan hias. Bahkan, mereka dari yang sekedar hoby, banyak juga yang kemudian mengkomersilkannya. Hal ini karena ikan hias Komet memiliki daya tarik yang kuat dengan warna tubuhnya yang indah serta mempunyai gerakan mempesona. Ikan hias Komet juga dikenal sangat ramah lingkungan karena bisa hidup berdampingan dengan jenis ikan lain dalam satu tempat.\n" +
                "\n" +
                "Selain ituikan hias Komet juga mudah dalam menyesuaikan diri dengan lingkungan barunya, oleh sebab itu ikan ini dapat dipelihara hampir di semua tempat asalkan tempatnya bersih dan sehat. Diantara kelebihan ikan hias air tawar aquariam ini adalah memiliki warna tubuh yang bermacam-macam seperti kuning, merah, putih, dan perpaduan dari warna-warna tersebut.");

        gambarUrls.add("https://i.ytimg.com/vi/vyfvQ5jDSaA/maxresdefault.jpg");
        mNames.add("Ikan Cupang Hias / Betta");
        mDesc.add("Ikan hias yang sangat cantik dengan berbagai warna dan corak");
        penjelasan.add("Ikan Cupang Hias / Betta dikenal sebagai ikan petarung. Pada Cupang jantan memiliki warna yang lebih banyak dan beragam dibanding dengan Betta betina. Ada banyak ragam warna yang ada pada ikan Betta ini diantara hitam, merah putih, kuning, ungu, dan biru. Terkadang ada juga yang memiliki warna monokrom dengan dua atau lebih gradasi. Ikan tampak begitu indah saat berenang dengan sirip yang panjang dan lebar menjuntai. Salah satu keistimewan ikan ini bisa memiliki umur yang panjang.");

        gambarUrls.add("https://bahasikan.com/wp-content/uploads/2017/11/z4.jpg");
        mNames.add("Ikan Arwana Super Red");
        mDesc.add("Ikan yang sangat tingga harga jualnya");
        penjelasan.add("Jenis Arwana merupakan salah satu ikan hias yang masih populer sampai saat ini. Bahkan ada yang mengatakan kalau ikan hias arwana tidak akan pernah menurun peminatnya. Sisiknya yang unik dapat memikat siapa saja yang melihat ikat hias ini. Ikan hias arwana mempunyai ukuran tubuh yang besar, bahkan bisa mencapai hampir 1 meter.\n" +
                "Ukuran telurnya yang besar dan hampir mirip dengan telur puyuh menjadikannya termasuk dalam golongan ikan purba. Ikan hias arwana memiliki banyak sebutan lain seperti arwana super red, silok, ikan payang, kalasa, siluk,naga, khayangan dan nama latin Scleropages sp.Ikan hias arwana dapat kita jumpai pada perairan tawar di daerah Kalimantan dan Papua. Namun untuk saat ini jenis ikan arwana sudah banyak yang membudidayaknnnya, karena harga dan peminatnya yang tergolong tinggi.\n" +
                "\n" +
                "Oh iya ikan hias jenis arwana ini juga mempunyai mitos yang beredar di masyarakat bahwa apabila memelihara ikan hias arwana dapat memberikan kelancaran rezeki. Namun wajib di ingat ya, bahwa sang pemberi rezeki hanya satu, Dialah Allah Tuhan semesta alam.");

        gambarUrls.add("https://i1.wp.com/masbidin.net/wp-content/uploads/2016/09/ikan-maskoki-ikanhiasmaskoki-blogspot-dot-com.jpg?resize=768%2C511&ssl=1");
        mNames.add("Ikan Hias Mas Koki");
        mDesc.add("Ikan yang menggemaskan");
        penjelasan.add("Ikan hias jenis maskoki berasal dari China yang dipopulerkan oleh masyarakat Jepang. Pada awalnya ikan hias jenis maskoki memiliki bentuk tubuh yang mirip dengan ikan mas yang merupakan satu spesies. Kemudian masyarakat Jepang yang mengembangkan ikan hias maskoki banyak variasi warna dan bentuk menjadi lebih cantik dari sebelumnya.\n" +
                "Ikan hias maskoki termasuk jenis ikan hias yang mudah dipelihara dan di budidayakan di rumah. Namun ikan hias ini merupakan ikan ekslusif yang tidak mau di pelihara dengan selain ikan hias jenis maskoki karena membutuhkan banyak oksigen untuk bertahan hidup.\n" +
                "\n" +
                "Jenis ikan hias ini sudah familiar di telinga kita karena banyak dari masyarakat kita yang memeliharanya sebagai ikan hias. Ikan maskoki memiliki gerakan tubuh yang lucu disebabkan bentuk badannya yang penuh namun tetap seimbang.");

        gambarUrls.add("https://i1.wp.com/masbidin.net/wp-content/uploads/2016/09/angel-fish-atau-manfish-akuariumhias-dot-blogspot-dot-com.jpeg?resize=768%2C510&ssl=1");
        mNames.add("Ikan Hias Manfish");
        mDesc.add("Ikan hias yang bentuknya sangat menarik");
        penjelasan.add("Ikan Manfish termasuk dalam keluarga Chiclidae. Sebutan lain dari manfish ini ialah angle fish karena warna elegan dan betuknya yang menarik. Manfish merupakan ikan yang membuat perlindungan dan melindungi keturunannya.\n" +
                "Untuk menjadikan manfish sebagai induk ikan harus menunggunya setelah berumur 7 bulan dengan panjang kira-kira 7,5 cm. Agar hasil budidaya maksimal, induk harus di pelihara dengan baik.\n" +
                "\n" +
                "Caranya dengan memberinya makan jentik nyamuk, cacing tubifex atau chironomous. Tidak hanya itu, lemahnya induk terhadap serangan penyakit membuatnya harus di berikan obat Oxytetracycline dan garam secara periodik.");

        gambarUrls.add("https://i0.wp.com/masbidin.net/wp-content/uploads/2016/09/lemon_peel_angle_fish_spacetouristmarv-deviantart-com.jpg?resize=768%2C487&ssl=1");
        mNames.add("Ikan Hias Lemon");
        mDesc.add("Ikan hias yang berwarna kuning seperti buah lemon");
        penjelasan.add("Sesuai dengan namanya, ikan hias jenis lemon ini memilki warna tubuh yang dominan dengan warna seperti buah jeruk lemon masak. Untuk ikan lemon yang sudah dewasa, bagian ujung sirip atas akan terlihat warna hitam.\n" +
                "Di sarankan pemeliharaan ikan hias jenis lemon ini tidak di gabung dengan ikan jenis lainnya karena ikan lemon inni termasuk ikan yang agrseif.");

        gambarUrls.add("https://i1.wp.com/masbidin.net/wp-content/uploads/2016/09/Red-Finned-Shark-aquaticmag-com.jpg?resize=768%2C516&ssl=1");
        mNames.add("Ikan hias Red Finned Shark");
        mDesc.add(" ikan dasar yang memiliki habitat asal di Sungai Mekong");
        penjelasan.add("Ikan hias jenis Red Finned Shark atau nama latinnya Ephalzaerhynchus frenatus adalah ikan dasar yang memiliki habitat asal di Sungai Mekong, Thailand. Ikan hias yang indah dengan warna cokelat hitam atau putih albino pada tubuhnya ini termasuk pemakan omnivora. Selain itu sirip-sirip merah terangnya membuatnya lebih indah dan menarik.\n" +
                "\n" +
                "Red finned shark ini dapat bertahan hidup pada suhu ideal pemeliharaan antara 26-28 derajat celcius. Apabila kita memeliharanya di dalam akuarium, biasanya dinding-dinding akuarium akan bersih dari lumut. Hal ini karena pada habitat aslinya red finned shark suka memakan lumut.\n" +
                "\n" +
                "Sifat dari red finned shark ini adalah pemalu dan suka bersembunyi pada siang hari sehingga lebih sering keluar pada malam hari untuk mencari makanan.");







        initRecyclerView();

    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecycleViewAdapter adapter = new RecycleViewAdapter(this, mNames, gambarUrls, mDesc, penjelasan);
        recyclerView.setAdapter(adapter);
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, mNames, gambarUrls, mDesc, penjelasan);
        recyclerView.setAdapter(adapter);

    }

    private void showRecyclerGrid() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        GridActivity adapter = new GridActivity(this, mNames, gambarUrls, mDesc, penjelasan);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_list:
                setActionBarTitle("Mode List");
                showRecyleList();
                break;
            case R.id.action_grid:
                setActionBarTitle("Mode Grid");
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                setActionBarTitle("Mode Card View");
                initRecyclerView();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);

    }
}