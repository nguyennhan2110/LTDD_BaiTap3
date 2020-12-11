package com.example.baitaplon_baiso3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends ArrayAdapter<String> {

    private final Activity context137;
    private final String[] web137;
    private final String[] cs137;
    private final Integer[] imageId137;

    public CustomList(Activity context137, String[] web137, String[] cs137, Integer[] imageId137) {
        super(context137, R.layout.activity_custom_list, web137);
        this.context137 = context137;
        this.web137 = web137;
        this.cs137 = cs137;
        this.imageId137 = imageId137;

    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater = context137.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_custom_list, null, true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.t1);
        TextView txtTitle2 = (TextView) rowView.findViewById(R.id.t2);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.h);
        txtTitle.setText(web137[position]);
        txtTitle2.setText(cs137[position]);

        imageView.setImageResource(imageId137[position]);
        return rowView;

    }
}