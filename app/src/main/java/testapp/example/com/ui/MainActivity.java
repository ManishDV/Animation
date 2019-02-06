package testapp.example.com.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button e1,e2,e3,e4,e5,e6,e7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        e3 = findViewById(R.id.e3);
        e4 = findViewById(R.id.e4);
        e5 = findViewById(R.id.e5);
        e6 = findViewById(R.id.e6);
        e7 = findViewById(R.id.e7);


        Animation L2R = AnimationUtils.loadAnimation(MainActivity.this,R.anim.lefttoright);
        Animation R2L = AnimationUtils.loadAnimation(MainActivity.this,R.anim.lefttoright);

        e1.startAnimation(L2R);
        e2.startAnimation(R2L);
        e3.startAnimation(L2R);
        e4.startAnimation(R2L);
        e5.startAnimation(L2R);
        e6.startAnimation(R2L);
        e7.startAnimation(R2L);



    }

    public void clime(View view) {



    }


}
