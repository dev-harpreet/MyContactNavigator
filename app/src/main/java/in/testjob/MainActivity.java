package in.testjob;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import in.testjob.fragments.FragmentContacts;

/**
 * Created by harpreet on 07/11/17.
 */

public class MainActivity extends FragmentActivity {

    @BindView(R.id.frame)
    FrameLayout frameLayout;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frame, FragmentContacts.getFragment());
        transaction.commit();
    }
}
