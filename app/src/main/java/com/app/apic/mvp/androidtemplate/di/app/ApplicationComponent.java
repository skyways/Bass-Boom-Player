package com.app.apic.mvp.androidtemplate.di.app;

import com.app.apic.mvp.androidtemplate.MyApplication;
import com.app.apic.mvp.androidtemplate.di.activity.ActivityComponent;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Korir on 3/12/19.
 * amoskrr@gmail.com
 */

@Singleton
@Component(modules = ApplicationModule.class) public interface ApplicationComponent {
    ActivityComponent.Builder activityComponentBuilder();

    void inject(MyApplication myApplication);
}
