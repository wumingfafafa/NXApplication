package com.redrocks.service.ningxia.adapter;

import java.util.List;
import java.util.Map;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.redrocks.service.ningxia.activity.R;
import com.redrocks.service.ningxia.view.RoundImageView;

public class MyAdapter extends BaseAdapter {
	private LayoutInflater mInflater;
	private List<Map<String, Object>> mData;
	public MyAdapter(Context context,List<Map<String, Object>> mData) {
		this.mInflater = LayoutInflater.from(context);
		this.mData = mData;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return this.mData.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder = null;
		if (convertView == null) {

			holder = new ViewHolder();
			convertView = mInflater.inflate(R.layout.item_task, null);
			holder.icon2 = (RoundImageView) convertView.findViewById(R.id.icon2);
			holder.text1 = (TextView) convertView.findViewById(R.id.text1);
			holder.item_title = (TextView) convertView.findViewById(R.id.item_title);
			holder.item_code = (TextView) convertView.findViewById(R.id.item_code);
			holder.item_name = (TextView) convertView.findViewById(R.id.item_name);
			holder.item_phone = (TextView) convertView.findViewById(R.id.item_phone);
			holder.item_address = (TextView) convertView.findViewById(R.id.item_address);
			convertView.setTag(holder);

		} else {

			holder = (ViewHolder) convertView.getTag();
		}
//		if((Integer) mData.get(position).get("icon2")==1){
//			
//			holder.icon2.setBackgroundResource(R.drawable.taskarrive);
//		}
//		if((Integer) mData.get(position).get("icon2")==2){
//			
//			holder.icon2.setBackgroundResource(R.drawable.taskgo);
//		}
//		if((Integer) mData.get(position).get("icon2")==3){
//			
//			holder.icon2.setBackgroundResource(R.drawable.tasknew);
//		}
		holder.icon2.setImageResource((Integer) mData.get(position).get("icon2"));
		holder.text1.setText((String) mData.get(position).get("text1"));
		holder.item_title.setText((String) mData.get(position).get("item_title"));
		holder.item_code.setText((String) mData.get(position).get("item_code"));
		holder.item_name.setText((String) mData.get(position).get("item_name"));
		holder.item_phone.setText((String) mData.get(position).get("item_phone"));
		holder.item_address.setText((String) mData.get(position).get("item_address"));

		return convertView;
	}

	public final class ViewHolder {
		public RoundImageView icon2;
		public TextView text1;
		public TextView item_title;
		public TextView item_code;
		public TextView item_name;
		public TextView item_phone;
		public TextView item_address;
	}

}
