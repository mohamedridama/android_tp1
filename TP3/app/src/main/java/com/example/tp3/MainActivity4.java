package com.example.tp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.provider.CalendarContract;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button bt=(Button)findViewById(R.id.bt_precedent);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(intent);
            }
        });
        Button bt_appel=(Button)findViewById(R.id.bt_appel);
        bt_appel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri telnumber=Uri.parse("tel:0123456789");
                Intent call=  new Intent(Intent.ACTION_DIAL, telnumber);
                startActivity(call);

            }
        });
        Button bt_aff=(Button)findViewById(R.id.bt_afficher);
        bt_aff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.vogella.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button bt_mail=(Button)findViewById(R.id.bt_mail);
        bt_mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(android.content.Intent.EXTRA_TEXT, "News for you!");
                startActivity(intent);
            }

        });
        Button bt_alarm=(Button)findViewById(R.id.bt_alarm);
        bt_alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                        .putExtra(AlarmClock.EXTRA_MESSAGE, "aid fitr")
                        .putExtra(AlarmClock.EXTRA_DAYS,23)

                        .putExtra(AlarmClock.EXTRA_HOUR, 10)
                        .putExtra(AlarmClock.EXTRA_MINUTES, 10);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
        Button bt_calendar=(Button)findViewById(R.id.bt_calendar);
        bt_calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_INSERT)
                        .setData(CalendarContract.Events.CONTENT_URI)
                        .putExtra(CalendarContract.Events.TITLE, "title")
                        .putExtra(CalendarContract.Events.EVENT_LOCATION, "location")
                        .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, 10)
                        .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, 20);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
        Button bt_cam=(Button)findViewById(R.id.bt_camera);
        bt_cam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 int REQUEST_IMAGE_CAPTURE = 1;
                 Uri locationForPhotos=Uri.parse("tel:0123456789");;
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                intent.putExtra(MediaStore.EXTRA_OUTPUT,
                        Uri.withAppendedPath(locationForPhotos, null));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
}