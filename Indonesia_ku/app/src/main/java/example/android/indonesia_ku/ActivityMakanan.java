package example.android.indonesia_ku;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ActivityMakanan extends AppCompatActivity implements View.OnClickListener
{
    private Button makananBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.makanan);

        ListView list = (ListView) findViewById(R.id.listView);
        String[] rendang = {"Nama lain : Rendang padang ","Tempat asal : Indonesia bagian barat","Wilayah : Sumatra barat",
                "Variasi : Rendang ayam,Rendang Bebek","Kategori makanan : menu utama","Teknik Memasak : Goreng dan Rebus"};
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_1, rendang);
        list.setAdapter(myAdapter);

        makananBack = findViewById(R.id.makan_back);
        makananBack.setOnClickListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.makan_back:
                finish();
                break;
        }
    }
}
