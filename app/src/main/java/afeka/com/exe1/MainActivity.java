package afeka.com.exe1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    final String TAG = "Exe1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Test Remark
        //TODO benny build this activity for sunday


        Button btn2 = (Button)findViewById(R.id.btn2_act_main);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e(TAG,"e-btn2-onClick");
            }
        });

        Button btn3 = (Button)findViewById(R.id.btn3_act_main);
        btn3.setOnClickListener(this);

        //Log.d(TAG,"d-onCreate");
        Log.e(TAG,"e-onCreate");
//        Log.v(TAG,"v-onCreate");
//        Log.w(TAG,"w-onCreate");



    }

    public void btn1Click(View view){
        Log.e(TAG,"e-btn1Click");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"e-onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"e-onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"e-onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"e-onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"e-onDestroy");
    }

    //onclickListener
    @Override
    public void onClick(View view) {
        Log.e(TAG,"e-onClick btn3");
    }
}
