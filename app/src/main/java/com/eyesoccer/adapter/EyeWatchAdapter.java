package com.eyesoccer.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.VideoView;

import com.eyesoccer.R;

/**
 * Created by ERD on 11/21/2016.
 */

public class EyeWatchAdapter extends RecyclerView.Adapter<EyeWatchAdapter.ViewHolder> {
    private static final String TAG = "CustomAdapter";

    private String[] mDataSet;
    private int[] mDataSetTypes;

    public static final int EYE_WATCH = 0;
    public static final int EYE_WATCH_VIDEO_RECOMMENDED = 1;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View v) {
            super(v);
        }
    }

    public class NewsViewHolder extends ViewHolder {
        TextView title;
        TextView desc;
        TextView date;
        VideoView videoViewEyeWatch;

        public NewsViewHolder(View v) {
            super(v);
            this.title = (TextView) v.findViewById(R.id.title);
            this.desc = (TextView) v.findViewById(R.id.desc);
            this.date = (TextView) v.findViewById(R.id.datetime);
            this.videoViewEyeWatch = (VideoView) v.findViewById(R.id.videoView_eye_watch);
        }
    }

    public class NewsRecommendViewHolder extends ViewHolder {
        TextView title;
        TextView datetime;
        VideoView vid_news;

        public NewsRecommendViewHolder(View v) {
            super(v);
            this.title = (TextView) v.findViewById(R.id.title);
            this.datetime = (TextView) v.findViewById(R.id.datetime);
            this.vid_news = (VideoView) v.findViewById(R.id.vid_eye_soccer);
        }
    }


    public EyeWatchAdapter(String[] dataSet, int[] dataSetTypes) {
        mDataSet = dataSet;
        mDataSetTypes = dataSetTypes;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v;
        if (viewType == EYE_WATCH) {
            v = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.card_eye_watch, viewGroup, false);

            return new NewsViewHolder(v);
        } else {
            v = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.card_eye_watch_recommend, viewGroup, false);
            return new NewsRecommendViewHolder(v);
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        if (viewHolder.getItemViewType() == EYE_WATCH) {
            NewsViewHolder holder = (NewsViewHolder) viewHolder;
            holder.title.setText(mDataSet[position]);
        }
        else {
            NewsRecommendViewHolder holder = (NewsRecommendViewHolder) viewHolder;
            holder.title.setText(mDataSet[position]);
        }
    }

    @Override
    public int getItemCount() {
        return mDataSet.length;
    }

    @Override
    public int getItemViewType(int position) {
        return mDataSetTypes[position];
    }
}