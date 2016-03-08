package com.welcome.genesmit.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;


/**
 * A simple {@link Fragment} subclass.
 */
public class VerticalBlinds extends Fragment {
    /*This is the image array*/
    public Integer[] mThumbIds = {
            R.drawable.athena_cream,
            R.drawable.athena_peace,
            R.drawable.athena_white,
            R.drawable.a_range_a1,
            R.drawable.a_range_a13,
            R.drawable.a_range_a20,
            R.drawable.a_range_a3,
            R.drawable.a_range_a4,
            R.drawable.a_range_a5,
            R.drawable.a_range_a9,
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
            R.drawable.vte_vt7,

    };
    /*This is the names array */
    public String[] names={"athena_cream",
            "athena_peace",
            "athena_white",
            "a_range_a1",
            "a_range_a13",
            "a_range_a20",
            "a_range_a3",
            "a_range_a4",
            "a_range_a5",
            "a_range_a9",
            "bali_black_brandy_butter",
            "bali_black_burgundy",
            "bali_black_cloud_grey",
            "bali_black_eve",
            "belair_albaster",
            "belair_black",
            "belair_gun_metal",
            "belair_toast",
            "bushman_eve_glow",
            "bushman_sand",
            "d_range_15_black",
            "fern_burgundy",
            "fern_ivory",
            "fern_navy",
            "glacier_charcoal",
            "img_0092",
            "img_0093",
            "img_0094",
            "kalahari_oatmeal",
            "maggie_fawn",
            "maggie_grey",
            "maggie_ivory",
            "malimo_albatross",
            "malimo_aluminium",
            "metalic_blue",
            "metalic_plum",
            "metalic_silver",
            "min_glare_grey",
            "min_glare_sahara",
            "new_blockout_albaster",
            "new_blockout_blueberry",
            "new_blockout_camel",
            "new_blockout_charcoal",
            "new_blockout_grey",
            "new_van_goch_black",
            "new_van_goch_grey",
            "new_van_goch_sea_blue",
            "shantex_beige",
            "shantex_burgundy",
            "shantex_camel",
            "shantex_earth",
            "shantex_stone",
            "squares_bark",
            "tamara_beige",
            "tamara_grey",
            "tamara_peace",
            "tamara_rust",
            "vte_vt1",
            "vte_vt6",
            "vte_vt7",
    };

    public VerticalBlinds() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_vertical_blinds, container, false);
        GridView  grid=(GridView) view.findViewById(R.id.grid);
        /*This time we need to pass the image and names array along with the context **/
        grid.setAdapter(new ImageAdapter(getContext(),mThumbIds,names));
        return view;

    }

}
