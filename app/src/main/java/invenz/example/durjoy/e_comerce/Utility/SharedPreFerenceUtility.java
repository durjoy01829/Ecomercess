package invenz.example.durjoy.e_comerce.Utility;

import android.content.Context;
import android.content.SharedPreferences;

import invenz.example.durjoy.e_comerce.MyAPP;

public class SharedPreFerenceUtility  {

    private static  String  PREFERENCE_NAME="ecomerce"; //String

    private static  SharedPreFerenceUtility sharedPreFerenceUtility; //object

    private static SharedPreferences sharedPreferences ; //variable

    private SharedPreFerenceUtility(Context context)

    {

        PREFERENCE_NAME =PREFERENCE_NAME + context.getPackageName(); //for ineterger converstion

        this.sharedPreferences=context.getSharedPreferences(PREFERENCE_NAME,Context.MODE_PRIVATE); // user login should be different in different devices


    }

    public static SharedPreFerenceUtility getInstance()
    {
        if(sharedPreFerenceUtility ==null)
        {
            sharedPreFerenceUtility=new SharedPreFerenceUtility(MyAPP.getContex());  //  check the value is null or not
        }

        return sharedPreFerenceUtility;
    }

            ///login response
        public  void  saveString(String key, String Val)
        {
            SharedPreferences.Editor editor=sharedPreferences.edit();

            editor.putString(key, Val);
            editor.commit();


        }


        //string receive

        public String getString(String key ,String defVal)
        {
            return  sharedPreferences.getString(key,defVal);
        }


    public String getString(String key )
    {
        return  sharedPreferences.getString(key, "");
    }


    }

