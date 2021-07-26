package HW2_TA;

public interface Alarm {

    default String turnAlarmOn()
    {
        return "Alarm turn on ! ";
    }

    default String turnAlarmOff()
    {
        return "Alarm turn off ! ";
    }

}
