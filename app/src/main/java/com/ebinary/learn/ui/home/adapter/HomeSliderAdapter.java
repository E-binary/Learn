package com.ebinary.learn.ui.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.appcompat.widget.AppCompatImageView;

import com.bumptech.glide.Glide;
import com.ebinary.learn.R;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.text.CollationElementIterator;

public class HomeSliderAdapter extends SliderViewAdapter<HomeSliderAdapter.SliderAdapterVH> {

    private Context context;

    public HomeSliderAdapter(Context context) {
        this.context = context;
    }

    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_slider_layout_item, null);
        return new SliderAdapterVH(inflate);
    }
    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, int position) {

        switch (position) {
            case 0:
                Glide.with(viewHolder.itemView)
                        .load(R.drawable.science1)
                        .into(viewHolder.imageViewBackground);
                break;
            case 1:
                Glide.with(viewHolder.itemView)
                        .load(R.drawable.science2)
                        .into(viewHolder.imageViewBackground);
                break;
            case 2:
                Glide.with(viewHolder.itemView)
                        .load(R.drawable.commerce1)
                        .into(viewHolder.imageViewBackground);
                break;
            case 3:
                Glide.with(viewHolder.itemView)
                        .load(R.drawable.commerce2)
                        .into(viewHolder.imageViewBackground);
                break;
            case 4:
                Glide.with(viewHolder.itemView)
                        .load(R.drawable.humanities1)
                        .into(viewHolder.imageViewBackground);
                break;
            case 5:
                Glide.with(viewHolder.itemView)
                        .load(R.drawable.humanities2)
                        .into(viewHolder.imageViewBackground);
                break;

        }

    }

    @Override
    public int getCount() {
        //slider view count could be dynamic size
        return 6;
    }


    class SliderAdapterVH extends SliderViewAdapter.ViewHolder {

        public CollationElementIterator textViewDescription;
        View itemView;
        AppCompatImageView imageViewBackground;

        public SliderAdapterVH(View itemView) {
            super(itemView);
            imageViewBackground = itemView.findViewById(R.id.iv_auto_image_slider);
            this.itemView = itemView;
        }
    }
}