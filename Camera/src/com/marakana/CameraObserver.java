package com.marakana;

public class CameraObserver implements IConsumptionObs
{
	byte[] data;

	public void update(Object obj) {
		
		data = (byte[]) obj;
		
	}
	
	public byte[] getData()
	{
		return data;
	}
	
	
}
