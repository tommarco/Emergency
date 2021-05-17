package model;

import java.time.LocalTime;

public class Patient {
	
	@Override
	public String toString() {
		return "Patient [arrivalTime=" + arrivalTime + ", color=" + color + "]";
	}

	public enum ColorCode {
		NEW, // in triage
		WHITE, YELLOW, RED, BLACK,  // in sala d'attesa
		TREATING, // dentro studio medico
		OUT // a casa (abbandonato o curato)
	} ;
	
	private LocalTime arrivalTime ;
	private ColorCode color ;
	
	public Patient(LocalTime arrivalTime, ColorCode color) {
		super();
		this.arrivalTime = arrivalTime;
		this.color = color;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public ColorCode getColor() {
		return color;
	}

	public void setColor(ColorCode color) {
		this.color = color;
	}
	
	

}
