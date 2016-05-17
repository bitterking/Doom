package com.per.misha.doom.mvp.repoList;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hannesdorfmann.mosby.mvp.viewstate.MvpViewStateFragment;
import com.hannesdorfmann.mosby.mvp.viewstate.ViewState;
import com.per.misha.doom.R;

/**
 * Created by misha on 16/5/17.
 */
public class FragmentRepoList extends MvpViewStateFragment<ViewRepoList, PresenterRepoList>{

    private static final String TAG = FragmentRepoList.class.getSimpleName();

    @Override
    public ViewState createViewState() {
        return null;
    }

    @Override
    public void onNewViewStateInstance() {

    }

    @Override
    public PresenterRepoList createPresenter() {
        return null;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag)
    }
}
