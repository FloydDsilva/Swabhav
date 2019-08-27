package com.techlabs.employee;

import java.util.HashSet;

public interface ILoadable<T> {
	HashSet<T> loadData();
}
