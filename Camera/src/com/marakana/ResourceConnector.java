package com.marakana;

public class ResourceConnector implements IResource 
{
	
	CameraManager cm;
	boolean aviability = true;
	int id = 0;
	
	public void sendImage()
	{
		
	}
	
	public void sendInstruction()
	{
		
	}
	
	

	public boolean isAvailable() {
		return aviability;
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
		// TODO Auto-generated method stub
		
	}

}
