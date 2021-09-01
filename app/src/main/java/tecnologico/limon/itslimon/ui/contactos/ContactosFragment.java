package tecnologico.limon.itslimon.ui.contactos;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import tecnologico.limon.itslimon.R;
import tecnologico.limon.itslimon.databinding.BienvenidaFragmentBinding;
import tecnologico.limon.itslimon.databinding.ContactosFragmentBinding;
import tecnologico.limon.itslimon.databinding.FragmentGalleryBinding;
import tecnologico.limon.itslimon.ui.gallery.GalleryViewModel;

public class ContactosFragment extends Fragment {

    private ContactosViewModel mViewModel;
    private ContactosFragmentBinding binding;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mViewModel =
                new ViewModelProvider(this).get(ContactosViewModel.class);
        binding = ContactosFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }
}