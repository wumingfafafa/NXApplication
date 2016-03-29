package com.redrocks.service.ningxia.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.redrocks.service.ningxia.dialog.WritePadDialog;
import com.redrocks.service.ningxia.linstener.DialogListener;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HandwritingActivity extends Activity {
    @Bind(R.id.title_back)
    ImageView titleBack;
    @Bind(R.id.title_text)
    TextView titleText;
    @Bind(R.id.title_right)
    TextView titleRight;
    @Bind(R.id.title_right_img)
    ImageView titleRightImg;
    @Bind(R.id.score_lay1)
    LinearLayout scoreLay1;
    @Bind(R.id.tv_ts)
    TextView tvTs;
    @Bind(R.id.zyxratingBar)
    RatingBar zyxratingBar;
    @Bind(R.id.relay1)
    RelativeLayout relay1;
    @Bind(R.id.fwtdratingBar)
    RatingBar fwtdratingBar;
    @Bind(R.id.relay2)
    RelativeLayout relay2;
    @Bind(R.id.rwwcdratingBar)
    RatingBar rwwcdratingBar;
    @Bind(R.id.relay3)
    RelativeLayout relay3;
    @Bind(R.id.strut)
    View strut;
    @Bind(R.id.tv_rebutton)
    Button tvRebutton;
    @Bind(R.id.tv_okbutton)
    Button tvOkbutton;
    /**
     * Called when the activity is first created.
     */

    private Bitmap mSignBitmap;
    private String signPath;
    private ImageView ivSign;
    private TextView tvSign;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_evaluation);
        ButterKnife.bind(this);
        titleText.setText("签名与评价");
        ivSign = (ImageView) findViewById(R.id.iv_sign);
        tvSign = (TextView) findViewById(R.id.tv_sign);

        ivSign.setOnClickListener(signListener);
        tvSign.setOnClickListener(signListener);
    }


    private OnClickListener signListener = new OnClickListener() {

        @Override
        public void onClick(View v) {
            WritePadDialog writeTabletDialog = new WritePadDialog(
                    HandwritingActivity.this, new DialogListener() {
                @Override
                public void refreshActivity(Object object) {

                    mSignBitmap = (Bitmap) object;
                    signPath = createFile();
                            /*BitmapFactory.Options options = new BitmapFactory.Options();
							options.inSampleSize = 15;
							options.inTempStorage = new byte[5 * 1024];
							Bitmap zoombm = BitmapFactory.decodeFile(signPath, options);*/
                    ivSign.setImageBitmap(mSignBitmap);
                    tvSign.setVisibility(View.GONE);
                }
            });

            switch (v.getId()) {
                case R.id.iv_sign:
                    writeTabletDialog.show();
                    break;
                case R.id.tv_sign:
                    writeTabletDialog.show();
                    break;
            }

        }
    };

    /**
     * 创建手写签名文件
     *
     * @return
     */
    private String createFile() {
        ByteArrayOutputStream baos = null;
        String _path = null;
        try {
            String sign_dir = Environment.getExternalStorageDirectory() + File.separator;
            _path = sign_dir + System.currentTimeMillis() + ".jpg";
            baos = new ByteArrayOutputStream();
            mSignBitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos);
            byte[] photoBytes = baos.toByteArray();
            if (photoBytes != null) {
                new FileOutputStream(new File(_path)).write(photoBytes);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (baos != null)
                    baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return _path;
    }

    @OnClick({R.id.title_back, R.id.title_text, R.id.zyxratingBar, R.id.fwtdratingBar, R.id.rwwcdratingBar, R.id.tv_rebutton, R.id.tv_okbutton})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.title_back:
                finish();
                break;
            case R.id.title_text:
                break;
            case R.id.zyxratingBar:
                break;
            case R.id.fwtdratingBar:
                break;
            case R.id.rwwcdratingBar:
                break;
            case R.id.tv_rebutton:
                finish();
                break;
            case R.id.tv_okbutton:
                finish();
                break;
        }
    }
}