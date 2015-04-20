package com.example.torsh.myfragment1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by torsh on 3/29/15.
 */
public class CrimeLocationFragment extends Fragment {

    public String message(){
        return "Location: The Round Tower";
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup parentView, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_crime_location, parentView, false);

        Button buttonF1 = (Button) v.findViewById(R.id.btn_frag1);
        View.OnClickListener listener = new View.OnClickListener(){
            @Override
        public void onClick(View v){
                Toast.makeText(getActivity().getBaseContext(), "GoToF1", Toast.LENGTH_SHORT).show();
                replaceThisFragment();
            }
        };
        buttonF1.setOnClickListener(listener);

        return v;
    }

    public void replaceThisFragment(){
        //getActivity().getFragmentManager().beginTransaction().remove(this).commit(); // removes but not replace!!
        Fragment fragment = new CrimeFragment();
        getActivity().getFragmentManager().beginTransaction().replace(R.id.fragmentContainer, fragment).commit();
    }
}