package winapp.daggerwithretro.di.component;

import javax.inject.Singleton;

import dagger.Component;
import winapp.daggerwithretro.MainActivity;
import winapp.daggerwithretro.di.module.AppModule;

/**
 * Created by karthick on 02/10/17.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(MainActivity target);

}
