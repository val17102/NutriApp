package val17102.edu.gt.nutriapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentCc extends Fragment{
    View v;
    public TextView cal_chon, chon_round, cc_amin, cc_amin_r, cal_cho, cho_r, dex10, dex10_r
    , dex50, dex50_r, cc_nacl, cc_nacl_r, cc_kcl, cc_kcl_r, cc_gluco, cc_gluco_r, cc_mg, cc_mg_r, mvi, mvi_r;
    public FragmentCc() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.cc,container,false);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        cal_chon = (TextView) view.findViewById(R.id.calorias_chon);
        cc_amin = (TextView) view.findViewById(R.id.cc_aminoacidos);
        cal_cho = (TextView) view.findViewById(R.id.calorias_cho);
        dex10 = (TextView) view.findViewById(R.id.cc_dex10);
        dex50 = (TextView) view.findViewById(R.id.cc_dex50);
        cc_nacl = (TextView) view.findViewById(R.id.cc_nacl20);
        cc_kcl = (TextView) view.findViewById(R.id.cc_kcl10);
        cc_gluco = (TextView) view.findViewById(R.id.cc_glucoca);
        cc_mg = (TextView) view.findViewById(R.id.cc_mg45);
        mvi = (TextView) view.findViewById(R.id.cc_mvi);
    }

    public View getV() {
        return v;
    }

    public TextView getCal_chon() {
        return cal_chon;
    }

    public TextView getChon_round() {
        return chon_round;
    }


    public TextView getCc_amin() {
        return cc_amin;
    }

    public TextView getCal_cho() {
        return cal_cho;
    }


    public TextView getDex10() {
        return dex10;
    }

    public TextView getDex50() {
        return dex50;
    }

    public TextView getCc_nacl() {
        return cc_nacl;
    }

    public TextView getCc_kcl() {
        return cc_kcl;
    }

    public TextView getCc_gluco() {
        return cc_gluco;
    }

    public TextView getCc_mg() {
        return cc_mg;
    }


    public TextView getMvi() {
        return mvi;
    }



}
