package com.learn.learning.activitys.main.view.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.learn.learning.R;
import com.learn.learning.app.GlideApp;
import com.learn.learning.databinding.BannerItemBinding;

import java.util.ArrayList;
import java.util.List;

public class BannerAdapter extends RecyclerView.Adapter<BannerAdapter.BannerHolder> {

    BannerItemBinding binding;

    List<String> mlist = new ArrayList<>();
    Context context;

    public BannerAdapter(Context context) {
        this.context = context;
    }
    @NonNull
    @Override
    public BannerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = DataBindingUtil.inflate(inflater, R.layout.banner_item, parent, false);
        BannerHolder bannerHolder = new BannerHolder(binding);
        return bannerHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BannerHolder holder, int position) {

        if (mlist == null || mlist.isEmpty())
            return;
        String url = mlist.get(position % mlist.size());
       // Glide.with(context).load(url).into(holder.imageView);
        GlideApp.with(context)
                .load(url)
                .placeholder(R.mipmap.img_default)
                .error(R.mipmap.img_default)
                .into(holder.imageView);

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }

    static class BannerHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public BannerHolder(BannerItemBinding binding) {
            super(binding.getRoot());
            imageView = binding.ivBanner;
        }
    }

    public void setUrllist(List<String> mlist) {
        this.mlist = mlist;
        notifyDataSetChanged();
    }
}
