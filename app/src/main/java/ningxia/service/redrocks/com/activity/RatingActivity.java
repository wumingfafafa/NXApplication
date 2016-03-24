package ningxia.service.redrocks.com.activity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;

import com.redrocks.service.ningxia.R;

import android.app.Activity;
/**
 * RatingBar
 * 如果要自定义RatingBar更改它的外观,只需要在布局文件中修改其style即可
 * 
 * 参考资料:
 * 1 http://www.cnblogs.com/over140/archive/2010/11/18/1880455.html
 * 2 http://www.cnblogs.com/lipeil/archive/2012/07/13/2590457.html
 * 3 http://my.oschina.net/amigos/blog/60060
 *   Thank you very much
 *
 */
public class RatingActivity extends Activity {
  private RatingBar mRatingBar;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.layout_star);
    init();
  }
  
  private void init(){
    mRatingBar=(RatingBar) findViewById(R.id.ratingBar);
    //为RatingBar设置监听
    mRatingBar.setOnRatingBarChangeListener(new RatingBarChangeListenerImpl());
    //得到RatingBar的最大等级
    int max=mRatingBar.getMax();
    //得到RatingBar现在的等级
    float currentRating=mRatingBar.getRating();
    System.out.println("max="+max+",currentRating"+currentRating);
  }
  
  //注意onRatingChanged方法中的最后一个参数boolean fromUser:
  //若是由用户触摸手势或方向键轨迹球移动触发RatingBar的等级改变,返回true
  //若是由编程触发RatingBar的等级改变,返回false
  private class RatingBarChangeListenerImpl implements OnRatingBarChangeListener{
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
      
      System.out.println("现在的等级为 rating="+rating+",是否是用户触发 fromUser="+fromUser);
    }
    
  }

  
}