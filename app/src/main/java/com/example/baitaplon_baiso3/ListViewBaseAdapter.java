package com.example.baitaplon_baiso3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListViewBaseAdapter extends BaseAdapter {
    public ArrayList<ListViewBean> arrayListListener137;
    private List<ListViewBean> mListenerList137;
    Context mContext137;

    public ListViewBaseAdapter(List<ListViewBean> mListenerList137, Context context) {
        mContext137 = context;
        this.mListenerList137 = mListenerList137;
        this.arrayListListener137 = new ArrayList<ListViewBean>();
        this.arrayListListener137.addAll(mListenerList137);
    }


    public class ViewHolder {
        ImageView mItemPic137;
        TextView mLangName137;
    }

    @Override
    public int getCount() {
        return mListenerList137.size();
    }

    @Override
    public Object getItem(int position) {
        return mListenerList137.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            view = LayoutInflater.from(mContext137).inflate(R.layout.child, null);
            holder = new ViewHolder();
            holder.mItemPic137 = (ImageView) view.findViewById(R.id.im_test);
            holder.mLangName137 = (TextView) view.findViewById(R.id.tv_langName);
            view.setTag(holder);

        } else {
            holder = (ViewHolder) view.getTag();
        }
        try {
            int image = mListenerList137.get(position).getImage();
            holder.mItemPic137.setImageResource(image);
            holder.mLangName137.setText(mListenerList137.get(position).getCourse());
        } catch (Exception ex) {
        }
        return view;
    }
}
