package tecnologico.limon.itslimon.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import tecnologico.limon.itslimon.R;
import tecnologico.limon.itslimon.SoftwareActivity;
import tecnologico.limon.itslimon.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;
    private FragmentGalleryBinding binding;
    Button btnSoftware;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        btnSoftware=binding.btnSoftware;
        btnSoftware.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento= new Intent(getContext(), SoftwareActivity.class);
                startActivity(intento);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}