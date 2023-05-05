package JAVA_OOP.Seminar07.Adapter;

import java.time.*;

public interface MeteoSensor {
    int getId(); // идентификатор датчика

    Float getTemperature(); // температура датчика

    Float getHumidity(); // влажность

    Float getPressure(); // давление

    LocalDateTime getDateTime(); // время чтения данных датчика
}