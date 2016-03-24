package com.redrocks.service.ningxia.activity;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.redrocks.service.ningxia.dialog.WritePadDialog;
import com.redrocks.service.ningxia.linstener.DialogListener;

import butterknife.Bind;
import butterknife.ButterKnife;

public class HandwritingActivity extends Activity {
    /** Called when the activity is first created. */
	
	private Bitmap mSignBitmap;
	private String signPath;
	private ImageView ivSign;
	private TextView tvSign;
	@Bind(R.id.title_text)
	protected TextView title_text;
	private Button tv_button;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_evaluation);
		ButterKnife.bind(this);
		title_text.setText("签名与评价");
        ivSign =(ImageView)findViewById(R.id.iv_sign);
        tvSign = (TextView)findViewById(R.id.tv_sign);
        tv_button = (Button)findViewById(R.id.tv_okbutton);
        
        ivSign.setOnClickListener(signListener);
        tvSign.setOnClickListener(signListener);
        tv_button.setOnClickListener(signListener);
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
			
			switch(v.getId()){
			case R.id.iv_sign:
				writeTabletDialog.show();
				break;
			case R.id.tv_sign:
				writeTabletDialog.show();
				break;
			case R.id.tv_okbutton:
				Intent intent = new Intent(HandwritingActivity.this,RatingActivity.class);
				startActivity(intent);
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
}