package com.redrocks.service.ningxia.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author yangyu
 *         功能描述：弹出Activity界面
 */
public class DialogActivity extends Activity implements OnClickListener {
    @Bind(R.id.llayout01)
    RelativeLayout llayout01;
    @Bind(R.id.llayout02)
    RelativeLayout llayout02;
    @Bind(R.id.llayout03)
    RelativeLayout llayout03;
    @Bind(R.id.llayout04)
    RelativeLayout llayout04;
    @Bind(R.id.llayout05)
    RelativeLayout llayout05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        ButterKnife.bind(this);
        initView();
    }

    /**
     * 初始化组件
     */
    private void initView() {
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        finish();
        return true;
    }

    @OnClick({R.id.llayout01, R.id.llayout02, R.id.llayout03, R.id.llayout04, R.id.llayout05})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.llayout01:
                finish();
                break;
            case R.id.llayout02:
                finish();
                break;
            case R.id.llayout03:
                finish();
                break;
            case R.id.llayout04:
                finish();
                break;
            case R.id.llayout05:
                finish();
                break;
        }
    }

    @Override
    public void finish() {
        super.finish();
        MainTaskActivity2.setMenuCount(0);
    }
}
