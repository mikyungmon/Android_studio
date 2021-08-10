package com.example.summer_study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    Switch check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.text_view);
        check = findViewById(R.id.check);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {   // onClick 이 콜백 메서드
                Log.d("text1", "text2");  //개발자가 보는 창
                Toast.makeText(MainActivity.this, "message", Toast.LENGTH_SHORT).show(); // 사용자가 보는 창, 메인 액티비티에 띄울건데 text에 있는 글자 띄울거고 길이가 짧은지 긴지를 설정하면 떠있는 시간 다름
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = (String) check.getText(); // getText : 속성을 세팅하는게 아니라 가져오는거. check 의 텍스트를 가져와서 str 에 넣는다는 의미
                boolean b = check.isChecked();   // check 가 됐는지 아닌지 받아오는거. 체크가 되면 true, 아니면 false를 담고 있음

                textView.setText(str + " " + b);  // switch 를 누르면 switch true 로 바뀜
            }
        });


        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if (b) {
                    textView.setText("On");  //textView 의 text 속성을 변경할 수 있음
                    button.setEnabled(true);
                } else {
                    textView.setText("Off");
                    button.setEnabled(false);
                }
            }
        });
    }
}