package models;

public class Events {
	private String name,description, latitude, longitude, place; 
	private int event_strt_time, travelling_time=0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getEvent_strt_time() {
		return event_strt_time;
	}
	public void setEvent_strt_time(int event_strt_time) {
		this.event_strt_time = event_strt_time;
	}
	public int getTravelling_time() {
		return travelling_time;
	}
	public void setTravelling_time(int travelling_time) {
		this.travelling_time = travelling_time;
	}
}
