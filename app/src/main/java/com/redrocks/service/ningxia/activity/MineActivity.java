package com.redrocks.service.ningxia.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.redrocks.service.ningxia.view.RoundImageView;
import com.redrocks.service.ningxia.activity.R;
import butterknife.Bind;
import butterknife.ButterKnife;

public class MineActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_my);
        ButterKnife.bind(this);
    }

}
