package com.aylingunes.parselearning;

import android.app.Application;

import com.parse.Parse;

// applicationa extend etmelisin
public class ParseStarterClass extends Application {
    @Override // 'oncreate' ile hazır blok eklenecek
    public void onCreate() {
        super.onCreate();

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG); // Logcatte ne gösterileceğini belirler
        Parse.initialize(new Parse.Configuration.Builder(this)
            .applicationId("WLEnCVA2JcenZJSDE7AGsM3Cbh3ObSFxD3EeLfKZ") // backend işlemler için beklenen server bilgileri
                .clientKey("kJRkOoVcKamoISUJ1zcBKOd15wvXaTETp2A7InxC")
                .server("https://parseapi.back4app.com/") //kendi serverımızı kuracağız
                .build()
        );



    }
}
