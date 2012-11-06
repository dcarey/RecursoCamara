package com.marakana;

import java.io.File;
import java.io.FileInputStream;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;


public class ResourceConnector implements IResource 
{
	CameraActivity CameraAct = new CameraActivity();
	boolean availability = true;
	int id = 0;

	IConsumptionObs observer;

	
	void notifyAllObservers(byte[] data) {	        
        observer.consumptionUpdate(id, (Object)data);
    }
	
	
	public boolean isAvailable() {
		return availability;
	}

	public void cancelConsumption() {
		
		CameraAct.preview.camera.stopPreview();
		availability = true;
	}

	public boolean receiveAction(int i, String[] s) {		
		
		//byte[] data = CameraAct.preview.getFoto();
		byte[] data = {0,0};
		notifyAllObservers(data);
		return true;
	}

	public int getStatus() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setId(int i) {
		id = i;
	}

	public void setObserver(IConsumptionObs observer) {
		this.observer = observer;
		
	}

}
