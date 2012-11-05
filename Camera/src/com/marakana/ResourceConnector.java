package com.marakana;

import java.util.ArrayList;
import java.util.List;

public class ResourceConnector implements IResource 
{
	boolean availability = true;
	int id = 0;
	List<IConsumptionObs> observers = new ArrayList<IConsumptionObs>();
	CameraActivity ca = new CameraActivity();

	
	public void sendImage()
	{
		
	}
	
	public void sendInstruction()
	{
		
	}
	
	

	public boolean isAvailable() {
		return availability;
	}

	public void cancelConsumption() {
		// TODO Auto-generated method stub
		
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
