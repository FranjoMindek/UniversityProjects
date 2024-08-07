// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: readingExchange.proto

package hr.fer.tel.rassus.sensor.gRPC;

public interface SensorReadingGRPCOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hr.fer.tel.rassus.SensorReadingGRPC)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>double temperature = 1;</code>
   * @return The temperature.
   */
  double getTemperature();

  /**
   * <code>double pressure = 2;</code>
   * @return The pressure.
   */
  double getPressure();

  /**
   * <code>double humidity = 3;</code>
   * @return The humidity.
   */
  double getHumidity();

  /**
   * <code>double co = 4;</code>
   * @return The co.
   */
  double getCo();

  /**
   * <code>double so2 = 5;</code>
   * @return The so2.
   */
  double getSo2();

  /**
   * <code>double no2 = 6;</code>
   * @return The no2.
   */
  double getNo2();
}
