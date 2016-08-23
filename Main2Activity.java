package com.example.admin.alertdialog;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.ScrollView;
import android.widget.Scroller;
import android.widget.TextView;

import com.backendless.Backendless;
import com.backendless.Persistence;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;

import org.w3c.dom.Text;


public class Main2Activity extends AppCompatActivity {

    String YOUR_APP_ID = "BC29EC02-D5DB-106C-FFE7-13DCA1AF5500";
    String YOUR_SECRET_KEY = "C1C98D65-1ED4-8512-FFE5-5833BDF92E00";
    String ObjectId = "D289BE4A-BE3B-3FA6-FF42-B7452305E600";
    TextView textView;
    String text;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String appVersion = "v1";
        Backendless.initApp(this, YOUR_APP_ID, YOUR_SECRET_KEY, appVersion);
        textView = (TextView) findViewById(R.id.textView);
        scrollView = (ScrollView)findViewById(R.id.scrollView);
       // scrollView.addView(textView);
        Backendless.Persistence.of( Offerta.class ).findById( ObjectId,
                new AsyncCallback<Offerta>() {
                    @Override
                    public void handleResponse(Offerta response )
                    {
                      text = response.getText();
                        textView.setText(text);
                    }
                    @Override
                    public void handleFault( BackendlessFault fault )
                    {
                    }
                } );


}
}

