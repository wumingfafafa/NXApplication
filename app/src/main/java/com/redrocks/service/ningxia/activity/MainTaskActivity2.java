package com.redrocks.service.ningxia.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.redrocks.service.ningxia.adapter.MyAdapter;

import com.redrocks.service.ningxia.activity.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author : Chunfa.Zhang
 * @since : 2016/3/19.
 * desc    :
 */
public class MainTaskActivity2 extends Activity {

	@Bind(R.id.title_right_img)
	ImageView title_right_img;
	@Bind(R.id.main_listview)
	ListView main_listview;
	
	private List<Map<String, Object>> mData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub                                              
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_maintask);
        ButterKnife.bind(this);
        mData = getData();
        MyAdapter adapter = new MyAdapter(this,getData());
        main_listview.setAdapter(adapter);
    }
    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
 /*
  * public ImageView icon2;
		public TextView text1;
		public TextView item_title;
		public TextView item_code;
		public TextView item_name;
		public TextView item_phone;
		public TextView item_address;
  */
        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("icon2", 1);
        map.put("icon2", R.drawable.taskarrive);
        map.put("text1", "已送达");
        map.put("item_title", "机顶盒故障维修");
        map.put("item_code", "(1238572837942875)");
        map.put("item_name", "张先生");
        map.put("item_phone", "(15811546789)");
        map.put("item_address", "北京市三里屯1289号专卖店对面");
        list.add(map);
 
        map = new HashMap<String, Object>();
//        map.put("icon2", 2);
        map.put("icon2", R.drawable.taskgo);
        map.put("text1", "已发出");
        map.put("item_title", "机顶盒故障维修");
        map.put("item_code", "(1238572837942875)");
        map.put("item_name", "张先生");
        map.put("item_phone", "(15811546789)");
        map.put("item_address", "北京市三里屯1289号专卖店对面");
        list.add(map);
 
        map = new HashMap<String, Object>();
//        map.put("icon2",3);
        map.put("icon2", R.drawable.tasknew);
        map.put("text1", "新任务");
        map.put("item_title", "机顶盒故障维修");
        map.put("item_code", "(1238572837942875)");
        map.put("item_name", "张先生");
        map.put("item_phone", "(15811546789)");
        map.put("item_address", "北京市三里屯1289号专卖店对面");
        list.add(map);
         
        return list;
    }
    @OnClick(R.id.title_right_img)
    public void startMyActivity(){
    	Intent intent = new Intent(this,MineActivity.class);
    	startActivity(intent);
    }
     
}
