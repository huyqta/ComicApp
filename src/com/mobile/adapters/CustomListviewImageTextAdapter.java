package com.mobile.adapters;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mobile.comicapp.R;
import com.mobile.comicapp.R.drawable;
import com.mobile.objects.MyChapter;
import com.mobile.utils.GlobalValues;

public class CustomListviewImageTextAdapter extends BaseAdapter {

	List<MyChapter> ListChapters = GlobalValues.ListChapter;
	Context context;

	public CustomListviewImageTextAdapter(Context context) {
		this.context = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return this.ListChapters.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return this.ListChapters.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return this.ListChapters.get(position).getId();
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater mInflater = (LayoutInflater) this.context
				.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
		if (mInflater == null)
			return null;
		ImageView imageview = null;
		TextView textview1 = null;
		TextView textview2 = null;
		TextView textview3 = null;

		convertView = mInflater.inflate(R.layout.image_3text_item, null);

		imageview = (ImageView) convertView.findViewById(R.id.img_3txt_image);
		textview1 = (TextView) convertView.findViewById(R.id.img_3txt_text1);
		textview2 = (TextView) convertView.findViewById(R.id.img_3txt_text2);
		textview3 = (TextView) convertView.findViewById(R.id.img_3txt_text3);

		imageview.setBackgroundResource(drawable.ic_launcher);
		textview1.setText(String.format("Tập: %s",
				this.ListChapters.get(position).getTitle()));
		textview2.setText(String.format("Số trang: %s",
				this.ListChapters.get(position).getPage()));
		textview3.setText(String.format("Tác giả: %s",
				this.ListChapters.get(position).getAuthor()));

		return convertView;
	}
}
