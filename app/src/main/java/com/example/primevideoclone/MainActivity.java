package com.example.primevideoclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.primevideoclone.adapter.BannerMoviesPagerAdapter;
import com.example.primevideoclone.databinding.ActivityMainBinding;
import com.example.primevideoclone.model.BannerMovies;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private TabLayout tabLayout;
    private ViewPager bannerMoviesViewPager;
    private List<BannerMovies> bannerMoviesList;

    private BannerMoviesPagerAdapter bannerMoviesPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bannerMoviesList = new ArrayList<>();
        bannerMoviesList.add(new BannerMovies(1,"PonMagal Vandhal", "https://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/banners/homebanner1.png", ""));
        bannerMoviesList.add(new BannerMovies(2,"Little Women", "https://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/banners/homebanner2.png", ""));
        bannerMoviesList.add(new BannerMovies(3,"BHOOT The Haunted", "https://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/banners/homebanner3.png", ""));
        bannerMoviesList.add(new BannerMovies(4,"MIRZAPUR", "https://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/banners/homebanner4.png", ""));
        bannerMoviesList.add(new BannerMovies(5,"PIKACHU", "https://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/banners/homebanner5.png", ""));

        setBannerMoviesPagerAdapter(bannerMoviesList);
    }

    private void setBannerMoviesPagerAdapter(List<BannerMovies> bannerMoviesList){

        bannerMoviesViewPager = findViewById(R.id.banner_viewPager);
        bannerMoviesPagerAdapter = new BannerMoviesPagerAdapter(this, bannerMoviesList);
        bannerMoviesViewPager.setAdapter(bannerMoviesPagerAdapter);


    }
}