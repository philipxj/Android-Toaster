package com.philipxj.toastermessage;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    public static void toasterShort(Context context,String string){
        Toast.makeText(context,string,Toast.LENGTH_SHORT).show();
    }
    public static void toasterLong(Context context,String string){
        Toast.makeText(context,string,Toast.LENGTH_LONG).show();
    }
}
