package com.redrocks.service.ningxia.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.redrocks.service.ningxia.adapter.TaskAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @Bind(R.id.title_back)
    ImageView titleBack;
    @Bind(R.id.title_text)
    TextView titleText;
    @Bind(R.id.title_right)
    TextView titleRight;
    @Bind(R.id.spinnerAdapter)
    Spinner spinnerAdapter;
    @Bind(R.id.tv_bgbutton)
    Button tvBgbutton;
//    @Bind(R.id.menusanj)
    static ImageView menusanj;

    public static int menucount = 0;
    private List<Map<String, Object>> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub                                              
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_maintask);
        ButterKnife.bind(this);
        menusanj = (ImageView)findViewById(R.id.menusanj);
        menusanj.setVisibility(View.VISIBLE);
        mData = getData();
        TaskAdapter adapter = new TaskAdapter(this, getData());
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

    @OnClick({R.id.title_back, R.id.title_text, R.id.tv_bgbutton, R.id.title_right_img,R.id.menusanj})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.title_back:
                Intent intent1 = new Intent(this, HistoryTaskActivity.class);
                startActivity(intent1);
                break;
            case R.id.title_text:
                Intent intent0 = new Intent(this, DialogActivity.class);
                startActivity(intent0);
                menucount = 1;
                refreshMenuicon();
                break;
            case R.id.menusanj:
                Intent intent01 = new Intent(this, DialogActivity.class);
                startActivity(intent01);
                menucount = 1;
                refreshMenuicon();
                break;
            case R.id.title_right_img:
                Intent intent = new Intent(this, MineActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_bgbutton:
                Intent intent2 = new Intent(this, ReportActivity.class);
                startActivity(intent2);
                break;
        }
    }
    static void refreshMenuicon(){
        if(menucount==1){
            menusanj.setImageResource(R.mipmap.menudown);
            menucount = 0;
        }else{
            menusanj.setImageResource(R.mipmap.menuup);
            menucount = 1;
        }
    }
    public static void setMenuCount(int count){
        menucount = count;
        refreshMenuicon();
    }

}
