// -*- mode: java; c-basic-offset: 2; -*-
// Copyright 2009-2011 Google, All Rights reserved
// Copyright 2011-2012 MIT, All rights reserved
// Released under the Apache License, Version 2.0
// http://www.apache.org/licenses/LICENSE-2.0

package es.roboticafacil.facilino.runtime;

/**
 * Callback for receiving Bluetooth connection events
 *
 * @author lizlooney@google.com (Liz Looney)
 */
interface FacilinoSensor {
  /**
   *
   */
  byte sensorType();
  void dispatchData(byte cmd, byte[] data);
}
