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
public class VerticalBlindsFragment extends Fragment {
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
    public String[] names={"Athena Cream",
            "Athena Peace",
            "Athena White",
            "A-Range A1",
            "A-Range A13",
            "A-Range A20",
            "A-Range A3",
            "A-Range A4",
            "A-Range A5",
            "A-Range A9",
            "Bali Black Brandy Butter",
            "Bali Black Burgundy",
            "Bali Black Cloud Grey",
            "Bali Black Eve",
            "Belair Albaster",
            "Belair Black",
            "Belair Gun Metal",
            "Belair Toast",
            "Bushman Eve Glow",
            "Bushman Sand",
            "D-Range-15 Black",
            "Fern Burgundy",
            "Fern Ivory",
            "Fern Navy",
            "Glacier Charcoal",
            "Kalahari Oatmeal",
            "Maggie Fawn",
            "Maggie Grey",
            "Maggie Ivory",
            "Malimo Albatross",
            "Malimo Aluminium",
            "Metallic Blue",
            "Metallic Plum",
            "Metallic Silver",
            "Min Glare Grey",
            "Min Glare Sahara",
            "New Blockout Albaster",
            "New Blockout Blueberry",
            "New Blockout Camel",
            "New Blockout Charcoal",
            "New Blockout Grey",
            "New Van Goch Black",
            "New Van Goch Grey",
            "New Van Goch Sea Blue",
            "Shantex Beige",
            "Shantex Burgundy",
            "Shantex Camel",
            "Shantex Earth",
            "Shantex Stone",
            "Squares Bark",
            "Tamara Beige",
            "Tamara Grey",
            "Tamara Peace",
            "Tamara Rust",
            "VTE-VT1",
            "VTE-VT6",
            "VTE-VT7",
    };

    public VerticalBlindsFragment() {
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
