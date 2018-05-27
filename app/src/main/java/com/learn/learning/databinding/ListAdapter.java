package com.learn.learning.databinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.learn.learning.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListAdapter extends RecyclerView.Adapter<Holder> {
    Context mContext;
    List<Person> mDatas;
    private List<Integer> colorsR = new ArrayList<>();
    private List<Integer> colorsG = new ArrayList<>();
    private List<Integer> colorsB = new ArrayList<>();

    public ListAdapter(Context context, List<Person> datas) {
        mContext = context;
        mDatas = datas;
        initColor();
    }

    private void initColor() {
        for (Person mData : mDatas) {
            Random random = new Random();
            int r = random.nextInt(256);
            int g = random.nextInt(256);
            int b = random.nextInt(256);
            colorsR.add(r);
            colorsG.add(g);
            colorsB.add(b);
        }
    }
    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Holder holder = new Holder(LayoutInflater.from(mContext).inflate(R.layout.recycle_databinding_item, parent, false));
        RecycleDatabindingItemBinding itemBinding = DataBindingUtil.inflate(LayoutInflater.from(mContext), R.layout.recycle_databinding_item, parent, false);
        View root = itemBinding.getRoot();
        Holder holder = new Holder(root);
        holder.setBinding(itemBinding);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        Person person = mDatas.get(position);
        holder.getBinding().setPerson(person);
        holder.getBinding().executePendingBindings();
        View root = holder.getBinding().getRoot();
        root.setBackgroundColor(Color.rgb(colorsR.get(position), colorsG.get(position), colorsR.get(position)));

    }

    @Override
    public int getItemCount() {
        return mDatas == null ? 0 : mDatas.size();
    }
}
