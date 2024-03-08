package telran.exceptions;

import telran.messages.ExceptionMessages;

@SuppressWarnings("serial")
public class SensorNotFoundException extends NotFoundException {

	public SensorNotFoundException() {
		super(ExceptionMessages.SENSOR_NOT_FOUND);
	}

}

