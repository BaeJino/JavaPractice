package org.dimigo.Engine;

public class Car {
    //엔진을 포함함
   private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.startEngine();
    }

    public void stop(){
        engine.stopEngine();
    }
}
