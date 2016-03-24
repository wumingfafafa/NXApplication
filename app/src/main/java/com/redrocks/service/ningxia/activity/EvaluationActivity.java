package com.redrocks.service.ningxia.activity;

import android.app.Activity;
import android.os.Bundle;

import butterknife.ButterKnife;

/**
 * Created by chuny on 2016/3/24.
 */
public class EvaluationActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_taskdetails);
        ButterKnife.bind(this);
    }
}
