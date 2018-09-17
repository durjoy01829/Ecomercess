package invenz.example.durjoy.e_comerce.Splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.logging.Handler;

import invenz.example.durjoy.e_comerce.Home.HomeActivity;
import invenz.example.durjoy.e_comerce.Login.SignIn;
import invenz.example.durjoy.e_comerce.R;
import invenz.example.durjoy.e_comerce.Utility.SharedPreFerenceUtility;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        init();
    }

    private void init() {
    //splash scree

        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //
                if (SharedPreFerenceUtility.getInstance().getString("register_user").equalsIgnoreCase(""))

                {
                    Intent intent=new Intent(SplashActivity.this, SignIn.class);

                    startActivity(intent);
                }
                else{


                    //homeScreen

                    Intent intent= new Intent(SplashActivity.this,HomeActivity.class);

                    startActivity(intent);

                }

                finish();

            }
        }, 5000); //delay splash screen

    }
}
