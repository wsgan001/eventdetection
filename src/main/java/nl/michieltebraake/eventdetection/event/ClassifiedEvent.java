package nl.michieltebraake.eventdetection.event;

import nl.michieltebraake.eventdetection.Coordinate;

public class ClassifiedEvent {
    private double distance;
    private EventType type;
    private int start;
    private int end;

    private String lat = "";
    private String lng = "";

    public ClassifiedEvent(double distance, EventType type, int start, int end, String lat, String lng) {
        this.distance = distance;
        this.type = type;
        this.start = start;
        this.end = end;
        this.lat = lat;
        this.lng = lng;
    }

    public ClassifiedEvent(double distance, EventType type, int start, int end) {
        this.distance = distance;
        this.type = type;
        this.start = start;
        this.end = end;
    }

    public double getDistance() {
        return distance;
    }

    public EventType getType() {
        return type;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }

    public Coordinate getCoordinate () {
        return new Coordinate(Double.parseDouble(lat), Double.parseDouble(lng));
    }

    @Override
    public String toString() {
        return "ClassifiedEvent{" +
                "distance=" + distance +
                ", type=" + type +
                ", start=" + start +
                ", end=" + end +
                ", lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                '}';
    }
}
