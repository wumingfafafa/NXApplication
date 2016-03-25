package com.redrocks.service.ningxia.activity;

import android.app.Activity;
import android.os.Bundle;

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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_taskdetails);
        ButterKnife.bind(this);

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
