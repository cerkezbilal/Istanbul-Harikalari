package com.bilalkarademir.stanbulharikalar;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends menuActivity {
    ListView liste;
    ArrayList<String> mekanListesi;
    ArrayList<Bitmap> resimListesi;
    ArrayList<String> mekanicerikListesi;
    ArrayList<String> mekanulasimListesi;
    ArrayList<String> mekankonumListesi;
    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        ListeOlustur();


    }

    public void ListeOlustur(){

        mekanListesi = new ArrayList<>();
        mekanicerikListesi = new ArrayList<>();
        mekanulasimListesi = new ArrayList<>();
        mekankonumListesi = new ArrayList<>();
        resimListesi = new ArrayList<>();




        Bitmap Adalar = BitmapFactory.decodeResource(context.getResources(),R.drawable.adalar);
        Bitmap AnadoluHisari = BitmapFactory.decodeResource(context.getResources(),R.drawable.anadoluhisari);
        Bitmap Ayasofya = BitmapFactory.decodeResource(context.getResources(),R.drawable.ayasofya);
        Bitmap BakircilarCarsisi = BitmapFactory.decodeResource(context.getResources(),R.drawable.bakircilarcarsisi);
        Bitmap Beylerbeyi = BitmapFactory.decodeResource(context.getResources(),R.drawable.beylerbeyisarayi);
        Bitmap Cafer = BitmapFactory.decodeResource(context.getResources(),R.drawable.caferaga);
        Bitmap Ciragan = BitmapFactory.decodeResource(context.getResources(),R.drawable.ciragan);
        Bitmap Dolmabahce = BitmapFactory.decodeResource(context.getResources(),R.drawable.dolmabahce);
        Bitmap Eyüp = BitmapFactory.decodeResource(context.getResources(),R.drawable.eyupsultan);
        Bitmap Gulhane = BitmapFactory.decodeResource(context.getResources(),R.drawable.gulhane);
        Bitmap Haseki = BitmapFactory.decodeResource(context.getResources(),R.drawable.hasekisultan);
        Bitmap Hidiv = BitmapFactory.decodeResource(context.getResources(),R.drawable.hidiv);
        Bitmap Kapalicarsi = BitmapFactory.decodeResource(context.getResources(),R.drawable.kapalicarsi);
        Bitmap kizkulesi = BitmapFactory.decodeResource(context.getResources(),R.drawable.kizkulesi);
        Bitmap misir = BitmapFactory.decodeResource(context.getResources(),R.drawable.misircarsisi);
        Bitmap Miniatürk = BitmapFactory.decodeResource(context.getResources(),R.drawable.miniaturk);
        Bitmap Rumeli = BitmapFactory.decodeResource(context.getResources(),R.drawable.rumelihisari);
        Bitmap Soguk = BitmapFactory.decodeResource(context.getResources(),R.drawable.sogukcesme);
        Bitmap SultanAhmet = BitmapFactory.decodeResource(context.getResources(),R.drawable.sultanahmetsarnici);
        Bitmap SultanAhmetcami = BitmapFactory.decodeResource(context.getResources(),R.drawable.sultanahmetcamisi);
        Bitmap Suleymaniye = BitmapFactory.decodeResource(context.getResources(),R.drawable.suleymaniyehamami);
        Bitmap Tekfur = BitmapFactory.decodeResource(context.getResources(),R.drawable.tekfursarayi);
        Bitmap Topkapi = BitmapFactory.decodeResource(context.getResources(),R.drawable.topkapisarayi);
        Bitmap Yedikule = BitmapFactory.decodeResource(context.getResources(),R.drawable.yedikulehisari);
        Bitmap Yerebatan = BitmapFactory.decodeResource(context.getResources(),R.drawable.yerebatan);
        Bitmap Yildiz = BitmapFactory.decodeResource(context.getResources(),R.drawable.yildizsarayi);



        mekanListesi.add("Adalar");
        mekanListesi.add("Anadolu Hisarı");
        mekanListesi.add("Ayasofya");
        mekanListesi.add("Bakırcılar Çarşısı");
        mekanListesi.add("Beylerbeyi Sarayı");
        mekanListesi.add("Cafer Ağa Medresesi");
        mekanListesi.add("Çırağan Sarayı");
        mekanListesi.add("Dolmabahçe Sarayı");
        mekanListesi.add("Eyüp Sultan Camii");
        mekanListesi.add("Gülhane Parkı");
        mekanListesi.add("Haseki Hürrem Hamamı");
        mekanListesi.add("Hidiv Kasrı");
        mekanListesi.add("Kapalıçarşı");
        mekanListesi.add("Kız Kulesi");
        mekanListesi.add("Mısır Çarşısı");
        mekanListesi.add("Miniatürk");
        mekanListesi.add("Rumeli Hisarı");
        mekanListesi.add("Soğuk Çeşme Sokağı");
        mekanListesi.add("Sultan Ahmet Binbirdirek Sarnıcı");
        mekanListesi.add("Sultan Ahmet Camisi");
        mekanListesi.add("Süleymaniye Hamamı");
        mekanListesi.add("Tekfur Sarayı");
        mekanListesi.add("Topkapı Sarayı");
        mekanListesi.add("Yedikule Hisarı");
        mekanListesi.add("Yerebatan Sarnıcı");
        mekanListesi.add("Yıldız Sarayı");



        mekanicerikListesi.add("Büyükada, Heybeliada, Burgazada gibi bildiğimiz takım adalar eski dönemlerde Prens Adaları olarak da bilinmekteydi. Bunun nedeni ise Bizans İmparatorluğu döneminde taç giymiş bir çok saray mensubu İstanbul’a uzak olduğu için bu adalara sürgün edilmiş, ve buralarda yaşamak durumunda kalmıştır. Günümüzde ise nostaljik havası, hala kullanılan faytonları ve trafiğin olmaması nedeniyle hafta sonu kaçamaklarının ilk adresleri haline gelmiştir. Adalar, piknik yapmak, bisiklete binmek, nostaljiyi tatmak isteyen yerli yabancı bir çok turistin gözdesi haline gelmiştir.");
        mekanicerikListesi.add("Bizans’a Karadeniz’den gelen yardımları engellemek amacıyla yapılmış olan Anadolu Hisarı Rumeli Hisarı’nın tam karşısında yer almaktadır. Günümüzde İstanbul Boğazı’nın kenarında yer almasıyla küçük bir balıkçı kasabasını andıran Anadolu Hisarı sessiz, sakin yapısıyla ve tarihi güzelliğiyle görülmeye değer mekanlardandır.");
        mekanicerikListesi.add("İstanbul’un tarihi yerleri denince ilk akla gelenlerden biride tartışmasız Ayasofya müzesi! Sınırsızlığı ve görkemiyle yerli yabancı çoğu turisti şaşırtan ve görmek için mutlaka vakit ayrılması gereken mekanlardan biri de Ayasofya Müzesi’dir. Bizans İmparatoru 1. Jüstinyen tarafından yaptırılmış daha sonra ise Fatih Sultan Mehmet tarafından camiye dönüştürülmüş olan Ayasofya tarihi hissetmek, şahit olmak isteyen bir çok turisti ağırlamaktadır.");
        mekanicerikListesi.add("Özellikle yabancı turistlerin dikkatini çeken Bakırcılar Çarşısı Beyazıt semtinde yer alır. Kazan, tencere, mangal gibi bakırdan yapılan eşyaların sergilendiği ve satışa açık olduğu sıra sıra dükkanlar çevresini sarmaktadır. Turistlerin yoğun ilgisiyle karşılaşan bu bakır işlerinin bulunduğu Bakırcılar Çarşısı mutlaka görülmesi gereken, çok bilinmeyen mekanlardandır.");
        mekanicerikListesi.add("Beylerbeyi Sarayı Üsküdar’ın Beylerbeyi ilçesinde konumlanmış Sultan Abdülaziz tarafından yaptırılmış tarihi bir mekandır. Saray ve müze bölümündeki tarihi eserler günümüzde pazartesi ve perşembe günleri haricinde diğer günlerde ziyaretçilere kapılarını açmakta ve bir çok konuğu ağarlamaktadır.");
        mekanicerikListesi.add("Ayasofya Müzesi’nin yanında konumlanmış olan bu tarihi mekan, çay molası vermek isteyenlerin, pazar günlerinin huzurlu kahvaltıları için alternatif arayanların kesinlikle uğraması gereken bir mekan. 16. yüzyılda Kanuni Sultan Süleyman Dönemi’nde yaptırılan medrese şu an tarihle sanatı da buluşturan bir özelliğe sahip. Medresede cüzi bir ücret karşılığında hat, ebru, takı, resim gibi atölyelere katılabilir, tarihi mekanın keyfini çıkarabilirsiniz.");
        mekanicerikListesi.add("Sultan Abdülaziz tarafından yaptırılan Çırağan Sarayı bir dönem konumu itibariyle “Beşiktaş Sarayı” olarak da anılmaktaydı. Büyük bir ihtişama ve görkeme sahip olan saray, bugün düğün, balo, parti gibi organizasyonların düzenlendiği bir mekan halini almıştır. Böyle bir mimariyi görmek, geçmişten bir hava solumak isteyenlerin çeşitli organizasyonlar için uğrak yeri olmuş, bir çok yerli yabancı turisti ağırlamaktadır.");
        mekanicerikListesi.add("Dolmabahçe Sarayı, imparatorluk döneminde Osmanlı Kaptan-ı Derya’sının gemileri demirlediği bir alan olarak kullanılmış daha sonra ise has bahçeye dönüştürülmüştür. Cumhuriyet döneminde ise Atatürk’ün İstanbul ziyaretlerinde kaldığı bir mekan olmasıyla ve hayata gözlerini burada yumması nedeniyle büyük önem taşımaktadır. Bu kadar tarihi dokuyu bir arada bulunduran saray ve saat müzesindeki tarihi eserler mutlaka görülmesi gereken yerlerdendir.\"");
        mekanicerikListesi.add("Günümüzde kutsal bir ibadet yeri olarak atfedilen Eyüp Sultan Camii Haliç kıyısında, Eyüp semtinde yer almaktadır. Diğer illerden ya da yurtdışından gelen turistlerin görmeden geçmedikleri tarihi bir camiidir. istanbul’un kutsal cuma gününde, kalabalığın camiye yöneldiği ve ibadet ettiği görülür. Görülmesi gereken, kutsal sayılan yerlerdendir.");
        mekanicerikListesi.add("Gülhane Parkı, Osmanlı döneminde Topkapı Sarayı’nın has bahçelerinden biri olarak kullanılmaktaydı. Döneminde, güllerle, lalelerle bir çok çiçekle bu bahçe süslenirken zamanla bakımı sekteye uğramış fakat günümüzde yeniden bakımı yapılıp, Türkiye’nin en büyük parklarından biri haline getirilmiştir. Hafta içi ya da haftasonu çiçekler içinde, temiz hava ve doğayla başbaşa kalmak, aynı zamanda şehirden çok da uzaklaşmak istemiyorsanız, çay içmek ve parkı gezmek sizin için güzel bir alternatif olabilir.");
        mekanicerikListesi.add("Kanuni Sultan Süleyman’ın eşi Hürrem Sultan tarafından istenmiş ve Mimar Sinan’a yaptırılmış hamamdır. Mimar Sinan’ın yaptığı en büyük hamam olma özelliği taşır. Son dönemde diziler sayesinde popülerliği artan ve merak uyandıran tarihi mekanlar arasında yerini almıştır.");
        mekanicerikListesi.add("Mısır’ın son hıdıvi Abbas Hilmi Paşa tarafından İtalyan bir mimara yaptırılan Hidiv Kasrı 1907 yılında bitmiş ve dönemin mimari özelliklerini taşımaktadır. Günümüzde düğün gibi çeşitli organizasyonların yapılabildiği, gidilip, görülebilecek yakınlarında bir çay molası verilebilecek bir mekandır.");
        mekanicerikListesi.add("Kapalıçarşı İstanbul’un merkezinde yer alan, tarihi dokusu ve alışveriş yapılacak bir çok mekanı içerisinde barındırması nedeniyle turistlerin yoğun ilgisiyle karşılaşır. Gün içerisinde yarım milyon insanın uğradığı bile bilinmektedir. Özellikle yabancı turistlerin uğramadan ülkelerine dönmedikleri bir yer olan Kapalıçarşı, her gün bütün ihtiyaçları karşılayacak dükkanlarıyla gözde mekanlardan biridir. Adeta bir şehri andıran Kapalıçarşı Fatih Sultan Mehmet tarafından tarafından insanların yaptıklarını sergileyip satmaları için yaptırılmıştır.");
        mekanicerikListesi.add("İstanbul Boğazı’nda Salacak açıklarında yer alan küçük bir adacık üzerinde konumlanmış bir kuledir. Hakkında neden yapıldığına dair çeşitli rivayetler ve efsaneler bulunan Kız Kulesi bu gizemi anlayabilmek adına bile görülesi mekanlardandır. Günümüzde eşinizle, dostunuzla gidebileceğiniz, romantik bir akşam yemeği ya da rutin dışında bir öğle molası için gidilebilecek ve yapısıyla mutlaka görülmesi gereken tarihi bir mekandır.");
        mekanicerikListesi.add("İstanbul’un en eski kapalı çarşılarından biri olan Mısır Çarşısı aktarlarıyla, kuruyemiş ve şarküteri ürünlerinin satılmasıyla meşhur bir mekandır. Turistlerin özellikle alışveriş için tercih ettiği gözde mekanlardandır. 1600 yılında Turhan Sultan tarafından yaptırılan mekan, pazar günleri de açık olma özelliğiyle cezbedicidir. İstanbul’da mutlaka görülmesi gereken yerler arasında yer alır.");
        mekanicerikListesi.add("Miniatürk bir çok eserin maketlerinin sergilendiği bir mekandır. Topkapı Sarayı, Anıtkabir, Mevlana Türbesi gibi çeşitli yapıtları burada maket olarak toplu halde görmek ve hakkında bilgi sahibi olmak mümkündür. 2003’ten beri turistlerin İstanbul’a adım attıkları andan itibaren ilk gidecekleri ve mutlaka görülmesi gereken mekanlar arasında yer alır.");
        mekanicerikListesi.add("Osmanlı döneminde, İstanbul Fethi sırasında Anadolu Hisarı’ndan halat çekmek için yapılmış olan etrafı kalelerle kaplı Rumeli Hisarı günümüzün vazgeçilmez mekanları arasında yer alır. Hem turistlerin hem İstanbul’da yaşayanların kesinlikle bir hafta sonu kahvaltısı için aynı zamanda da tarihi yapıyı görmek için gitmesi gereken mekanlardandır.");
        mekanicerikListesi.add("Sultanahmet semti içerisinde bulunan, eski türk filmlerinin unutulmaz mekanları arasında yer alır Soğuk Çeşme Sokağı. Nostaljik haliyle, tarihi yapısıyla İstanbul’un tarihi yerleri içerisinde görülesi mekanların başında gelir. Ayasofya Müzesi ve Topkapı Sarayı arasında yer alan sokak, trafiğe kapalı olma özelliğiyle fotoğraf çekmek ve İstanbul’dan güzel bir hatırayla ayrılmak isteyen turistlerin ilgisini çekmektedir.");
        mekanicerikListesi.add("Sarnıç, Büyük Konstantin döneminden günümüze kadar gelen, yaşayan tarihi mekanlar arasında turistlerin en çok merak ettiklerindendir. Şehrin su ihtyacını karşılamak amacıyla yapılmış, şu an ise turistik gezi listelerinin içinde mutlaka yer alan gizemli bir mekandır. Sultanahmet’te yer alan sarnıç için, bir hafta sonu vakit ayırmak gerekir.");
        mekanicerikListesi.add("Neredeyse çocuk yaşta tahta geçen ve oldukça genç yaşta ölen Osmanlı Padişahı I. Ahmed tarafından yaptırılan Sultanahmet Camisi’nin yapımına 1609’da başlanır ve 7 yıl süren yoğun çalışmaların ardından 1616’da tamamlanabilir. Mimar Sinan’dan sonra böyle bir eseri çıkarabileceğine inanılan tek kişi vardır, o da yine Mimar Sinan’ın öğrencilerinden birisi olan Mimar Sedefkâr Mehmet Ağa’dır ve caminin mimarlığını da o yapar.");
        mekanicerikListesi.add("Kanuni Sultan Süleyman tarafından Mimar Sinan’a yaptırılan Süleymaniye Hamamı Mimar Sinan’ın “kalfalık eserim” diye tabir ettiği eserleri arasında yer alır. Bugün turistik amaçla kullanılabilen daha çok yabancı turistlerin ilgisini çeken hamam görülmesi gereken tarihi mekanlardandır.");
        mekanicerikListesi.add("Bizans İmparatorluğu’ndan günümüze kadar gelen Tekfur Sarayı bugün az duyulsa da Edirnekapı semtinde ziyaretçilerini ağırlamaktadır. Tarihi olayların gizemini çözmed adına yapılan arkeolojik çalışmalar ise hala devam etmektedir. Bu nedenle ilgi çekici ve görülmeye değer tarihi yapılardan biridir.");
        mekanicerikListesi.add("İhtişamıyla ve mimarisiyle büyüleyen Topkapı Sarayı İstanbul’da görülmeden geçilmemesi gereken tarihi mekanların başında yer alır. 1478 yılında Fatih Sultan Mehmet tarafından yaptırılan saray, 400 yıl boyunca padişahların yaşadığı ve devleti idare ettikleri ana merkez görevini üstlenmiş, tarihe tanıklık etmiştir. Abdülmecit döneminde ziyarete açılan Topkapı Sarayı günümüzde de ziyaretçilerini ağırlamakta, gizemi ve Osmanlı mimarisine ait taşıdığı izlerle ve müzesindeki tarihi eserler ile turistlerin ilgi odağı olmaktadır.");
        mekanicerikListesi.add("İstanbul’un en eski açık hava müzelerinden biri olan Yedikule Zindanları diğer bir deyişle Yedikule Hisarı günümüzde kültürel etkinliklerin, konserlerin ve çeşitli organizasyonların düzenlendiği tarihi bir mekan halini almıştır. Böyle bir mimarinin içerisinde düzenlenmiş organizasyona katılmak yerli yabancı turistlerin ilgisini çekmektedir.");
        mekanicerikListesi.add("Suların içinde yükselen sütunlarıyla, yaşandığı rivayet edilen ilginç efsaneleriyle Yerebatan Sarnıcı en çok merak edilen, görmek için can atılan mekanlar arasında. Bizans İmparatoru tarafından sarayın su ihtiyacını karşılamak için kullanılan Yerebatan Sarnıcı, Fatih Sultan Mehmet döneminde de bir süre aynı şekilde devam etmiştir. Sütunların üzerinde bulunan şekillerin gözyaşlarını andırması, Büyük Basilika yapılırken kaybedilen bir çok kölenin dramını temsil etmesi açısından önem taşıdığı ise efsane ve rivayetler arasındadır. Bu yüzden yapısıyla da bir çok turistin ilgi odağı olmakta, merakını cezbetmektedir.");
        mekanicerikListesi.add("Beşiktaş, Ortaköy ve Balmumcu arasında yer alan Yıldız Sarayı tarihe tanıklık etmiş mekanlardan biridir. Bizans dönemine kadar dayanan tarihi dokusuyla günümüzde müze olarak kullanılan Yıldız Sarayı’nda Sultan II. Abdülhamit’in kişisel eşyaları sergilenmekte ve turistlerin ilgi odağı olmaktadır. Aynı zamanda içerisinde Yıldız Sarayı Tiyatrosu ve Sahne Sanatları Müzesi de bulunmaktadır.");


        mekanulasimListesi.add("Adalara Ulaşım –  Avrupa Yakası \n Karaköy ve Eminönü’nden \n Motorlar vasıtası ile adalara sabah saat:6.30’dan itibaren seferler düzenlenmektedir. \n Kabataş limanı’ndan \n Adalara, vapur, motor ve deniz otobüsleri gibi geniş bir tercih sunması nedeni ile çok rağbet görmektedir. Yaz kış düzenli seferler uygulanmaktadır. İsterseniz şehir hatları vapuru kullanarak ucuza ulaşımı gerçekleştirebilir, isterseniz rahat ve hızlı bir ulaşım için İDO’yu tercih edebilirsiniz.");
        mekanulasimListesi.add("Hat Bilgisi\tVarış Süresi\n" +
                "11H ORTAÇEŞME - ÜMRANİYE\t8 dk.\n" +
                "15ŞN ŞENEVLER - ÜSKÜDAR\t9 dk.\n" +
                "15 BEYKOZ - ÜSKÜDAR\t12 dk.\n" +
                "15T TOKATKÖY - ÜSKÜDAR\t21 dk.\n" +
                "11H ORTAÇEŞME - ÜMRANİYE\t23 dk.\n" +
                "15P SOĞUKSU MAHALLESİ - ÜSKÜDAR\t32 dk.\n" +
                "11H ORTAÇEŞME - ÜMRANİYE\t33 dk.\n" +
                "15 BEYKOZ - ÜSKÜDAR\t40 dk.\n" +
                "11H ORTAÇEŞME - ÜMRANİYE");
        mekanulasimListesi.add("Tramvay: Ayasofya Müzesine bağlı Bağcılar Kabataş Tramvay hattı ile Gülhane ve Sultanahmet duraklarını kullanarak ulaşabilirsiniz.\n" +
                "\n" +
                "Tren: Halkalı-Sirkeci Banliyö Tren hattı ile Sirkeci’ye; buradan da tramvay hattıyla Ayasofya Müzesi’ne ulaşabilirsiniz.\n" +
                "\n" +
                "Vapur: Anadolu yakasından gelecekseniz Kadıköy-Eminönü ve Üsküdar-Eminönü vapurlarını kullanarak tramvay hattına ulaşabilirsiniz.\n" +
                "\n" +
                "Otobüs: İstanbul’un her yerinden Belediye ve Halk Otobüsleri ile Eminönü’e; buradan da tramvay ile Ayasofya Müzesi’ne ulaşabilirsiniz.\n" +
                "\n" +
                "Eminönü’ne gelen otobüs hatları: 28-28T-30D-EM1-EM2-44B-99-54E-66-74A-36CE-47Ç-77Ç-336E-70FE-47-47E-33Y-92G-97A-94-33-33B-32-35-90-91O-36KE-325YK1");
        mekanulasimListesi.add(" mekanulasimListesi.add(\"Hat Bilgisi\\tVarış Süresi\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t8 dk.\\n\" +\n" +
                "                \"15ŞN ŞENEVLER - ÜSKÜDAR\\t9 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t12 dk.\\n\" +\n" +
                "                \"15T TOKATKÖY - ÜSKÜDAR\\t21 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t23 dk.\\n\" +\n" +
                "                \"15P SOĞUKSU MAHALLESİ - ÜSKÜDAR\\t32 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t33 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t40 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\");");
        mekanulasimListesi.add(" mekanulasimListesi.add(\"Hat Bilgisi\\tVarış Süresi\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t8 dk.\\n\" +\n" +
                "                \"15ŞN ŞENEVLER - ÜSKÜDAR\\t9 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t12 dk.\\n\" +\n" +
                "                \"15T TOKATKÖY - ÜSKÜDAR\\t21 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t23 dk.\\n\" +\n" +
                "                \"15P SOĞUKSU MAHALLESİ - ÜSKÜDAR\\t32 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t33 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t40 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\");");
        mekanulasimListesi.add(" mekanulasimListesi.add(\"Hat Bilgisi\\tVarış Süresi\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t8 dk.\\n\" +\n" +
                "                \"15ŞN ŞENEVLER - ÜSKÜDAR\\t9 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t12 dk.\\n\" +\n" +
                "                \"15T TOKATKÖY - ÜSKÜDAR\\t21 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t23 dk.\\n\" +\n" +
                "                \"15P SOĞUKSU MAHALLESİ - ÜSKÜDAR\\t32 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t33 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t40 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\");");
        mekanulasimListesi.add(" mekanulasimListesi.add(\"Hat Bilgisi\\tVarış Süresi\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t8 dk.\\n\" +\n" +
                "                \"15ŞN ŞENEVLER - ÜSKÜDAR\\t9 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t12 dk.\\n\" +\n" +
                "                \"15T TOKATKÖY - ÜSKÜDAR\\t21 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t23 dk.\\n\" +\n" +
                "                \"15P SOĞUKSU MAHALLESİ - ÜSKÜDAR\\t32 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t33 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t40 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\");");
        mekanulasimListesi.add(" mekanulasimListesi.add(\"Hat Bilgisi\\tVarış Süresi\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t8 dk.\\n\" +\n" +
                "                \"15ŞN ŞENEVLER - ÜSKÜDAR\\t9 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t12 dk.\\n\" +\n" +
                "                \"15T TOKATKÖY - ÜSKÜDAR\\t21 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t23 dk.\\n\" +\n" +
                "                \"15P SOĞUKSU MAHALLESİ - ÜSKÜDAR\\t32 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t33 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t40 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\");");
        mekanulasimListesi.add(" mekanulasimListesi.add(\"Hat Bilgisi\\tVarış Süresi\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t8 dk.\\n\" +\n" +
                "                \"15ŞN ŞENEVLER - ÜSKÜDAR\\t9 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t12 dk.\\n\" +\n" +
                "                \"15T TOKATKÖY - ÜSKÜDAR\\t21 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t23 dk.\\n\" +\n" +
                "                \"15P SOĞUKSU MAHALLESİ - ÜSKÜDAR\\t32 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t33 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t40 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\");");
        mekanulasimListesi.add(" mekanulasimListesi.add(\"Hat Bilgisi\\tVarış Süresi\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t8 dk.\\n\" +\n" +
                "                \"15ŞN ŞENEVLER - ÜSKÜDAR\\t9 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t12 dk.\\n\" +\n" +
                "                \"15T TOKATKÖY - ÜSKÜDAR\\t21 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t23 dk.\\n\" +\n" +
                "                \"15P SOĞUKSU MAHALLESİ - ÜSKÜDAR\\t32 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t33 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t40 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\");");
        mekanulasimListesi.add(" mekanulasimListesi.add(\"Hat Bilgisi\\tVarış Süresi\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t8 dk.\\n\" +\n" +
                "                \"15ŞN ŞENEVLER - ÜSKÜDAR\\t9 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t12 dk.\\n\" +\n" +
                "                \"15T TOKATKÖY - ÜSKÜDAR\\t21 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t23 dk.\\n\" +\n" +
                "                \"15P SOĞUKSU MAHALLESİ - ÜSKÜDAR\\t32 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t33 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t40 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\");");
        mekanulasimListesi.add(" mekanulasimListesi.add(\"Hat Bilgisi\\tVarış Süresi\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t8 dk.\\n\" +\n" +
                "                \"15ŞN ŞENEVLER - ÜSKÜDAR\\t9 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t12 dk.\\n\" +\n" +
                "                \"15T TOKATKÖY - ÜSKÜDAR\\t21 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t23 dk.\\n\" +\n" +
                "                \"15P SOĞUKSU MAHALLESİ - ÜSKÜDAR\\t32 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t33 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t40 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\");");
        mekanulasimListesi.add(" mekanulasimListesi.add(\"Hat Bilgisi\\tVarış Süresi\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t8 dk.\\n\" +\n" +
                "                \"15ŞN ŞENEVLER - ÜSKÜDAR\\t9 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t12 dk.\\n\" +\n" +
                "                \"15T TOKATKÖY - ÜSKÜDAR\\t21 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t23 dk.\\n\" +\n" +
                "                \"15P SOĞUKSU MAHALLESİ - ÜSKÜDAR\\t32 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t33 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t40 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\");");
        mekanulasimListesi.add(" mekanulasimListesi.add(\"Hat Bilgisi\\tVarış Süresi\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t8 dk.\\n\" +\n" +
                "                \"15ŞN ŞENEVLER - ÜSKÜDAR\\t9 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t12 dk.\\n\" +\n" +
                "                \"15T TOKATKÖY - ÜSKÜDAR\\t21 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t23 dk.\\n\" +\n" +
                "                \"15P SOĞUKSU MAHALLESİ - ÜSKÜDAR\\t32 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t33 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t40 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\");");
        mekanulasimListesi.add(" mekanulasimListesi.add(\"Hat Bilgisi\\tVarış Süresi\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t8 dk.\\n\" +\n" +
                "                \"15ŞN ŞENEVLER - ÜSKÜDAR\\t9 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t12 dk.\\n\" +\n" +
                "                \"15T TOKATKÖY - ÜSKÜDAR\\t21 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t23 dk.\\n\" +\n" +
                "                \"15P SOĞUKSU MAHALLESİ - ÜSKÜDAR\\t32 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t33 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t40 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\");");
        mekanulasimListesi.add(" mekanulasimListesi.add(\"Hat Bilgisi\\tVarış Süresi\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t8 dk.\\n\" +\n" +
                "                \"15ŞN ŞENEVLER - ÜSKÜDAR\\t9 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t12 dk.\\n\" +\n" +
                "                \"15T TOKATKÖY - ÜSKÜDAR\\t21 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t23 dk.\\n\" +\n" +
                "                \"15P SOĞUKSU MAHALLESİ - ÜSKÜDAR\\t32 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t33 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t40 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\");");
        mekanulasimListesi.add(" mekanulasimListesi.add(\"Hat Bilgisi\\tVarış Süresi\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t8 dk.\\n\" +\n" +
                "                \"15ŞN ŞENEVLER - ÜSKÜDAR\\t9 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t12 dk.\\n\" +\n" +
                "                \"15T TOKATKÖY - ÜSKÜDAR\\t21 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t23 dk.\\n\" +\n" +
                "                \"15P SOĞUKSU MAHALLESİ - ÜSKÜDAR\\t32 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t33 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t40 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\");");
        mekanulasimListesi.add(" mekanulasimListesi.add(\"Hat Bilgisi\\tVarış Süresi\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t8 dk.\\n\" +\n" +
                "                \"15ŞN ŞENEVLER - ÜSKÜDAR\\t9 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t12 dk.\\n\" +\n" +
                "                \"15T TOKATKÖY - ÜSKÜDAR\\t21 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t23 dk.\\n\" +\n" +
                "                \"15P SOĞUKSU MAHALLESİ - ÜSKÜDAR\\t32 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t33 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t40 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\");");
        mekanulasimListesi.add(" mekanulasimListesi.add(\"Hat Bilgisi\\tVarış Süresi\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t8 dk.\\n\" +\n" +
                "                \"15ŞN ŞENEVLER - ÜSKÜDAR\\t9 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t12 dk.\\n\" +\n" +
                "                \"15T TOKATKÖY - ÜSKÜDAR\\t21 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t23 dk.\\n\" +\n" +
                "                \"15P SOĞUKSU MAHALLESİ - ÜSKÜDAR\\t32 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t33 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t40 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\");");
        mekanulasimListesi.add(" mekanulasimListesi.add(\"Hat Bilgisi\\tVarış Süresi\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t8 dk.\\n\" +\n" +
                "                \"15ŞN ŞENEVLER - ÜSKÜDAR\\t9 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t12 dk.\\n\" +\n" +
                "                \"15T TOKATKÖY - ÜSKÜDAR\\t21 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t23 dk.\\n\" +\n" +
                "                \"15P SOĞUKSU MAHALLESİ - ÜSKÜDAR\\t32 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t33 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t40 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\");");
        mekanulasimListesi.add(" mekanulasimListesi.add(\"Hat Bilgisi\\tVarış Süresi\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t8 dk.\\n\" +\n" +
                "                \"15ŞN ŞENEVLER - ÜSKÜDAR\\t9 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t12 dk.\\n\" +\n" +
                "                \"15T TOKATKÖY - ÜSKÜDAR\\t21 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t23 dk.\\n\" +\n" +
                "                \"15P SOĞUKSU MAHALLESİ - ÜSKÜDAR\\t32 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t33 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t40 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\");");
        mekanulasimListesi.add(" mekanulasimListesi.add(\"Hat Bilgisi\\tVarış Süresi\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t8 dk.\\n\" +\n" +
                "                \"15ŞN ŞENEVLER - ÜSKÜDAR\\t9 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t12 dk.\\n\" +\n" +
                "                \"15T TOKATKÖY - ÜSKÜDAR\\t21 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t23 dk.\\n\" +\n" +
                "                \"15P SOĞUKSU MAHALLESİ - ÜSKÜDAR\\t32 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t33 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t40 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\");");
        mekanulasimListesi.add(" mekanulasimListesi.add(\"Hat Bilgisi\\tVarış Süresi\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t8 dk.\\n\" +\n" +
                "                \"15ŞN ŞENEVLER - ÜSKÜDAR\\t9 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t12 dk.\\n\" +\n" +
                "                \"15T TOKATKÖY - ÜSKÜDAR\\t21 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t23 dk.\\n\" +\n" +
                "                \"15P SOĞUKSU MAHALLESİ - ÜSKÜDAR\\t32 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t33 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t40 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\");");
        mekanulasimListesi.add(" mekanulasimListesi.add(\"Hat Bilgisi\\tVarış Süresi\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t8 dk.\\n\" +\n" +
                "                \"15ŞN ŞENEVLER - ÜSKÜDAR\\t9 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t12 dk.\\n\" +\n" +
                "                \"15T TOKATKÖY - ÜSKÜDAR\\t21 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t23 dk.\\n\" +\n" +
                "                \"15P SOĞUKSU MAHALLESİ - ÜSKÜDAR\\t32 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t33 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t40 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\");");
        mekanulasimListesi.add(" mekanulasimListesi.add(\"Hat Bilgisi\\tVarış Süresi\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t8 dk.\\n\" +\n" +
                "                \"15ŞN ŞENEVLER - ÜSKÜDAR\\t9 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t12 dk.\\n\" +\n" +
                "                \"15T TOKATKÖY - ÜSKÜDAR\\t21 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t23 dk.\\n\" +\n" +
                "                \"15P SOĞUKSU MAHALLESİ - ÜSKÜDAR\\t32 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t33 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t40 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\");");
        mekanulasimListesi.add(" mekanulasimListesi.add(\"Hat Bilgisi\\tVarış Süresi\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t8 dk.\\n\" +\n" +
                "                \"15ŞN ŞENEVLER - ÜSKÜDAR\\t9 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t12 dk.\\n\" +\n" +
                "                \"15T TOKATKÖY - ÜSKÜDAR\\t21 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t23 dk.\\n\" +\n" +
                "                \"15P SOĞUKSU MAHALLESİ - ÜSKÜDAR\\t32 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\\t33 dk.\\n\" +\n" +
                "                \"15 BEYKOZ - ÜSKÜDAR\\t40 dk.\\n\" +\n" +
                "                \"11H ORTAÇEŞME - ÜMRANİYE\");");

        mekankonumListesi.add("40.86778,29.13306");
        mekankonumListesi.add("41.128,29.102");
        mekankonumListesi.add("41.008469,28.980261");
        mekankonumListesi.add("40.86778,29.13306");
        mekankonumListesi.add("41.128,29.102");
        mekankonumListesi.add("41.008469,28.980261");
        mekankonumListesi.add("40.86778,29.13306");
        mekankonumListesi.add("41.128,29.102");
        mekankonumListesi.add("41.008469,28.980261");
        mekankonumListesi.add("40.86778,29.13306");
        mekankonumListesi.add("41.128,29.102");
        mekankonumListesi.add("41.008469,28.980261");
        mekankonumListesi.add("40.86778,29.13306");
        mekankonumListesi.add("41.128,29.102");
        mekankonumListesi.add("41.008469,28.980261");
        mekankonumListesi.add("40.86778,29.13306");
        mekankonumListesi.add("41.128,29.102");
        mekankonumListesi.add("41.008469,28.980261");
        mekankonumListesi.add("40.86778,29.13306");
        mekankonumListesi.add("41.128,29.102");
        mekankonumListesi.add("41.008469,28.980261");
        mekankonumListesi.add("40.86778,29.13306");
        mekankonumListesi.add("41.128,29.102");
        mekankonumListesi.add("41.008469,28.980261");
        mekankonumListesi.add("40.86778,29.13306");
        mekankonumListesi.add("41.128,29.102");



        resimListesi.add(Adalar);
        resimListesi.add(AnadoluHisari);
        resimListesi.add(Ayasofya);
        resimListesi.add(BakircilarCarsisi);
        resimListesi.add(Beylerbeyi);
        resimListesi.add(Cafer);
        resimListesi.add(Ciragan);
        resimListesi.add(Dolmabahce);
        resimListesi.add(Eyüp);
        resimListesi.add(Gulhane);
        resimListesi.add(Haseki);
        resimListesi.add(Hidiv);
        resimListesi.add(Kapalicarsi);
        resimListesi.add(kizkulesi);
        resimListesi.add(misir);
        resimListesi.add(Miniatürk);
        resimListesi.add(Rumeli);
        resimListesi.add(Soguk);
        resimListesi.add(SultanAhmet);
        resimListesi.add(SultanAhmetcami);
        resimListesi.add(Suleymaniye);
        resimListesi.add(Tekfur);
        resimListesi.add(Topkapi);
        resimListesi.add(Yedikule);
        resimListesi.add(Yerebatan);
        resimListesi.add(Yildiz);


        ArrayAdapter listeAdapter = new ArrayAdapter(context,android.R.layout.simple_list_item_1,mekanListesi);
        liste.setAdapter(listeAdapter);
        liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(context,Detay_Activity.class);
                intent.putExtra("isim",mekanListesi.get(position));
                intent.putExtra("icerik",mekanicerikListesi.get(position));
                intent.putExtra("ulasim",mekanulasimListesi.get(position));
                intent.putExtra("konum",mekankonumListesi.get(position));

                Bitmap bitmap = resimListesi.get(position);
                Globals globals = Globals.getInstance();
                globals.setData(bitmap);
                startActivity(intent);
            }
        });

    }

    public void tanimla(){
        liste = findViewById(R.id.liste);
    }
}
