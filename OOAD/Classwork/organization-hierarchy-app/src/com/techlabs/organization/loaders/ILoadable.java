package com.techlabs.organization.loaders;

import java.util.HashSet;

public interface ILoadable<T> {
	HashSet<T> loadData();
}
