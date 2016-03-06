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


    public VerticalBlindsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vertical_blinds, container, false);
        GridView  grid = (GridView) view.findViewById(R.id.grid);
        grid.setAdapter(new ImageAdapter(getContext()));
        return view;
    }

}
