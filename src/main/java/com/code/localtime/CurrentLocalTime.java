package com.code.localtime;

public class CurrentLocalTime {

	private String currentTime;
	private String timeZone;

	public CurrentLocalTime(String currentTime, String timeZone) {
		super();
		this.currentTime = currentTime;
		this.timeZone = timeZone;
	}

	/**
	 * @return the currentTime
	 */
	public String getCurrentTime() {
		return currentTime;
	}

	/**
	 * @param currentTime the currentTime to set
	 */
	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}

	/**
	 * @return the timeZone
	 */
	public String getTimeZone() {
		return timeZone;
	}

	/**
	 * @param timeZone the timeZone to set
	 */
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currentTime == null) ? 0 : currentTime.hashCode());
		result = prime * result + ((timeZone == null) ? 0 : timeZone.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof CurrentLocalTime)) {
			return false;
		}
		CurrentLocalTime other = (CurrentLocalTime) obj;
		if (currentTime == null) {
			if (other.currentTime != null) {
				return false;
			}
		} else if (!currentTime.equals(other.currentTime)) {
			return false;
		}
		if (timeZone == null) {
			if (other.timeZone != null) {
				return false;
			}
		} else if (!timeZone.equals(other.timeZone)) {
			return false;
		}
		return true;
	}

}
