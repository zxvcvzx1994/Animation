package vo.cvcompany.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import vo.cvcompany.com.myapplication.View.Main2Activity;

public class MainActivity extends AppCompatActivity {

    private Animation animation;
    private Animation animation1;
    private ImageView img;
    private ImageView imgTranslate;
    private ImageView imgRingbell;
    private Animation animationTranslate;
    private Animation animationScale;
    private ImageView imgScale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView) findViewById(R.id.img);
        imgTranslate = (ImageView) findViewById(R.id.imgMoto);
        imgRingbell = (ImageView) findViewById(R.id.imgRingbell);
        imgScale = (ImageView) findViewById(R.id.imgScale);
        Button btnStartActivity = (Button) findViewById(R.id.btnStartActivity);
        animationScale = AnimationUtils.loadAnimation(this, R.anim.scale);
        animation = AnimationUtils.loadAnimation(this, R.anim.alpha);
        animation1 = AnimationUtils.loadAnimation(this, R.anim.rotate);
        animationTranslate = AnimationUtils.loadAnimation(this, R.anim.translate);
        btnStartActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);

                overridePendingTransition(R.anim.enter, R.anim.exit);
            }
        });
        imgScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animationScale);
            }
        });
        imgTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animationTranslate);
            }
        });

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animation);
            }
        });

        imgRingbell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animation1);
            }
        });
    }
}
