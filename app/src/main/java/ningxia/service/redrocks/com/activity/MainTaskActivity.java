package ningxia.service.redrocks.com.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.redrocks.service.ningxia.R;

import butterknife.ButterKnife;

/**
 * @author : Chunfa.Zhang
 * @since : 2016/3/19.
 * desc    :
 */
public class MainTaskActivity extends Activity {


    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub                                              
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_maintask);
        ButterKnife.bind(this);

        spinner = (Spinner) findViewById(R.id.spinnerAdapter);
        //声明一个SimpleAdapter独享，设置数据与对应关系                                 
        SimpleAdapter simpleAdapter = null;
/*        SimpleAdapter simpleAdapter = new SimpleAdapter(
        		MainTaskActivity.this, getData(), R.layout.item_task,
        		new String[]{"ivLogo", "applicationName"}, new int[]{
        				R.id.imageview, R.id.textview});
*/        //绑定Adapter到Spinner中                                                        
        spinner.setAdapter(simpleAdapter);
        //Spinner被选中事件绑定。                                                       
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                //parent为一个Map结构的和数据                                           
                Map<String, Object> map = (Map<String, Object>) parent
                        .getItemAtPosition(position);
                Toast.makeText(MainTaskActivity.this,
                        map.get("applicationName").toString(),
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });
    }

    public List<Map<String, Object>> getData() {
        //生成数据源                                                                    
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        //每个Map结构为一条数据，key与Adapter中定义的String数组中定义的一一对应。       
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("ivLogo", R.drawable.tasknew);
        map.put("applicationName", "新任务");
        list.add(map);
        Map<String, Object> map2 = new HashMap<String, Object>();
        map2.put("ivLogo", R.drawable.taskget);
        map2.put("applicationName", "已接单");
        list.add(map2);
        Map<String, Object> map3 = new HashMap<String, Object>();
        map3.put("ivLogo", R.drawable.taskgo);
        map3.put("applicationName", "已出发");
        list.add(map3);
        Map<String, Object> map4 = new HashMap<String, Object>();
        map4.put("ivLogo", R.drawable.taskarrive);
        map4.put("applicationName", "已到达");
        list.add(map4);
        Map<String, Object> map5 = new HashMap<String, Object>();
        map5.put("ivLogo", R.drawable.taskcomplete);
        map5.put("applicationName", "已完成");
        list.add(map5);
        return list;
    }

}
