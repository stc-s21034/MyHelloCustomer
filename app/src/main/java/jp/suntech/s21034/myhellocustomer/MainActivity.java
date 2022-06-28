package jp.suntech.s21034.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick = findViewById(R.id.btClick);
        HelloListener listener = new HelloListener();
        btClick.setOnClickListener(listener);

        Button btClearName = findViewById(R.id.btNameClear);
        btClearName.setOnClickListener(listener);

        Button btClearaddress = findViewById(R.id.btAddressClear);
        btClearaddress.setOnClickListener(listener);
    }

    private class HelloListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            EditText input_name = findViewById(R.id.etName);
            EditText input_address = findViewById(R.id.etAddress);
            TextView output = findViewById(R.id.tvOutput);

            int id = view.getId();
            String inputStr_name = input_name.getText().toString();
            String inputStr_address = input_address.getText().toString();
            switch (id){
                case R.id.btClick:
                    output.setText(inputStr_address + "にお住まいの" + inputStr_name + "さん、こんにちは！");
                    break;
                case R.id.btAddressClear:
                    input_address.setText("");
                    output.setText("");
                    break;
                case R.id.btNameClear:
                    input_name.setText("");
                    output.setText("");
                    break;

            }
        }
    }
}