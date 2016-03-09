package com.welcome.genesmit.myapplication;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

/**
 * Created by Aniket on 3/1/2016.
 */
public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    /** mThumbids is the image id array and mnames is the name array **/
    private Integer[] mThumbids;
    private String[] mnames;
/** This time input for both the image and name is necessary. So there are 2 more arguments */
    public ImageAdapter(Context c,Integer[] images,String[] names) {
        /** initialising required variables **/
        this.mContext = c;
        this.mThumbids=images;
        this.mnames = names;

    }
    public class Holder
    {
        TextView tv;
        ImageView img;
    }

    public int getCount() {
        return mThumbids.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {

        View grid;

        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            Holder holder=new Holder();

/* Initialising the grid view **/
            grid = inflater.inflate(R.layout.vertical_texts, null);
        /* referencing the TextView and ImageView */
            holder.tv = (TextView) grid.findViewById(R.id.grid_text);
            holder.img = (ImageView)grid.findViewById(R.id.grid_image);

            int h = mContext.getResources().getDisplayMetrics().densityDpi;
            holder.img.setLayoutParams(new LinearLayout.LayoutParams(h,h));
            holder.img.setRotation(90);
        holder.img.setScaleType(ImageView.ScaleType.CENTER_CROP);
        /* Setting the name of the image */
            holder.tv.setText(mnames[position]);
        /*setting the image */
            Picasso.with(mContext).load(mThumbids[position]).into(holder.img);


        /*return the view */
        return grid;

    }


}

