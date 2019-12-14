package example.android.indonesia_ku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityWisata extends AppCompatActivity implements View.OnClickListener
{
    private Button wisataBack;
    private Button Lokasiin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tempat_eksotik);

        wisataBack = findViewById(R.id.wisata_back);
        wisataBack.setOnClickListener(this);

        Lokasiin = findViewById(R.id.lokasibromo);
        Lokasiin.setOnClickListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.lokasibromo:
                startActivity(new Intent(this, AktivityLokasi.class));
                break;
            case R.id.wisata_back:
                finish();
                break;
        }
    }

}
