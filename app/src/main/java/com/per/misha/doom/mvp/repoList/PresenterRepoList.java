package com.per.misha.doom.mvp.repoList;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;

/**
 * Created by misha on 16/5/17.
 */
public class PresenterRepoList extends MvpBasePresenter<ViewRepoList>{

    private static final String TAG = PresenterRepoList.class.getSimpleName();

    @Override
    public void attachView(ViewRepoList view) {
        super.attachView(view);
    }

    @Override
    public void detachView(boolean retainInstance) {
        super.detachView(retainInstance);
    }

    public void loadRepos(final boolean pbPullToRefresh) {}

    private void getRepos(final boolean pbPullToRefresh) {}




}
