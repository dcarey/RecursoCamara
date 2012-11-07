Agregamos un Readme con los puntos importantes que cambiamos con respecto a nuestra Tarea 3:

- Modificamos algunas clases, como:
	- ResourceConector es la clase que implementa la interfaz IResource
	- Ademas ResourceConector posee un CameraActivity
	- Se eliminaron las clases CaptureManager y Camera Manager para evitar excesiva indireccion entre ResourceConector (que es la clase que interactua con el ResourceManager) y CameraActivity
	- Preview se mantiene relacionada con CameraActivity
	- La interfaces IResource e IConsumptionObs fueron copiadas del ResourceManager
	- La clase mainActivity esta solo por motivos de prueba de que el sistema de envio de datos funcione adecuadamente