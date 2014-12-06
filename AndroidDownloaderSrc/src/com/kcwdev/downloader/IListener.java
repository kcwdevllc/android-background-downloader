package com.kcwdev.downloader;

public interface IListener<E> {
	public void handleEvent(E event);
}
