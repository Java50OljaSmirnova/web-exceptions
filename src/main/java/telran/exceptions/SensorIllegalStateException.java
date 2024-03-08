package telran.exceptions;

import telran.messages.ExceptionMessages;

@SuppressWarnings("serial")
public class SensorIllegalStateException extends IllegalStateException {
	
	public SensorIllegalStateException() {
		super(ExceptionMessages.SENSOR_ALREADY_EXISTS);
	}

}

