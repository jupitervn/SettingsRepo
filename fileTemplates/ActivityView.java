package ${PACKAGE_NAME};

import com.jupitervn.mvp.common.presenter.PresenterLifecycle;
import com.jupitervn.mvp.common.view.BaseAppcompatActivityView;

import android.app.Activity;
import android.os.Bundle;

#parse("File Header.java")
public class ${NAME} extends BaseAppcompatActivityView<${PresenterClass}> {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
