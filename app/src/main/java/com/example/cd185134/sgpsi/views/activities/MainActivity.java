package com.example.cd185134.sgpsi.views.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import com.example.cd185134.sgpsi.R;
import com.example.cd185134.sgpsi.views.fragments.PSIMapFragment;

/**
 * this class for showing main page
 * Created by cherrie on 5/23/2018.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        changeFragment(new PSIMapFragment()); //default selected
    }


    /**
     * for change tab menu fragment
     *
     * @param fragment {@link Fragment} page will be shown
     */
    private void changeFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }
}
