package cn.edu.gdmec.android.androiddebug;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找到控件
        textView = (TextView) findViewById ( R.id.tv );
        button = (Button ) findViewById ( R.id.btn );
        editText = (EditText ) findViewById ( R.id.et );

        //给按钮设置点击事件
        button.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                //获取用户输入的数
                int n = Integer.parseInt ( editText.getText ().toString () );
                int sum = 0;
                for (int i=0; i <= n; i++){
                    Log.i ( "sum= ", Integer.toString ( sum ) );
                    sum+=i;
                }
                textView.setText ( "从0累加到"+n+"：总和是："+sum );

            }
        } );
    }
}
