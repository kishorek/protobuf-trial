// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: employees.proto

package com.kishorek.protos;

public interface EmployeeDBOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tutorial.EmployeeDB)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .tutorial.Employee employee = 1;</code>
   */
  java.util.List<com.kishorek.protos.Employee> 
      getEmployeeList();
  /**
   * <code>repeated .tutorial.Employee employee = 1;</code>
   */
  com.kishorek.protos.Employee getEmployee(int index);
  /**
   * <code>repeated .tutorial.Employee employee = 1;</code>
   */
  int getEmployeeCount();
  /**
   * <code>repeated .tutorial.Employee employee = 1;</code>
   */
  java.util.List<? extends com.kishorek.protos.EmployeeOrBuilder> 
      getEmployeeOrBuilderList();
  /**
   * <code>repeated .tutorial.Employee employee = 1;</code>
   */
  com.kishorek.protos.EmployeeOrBuilder getEmployeeOrBuilder(
      int index);
}
