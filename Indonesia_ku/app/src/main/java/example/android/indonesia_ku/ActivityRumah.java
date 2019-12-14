package example.android.indonesia_ku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ActivityRumah extends AppCompatActivity implements View.OnClickListener
{
    private Button rumahBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rumah_adat);

        ListView listet = (ListView) findViewById(R.id.proFil);
        String[] profial = {" Nama  : Muhammad Fadilla ","Tempat Tinggal : Depok",
                "universitas : unsri","fakultas : ilmu komputer","Tempat eksotik yang pernah dikunjungi : Pantai kuta bali, gn.bromo, gn.merapi, air terjun pagar alam, borobudur, dll"};
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_1, profial);
        listet.setAdapter(myAdapter);

        rumahBack = findViewById(R.id.rumah_back);
        rumahBack.setOnClickListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }


    public void submitOrder(View view) {

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:muhamadfadillah80@gmail.com")); // only email apps should handle this

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rumah_back:
                finish();
                break;
        }
    }
}
