package ru.mvlikhachev.myapplication;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class Multithread {
    private int count;
    private TextView context;
    private String TAG = Multithread.class.getCanonicalName();

    Multithread(int count, TextView context) {
        this.count = count;
        this.context = context;
    }

    void doWork() {
        final Handler handler = new Handler();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            context.setText("Thread finished");
                        }
                    });
                    Log.e(TAG, "Thread Finished: ");
                } catch (InterruptedException e) {
                    Log.e(TAG, "Exception: " + e.getLocalizedMessage());
                }
            }
        }).start();

    }
}
