
package _04_class_and_object_in_java.exercise.class_stop_watch;

class Watch {
    private long startTime, endTime;

    public long Start() {
        return this.startTime = System.currentTimeMillis();
    }

    public long Stop() {
        return this.endTime = System.currentTimeMillis();
    }
}
