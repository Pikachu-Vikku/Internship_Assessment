package com.example.internship;

import android.os.Bundle;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ProfileFragment extends Fragment {

    String s1,s2,s3,s4,s5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

//        TextView name=view.findViewById(R.id.name);
//        TextView position =view.findViewById(R.id.spinner);
//        TextView mobile=view.findViewById(R.id.mobile);
//        TextView email=view.findViewById(R.id.email_id);
//        TextView address=view.findViewById(R.id.address);
//
//        s1=this.getArguments().getString("name");
//        s2=this.getArguments().getString("position");
//        s3=this.getArguments().getString("mobile");
//        s4=this.getArguments().getString("email");
//        s5=this.getArguments().getString("address");
//
//        name.setText(s1);
//        position.setText(s2);
//        mobile.setText(s3);
//        email.setText(s4);
//        address.setText(s5);

        return view;
    }
}