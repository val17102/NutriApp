package val17102.edu.gt.nutriapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AportesListener {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    public ViewPagerAdapter adapter;
    FragmentAportes aportes;
    FragmentCalculos calculos;
    FragmentCc cc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //Add Fragment Here

        adapter.AddFragment(new FragmentAportes(), "Aportes");
        adapter.AddFragment(new FragmentCalculos(), "Calculos");
        adapter.AddFragment(new FragmentCc(), "Cc");

        aportes = (FragmentAportes) adapter.getItem(0);
        calculos = (FragmentCalculos) adapter.getItem(1);
        cc = (FragmentCc) adapter.getItem(2);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_aportes);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_calculos);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_cc);



        ActionBar actionbar = getSupportActionBar();
        actionbar.setElevation(0);


    }

    @Override
    public void getMessage(String[] message) {

        calculos.getVol().setText(message[0]);
        calculos.getCalkg().setText(message[1]);
        calculos.getCalt().setText(message[2]);
        calculos.getCameq().setText(message[3]);
        calculos.getChonkg().setText(message[4]);
        calculos.getCoohkg().setText(message[5]);
        calculos.getDex().setText(message[6]);
        calculos.getG2().setText(message[7]);
        calculos.getG4().setText(message[8]);
        calculos.getGram().setText(message[9]);
        calculos.getKmeq().setText(message[10]);
        calculos.getMgmeq().setText(message[11]);
        calculos.getNameq().setText(message[12]);
        calculos.getOsm().setText(message[13]);
        calculos.getRel().setText(message[14]);
        calculos.getOtros().setText(message[15]);
    }

    @Override
    public void getMessage2(String[] message) {
        cc.getCal_cho().setText(message[0]);
        cc.getCc_amin().setText(message[1]);
        cc.getCc_gluco().setText(message[2]);
        cc.getCc_kcl().setText(message[3]);
        cc.getCc_mg().setText(message[4]);
        cc.getCc_nacl().setText(message[5]);
        cc.getDex10().setText(message[6]);
        cc.getDex50().setText(message[7]);
        cc.getMvi().setText(message[8]);
        cc.getCal_chon().setText(message[9]);
    }
}
