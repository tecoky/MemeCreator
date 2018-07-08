package tutorial.android.tecoky2u.memecreator;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomPictureFragment extends Fragment {
    private static TextView toptextin;
    private static TextView bottomtextin;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.bottom_picture_fragment, container, false);

        toptextin=(TextView) view.findViewById(R.id.textView);
        bottomtextin=(TextView) view.findViewById(R.id.textView2);
        return view;
    }

    public void setMemeText(String top, String bottom){
        toptextin.setText(top);
        bottomtextin.setText(bottom);
    }
}
