package com.apple.dekay.isms

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.

class MainActivity : AppCompatActivity() {

    private static int splash_time_out = 4000;

    @JvmOverloads
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        new Handler().postDelayed(new Runnable(){
            @JvmOverloads
            public void run(){
                Intent homeIntent = new Intent(this@MainActivity)
                startActivity(homeIntent)
                finish()
            },splash_time_out
        }
    }
}

/*            override fun onCreate(savedInstanceState: Bundle?)
    {             super.onCreate(savedInstanceState)
                  setContentView(R.layout.activity_main)          override fun onCreate(savedInstanceState: Bundle?) {
                                                                      super.onCreate(savedInstanceState)
                  // Example of a call to a native method             setContentView(R.layout.activity_main)
                  sample_text.text = stringFromJNI()
              }                                                       // Example of a call to a native method
            sample_text.text = stringFromJNI()
        }

        /**
         * A native method that is implemented by the 'native-lib' native library,
         * which is packaged with this application.
         */
        external fun stringFromJNI(): String

        companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }

    }


    }
*/