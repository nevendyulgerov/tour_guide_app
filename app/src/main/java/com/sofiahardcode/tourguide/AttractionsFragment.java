package com.sofiahardcode.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsFragment extends Fragment {
    public AttractionsFragment() {
        // Required empty public constructor
    }

    public static AttractionsFragment newInstance() {
        AttractionsFragment fragment = new AttractionsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> attractions = new ArrayList<>();
        attractions.add(new Place(R.string.amphitheater, R.string.amphitheater_description, R.drawable.amphitheater));
        attractions.add(new Place(R.string.old_town, R.string.old_town_description, R.drawable.old_town));
        attractions.add(new Place(R.string.ethnographic_museum, R.string.ethnographic_museum_description, R.drawable.ethnographic_museum));
        attractions.add(new Place(R.string.alyosha, R.string.alyosha_description, R.drawable.alyosha));
        attractions.add(new Place(R.string.nebet_tepe, R.string.nebet_tepe_description, R.drawable.nebet_tepe));
        attractions.add(new Place(R.string.dzhumaya_mosque, R.string.dzhumaya_mosque_description, R.drawable.dzhumaya_mosque));
        attractions.add(new Place(R.string.history_museum, R.string.history_museum_description, R.drawable.history_museum));
        attractions.add(new Place(R.string.singing_fountains, R.string.singing_fountains_description, R.drawable.singing_fountain));
        attractions.add(new Place(R.string.tsar_simeon_garden, R.string.tsar_simeon_garden_description, R.drawable.tsar_simeon_garden));
        attractions.add(new Place(R.string.hindliyan_house_museum, R.string.hindliyan_house_museum_description, R.drawable.hindliyan_house_museum));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), attractions);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        return rootView;
    }
}