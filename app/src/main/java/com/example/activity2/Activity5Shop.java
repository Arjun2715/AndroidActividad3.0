package com.example.activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity5Shop extends AppCompatActivity {
    private Button reading;
    private Button library;
    private Button audio_Books;
    private Button shop;
    private  Button lawpower;
    private  Button goodstrat;
    private  Button thinking;
    private  Button dune;
    private  Button stolen;
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(Activity5Shop.this, Activity3Library.class));
        finish();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity5_shop);
        library = (Button) findViewById(R.id.Libarary);
        reading = (Button) findViewById(R.id.Reading_Now);
        audio_Books = (Button) findViewById(R.id.Audio_Books);
        shop = (Button) findViewById(R.id.Book_Store);
        lawpower = (Button) findViewById(R.id.lawpowerbtn);
        goodstrat  =(Button) findViewById(R.id.goodstratbtn);
        thinking = (Button) findViewById(R.id.thinkingstratbtn);
        dune = (Button) findViewById(R.id.dunebtn);
        stolen = (Button) findViewById(R.id.stolenbtn) ;
        lawpower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLawpowerBookLink();

            }
        });
        goodstrat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGoodstratBookLink();
            }
        });
        thinking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThinkingBookLink();
            }
        });
        dune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDuneBookLink();
            }
        });
        stolen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openStolenBookLink();
            }
        });
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLibrary();
            }
        });
        reading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReading();
            }
        });
        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openShop();
            }
        });
        audio_Books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAudioBooks();
            }
        });

    }
    private void openLibrary(){
        Intent intent = new Intent(this,Activity3Library.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
    private void openReading(){
        Intent intent = new Intent(this, Activity2Reading.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
    private void openShop(){
        Intent intent = new Intent(this, Activity5Shop.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
    private void openAudioBooks(){
        Intent intent = new Intent(this,Activity4AudioBooks.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
    private void openLawpowerBookLink(){
    Uri uri = Uri.parse("https://www.amazon.com/48-Laws-Power-Robert-Greene/dp/0140280197"); // missing 'http://' will cause crashed
    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
    startActivity(intent);
    }
    private void openGoodstratBookLink(){
        Uri uri = Uri.parse("https://www.amazon.es/Good-Strategy-Bad-difference-matters/dp/1846684811"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    private void openThinkingBookLink(){
        Uri uri = Uri.parse("https://www.amazon.es/Thinking-Strategically-Competitive-Business-Paperback/dp/0393310353"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    private void openDuneBookLink(){
        Uri uri = Uri.parse("https://www.amazon.es/Dune-Nueva-edición-Las-crónicas/dp/8466353771"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    private void openStolenBookLink(){
        Uri uri = Uri.parse("https://www.amazon.es/Stolen-Lucy-Christopher/dp/1908435755"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}