package com.welcome.genesmit.myapplication;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by skull on 2016/03/01.
 */
public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {

            DisplayMetrics metrics = mContext.getResources()
                    .getDisplayMetrics();
            int h = mContext.getResources().getDisplayMetrics().densityDpi;

            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(h,h));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setRotation(90);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        Picasso.with(mContext).load(mThumbIds[position]).into(imageView);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.a_range_a13,
            R.drawable.a_range_a1,
            R.drawable.a_range_a20,
            R.drawable.a_range_a3,
            R.drawable.a_range_a4,
            R.drawable.a_range_a5,
            R.drawable.a_range_a9,
            R.drawable.athena_cream,
            R.drawable.athena_peace,
            R.drawable.athena_white,
            R.drawable.bali_black_brandy_butter,
            R.drawable.bali_black_burgundy,
            R.drawable.bali_black_cloud_grey,
            R.drawable.bali_black_eve,
            R.drawable.belair_albaster,
            R.drawable.belair_black,
            R.drawable.belair_gun_metal,
            R.drawable.belair_toast,
            R.drawable.bushman_eve_glow,
            R.drawable.bushman_sand,
            R.drawable.d_range_15_black,
            R.drawable.fern_burgundy,
            R.drawable.fern_ivory,
            R.drawable.fern_navy,
            R.drawable.glacier_charcoal,
            R.drawable.kalahari_oatmeal,
            R.drawable.maggie_fawn,
            R.drawable.maggie_grey,
            R.drawable.maggie_ivory,
            R.drawable.malimo_albatross,
            R.drawable.malimo_aluminium,
            R.drawable.metalic_blue,
            R.drawable.metalic_plum,
            R.drawable.metalic_silver,
            R.drawable.min_glare_grey,
            R.drawable.min_glare_sahara,
            R.drawable.new_blockout_albaster,
            R.drawable.new_blockout_blueberry,
            R.drawable.new_blockout_camel,
            R.drawable.new_blockout_charcoal,
            R.drawable.new_blockout_grey,
            R.drawable.new_van_goch_black,
            R.drawable.new_van_goch_grey,
            R.drawable.new_van_goch_sea_blue,
            R.drawable.shantex_beige,
            R.drawable.shantex_burgundy,
            R.drawable.shantex_camel,
            R.drawable.shantex_earth,
            R.drawable.shantex_stone,
            R.drawable.squares_bark,
            R.drawable.tamara_beige,
            R.drawable.tamara_grey,
            R.drawable.tamara_peace,
            R.drawable.tamara_rust,
            R.drawable.vte_vt1,
            R.drawable.vte_vt6,
            R.drawable.vte_vt7 };
}
