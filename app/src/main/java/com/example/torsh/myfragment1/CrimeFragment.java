package com.example.torsh.myfragment1;

import android.os.Bundle;
import android.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by torsh on 3/29/15.
 */
public class CrimeFragment extends Fragment {

    private Crime mCrime;
    private EditText editTextField;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup parentView, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_crime, parentView, false);

        Button buttonF2 = (Button) v.findViewById(R.id.btn_frag2);
        View.OnClickListener listenerF2 = new View.OnClickListener(){
            @Override
        public void onClick(View view){
                Toast.makeText(getActivity().getBaseContext(), "GoToF2", Toast.LENGTH_SHORT).show();
                replaceThisFragment();
            }
        };
        buttonF2.setOnClickListener(listenerF2);

        return v;
    }

    public void replaceThisFragment(){
        //getActivity().getFragmentManager().beginTransaction().remove(this).commit(); // removes but not replace!!
        Fragment fragment = new CrimeLocationFragment();
        getActivity().getFragmentManager().beginTransaction().replace(R.id.fragmentContainer, fragment).commit();
    }
}
