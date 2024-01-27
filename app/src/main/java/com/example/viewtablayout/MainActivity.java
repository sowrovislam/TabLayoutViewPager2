package com.example.viewtablayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;

    private ViewPager2 viewPager2;

    private  ViewPagerAdapter viewPagerAdapter;

   private String [] tabName={"movie","Miguc","game"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.Tab_Layout);
        viewPager2=findViewById(R.id.viewPager2);



        viewPagerAdapter=new ViewPagerAdapter(this);
        viewPager2.setAdapter(viewPagerAdapter);


       new TabLayoutMediator(
               tabLayout,
               viewPager2,


               (tab, position) -> {
                   tab.setText(tabName[position]);


               }


       ).attach();




//        Video LInk   Youtub ===https://youtu.be/nIPwtHdkzJE?si=i5YiZv9-4DsntBdg



    }
}