package example.android.indonesia_ku;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button clk;
    VideoView videov;
    MediaController mediaC;

    private Button menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clk = (Button) findViewById(R.id.button);
        videov = (VideoView) findViewById(R.id.videoInd);
        mediaC = new MediaController(this);

        menu = findViewById(R.id.budaya);
        menu.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.budaya:
                startActivity(new Intent(this, ActivityMenu.class));
                break;
        }
    }

    public void videoplay(View v)
    {
        String videopath = "android.resource://example.android.indonesia_ku/"+R.raw.indonesia;
        Uri uri = Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.setMediaController(mediaC);
        mediaC.setAnchorView(videov);
        videov.start();
    }
}
