package com.redrocks.service.ningxia.activity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.redrocks.service.ningxia.activity.R;
import com.redrocks.service.ningxia.bean.Person;
import com.redrocks.service.ningxia.util.HttpUtils;
import com.redrocks.service.ningxia.util.JSONUtils;

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
	private static String PATH = "http://192.168.0.103:8080/JsonProject/servlet/JsonServlet";
	private static final String TAG = "MainActivity";
	@OnClick({ R.id.icon_user, R.id.login_user, R.id.icon_pass, R.id.login_pass, R.id.login_button })
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.icon_user:
//			Intent intent1 = new Intent(this,ReportActivity.class);
//			Intent intent1 = new Intent(this,EvaluationActivity.class);
//			startActivity(intent1);


			Thread t1 = new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					String path1 = PATH + "?action_flag=person";
					String jsonString1 = HttpUtils.getJsonContent(path1);
					Message msg = new Message();
					msg.what = 1;
					msg.obj = jsonString1;
					handler.sendMessage(msg);
				}
			});
			t1.start();
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

	private Handler handler = new Handler() {

		@Override
		public void handleMessage(Message msg) {
			// TODO Auto-generated method stub
			switch (msg.what) {
				case 1:
					//解析json数组
//					JSONUtils.fromJson(content, new TypeToken<ListVO<Config>>() {});
//解析json对象
//					JSONUtils.fromJson(content, new TypeToken<Result>() {});
					Person p = new Person();
					p.setAddress("111");
					p.setId(22);
					p.setName("333");
					String json =  new Gson().toJson(p);
//					Toast.makeText(LoginActivity.this,"json="+json,
//							Toast.LENGTH_LONG).show();
//					Person person = new Gson().fromJson(json, Person.class);
//					Person person = new Gson().fromJson((String) msg.obj, Person.class);
//					Person person = JSONUtils.fromJson((String) msg.obj, new TypeToken<Person>() {});
					Person person = JSONUtils.fromJson(json, new TypeToken<Person>() {});
//					Toast.makeText(LoginActivity.this,"(String) msg.obj="+(String) msg.obj+";" + person.toString(),
//							Toast.LENGTH_LONG).show();
					Toast.makeText(LoginActivity.this,"(String) msg.obj="+(String) msg.obj+";" + person.toString(),
							Toast.LENGTH_LONG).show();
					break;

//				case 2:
//					List<Person> list2 = JsonTools.getPersons("persons", (String) msg.obj);
//					Toast.makeText(MainActivity.this,
//							"" + list2.toString(),
//							Toast.LENGTH_LONG).show();
//					mytext.setText(list2.toString());
//					break;
//
//				case 3:
//					List<String> list3 = JsonTools.getList("listString", (String) msg.obj);
//					Toast.makeText(MainActivity.this,
//							"" + list3.toString(),
//							Toast.LENGTH_LONG).show();
//					mytext.setText(list3.toString());
//					break;
//				case 4:
//					List<Map<String, Object>> list4 = JsonTools.getListMap("listMap",
//							(String) msg.obj);
//					Toast.makeText(MainActivity.this,
//							"" + list4.toString(),
//							Toast.LENGTH_LONG).show();
//					mytext.setText(list4.toString());
//					break;
			}
		}

	};

}
