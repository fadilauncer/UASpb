package example.android.indonesia_ku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityMenu extends AppCompatActivity implements View.OnClickListener
{
    private Button Selendang;
    private Button Gunung;
    private Button Rumahan;
    private Button Makanin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menubud);

        Selendang = findViewById(R.id.Tari);
        Selendang.setOnClickListener(this);

        Gunung = findViewById(R.id.Wisata);
        Gunung.setOnClickListener(this);

        Rumahan = findViewById(R.id.Rumahadat);
        Rumahan.setOnClickListener(this);

        Makanin = findViewById(R.id.Makanan);
        Makanin.setOnClickListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.Tari:
                startActivity(new Intent(this, ActivityTari.class));
                break;
            case R.id.Wisata:
                startActivity(new Intent(this, ActivityWisata.class));
                break;
            case R.id.Rumahadat:
                startActivity(new Intent(this, ActivityRumah.class));
                break;
            case R.id.Makanan:
                startActivity(new Intent(this, ActivityMakanan.class));
                break;
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
