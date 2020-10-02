package com.aylingunes.parselearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;
import com.parse.SignUpCallback;

import java.util.List;

//Manifest'te internet izni alacağını kullanıcıya iletmelisin
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*      // Parse içinde yeni nesne oluşturma;
        ParseObject object = new ParseObject("Fruits");
        object.put("name", "banana");
        object.put("calories",150);
        object.saveInBackground(new SaveCallback() { // new SaveCallBack ile hazır blok verir
            @Override
            public void done(ParseException e) {
                //işlem sonundde exception varsa
                if(e!=null){
                    Toast.makeText(getApplicationContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),"Saved",Toast.LENGTH_LONG).show();
                } }
        }); // saveInBackground with callback olumlu olumsuz geri dönüt verebilir--> basic save kullanma */

   /*     ParseQuery<ParseObject>  query = ParseQuery.getQuery("Fruits");  //Server'dan okuma yaparken parseobject çekilecek
        query.getInBackground("mUQt8UWdje", new GetCallback<ParseObject>() {
            @Override
            public void done(ParseObject object, ParseException e) {
                if(e!=null){
                    e.printStackTrace(); //eğer hata alırsa Logcat'e yazdıracak toast message'dan iyi
                }else {
                    String objectname = object.getString("name"); // key için veritabanında nasıl kaydettiysen öyle anahttarlamalısın name demiştik
                    int objectCaloris= object.getInt("calories");

                    System.out.println("object name: " +objectname +" object Calories: " +objectCaloris); //Logcatte görüntülendi veriyi id ile çekebildik fakat her defasında unique olam bu id'lere erişmek çok zahmetli olacaktır
                }
            }
        }); // id bekliyor geri getirmek için bunu back4app'tan aldık unique olduğu ve auto tanımlandığı için

        // çok fazla özelliği olan bir objenin tüm özelliklerini çekmek durumunda değilizz. bazı select işlemleri (like SQL ) mevcut
*/
/*
   ParseQuery<ParseObject> query = ParseQuery.getQuery("Fruits");
   // tek bir objeyi çekmek istersek ve object id'ye erişemiyorsak ;
        query.whereEqualTo("name", "banana"); // SQLdeki gibi filtreleme yapabiliriz whereEqualTo kullanımında bir şey birşeye eşitse şeklinde çalışıyor iki String bekler
        // whereLessThan gibi integer değerlendirmesi yapılabilr yani maaşı 1200den büyük olanları çek gibi kullanabilirsin (where maas>1200)


   query.findInBackground(new FindCallback<ParseObject>() { // new FindcallBack ile hazır blok oluştu
       @Override
       public void done(List<ParseObject> objects, ParseException e) {
            //done içinde yine bir exception hali ve Parse Objeleri listesi verdi
           if( e!= null) {
               e.printStackTrace(); // eğer hata varsa yazdır system.out altında
           } else {  // eğer hata yoksa object list alacağımız için önce object.size dolu mu diye kontrol et

               if(objects.size()>0){ // eğer liste boş değilse

                   for (ParseObject object : objects){ // sınıftaki tüm objeler için ilk kodu döngülemiş olduk böylece listedeki elemanalr aslında tek bir veri haline gelmiş oldu
                       String objectName = object.getString("name");
                       int objectCalorie = object.getInt("calories"); // bu keyler back4app içindeki keys olmalı

                       System.out.println("object name : " +objectName+ " object calories : " +objectCalorie);

                   }

               }

           }

       }
   });

*/

/*kullanıcı oluşturma işlemleri *****************************************************


        ParseUser user = new ParseUser(); // yeni kullanıcı oluşturma
       user.setUsername("James");       user.setPassword("123456"); // Default kullanıcı oluşturma ve şifre verme
        user.signUpInBackground(new SignUpCallback() {  // callbackli olanı seçmelisin blok verecek
            @Override
            public void done(ParseException e) { // done içinde hata varsa yokla
                if(e!=null) {
                    e.printStackTrace(); // sout'a yazdır
                }else {
                    Toast.makeText(MainActivity.this,"User Signed Up",Toast.LENGTH_LONG).show();
                }

            }
        });
        */

//kullanıcı ile giriş yapma için kullanıcı adı ve şifre kontrol işlemleri yapılmalı , kullanıcı oluşturulunca tekrarlanmaması için yorum satırına al
   /*   ParseUser.logInInBackground("James", "12346", new LogInCallback() {
          @Override
          public void done(ParseUser user, ParseException e) { //hata yanınd bir de user veriyor
              if(e!=null) {
                  e.printStackTrace();
                  Toast.makeText(MainActivity.this,e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
              }else {
                  Toast.makeText(MainActivity.this,"Welcome" +user.getUsername(),Toast.LENGTH_LONG).show();
              }

          }
      }); // kullanıcı adı ve şifre bekler , den sonra LogınCallbackle çalışmalısın
*/



    }
}