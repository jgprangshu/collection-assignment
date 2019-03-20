package com.capgemini.client;

public class Car {
	private String makeOfCar;
	private String modelOfCar;
	private double yearOfManufacturing;
	private double priceOfCar;

	public Car() {
		super();

	}

	public Car(String makeOfCar, String modelOfCar, double yearOfManufacturing, double priceOfCar) {
		super();
		this.makeOfCar = makeOfCar;
		this.modelOfCar = modelOfCar;
		this.yearOfManufacturing = yearOfManufacturing;
		this.priceOfCar = priceOfCar;
	}

	public String getMakeOfCar() {
		return makeOfCar;
	}

	public void setMakeOfCar(String makeOfCar) {
		this.makeOfCar = makeOfCar;
	}

	public String getModelOfCar() {
		return modelOfCar;
	}

	public void setModelOfCar(String modelOfCar) {
		this.modelOfCar = modelOfCar;
	}

	public double getYearOfManufacturing() {
		return yearOfManufacturing;
	}

	public void setYearOfManufacturing(double yearOfManufacturing) {
		this.yearOfManufacturing = yearOfManufacturing;
	}

	public double getPriceOfCar() {
		return priceOfCar;
	}

	public void setPriceOfCar(double priceOfCar) {
		this.priceOfCar = priceOfCar;
	}

	/*
	 * public int compareTo(Car fourthCar) { if(this.makeOfCar== fourthCar.makeOfCar
	 * && this.modelOfCar== fourthCar.modelOfCar) { return 0; } else return 1; }
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((makeOfCar == null) ? 0 : makeOfCar.hashCode());
		result = prime * result + ((modelOfCar == null) ? 0 : modelOfCar.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (makeOfCar == null) {
			if (other.makeOfCar != null)
				return false;
		} else if (!makeOfCar.equals(other.makeOfCar))
			return false;
		if (modelOfCar == null) {
			if (other.modelOfCar != null)
				return false;
		} else if (!modelOfCar.equals(other.modelOfCar))
			return false;
		return true;
	}

}
