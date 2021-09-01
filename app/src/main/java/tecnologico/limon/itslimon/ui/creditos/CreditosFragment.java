package tecnologico.limon.itslimon.ui.creditos;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import tecnologico.limon.itslimon.R;
import tecnologico.limon.itslimon.databinding.ContactosFragmentBinding;
import tecnologico.limon.itslimon.databinding.CreditosFragmentBinding;
import tecnologico.limon.itslimon.ui.contactos.ContactosViewModel;

public class CreditosFragment extends Fragment {

    private CreditosViewModel mViewModel;
    private CreditosFragmentBinding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mViewModel =
                new ViewModelProvider(this).get(CreditosViewModel.class);
        binding = CreditosFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }



}