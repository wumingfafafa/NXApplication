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

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MineActivity extends Activity {
    TextView myVersiontext1;
    @BindView(R.id.title_back)
    ImageView titleBack;
    @BindView(R.id.title_text)
    TextView titleText;
    @BindView(R.id.title_right)
    TextView titleRight;
    @BindView(R.id.title_right_img)
    ImageView titleRightImg;
    @BindView(R.id.id_qiqiu)
    RoundImageView idQiqiu;
    @BindView(R.id.my_name)
    TextView myName;
    @BindView(R.id.my_usertitle)
    TextView myUsertitle;
    @BindView(R.id.my_newtasknum)
    TextView myNewtasknum;
    @BindView(R.id.lay_1)
    RelativeLayout lay1;
    @BindView(R.id.my_nouploadtask)
    TextView myNouploadtask;
    @BindView(R.id.lay_2)
    RelativeLayout lay2;
    @BindView(R.id.my_dotask)
    TextView myDotask;
    @BindView(R.id.lay_3)
    RelativeLayout lay3;
    @BindView(R.id.my_content)
    RelativeLayout myContent;
    @BindView(R.id.my_id_ll_top)
    LinearLayout myIdLlTop;
    @BindView(R.id.my_id_view)
    View myIdView;
    @BindView(R.id.icon1)
    ImageView icon1;
    @BindView(R.id.my_jingdutext)
    TextView myJingdutext;
    @BindView(R.id.my_jingdu)
    RelativeLayout myJingdu;
    @BindView(R.id.icon2)
    ImageView icon2;
    @BindView(R.id.my_updatetext)
    TextView myUpdatetext;
    @BindView(R.id.my_updateshuju)
    RelativeLayout myUpdateshuju;
    @BindView(R.id.icon3)
    ImageView icon3;
    @BindView(R.id.my_leveltext)
    TextView myLeveltext;
    @BindView(R.id.ratingBar)
    RatingBar ratingBar;
    @BindView(R.id.my_level)
    RelativeLayout myLevel;
    @BindView(R.id.icon4)
    ImageView icon4;
    @BindView(R.id.my_passtext)
    TextView myPasstext;
    @BindView(R.id.my_pass)
    RelativeLayout myPass;
    @BindView(R.id.icon5)
    ImageView icon5;
    @BindView(R.id.my_relogintext)
    TextView myRelogintext;
    @BindView(R.id.my_relogin)
    RelativeLayout myRelogin;
    @BindView(R.id.icon6)
    ImageView icon6;
    @BindView(R.id.my_checkupdatetext)
    TextView myCheckupdatetext;
    @BindView(R.id.my_arrow)
    ImageView myArrow;
    @BindView(R.id.my_tv_text)
    TextView myTvText;
    @BindView(R.id.my_checkupdate)
    RelativeLayout myCheckupdate;
    @BindView(R.id.my_id_ll_info)
    LinearLayout myIdLlInfo;
    @BindView(R.id.my_versiontext)
    TextView myVersiontext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_my);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.title_back, R.id.title_text, R.id.id_qiqiu, R.id.my_name, R.id.my_title, R.id.lay_1, R.id.my_nouploadtask, R.id.lay_2, R.id.my_dotask, R.id.lay_3, R.id.my_content, R.id.my_jingdu, R.id.my_updateshuju, R.id.ratingBar, R.id.my_level, R.id.my_relogin, R.id.my_checkupdatetext, R.id.my_checkupdate})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.title_back:
                break;
            case R.id.title_text:
                break;
            case R.id.id_qiqiu:
                break;
            case R.id.my_name:
                break;
            case R.id.my_title:
                break;
            case R.id.lay_1:
                break;
            case R.id.my_nouploadtask:
                break;
            case R.id.lay_2:
                break;
            case R.id.my_dotask:
                break;
            case R.id.lay_3:
                break;
            case R.id.my_content:
                break;
            case R.id.my_jingdu:
                break;
            case R.id.my_updateshuju:
                break;
            case R.id.ratingBar:
                break;
            case R.id.my_level:
                break;
            case R.id.my_relogin:
                break;
            case R.id.my_checkupdatetext:
                break;
            case R.id.my_checkupdate:
                break;
        }
    }
}
