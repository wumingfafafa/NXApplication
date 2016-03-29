package com.redrocks.service.ningxia.activity;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by chuny on 2016/3/24.
 */
public class TaskDetailActivity extends Activity {
    @Bind(R.id.title_back)
    ImageView titleBack;
    @Bind(R.id.title_text)
    TextView titleText;
    @Bind(R.id.title_right)
    TextView titleRight;
    @Bind(R.id.title_right_img)
    ImageView titleRightImg;
    @Bind(R.id.detail_id_view)
    View detailIdView;
    @Bind(R.id.icon1)
    ImageView icon1;
    @Bind(R.id.detail_tv_about)
    TextView detailTvAbout;
    @Bind(R.id.detail_about)
    RelativeLayout detailAbout;
    @Bind(R.id.detail_tv_na)
    TextView detailTvNa;
    @Bind(R.id.detail_tv_name)
    TextView detailTvName;
    @Bind(R.id.detail_team_content0)
    RelativeLayout detailTeamContent0;
    @Bind(R.id.detail_tv_add)
    TextView detailTvAdd;
    @Bind(R.id.detail_tv_address)
    TextView detailTvAddress;
    @Bind(R.id.detail_team_content1)
    RelativeLayout detailTeamContent1;
    @Bind(R.id.detail_tv_pers)
    TextView detailTvPers;
    @Bind(R.id.detail_tv_person)
    TextView detailTvPerson;
    @Bind(R.id.detail_team_content2)
    RelativeLayout detailTeamContent2;
    @Bind(R.id.detail_tv_ph)
    TextView detailTvPh;
    @Bind(R.id.detail_tv_phone)
    TextView detailTvPhone;
    @Bind(R.id.detail_invite_content3)
    RelativeLayout detailInviteContent3;
    @Bind(R.id.detail_tv_sbgz)
    TextView detailTvSbgz;
    @Bind(R.id.detail_tv_dy)
    TextView detailTvDy;
    @Bind(R.id.detail_tv_dygz)
    TextView detailTvDygz;
    @Bind(R.id.detail_gz)
    RelativeLayout detailGz;
    @Bind(R.id.detail_tv_dy1)
    TextView detailTvDy1;
    @Bind(R.id.detail_tv_dygz1)
    TextView detailTvDygz1;
    @Bind(R.id.detail_gz1)
    RelativeLayout detailGz1;
    @Bind(R.id.detail_tv_xsq)
    TextView detailTvXsq;
    @Bind(R.id.detail_tv_xsqgz)
    TextView detailTvXsqgz;
    @Bind(R.id.detail_gz3)
    RelativeLayout detailGz3;
    @Bind(R.id.detail_tv_xsq1)
    TextView detailTvXsq1;
    @Bind(R.id.detail_tv_xsqgz1)
    TextView detailTvXsqgz1;
    @Bind(R.id.detail_gz4)
    RelativeLayout detailGz4;
    @Bind(R.id.my_tv_other)
    TextView myTvOther;
    @Bind(R.id.my_tv_othertext)
    TextView myTvOthertext;
    @Bind(R.id.my_team_otherlay)
    RelativeLayout myTeamOtherlay;
    @Bind(R.id.my_tv_note)
    TextView myTvNote;
    @Bind(R.id.my_tv_notetext)
    TextView myTvNotetext;
    @Bind(R.id.my_invite_notelay)
    RelativeLayout myInviteNotelay;
    @Bind(R.id.detail_tv_ti)
    TextView detailTvTi;
    @Bind(R.id.detail_tv_text)
    TextView detailTvText;
    @Bind(R.id.detail_official_timelay)
    RelativeLayout detailOfficialTimelay;
    @Bind(R.id.detail_id_ll_info)
    LinearLayout detailIdLlInfo;
    @Bind(R.id.tv_rebutton)
    Button tvRebutton;
    @Bind(R.id.tv_okbutton)
    Button tvOkbutton;
    @Bind(R.id.tv_arrbutton)
    Button tvArrbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_taskdetails);
        ButterKnife.bind(this);
        initViews();
    }
    protected void initViews(){
        titleText.setText("任务详情");
    }

    @OnClick({R.id.title_back, R.id.title_text, R.id.title_right, R.id.title_right_img, R.id.detail_id_view, R.id.icon1, R.id.detail_tv_about, R.id.detail_tv_name, R.id.detail_tv_address, R.id.detail_tv_person, R.id.detail_tv_phone, R.id.detail_tv_sbgz, R.id.detail_tv_dy, R.id.detail_tv_dygz, R.id.detail_tv_dy1, R.id.detail_tv_dygz1, R.id.detail_gz1, R.id.detail_tv_xsq, R.id.detail_tv_xsqgz, R.id.detail_gz3, R.id.detail_tv_xsq1, R.id.detail_tv_xsqgz1, R.id.detail_gz4, R.id.my_tv_other, R.id.my_tv_othertext, R.id.my_team_otherlay, R.id.my_tv_note, R.id.my_tv_notetext, R.id.my_invite_notelay, R.id.detail_tv_ti, R.id.detail_tv_text, R.id.tv_rebutton, R.id.tv_okbutton, R.id.tv_arrbutton})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.title_back:
                finish();
                break;
            case R.id.title_text:
                break;
            case R.id.title_right:
                break;
            case R.id.title_right_img:
                break;
            case R.id.detail_id_view:
                break;
            case R.id.icon1:
                break;
            case R.id.detail_tv_about:
                break;
            case R.id.detail_tv_name:
                break;
            case R.id.detail_tv_address:
                break;
            case R.id.detail_tv_person:
                break;
            case R.id.detail_tv_phone:
                break;
            case R.id.detail_tv_sbgz:
                break;
            case R.id.detail_tv_dy:
                break;
            case R.id.detail_tv_dygz:
                break;
            case R.id.detail_tv_dy1:
                break;
            case R.id.detail_tv_dygz1:
                break;
            case R.id.detail_gz1:
                break;
            case R.id.detail_tv_xsq:
                break;
            case R.id.detail_tv_xsqgz:
                break;
            case R.id.detail_gz3:
                break;
            case R.id.detail_tv_xsq1:
                break;
            case R.id.detail_tv_xsqgz1:
                break;
            case R.id.detail_gz4:
                break;
            case R.id.my_tv_other:
                break;
            case R.id.my_tv_othertext:
                break;
            case R.id.my_team_otherlay:
                break;
            case R.id.my_tv_note:
                break;
            case R.id.my_tv_notetext:
                break;
            case R.id.my_invite_notelay:
                break;
            case R.id.detail_tv_ti:
                break;
            case R.id.detail_tv_text:
                break;
            case R.id.tv_rebutton:
                finish();
                break;
            case R.id.tv_okbutton:
                finish();
                break;
            case R.id.tv_arrbutton:
                finish();
                break;
        }
    }
}
