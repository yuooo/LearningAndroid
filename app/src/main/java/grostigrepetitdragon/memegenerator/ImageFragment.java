package grostigrepetitdragon.memegenerator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class ImageFragment extends Fragment {

    final String TAG = "IMAGE";

    public static TextView topText;
    public static TextView bottomText;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_image, container, false);

        topText = (TextView) view.findViewById(R.id.ImageTopText);
        bottomText = (TextView) view.findViewById(R.id.ImageBottomText);

        return view;
    }

    public void setMemeText(String top, String bottom) {
//        Log.i(TAG, topText.getText().toString() + " FRAGMENT1_setMemeTextBefore");
//        Log.i(TAG, bottomText.getText().toString() + " FRAGMENT1_setMemeTextBefore");
        topText.setText(top);
        bottomText.setText(bottom);
//        Log.i(TAG, topText.getText().toString() + " FRAGMENT1_setMemeTextAfter");
//        Log.i(TAG, bottomText.getText().toString() + " FRAGMENT1_setMemeTextAfter");
    }

}
