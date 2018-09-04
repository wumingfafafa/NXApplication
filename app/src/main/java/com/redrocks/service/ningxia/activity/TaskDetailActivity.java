package com.redrocks.service.ningxia.activity;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.redrocks.service.ningxia.view.TagCloudView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by chuny on 2016/3/24.
 */
public class TaskDetailActivity extends Activity {
    @BindView(R.id.title_back)
    ImageView titleBack;
    @BindView(R.id.title_text)
    TextView titleText;
    @BindView(R.id.title_right)
    TextView titleRight;
    @BindView(R.id.title_right_img)
    ImageView titleRightImg;
    @BindView(R.id.detail_id_view)
    View detailIdView;
    @BindView(R.id.icon1)
    ImageView icon1;
    @BindView(R.id.detail_tv_about)
    TextView detailTvAbout;
    @BindView(R.id.detail_about)
    RelativeLayout detailAbout;
    @BindView(R.id.detail_tv_na)
    TextView detailTvNa;
    @BindView(R.id.detail_tv_name)
    TextView detailTvName;
    @BindView(R.id.detail_team_content0)
    RelativeLayout detailTeamContent0;
    @BindView(R.id.detail_tv_add)
    TextView detailTvAdd;
    @BindView(R.id.detail_tv_address)
    TextView detailTvAddress;
    @BindView(R.id.detail_team_content1)
    RelativeLayout detailTeamContent1;
    @BindView(R.id.detail_tv_pers)
    TextView detailTvPers;
    @BindView(R.id.detail_tv_person)
    TextView detailTvPerson;
    @BindView(R.id.detail_team_content2)
    RelativeLayout detailTeamContent2;
    @BindView(R.id.detail_tv_ph)
    TextView detailTvPh;
    @BindView(R.id.detail_tv_phone)
    TextView detailTvPhone;
    @BindView(R.id.detail_invite_content3)
    RelativeLayout detailInviteContent3;
    @BindView(R.id.detail_tv_sbgz)
    TextView detailTvSbgz;
    @BindView(R.id.detail_tv_dy)
    TextView detailTvDy;
    @BindView(R.id.detail_tv_dygz)
    TextView detailTvDygz;
    @BindView(R.id.detail_gz)
    RelativeLayout detailGz;
    @BindView(R.id.detail_tv_dy1)
    TextView detailTvDy1;
    @BindView(R.id.detail_tv_dygz1)
    TextView detailTvDygz1;
    @BindView(R.id.detail_gz1)
    RelativeLayout detailGz1;
    @BindView(R.id.detail_tv_xsq)
    TextView detailTvXsq;
    @BindView(R.id.detail_tv_xsqgz)
    TextView detailTvXsqgz;
    @BindView(R.id.detail_gz3)
    RelativeLayout detailGz3;
    @BindView(R.id.detail_tv_xsq1)
    TextView detailTvXsq1;
    @BindView(R.id.detail_tv_xsqgz1)
    TextView detailTvXsqgz1;
    @BindView(R.id.detail_gz4)
    RelativeLayout detailGz4;
    @BindView(R.id.my_tv_other)
    TextView myTvOther;
    @BindView(R.id.my_tv_othertext)
    TextView myTvOthertext;
    @BindView(R.id.my_team_otherlay)
    RelativeLayout myTeamOtherlay;
    @BindView(R.id.my_tv_note)
    TextView myTvNote;
    @BindView(R.id.my_tv_notetext)
    TextView myTvNotetext;
    @BindView(R.id.my_invite_notelay)
    RelativeLayout myInviteNotelay;
    @BindView(R.id.detail_tv_ti)
    TextView detailTvTi;
    @BindView(R.id.detail_tv_text)
    TextView detailTvText;
    @BindView(R.id.detail_official_timelay)
    RelativeLayout detailOfficialTimelay;
    @BindView(R.id.detail_id_ll_info)
    LinearLayout detailIdLlInfo;
    @BindView(R.id.tv_rebutton)
    Button tvRebutton;
    @BindView(R.id.tv_okbutton)
    Button tvOkbutton;
    @BindView(R.id.tv_arrbutton)
    Button tvArrbutton;
    @BindView(R.id.tag_cloud_view_4)
    TagCloudView tagCloudView4;
    @BindView(R.id.tag_cloud_view_5)
    TagCloudView tagCloudView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_taskdetails);
        ButterKnife.bind(this);
        initViews();
    }

    protected void initViews() {
        titleText.setText("任务详情");
        List<String> tags = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            tags.add("标签" + i);
        }
        tagCloudView4.setTags(tags);
        tagCloudView5.setTags(tags);
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
