package org.dimigo.IEngine;

public class Car {
    //엔진을 포함함
   private IEngine engine;

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.startEngine();
    }

    public void stop(){
        engine.stopEngine();
    }
}
