package com.learn.learning.databinding;

import android.support.v7.widget.RecyclerView;
import android.view.View;

class Holder extends RecyclerView.ViewHolder{
    RecycleDatabindingItemBinding binding;
    public Holder(View itemView) {
        super(itemView);
    }

    public RecycleDatabindingItemBinding getBinding() {
        return binding;
    }

    public void setBinding(RecycleDatabindingItemBinding binding) {
        this.binding = binding;
    }
}
