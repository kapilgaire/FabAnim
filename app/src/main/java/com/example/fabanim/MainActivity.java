package com.example.fabanim;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView olTv;
    private FloatingActionButton fabOl;
    private TextView ulTv;
    private FloatingActionButton fabUl;
    private TextView nTv;
    private FloatingActionButton fabN;
    private TextView ubTv;
    private FloatingActionButton fabUb;
    private TextView olUbTv;
    private FloatingActionButton fabOlUb;
    private TextView ulUbTv;
    private FloatingActionButton fabUlUb;
    private TextView dtHealthTv;
    private FloatingActionButton dtHealthCounter;
    private View fabTv;
    private FloatingActionButton fabButton;
    private Animation fab_open, fab_close, rotate_forward, rotate_backward;
    private Boolean isFabOpen = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        initView();
        olTv.setOnClickListener(onClickListener);
        fabOl.setOnClickListener(onClickListener);
        ulTv.setOnClickListener(onClickListener);
        fabUl.setOnClickListener(onClickListener);
        nTv.setOnClickListener(onClickListener);
        fabN.setOnClickListener(onClickListener);
        ubTv.setOnClickListener(onClickListener);
        fabUb.setOnClickListener(onClickListener);
        olUbTv.setOnClickListener(onClickListener);
        fabOlUb.setOnClickListener(onClickListener);
        ulUbTv.setOnClickListener(onClickListener);
        fabUlUb.setOnClickListener(onClickListener);
        dtHealthTv.setOnClickListener(onClickListener);
        dtHealthCounter.setOnClickListener(onClickListener);
        fabTv.setOnClickListener(onClickListener);
        fabButton.setOnClickListener(onClickListener);
        fab_open = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);
        fab_close = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_close);
        rotate_forward = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_fab_icon_forward);
        rotate_backward = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_fab_icon_backward);

    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.fab_button:
                    animateFAB();
                    break;
                case R.id.ol_tv:
                    break;
                case R.id.fab_ol:
                    break;
                case R.id.ul_tv:
                    break;
                case R.id.fab_ul:
                    break;
                case R.id.n_tv:
                    break;
                case R.id.fab_n:
                    break;
                case R.id.ub_tv:
                    break;
                case R.id.fab_ub:
                    break;
            }
        }
    };

    private void initView() {
        olTv = findViewById(R.id.ol_tv);
        fabOl = findViewById(R.id.fab_ol);
        ulTv = findViewById(R.id.ul_tv);
        fabUl = findViewById(R.id.fab_ul);
        nTv = findViewById(R.id.n_tv);
        fabN = findViewById(R.id.fab_n);
        ubTv = findViewById(R.id.ub_tv);
        fabUb = findViewById(R.id.fab_ub);
        olUbTv = findViewById(R.id.ol_ub_tv);
        fabOlUb = findViewById(R.id.fab_ol_ub);
        ulUbTv = findViewById(R.id.ul_ub_tv);
        fabUlUb = findViewById(R.id.fab_ul_ub);
        dtHealthTv = findViewById(R.id.dt_health_tv);
        dtHealthCounter = findViewById(R.id.dt_health_counter);

        fabTv = findViewById(R.id.fab_tv);
        fabButton = findViewById(R.id.fab_button);
    }

    public void animateFAB() {

        if (isFabOpen) {

            fabButton.startAnimation(rotate_backward);

            olTv.startAnimation(fab_close);
            fabOl.startAnimation(fab_close);
            ulTv.startAnimation(fab_close);
            fabUl.startAnimation(fab_close);
            nTv.startAnimation(fab_close);
            fabN.startAnimation(fab_close);
            ubTv.startAnimation(fab_close);
            fabUb.startAnimation(fab_close);
            olUbTv.startAnimation(fab_close);
            fabOlUb.startAnimation(fab_close);
            ulUbTv.startAnimation(fab_close);
            fabUlUb.startAnimation(fab_close);
            dtHealthTv.startAnimation(fab_close);
            dtHealthCounter.startAnimation(fab_close);
            isFabOpen = false;

        } else {

            fabButton.startAnimation(rotate_forward);

            olTv.startAnimation(fab_open);
            fabOl.startAnimation(fab_open);
            ulTv.startAnimation(fab_open);
            fabUl.startAnimation(fab_open);
            nTv.startAnimation(fab_open);
            fabN.startAnimation(fab_open);
            ubTv.startAnimation(fab_open);
            fabUb.startAnimation(fab_open);
            olUbTv.startAnimation(fab_open);
            fabOlUb.startAnimation(fab_open);
            ulUbTv.startAnimation(fab_open);
            fabUlUb.startAnimation(fab_open);
            dtHealthTv.startAnimation(fab_open);
            dtHealthCounter.startAnimation(fab_open);
            isFabOpen = true;

        }
    }
}

