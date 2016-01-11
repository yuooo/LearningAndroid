package grostigrepetitdragon.memegenerator;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class EnterTextFragment extends Fragment {
    private static EditText topText;
    private static EditText bottomText;

    final String TAG = "ENTERTEXTFRAGMENT";


    private TopFragmentListener mListener;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_enter_text, container, false);
        topText = (EditText) view.findViewById(R.id.EnterTopText);
        bottomText = (EditText) view.findViewById(R.id.EnterBottomText);
//        Log.i(TAG, topText.getText().toString() + " FRAGMENT1_on_create_view");
//        Log.i(TAG, bottomText.getText().toString() + " FRAGMENT1_on_create_view");
        final Button createMemeButton = (Button) view.findViewById(R.id.submit_button);

        createMemeButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        createMemeButtonClicked(v);
                    }
                }
        );
        // Inflate the layout for this fragment
        return view;
    }

    // Call this when button is clicked
    public void createMemeButtonClicked(View v) {

//        Log.i(TAG, topText.getText().toString() + " FRAGMENT1_createMemeButtonClicked");
//        Log.i(TAG, bottomText.getText().toString() + " FRAGMENT1_createMemeButtonClicked");
        mListener.buttonClicked(topText.getText().toString(), bottomText.getText().toString());
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (TopFragmentListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface TopFragmentListener {
        void buttonClicked(String top, String bottom);
    }

}
