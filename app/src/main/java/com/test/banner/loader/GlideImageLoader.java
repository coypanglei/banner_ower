package com.test.banner.loader;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import com.test.banner.ui.RoundAngleImageView;
import com.youth.banner.loader.ImageLoader;


import com.test.banner.ui.RoundCornersTransformation;


public class GlideImageLoader extends ImageLoader {

    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        //具体方法内容自己去选择，次方法是为了减少banner过多的依赖第三方包，所以将这个权限开放给使用者去选择
        Glide.with(context.getApplicationContext())
                .load(path)
//                .bitmapTransform(new RoundCornersTransformation(context, 0, 20, RoundCornersTransformation.CornerType.ALL))
                .into(imageView);
    }

    @Override
    public ImageView createImageView(Context context) {
        //圆角
        RoundAngleImageView angleImageView = new RoundAngleImageView(context);

        return angleImageView;
    }


}
