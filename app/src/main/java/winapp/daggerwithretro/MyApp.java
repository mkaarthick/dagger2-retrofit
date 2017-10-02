package winapp.daggerwithretro;

import android.app.Application;

import timber.log.Timber;
import winapp.daggerwithretro.di.component.AppComponent;
import winapp.daggerwithretro.di.component.DaggerAppComponent;
import winapp.daggerwithretro.di.module.AppModule;

/**
 * Created by karthick on 02/10/17.
 */

public class MyApp extends Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule())
                .build();
    }

    public AppComponent getAppComponent() {
        return this.appComponent;
    }
}
