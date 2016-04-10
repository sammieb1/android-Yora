package socialapp.com.socialapp.infrastructure;

import android.app.Application;

import com.squareup.otto.Bus;

import socialapp.com.socialapp.Services.Module;


public class MyApplication extends Application {

    private Auth auth;
    private Bus bus;

    public MyApplication() {
        bus = new Bus();
    }


    @Override
    public void onCreate() {
        super.onCreate();
        auth = new Auth(this);
        Module.register(this);
    }


    public Auth getAuth() {
        return auth;
    }

    public Bus getBus() {
        return bus;
    }
}