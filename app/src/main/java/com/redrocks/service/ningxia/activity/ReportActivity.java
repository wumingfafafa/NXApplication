package com.redrocks.service.ningxia.activity;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.MediaStore;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.redrocks.service.ningxia.util.Bimp;
import com.redrocks.service.ningxia.util.FileUtils;
import com.redrocks.service.ningxia.util.ImageItem;
import com.redrocks.service.ningxia.util.PublicWay;
import com.redrocks.service.ningxia.util.Res;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * 首页面activity
 *
 * @author king
 * @version 2014年10月18日  下午11:48:34
 * @QQ:595163260
 */
public class ReportActivity extends Activity {

    @BindView(R.id.title_back)
    ImageView titleBack;
    @BindView(R.id.title_text)
    TextView titleText;
    @BindView(R.id.title_right)
    TextView titleRight;
    @BindView(R.id.title_right_img)
    ImageView titleRightImg;
    @BindView(R.id.my_id_view)
    View myIdView;
    @BindView(R.id.report_taskname)
    TextView reportTaskname;
    @BindView(R.id.report_tasktext)
    TextView reportTasktext;
    @BindView(R.id.report_tasknumber)
    TextView reportTasknumber;
    @BindView(R.id.report_laytask)
    RelativeLayout reportLaytask;
    @BindView(R.id.report_jdhnum)
    TextView reportJdhnum;
    @BindView(R.id.report_jdhtext)
    EditText reportJdhtext;
    @BindView(R.id.report_laytasknum)
    RelativeLayout reportLaytasknum;
    @BindView(R.id.report_jdhtitle)
    TextView reportJdhtitle;
    @BindView(R.id.reprot_hdyx)
    TextView reprotHdyx;
    @BindView(R.id.report_hdyxbutton)
    ImageButton reportHdyxbutton;
    @BindView(R.id.report_hcz)
    TextView reportHcz;
    @BindView(R.id.report_hczbutton)
    ImageButton reportHczbutton;
    @BindView(R.id.report_mdbutton)
    ImageButton reportMdbutton;
    @BindView(R.id.report_laymd)
    RelativeLayout reportLaymd;
    @BindView(R.id.reprot_hwx)
    TextView reprotHwx;
    @BindView(R.id.report_hwxbutton)
    ImageButton reportHwxbutton;
    @BindView(R.id.report_xnf)
    TextView reportXnf;
    @BindView(R.id.report_xnfbutton)
    ImageButton reportXnfbutton;
    @BindView(R.id.report_gzms)
    EditText reportGzms;
    @BindView(R.id.noScrollgridview)
    GridView noScrollgridview;
    @BindView(R.id.reprot_khqz)
    TextView reprotKhqz;
    @BindView(R.id.report_khqztext)
    TextView reportKhqztext;
    @BindView(R.id.report_laykhqz)
    RelativeLayout reportLaykhqz;
    @BindView(R.id.reprot_bz)
    TextView reprotBz;
    @BindView(R.id.report_bztext)
    TextView reportBztext;
    @BindView(R.id.report_laybz)
    RelativeLayout reportLaybz;
    @BindView(R.id.my_id_ll_info)
    LinearLayout myIdLlInfo;
    @BindView(R.id.tv_uploadbutton)
    Button tvUploadbutton;
    @BindView(R.id.tv_savebutton)
    Button tvSavebutton;
//    private GridView noScrollgridview;
    private GridAdapter adapter;
    private View parentView;
    private PopupWindow pop = null;
    private LinearLayout ll_popup;
    public static Bitmap bimap;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Res.init(this);
        bimap = BitmapFactory.decodeResource(
                getResources(),
                R.drawable.icon_addpic_unfocused);
        PublicWay.activityList.add(this);
        parentView = getLayoutInflater().inflate(R.layout.layout_report, null);
        setContentView(parentView);
        ButterKnife.bind(this);
        Init();
    }

    public void Init() {

        titleText.setText("报告");

        pop = new PopupWindow(ReportActivity.this);

        View view = getLayoutInflater().inflate(R.layout.item_popupwindows, null);

        ll_popup = (LinearLayout) view.findViewById(R.id.ll_popup);

        pop.setWidth(LayoutParams.MATCH_PARENT);
        pop.setHeight(LayoutParams.WRAP_CONTENT);
        pop.setBackgroundDrawable(new BitmapDrawable());
        pop.setFocusable(true);
        pop.setOutsideTouchable(true);
        pop.setContentView(view);

        RelativeLayout parent = (RelativeLayout) view.findViewById(R.id.parent);
        Button bt1 = (Button) view
                .findViewById(R.id.item_popupwindows_camera);
        Button bt2 = (Button) view
                .findViewById(R.id.item_popupwindows_Photo);
        Button bt3 = (Button) view
                .findViewById(R.id.item_popupwindows_cancel);
        parent.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                pop.dismiss();
                ll_popup.clearAnimation();
            }
        });
        bt1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                photo();
                pop.dismiss();
                ll_popup.clearAnimation();
            }
        });
        bt2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ReportActivity.this,
                        AlbumActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.activity_translate_in, R.anim.activity_translate_out);
                pop.dismiss();
                ll_popup.clearAnimation();
            }
        });
        bt3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                pop.dismiss();
                ll_popup.clearAnimation();
            }
        });

//        noScrollgridview = (GridView) findViewById(R.id.noScrollgridview);
        noScrollgridview.setSelector(new ColorDrawable(Color.TRANSPARENT));
        adapter = new GridAdapter(this);
        adapter.update();
        noScrollgridview.setAdapter(adapter);
        noScrollgridview.setOnItemClickListener(new OnItemClickListener() {

            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                if (arg2 == Bimp.tempSelectBitmap.size()) {
                    Log.i("ddddddd", "----------");
                    ll_popup.startAnimation(AnimationUtils.loadAnimation(ReportActivity.this, R.anim.activity_translate_in));
                    pop.showAtLocation(parentView, Gravity.BOTTOM, 0, 0);
                } else {
                    Intent intent = new Intent(ReportActivity.this,
                            GalleryActivity.class);
                    intent.putExtra("position", "1");
                    intent.putExtra("ID", arg2);
                    startActivity(intent);
                }
            }
        });

    }

    @OnClick({R.id.title_back, R.id.title_text, R.id.report_hdyxbutton, R.id.report_hczbutton, R.id.report_mdbutton, R.id.report_hwxbutton, R.id.report_xnfbutton, R.id.report_laykhqz, R.id.tv_uploadbutton, R.id.tv_savebutton})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.title_back:
                finish();
                break;
            case R.id.title_text:
                finish();
                break;
            case R.id.report_hdyxbutton:
                break;
            case R.id.report_hczbutton:
                break;
            case R.id.report_mdbutton:
                break;
            case R.id.report_hwxbutton:
                break;
            case R.id.report_xnfbutton:
                break;
            case R.id.report_laykhqz:
                Intent intent2 = new Intent(this,HandwritingActivity.class);
                startActivity(intent2);
                break;
            case R.id.tv_uploadbutton:
                finish();
                break;
            case R.id.tv_savebutton:
                finish();
                break;
        }
    }

    @SuppressLint("HandlerLeak")
    public class GridAdapter extends BaseAdapter {
        private LayoutInflater inflater;
        private int selectedPosition = -1;
        private boolean shape;

        public boolean isShape() {
            return shape;
        }

        public void setShape(boolean shape) {
            this.shape = shape;
        }

        public GridAdapter(Context context) {
            inflater = LayoutInflater.from(context);
        }

        public void update() {
            loading();
        }

        public int getCount() {
            if (Bimp.tempSelectBitmap.size() == 9) {
                return 9;
            }
            return (Bimp.tempSelectBitmap.size() + 1);
        }

        public Object getItem(int arg0) {
            return null;
        }

        public long getItemId(int arg0) {
            return 0;
        }

        public void setSelectedPosition(int position) {
            selectedPosition = position;
        }

        public int getSelectedPosition() {
            return selectedPosition;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder = null;
            if (convertView == null) {
                convertView = inflater.inflate(R.layout.item_published_grida,
                        parent, false);
                holder = new ViewHolder();
                holder.image = (ImageView) convertView
                        .findViewById(R.id.item_grida_image);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            if (position == Bimp.tempSelectBitmap.size()) {
                holder.image.setImageBitmap(BitmapFactory.decodeResource(
                        getResources(), R.drawable.icon_addpic_unfocused));
                if (position == 9) {
                    holder.image.setVisibility(View.GONE);
                }
            } else {
                holder.image.setImageBitmap(Bimp.tempSelectBitmap.get(position).getBitmap());
            }

            return convertView;
        }

        public class ViewHolder {
            public ImageView image;
        }

        Handler handler = new Handler() {
            public void handleMessage(Message msg) {
                switch (msg.what) {
                    case 1:
                        adapter.notifyDataSetChanged();
                        break;
                }
                super.handleMessage(msg);
            }
        };

        public void loading() {
            new Thread(new Runnable() {
                public void run() {
                    while (true) {
                        if (Bimp.max == Bimp.tempSelectBitmap.size()) {
                            Message message = new Message();
                            message.what = 1;
                            handler.sendMessage(message);
                            break;
                        } else {
                            Bimp.max += 1;
                            Message message = new Message();
                            message.what = 1;
                            handler.sendMessage(message);
                        }
                    }
                }
            }).start();
        }
    }

    public String getString(String s) {
        String path = null;
        if (s == null)
            return "";
        for (int i = s.length() - 1; i > 0; i++) {
            s.charAt(i);
        }
        return path;
    }

    protected void onRestart() {
        adapter.update();
        super.onRestart();
    }

    private static final int TAKE_PICTURE = 0x000001;

    public void photo() {
        Intent openCameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(openCameraIntent, TAKE_PICTURE);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case TAKE_PICTURE:
                if (Bimp.tempSelectBitmap.size() < 9 && resultCode == RESULT_OK) {

                    String fileName = String.valueOf(System.currentTimeMillis());
                    Bitmap bm = (Bitmap) data.getExtras().get("data");
                    FileUtils.saveBitmap(bm, fileName);

                    ImageItem takePhoto = new ImageItem();
                    takePhoto.setBitmap(bm);
                    Bimp.tempSelectBitmap.add(takePhoto);
                }
                break;
        }
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            for (int i = 0; i < PublicWay.activityList.size(); i++) {
                if (null != PublicWay.activityList.get(i)) {
                    PublicWay.activityList.get(i).finish();
                }
            }
            System.exit(0);
        }
        return true;
    }

}

