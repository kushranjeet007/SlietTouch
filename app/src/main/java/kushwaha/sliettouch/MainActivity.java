package kushwaha.sliettouch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int images[]={R.drawable.slide1,R.drawable.slide2,R.drawable.slide3,R.drawable.slide4};
        viewFlipper= (ViewFlipper) findViewById(R.id.Flipper);
        //for(int i=0;i<images.length;i++)
        //
        // {
        //  flipperimage(images[i]);


        // }//
        for(int image:images){
            flipperimage(image);
        }
    }
    public void flipperimage(int image){

        ImageView imageview=new ImageView(this);
        imageview.setImageResource(image );
        viewFlipper.addView(imageview);
        viewFlipper.setFlipInterval(4000);//4 second
        viewFlipper.setAutoStart(true);
        //Animator
        viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);

    }
}
