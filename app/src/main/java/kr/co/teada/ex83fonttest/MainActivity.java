package kr.co.teada.ex83fonttest;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TextView tvTitle;
    TextView tv;

    AutoCompleteTextView actv;
    ArrayList<String> datas=new ArrayList<>();
    ArrayAdapter adapter; //스트링 하나를 텍스트뷰 하나로 만들어 주는 얘

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //기본적으로 표시되는 제목 글씨 안 보이도록!
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tv=findViewById(R.id.tv);
        tvTitle=findViewById(R.id.tv_title);

        //폰트변경
        Typeface typeface=Typeface.createFromAsset(getAssets(), "fonts/HoonMakdaeyunpilR.ttf");
        tv.setTypeface(typeface);
        tvTitle.setTypeface(typeface);


        //자동완성 에디트 텍스트(AutoCompleteTextView)
        actv=findViewById(R.id.actv);
        adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1, datas);
        actv.setAdapter(adapter);

        //AutoCompleteTextView 에서 자동완성으로 보여줄 항목들..
        datas.add("짜장면");
        datas.add("짜장밥");
        datas.add("짜파게티");
        datas.add("bed");
        datas.add("갈비");
        datas.add("bbb");
        datas.add("송어회");
        datas.add("광어회");
        datas.add("케익");

    }
}
