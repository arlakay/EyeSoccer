package com.eyesoccer.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.eyesoccer.R;
import com.eyesoccer.model.AndroidVersion;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by ERD on 11/22/2016.
 */

public class SupportersAdapter extends RecyclerView.Adapter<SupportersAdapter.ViewHolder> {
    private ArrayList<AndroidVersion> android;
    private Context context;

    public SupportersAdapter(Context context, ArrayList<AndroidVersion> android) {
        this.android = android;
        this.context = context;
    }

    @Override
    public SupportersAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_grid_supporter, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SupportersAdapter.ViewHolder viewHolder, int i) {
        viewHolder.tv_android.setText(android.get(i).getAndroid_version_name());
        Picasso.with(context).load(android.get(i).getAndroid_image_url()).resize(240, 120).into(viewHolder.img_android);
    }

    @Override
    public int getItemCount() {
        return android.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_android;
        private ImageView img_android;
        public ViewHolder(View view) {
            super(view);

            tv_android = (TextView)view.findViewById(R.id.release_date);
            img_android = (ImageView) view.findViewById(R.id.poster);
        }
    }

}