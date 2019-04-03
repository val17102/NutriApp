package val17102.edu.gt.nutriapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentCalculos extends Fragment{

        View v;
        public TextView vol,calt, calkg, rel, osm, chonkg, gram, coohkg
                ,dex, nameq,kmeq, cameq,mgmeq, g2,otros,g4;
    public FragmentCalculos() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.calculos,container,false);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        vol = (TextView) view.findViewById(R.id.volumen_total);
        calt = (TextView) view.findViewById(R.id.calorias_total);
        calkg = (TextView) view.findViewById(R.id.calorias);
        rel = (TextView) view.findViewById(R.id.relacion);
        osm = (TextView) view.findViewById(R.id.osmoralidad);
        chonkg = (TextView) view.findViewById(R.id.CHON_kg);
        gram = (TextView) view.findViewById(R.id.gramos_n);
        coohkg = (TextView) view.findViewById(R.id.chooh_kg);
        dex = (TextView) view.findViewById(R.id.aporte_dextrosa);
        nameq = (TextView) view.findViewById(R.id.Na_mEq);
        kmeq = (TextView) view.findViewById(R.id.K_mEq);
        cameq = (TextView) view.findViewById(R.id.Ca_mEq);
        mgmeq = (TextView) view.findViewById(R.id.Mg_mEq);
        g2 = (TextView) view.findViewById(R.id.g2);
        otros = (TextView) view.findViewById(R.id.otros);
        g4 = (TextView) view.findViewById(R.id.g4);

    }

    public TextView getVol(){
        return vol;
    }

    public TextView getCalt(){
        return calt;
    }

    public TextView getCalkg(){
        return calkg;
    }

    public TextView getRel(){
        return rel;
    }

    public TextView getOsm(){
        return osm;
    }

    public TextView getChonkg(){
        return chonkg;
    }

    public TextView getGram(){
        return gram;
    }

    public TextView getNameq(){
        return nameq;
    }

    public TextView getDex(){
        return dex;
    }

    public TextView getKmeq(){
        return kmeq;
    }

    public TextView getCameq(){
        return cameq;
    }

    public TextView getMgmeq(){
        return mgmeq;
    }

    public TextView getCoohkg(){
        return coohkg;
    }

    public TextView getG2(){
        return g2;
    }

    public TextView getG4(){
        return g4;
    }

    public TextView getOtros(){
        return otros;
    }
}
