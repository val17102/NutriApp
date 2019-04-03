package val17102.edu.gt.nutriapp;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentAportes extends Fragment {
    View v;
    private TabLayout tabLayout;
    private AportesListener aportesListener;
    TextInputEditText peso;
    TextInputEditText liquido;
    TextInputEditText chon;
    TextInputEditText chooh;
    TextInputEditText na;
    TextInputEditText k;
    TextInputEditText cho;
    TextInputEditText ca;
    TextInputEditText mg;
    TextInputEditText mvi;
    float pesoV;
    float liquidoV;
    float chonV;
    float choohV;
    float choV;
    float naV;
    float kV;
    float caV;
    float mgV;
    float mviV;

    AlertDialog alert1;
    public FragmentAportes() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.aportes, container, false);

        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        peso = (TextInputEditText) view.findViewById(R.id.peso);
        liquido = (TextInputEditText) view.findViewById(R.id.liquido);
        chon = (TextInputEditText) view.findViewById(R.id.CHON);
        chooh = (TextInputEditText) view.findViewById(R.id.CHOOH);
        cho = (TextInputEditText) view.findViewById(R.id.CHO);
        na = (TextInputEditText) view.findViewById(R.id.Na);
        k = (TextInputEditText) view.findViewById(R.id.K);
        ca = (TextInputEditText) view.findViewById(R.id.Ca);
        mg = (TextInputEditText) view.findViewById(R.id.Mg);
        mvi = (TextInputEditText) view.findViewById(R.id.mvi);
        Button button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                    int error = 0;
                    String m = "";
                    if(aportesListener != null){
                        try {
                            pesoV = Float.valueOf(peso.getText().toString());
                        }
                        catch(Exception e){
                            m = m +"Error en Ingreso de Peso\n";
                            error = error + 1;

                        }
                        try {
                            liquidoV = Float.valueOf(liquido.getText().toString());
                        }
                        catch(Exception e){
                            m = m +"Error en Ingreso de % Líquido\n";
                            error = error + 1;

                        }
                        try {
                            chonV = Float.valueOf(chon.getText().toString());
                        }
                        catch(Exception e){
                            m = m +"Error en Ingreso de CHON\n";
                            error = error + 1;

                        }
                        try {
                            choohV = Float.valueOf(chooh.getText().toString());
                        }
                        catch(Exception e){
                            m = m +"Error en Ingreso de CHOOH\n";
                            error = error + 1;

                        }
                        try {
                            choV = Float.valueOf(cho.getText().toString());
                        }
                        catch(Exception e){
                            m = m +"Error en Ingreso de CHO\n";
                            error = error + 1;

                        }
                        try {
                            naV = Float.valueOf(na.getText().toString());
                        }
                        catch(Exception e){
                            m = m +"Error en Ingreso de Na\n";
                            error = error + 1;

                        }
                        try {
                            kV = Float.valueOf(k.getText().toString());
                        }
                        catch(Exception e){
                            m = m +"Error en Ingreso de K\n";
                            error = error + 1;

                        }
                        try {
                            caV = Float.valueOf(ca.getText().toString());
                        }
                        catch(Exception e){
                            m = m +"Error en Ingreso de Ca\n";
                            error = error + 1;

                        }
                        try {
                            mgV = Float.valueOf(mg.getText().toString());
                        }
                        catch(Exception e){
                            m = m +"Error en Ingreso de Mg\n";
                            error = error + 1;

                        }
                        try {
                            mviV = Float.valueOf(mvi.getText().toString());
                        }
                        catch(Exception e){
                            m = m +"Error en Ingreso de MVI\n";
                            error = error + 1;

                        }
                        if (error > 0){
                            openDialog(m);
                        } else{
                            float volumen = pesoV * liquidoV;
                            float chon_kg = chonV * pesoV;
                            float cal_chon = chon_kg * 4.3f;
                            float cooh_kg = choohV * pesoV;
                            float cal_cooh = cooh_kg * 10;
                            float dextrosa = choV *pesoV*1.44f;
                            float cal_cho = dextrosa * 3.4f;
                            float gram_n = (chon_kg / 6.25f);
                            float na_meq = naV * pesoV;
                            float cc_nacl = na_meq / 3.4f;
                            float k_meq = kV * pesoV;
                            float cc_kcl = k_meq/2.0f;
                            float ca_meq = caV*pesoV;
                            float cc_gluco = ca_meq/100.0f;
                            float mg_meq = mgV*pesoV;
                            float cc_mg = mg_meq / 4.0f;
                            int relacion = (Math.round(cal_cooh)+ Math.round(cal_cho))/Math.round(gram_n);
                            float osmolaridad = (chon_kg * 10)+(dextrosa*5)+200;
                            int calorias_totales = Math.round(cal_chon) + Math.round(cal_cooh)+ Math.round(cal_cho);
                            int cal_kg = calorias_totales/Math.round(pesoV);
                            float cc_amin = chon_kg*100/10;
                            float cc_lipo = cooh_kg*100/20;
                            float g2 = (dextrosa/(volumen+20 - cc_lipo)*100);
                            int otros = Math.round(volumen) + 20 - Math.round(cc_amin) - Math.round(cc_lipo) - Math.round(cc_nacl)
                                    - Math.round(cc_kcl) - Math.round(cc_gluco) - Math.round(cc_mg) - Math.round(mviV);
                            float g4 = (1.25f * dextrosa)-Float.valueOf(otros/8);
                            float cc_dex10 = (dextrosa - g4)*10;
                            float cc_dex50 = g4 * 2;

                            String[] mes = new String[]{String.valueOf(volumen),String.valueOf(cal_kg), String.valueOf(calorias_totales),
                                    String.valueOf(ca_meq),String.valueOf(chon_kg), String.valueOf(cooh_kg), String.valueOf(dextrosa),
                                    String.valueOf(g2),String.valueOf(g4),String.valueOf(gram_n),String.valueOf(k_meq),String.valueOf(mg_meq)
                                    ,String.valueOf(na_meq), String.valueOf(osmolaridad), String.valueOf(relacion), String.valueOf(otros)};

                            String[] mes2 = new String[]{String.valueOf(cal_cho),String.valueOf(cc_amin),String.valueOf(cc_gluco),String.valueOf(cc_kcl),
                                    String.valueOf(cc_mg),String.valueOf(cc_nacl),String.valueOf(cc_dex10),String.valueOf(cc_dex50),String.valueOf(mviV), String.valueOf(cal_chon)

                            };
                            
                            aportesListener.getMessage(mes);
                            //aportesListener.getMessage2(mes2);
                        }


                        //float liquidoV = Float.valueOf(liquido.getText().toString());
                        //float chonV = Float.valueOf(chon.getText().toString());
                        //float choohV = Float.valueOf(chooh.getText().toString());
                        //float choV = Float.valueOf(cho.getText().toString());
                        //float naV = Float.valueOf(na.getText().toString());
                        //float kV = Float.valueOf(k.getText().toString());
                        //float caV = Float.valueOf(ca.getText().toString());
                        //float mgV = Float.valueOf(mg.getText().toString());
                        //float mviV = Float.valueOf(mvi.getText().toString());



                    }
                }
            });
        }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof  AportesListener){
            aportesListener = (AportesListener)context;
        }
    }

    public void openDialog(String message){
        AlertDialog.Builder builder1 = new AlertDialog.Builder(getContext());
        builder1.setMessage(message);
        builder1.setCancelable(true);
        builder1.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                    dialog.cancel();

            }
        });

        AlertDialog alert1 = builder1.create();
        alert1.show();
    }
}



