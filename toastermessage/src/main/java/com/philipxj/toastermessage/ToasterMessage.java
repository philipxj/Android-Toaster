package com.philipxj.toastermessage;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    public static void ToasterShort(Context context,String string){
        Toast.makeText(context,string,Toast.LENGTH_SHORT).show();
    }
    public static void ToasterLong(Context context,String string){
        Toast.makeText(context,string,Toast.LENGTH_LONG).show();
    }

    public static void ToasterTest(Context context,String string){
        Toast.makeText(context,string,Toast.LENGTH_SHORT).show();
    }
    //test
}
