package com.example.crypto.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import com.example.crypto.R;
import com.example.crypto.SplashScreens.Screen_2;

public class Adapter_class extends PagerAdapter {
    int[] mainimage;
    int[] bodyimage;
    public Adapter_class(Screen_2 screen2, int[] mainimage, int[] bodyimage) {
       this.mainimage = mainimage;
       this.bodyimage = bodyimage;
    }
    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.item_pager, container, false);

        ImageView windchain;
        ImageView text;

        windchain = view.findViewById(R.id.icon);
        text = view.findViewById(R.id.property);

        windchain.setBackgroundResource(mainimage[position]);
        text.setImageResource(bodyimage[position]);


        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View) object);

    }
}
