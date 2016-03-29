package com.redrocks.service.ningxia.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.redrocks.service.ningxia.bean.User;
import com.redrocks.service.ningxia.util.JSONHelper;

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
        initView();

    }

    /**
     * 初始化视图
     */
    private void initView() {
        groupView = (LinearLayout) findViewById(R.id.middle_layout);

        // 新增子布局对象到父布局中
        for (int i = 0; i < 8; i++) {
            ImageView childImg;// 子视图ImageView
            TextView childName;// 子视图名称
            View childView;// 子视图View

            // 初始化子布局
            childView = LayoutInflater.from(this).inflate(
                    R.layout.item_img, null);
            childImg = (ImageView) childView.findViewById(R.id.child_img);
            childName = (TextView) childView.findViewById(R.id.child_name);

            childImg.setBackgroundResource(R.mipmap.ic_launcher );
            childName.setText("测试子视图" + i);
            groupView.addView(childView);// 将childView添加到父布局
        }
    }

    void testObj(){
        try {
            User user = new User();
            user.setName("abcd");
            user.setPassword("123456");

            User user1 = new User();
            user.setName("abcdf");
            user.setPassword("1234567");

            String jsonStrUser = JSONHelper.toJSON(user);   //序列化
            User jsonUser = JSONHelper.parseObject(jsonStrUser, User.class);    //反序列化
            Map mapUser = JSONHelper.parseObject(jsonStrUser, HashMap.class);   //反序列化


            List sourceList = new ArrayList<User>();
            sourceList.add(user);
            sourceList.add(user1);
            String jsonStrUserList = JSONHelper.toJSON(sourceList);         //序列化
            List listUser = (List) JSONHelper.parseCollection(jsonStrUserList, List.class, User.class); //反序列化
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
