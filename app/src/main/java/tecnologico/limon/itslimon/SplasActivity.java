package tecnologico.limon.itslimon;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

public class SplasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splas);
        Thread time = new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    Intent nuevo = new Intent(SplasActivity.this, MainActivity.class);
                    startActivity(nuevo);
                    finish();
                }
            }
        };
        time.start();
    }
}