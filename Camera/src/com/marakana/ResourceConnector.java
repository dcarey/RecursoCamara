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
        observer.consumptionFinished(id, (Object)data);
    }
	
	
	public boolean isAvailable() {
		return availability;
	}

	public void cancelConsumption() {
		
		CameraAct.preview.camera.stopPreview();
		availability = true;
	}

	public boolean receiveAction(int i, String[] s) {		
		
	try{
		byte[] data = CameraAct.preview.getFoto();
		notifyAllObservers(data);
		return true;
	}
	catch(Exception e)
	{
		String o = e.getMessage();
		observer.consumptionFailed(id, o);
		return false;
	}
	}

	public int getStatus() {
		return 0;
	}

	public void setId(int i) {
		id = i;
	}

	public void setObserver(IConsumptionObs observer) {
		this.observer = observer;
		
	}

}
