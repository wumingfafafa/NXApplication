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

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MineActivity extends Activity {

    @Bind(R.id.title_back)
    ImageView titleBack;
    @Bind(R.id.title_text)
    TextView titleText;
    @Bind(R.id.title_right)
    TextView titleRight;
    @Bind(R.id.title_right_img)
    ImageView titleRightImg;
    @Bind(R.id.id_qiqiu)
    RoundImageView idQiqiu;
    @Bind(R.id.my_name)
    TextView myName;
    @Bind(R.id.my_title)
    TextView myTitle;
    @Bind(R.id.my_newtasknum)
    TextView myNewtasknum;
    @Bind(R.id.lay_1)
    RelativeLayout lay1;
    @Bind(R.id.my_nouploadtask)
    TextView myNouploadtask;
    @Bind(R.id.lay_2)
    RelativeLayout lay2;
    @Bind(R.id.my_dotask)
    TextView myDotask;
    @Bind(R.id.lay_3)
    RelativeLayout lay3;
    @Bind(R.id.my_content)
    RelativeLayout myContent;
    @Bind(R.id.my_id_ll_top)
    LinearLayout myIdLlTop;
    @Bind(R.id.my_id_view)
    View myIdView;
    @Bind(R.id.icon1)
    ImageView icon1;
    @Bind(R.id.my_jingdutext)
    TextView myJingdutext;
    @Bind(R.id.my_jingdu)
    RelativeLayout myJingdu;
    @Bind(R.id.icon2)
    ImageView icon2;
    @Bind(R.id.my_updatetext)
    TextView myUpdatetext;
    @Bind(R.id.my_updateshuju)
    RelativeLayout myUpdateshuju;
    @Bind(R.id.icon3)
    ImageView icon3;
    @Bind(R.id.my_leveltext)
    TextView myLeveltext;
    @Bind(R.id.ratingBar)
    RatingBar ratingBar;
    @Bind(R.id.my_level)
    RelativeLayout myLevel;
    @Bind(R.id.icon4)
    ImageView icon4;
    @Bind(R.id.my_passtext)
    TextView myPasstext;
    @Bind(R.id.my_pass)
    RelativeLayout myPass;
    @Bind(R.id.icon5)
    ImageView icon5;
    @Bind(R.id.my_relogintext)
    TextView myRelogintext;
    @Bind(R.id.my_relogin)
    RelativeLayout myRelogin;
    @Bind(R.id.icon6)
    ImageView icon6;
    @Bind(R.id.my_checkupdatetext)
    TextView myCheckupdatetext;
    @Bind(R.id.my_arrow)
    ImageView myArrow;
    @Bind(R.id.my_tv_text)
    TextView myTvText;
    @Bind(R.id.my_checkupdate)
    RelativeLayout myCheckupdate;
    @Bind(R.id.my_id_ll_info)
    LinearLayout myIdLlInfo;
    @Bind(R.id.my_versiontext)
    TextView myVersiontext;
    @Bind(R.id.my_versiontext1)
    TextView myVersiontext1;

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
