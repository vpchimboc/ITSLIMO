package tecnologico.limon.itslimon.ui.bienvenida;

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


public class BienvenidaFragment extends Fragment {

    private BienvenidaViewModel mViewModel;
    private BienvenidaFragmentBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       // return inflater.inflate(R.layout.bienvenida_fragment, container, false);
        mViewModel =
                new ViewModelProvider(this).get(BienvenidaViewModel.class);

        binding = BienvenidaFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}