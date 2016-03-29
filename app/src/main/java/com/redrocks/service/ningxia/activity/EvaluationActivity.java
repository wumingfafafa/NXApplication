package com.redrocks.service.ningxia.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.ButterKnife;

/**
 * Created by chuny on 2016/3/24.
 */
public class EvaluationActivity extends Activity {
    private LinearLayout groupView;// 线性水平布局对象
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_report);
//        setContentView(R.layout.layout_taskdetails);
        ButterKnife.bind(this);

    }


}
