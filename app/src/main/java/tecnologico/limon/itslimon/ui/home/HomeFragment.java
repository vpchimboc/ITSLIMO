package tecnologico.limon.itslimon.ui.home;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import tecnologico.limon.itslimon.MainActivity;
import tecnologico.limon.itslimon.R;
import tecnologico.limon.itslimon.databinding.BienvenidaFragmentBinding;
import tecnologico.limon.itslimon.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment  {
    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;
    Button accedr;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        accedr=binding.btnAcceder;
        accedr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationUI.onNavDestinationSelected(MainActivity.navigationView.getMenu().getItem(4),MainActivity.navController);
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