package tecnologico.limon.itslimon.ui.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import tecnologico.limon.itslimon.R;
import tecnologico.limon.itslimon.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;
    ViewFlipper slider;
    TextView textMision, textvision, texto_mision, texto_vision, texto_bienvenida, bienvenida;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        texto_bienvenida=binding.textoBienvenida;
        bienvenida=binding.bienvenida;
        textMision = binding.textMision;
        textvision= binding.textVision;
        texto_mision=binding.textoMision;
        texto_vision=binding.textoVision;
        textMision.setText(R.string.texto1);
        texto_mision.setText(R.string.mision);
        textvision.setText(R.string.texto2);
        texto_vision.setText(R.string.vision);
        slider=binding.viewFlipper;
        int imagen[]={R.mipmap.slider1,R.mipmap.slider2,R.mipmap.slider3,R.mipmap.slider4,R.mipmap.slider5,R.mipmap.slider6, R.mipmap.slider7,R.mipmap.slider8,R.mipmap.slider9,R.mipmap.imgslider10};
        for(int i=0; i<imagen.length; i++){
            flipper_imagen(imagen[i]);
        }
        texto_bienvenida.setText(R.string.titulo);
        bienvenida.setText(R.string.bienvenida);
        return root;
    }
    public void flipper_imagen(int image){
        ImageView imageView = new ImageView(binding.getRoot().getContext());
        imageView.setBackgroundResource(image);
        slider.addView(imageView);
        slider.setFlipInterval(4000);
        slider.setAutoStart(true);
        slider.setInAnimation(binding.getRoot().getContext(),android.R.anim.slide_in_left);
        slider.setOutAnimation(binding.getRoot().getContext(),android.R.anim.slide_out_right);
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}