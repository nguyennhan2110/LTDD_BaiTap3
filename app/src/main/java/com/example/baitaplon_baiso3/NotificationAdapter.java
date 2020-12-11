package com.example.baitaplon_baiso3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import java.util.List;

public class NotificationAdapter extends BaseAdapter {
    private Context context137;
    private int layout137;
    private List<Notification> tblist137;

    public NotificationAdapter(Context context137, int layout137, List<Notification> tblist137) {
        this.context137 = context137;
        this.layout137 = layout137;
        this.tblist137 = tblist137;
    }


    @Override
    public int getCount() {
        return tblist137.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context137.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout137, null);
        TextView texttb = (TextView) view.findViewById(R.id.tvtb);
        TextView texttg = (TextView) view.findViewById(R.id.tvtg);
        ImageView image = (ImageView) view.findViewById(R.id.imagetb);
        Notification tb = tblist137.get(position);
        texttb.setText(tb.getTexttb());
        texttg.setText(tb.getTg());
        image.setImageResource(tb.getImage());
        return view;
    }


}
