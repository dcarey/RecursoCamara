package com.marakana;


public class ResourceConnector implements IResource 
{
	CameraActivity CameraAct;
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
		
		byte[] data = CameraAct.preview.getFoto();
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
