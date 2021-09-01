package tecnologico.limon.itslimon.ui.bienvenida;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BienvenidaViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public BienvenidaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Bienvenida");
    }
    public LiveData<String> getText() {
        return mText;
}
}