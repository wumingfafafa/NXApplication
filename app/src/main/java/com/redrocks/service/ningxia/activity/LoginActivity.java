package com.redrocks.service.ningxia.activity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import com.redrocks.service.ningxia.activity.R;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
public class LoginActivity extends Activity {

	@Bind(R.id.icon_user)
	ImageView iconUser;
	@Bind(R.id.login_user)
	EditText loginUser;
	@Bind(R.id.icon_pass)
	ImageView iconPass;
	@Bind(R.id.login_pass)
	EditText loginPass;
	@Bind(R.id.login_button)
	Button loginButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_login);
		ButterKnife.bind(this);
	}

	@OnClick({ R.id.icon_user, R.id.login_user, R.id.icon_pass, R.id.login_pass, R.id.login_button })
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.icon_user:
			Intent intent1 = new Intent(this,EvaluationActivity.class);
			startActivity(intent1);
			break;
		case R.id.login_user:
			break;
		case R.id.icon_pass:
			Intent intent2 = new Intent(this,HandwritingActivity.class);
			startActivity(intent2);
			break;
		case R.id.login_pass:
			break;
		case R.id.login_button:
			 Intent intent = new Intent(this,MainTaskActivity2.class);
             startActivity(intent);
			break;
		}
	}

}
