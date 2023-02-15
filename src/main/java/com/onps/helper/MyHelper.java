package com.onps.helper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MyHelper {
    private Context context;

    public MyHelper(Context context) {
        this.context = context;
    }
    public void showToast(String txt){
        Toast.makeText(context, txt, Toast.LENGTH_SHORT).show();
    }
    public void startActivity(Class<?> activity){
        context.startActivity(new Intent(context,activity).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK));
    } public void startActivity(Class<?> activity, Bundle bundle){
        context.startActivity(new Intent(context,activity).putExtra("bundle",bundle).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK));
    }
}
