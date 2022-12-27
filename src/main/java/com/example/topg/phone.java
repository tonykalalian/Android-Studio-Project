package com.example.topg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class phone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);
    }
    public void btnsam_click(View view) {
        Intent intent = new Intent(this,listphone.class);
        startActivity(intent);
    }/*Tony Kalalian 51910025 */

    public void btniph(View view) {
        Intent intent = new Intent(this,listphone2.class);
        startActivity(intent);
    }/*Tony Kalalian 51910025 */

    public void buttontechno(View view) {
        Intent intent = new Intent(this,listphone3.class);
        startActivity(intent);
    }/*Tony Kalalian 51910025 */

    public void btntablet(View view) {
        Intent intent= new Intent(this,listphone4.class);
        startActivity(intent);
    }/*Tony Kalalian 51910025 */
}