package invenz.example.durjoy.e_comerce;

import android.app.Application;
import android.content.Context;

public class MyAPP extends Application{

    private static Context contex;


    public  void onCreate() {

        super.onCreate();

        contex=getApplicationContext();


    }

    public static Context getContex ()
    {
        return contex;
    }
}
