package peanut.ml.tabs;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private SectionsPageAdapter sectionsPageAdapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tabs

        viewPager = (ViewPager)findViewById(R.id.tabPager);
        sectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        viewPager.setAdapter(sectionsPageAdapter);
        tabLayout = (TabLayout)findViewById(R.id.mainTabs);
        tabLayout.setupWithViewPager(viewPager);

        viewPager.setCurrentItem(2);



    }
}
