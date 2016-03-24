package ningxia.service.redrocks.com.activity;

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
    @Bind(R.id.my_tv_about11)
    TextView myTvAbout11;
    @Bind(R.id.my_tv_about10)
    TextView myTvAbout10;
    @Bind(R.id.lay_1)
    RelativeLayout lay1;
    @Bind(R.id.my_tv_about21)
    TextView myTvAbout21;
    @Bind(R.id.my_tv_about20)
    TextView myTvAbout20;
    @Bind(R.id.lay_2)
    RelativeLayout lay2;
    @Bind(R.id.my_tv_about31)
    TextView myTvAbout31;
    @Bind(R.id.my_tv_about30)
    TextView myTvAbout30;
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
    @Bind(R.id.my_tv_about)
    TextView myTvAbout;
    @Bind(R.id.my_about)
    RelativeLayout myAbout;
    @Bind(R.id.icon2)
    ImageView icon2;
    @Bind(R.id.my_tv_team)
    TextView myTvTeam;
    @Bind(R.id.my_team_title)
    RelativeLayout myTeamTitle;
    @Bind(R.id.icon3)
    ImageView icon3;
    @Bind(R.id.my_tv_friends)
    TextView myTvFriends;
    @Bind(R.id.ratingBar)
    RatingBar ratingBar;
    @Bind(R.id.my_invite_friends)
    RelativeLayout myInviteFriends;
    @Bind(R.id.icon4)
    ImageView icon4;
    @Bind(R.id.my_tv_score)
    TextView myTvScore;
    @Bind(R.id.my_score)
    RelativeLayout myScore;
    @Bind(R.id.icon5)
    ImageView icon5;
    @Bind(R.id.my_tv_update)
    TextView myTvUpdate;
    @Bind(R.id.my_update)
    RelativeLayout myUpdate;
    @Bind(R.id.icon6)
    ImageView icon6;
    @Bind(R.id.my_tv_website)
    TextView myTvWebsite;
    @Bind(R.id.my_arrow)
    ImageView myArrow;
    @Bind(R.id.my_tv_text)
    TextView myTvText;
    @Bind(R.id.my_official_website)
    RelativeLayout myOfficialWebsite;
    @Bind(R.id.my_id_ll_info)
    LinearLayout myIdLlInfo;
    @Bind(R.id.my_login_out)
    TextView myLoginOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_my);
        ButterKnife.bind(this);
    }

}
