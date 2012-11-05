package com.marakana;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ResourceConnector implements IResource 
{
	CameraActivity CameraAct;
	boolean availability = true;
	int id = 0;
	List<IConsumptionObs> observers = new ArrayList<IConsumptionObs>();

	
	void notifyAllObservers(byte[] data) {
		
    	Iterator<IConsumptionObs> it= observers.iterator();

        while(it.hasNext())
        {
        	CameraObserver o = (CameraObserver)it.next();
        	o.update(data);
        }
    }
	
	
	public boolean isAvailable() {
		return availability;
	}

	public void cancelConsumption() {
		
		CameraAct.preview.camera.stopPreview();
		availability = true;
	}

	public boolean receiveAction(int i, String[] s) {
		// TODO Auto-generated method stub
		return false;
	}

	public int getStatus() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setId(int i) {
		id = i;
	}

	public void setObserver(IConsumptionObs observer) {
		observers.add(observer);
		
	}

}
