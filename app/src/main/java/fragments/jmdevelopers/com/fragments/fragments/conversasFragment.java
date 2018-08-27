package fragments.jmdevelopers.com.fragments.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fragments.jmdevelopers.com.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class conversasFragment extends Fragment {


    public conversasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_conversas3, container, false);
    }

}
