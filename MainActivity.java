package com.example.admin.alertdialog;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          alertScrollView();

    }


    public void alertScrollView() {

        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View myScrollView = inflater.inflate(R.layout.activity_main, null, false);


        TextView tv = (TextView) myScrollView
                .findViewById(R.id.textViewWithScroll);
        tv.setText("");

        for (int x = 0; x < 1; x++) {
            tv.append("Пользователь обязан предоставить достоверную информацию о себе и о нарушении ПДД.\n\n");
            tv.append("Пользователь соглашается на отправку информации и заявления о ПДД в милицию от его имени.\n\n");
            tv.append("Пользователь соглашается в случае необходимости явиться в милицию в качестве свидетеля для подтверждения заявления.");
        }

        new AlertDialog.Builder(MainActivity.this).setView(myScrollView)
                .setTitle("Statement")
                .setPositiveButton("Agree", new DialogInterface.OnClickListener() {
                    @TargetApi(11)
                    public void onClick(DialogInterface dialog, int id) {
                     dialog.dismiss();
                    }

                })
                .setNegativeButton("Disagree", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                    })
                .setNeutralButton("More Information", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                     Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                       startActivity(intent);

            }

    }).show();

    }
}




