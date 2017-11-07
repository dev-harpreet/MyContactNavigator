package in.testjob;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import in.testjob.fragments.FragmentMaps;

/**
 * Created by harpreet on 07/11/17.
 */

public class SplashActivity extends Activity {

    @BindView(R.id.image)
    ImageView image;
    private Activity context = this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(context);

        initOperations();
    }

    /** Set an animation to our splash view **/
    private void initOperations() {
        image.setImageResource(R.drawable.animate_rocket);
        AnimationDrawable animation = (AnimationDrawable) image.getDrawable();
        animation.start();
    }

    /** Proceed with next screen after splash animation completion **/
    @Override
    protected void onStart() {
        super.onStart();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(context, MainActivity.class));
                finish();
            }
        }, 2400);
    }
}
