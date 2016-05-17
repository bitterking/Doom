package com.per.misha.doom.mvp.repoList;

import com.per.misha.doom.persistence.RepoEntity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by misha on 16/5/17.
 */
public final class ModelRepoList implements Serializable{

    public final List<RepoEntity> repos;

    public ModelRepoList(final List<RepoEntity> ploRepos) {
        this.repos = ploRepos;
    }

}
